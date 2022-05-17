package com.example.labdb.dao.impl;


import com.example.labdb.dao.ManufacturerDao;
import com.example.labdb.models.Dish;
import com.example.labdb.models.Kind;
import com.example.labdb.models.Manufacturer;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Repository
public class ManufacturerDaoImpl implements ManufacturerDao {

    @Override
    public Manufacturer addNewManufacturer(Manufacturer manufacturer){
        Session session = getSessionFactory().openSession();
        session.beginTransaction();
        session.save(manufacturer);
        session.getTransaction().commit();
        session.close();
        return manufacturer;
    }

    @Override
    public void updateManufacturer(Manufacturer manufacturer){

    }

    @Override
    public void deleteManufacturer(Manufacturer manufacturer){

    }

    @Override
    public Manufacturer getFromId(int id) {
        Session session = getSessionFactory().openSession();
        Manufacturer manufacturer = (Manufacturer)
                session.createQuery("Select m FROM Manufacturer m WHERE m.id = " + id)
                        .list().get(0);
        session.close();
        return manufacturer;
    }

    @Override
    public List<Manufacturer> getAllManufacturer() {
        Session session = getSessionFactory().openSession();
        List<Manufacturer> list = session.createQuery("SELECT m FROM Manufacturer m", Manufacturer.class).getResultList();
        session.close();
        return list;
    }
}
