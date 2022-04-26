package com.example.labdb.dao.impl;

import com.example.labdb.dao.DishDao;
import com.example.labdb.models.Dish;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Repository
public class DishDaoImpl implements DishDao {

    @Override
    public Dish addNewDish(Dish dish){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(dish);
        session.getTransaction().commit();
        session.close();
        return dish;
    }

    @Override
    public void updateDish(Dish dish){

    }

    @Override
    public void deleteDish(Dish dish){

    }

    public List<Dish> getAllDish(){
        Session session = getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Dish.class);
        List<Dish> dishList = criteria.add(Restrictions.like("ingredients", "Помидоры")).list();
        return dishList;
    }
}
