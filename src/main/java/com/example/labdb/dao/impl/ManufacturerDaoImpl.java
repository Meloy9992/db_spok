package com.example.labdb.dao.impl;


import com.example.labdb.dao.ManufacturerDao;
import com.example.labdb.models.Manufacturer;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

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
}
