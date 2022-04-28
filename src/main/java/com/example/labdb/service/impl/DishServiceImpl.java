package com.example.labdb.service.impl;

import com.example.labdb.dao.DishDao;
import com.example.labdb.models.Dish;
import com.example.labdb.service.DishService;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Service
public class DishServiceImpl implements DishService {

    private DishDao dishDao;

    @Autowired
    public DishServiceImpl(DishDao dishDao) {
        this.dishDao = dishDao;
    }

    @Override
    public Dish addNewDish(Dish dish){
        return dishDao.addNewDish(dish);
    }

    @Override
    public void updateDish(Dish dish){
        dishDao.updateDish(dish);
    }

    @Override
    public void deleteDish(Dish dish){
        dishDao.deleteDish(dish);
    }

    @Override
    public List<Dish> getAllDish(){
        return dishDao.getAllDish();
    }

    @Override
    public Dish findById(Long id) {
        return dishDao.findById(id);
    }
}
