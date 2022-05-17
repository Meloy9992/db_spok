package com.example.labdb.service.impl;


import com.example.labdb.dao.ManufacturerDao;
import com.example.labdb.models.Manufacturer;
import com.example.labdb.service.ManufacturerService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    private ManufacturerDao manufacturerDao;

    @Autowired
    public ManufacturerServiceImpl(ManufacturerDao manufacturerDao) {
        this.manufacturerDao = manufacturerDao;
    }

    @Override
    public Manufacturer addNewManufacturer(Manufacturer manufacturer){
        return manufacturerDao.addNewManufacturer(manufacturer);
    }

    @Override
    public void updateManufacturer(Manufacturer manufacturer){
        manufacturerDao.addNewManufacturer(manufacturer);
    }

    @Override
    public void deleteManufacturer(Manufacturer manufacturer){
        manufacturerDao.deleteManufacturer(manufacturer);
    }

    @Override
    public Manufacturer getFromId(int id) {
        return manufacturerDao.getFromId(id);
    }

    @Override
    public List<Manufacturer> getAllManufacturer() {
        return manufacturerDao.getAllManufacturer();
    }
}
