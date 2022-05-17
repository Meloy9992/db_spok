package com.example.labdb.dao.impl;

import com.example.labdb.dao.DishDao;
import com.example.labdb.models.Dish;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
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
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(dish);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteDish(Dish dish){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(dish);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Dish> getAllDish(){
        Session session = getSessionFactory().openSession();
        List<Dish> list = session.createQuery("SELECT d FROM Dish d", Dish.class).getResultList();
        session.close();
        return list;
    }

    @Override
    public Dish findById(Long id){
        Session session = getSessionFactory().openSession();
        Dish dish = (Dish) session.createQuery("from Dish where id = " + id).list().get(0);
        session.close();
        return dish;
    }

    @Override
    public List<Dish> getListCategory(String category){
        Session session = getSessionFactory().openSession();
        Query query =  session.createQuery("from Dish d inner join Kind  k on" +
                " d.kindDish.id=k.id where k.nameGroup = :category");
        query.setParameter("category", category);
        List<Object[]> results = query.getResultList();
        List<Dish> dishes = new ArrayList<>();

        for (int i=0; i <results.size(); i++){
            Object[] objects = results.get(i);
            Dish dish = (Dish) objects[0];
            dishes.add(dish);
        }
        session.close();
        return dishes;
    }

    @Override
    public Dish getExpensiveDish(){
        Session session = getSessionFactory().openSession();
        DetachedCriteria price = DetachedCriteria.forClass(Dish.class, "d")
                .setProjection( Property.forName("d.priceDish").max());
        Dish dish = (Dish) session.createCriteria(Dish.class, "d")
                .add( Property.forName("d.priceDish").eq(price))
                .list().get(0);
        session.close();
        return dish;
    }
}
