package com.example.labdb.dao;


import com.example.labdb.models.Manufacturer;

public interface ManufacturerDao {

    Manufacturer addNewManufacturer(Manufacturer manufacturer);

    void updateManufacturer(Manufacturer manufacturer);

    void deleteManufacturer(Manufacturer manufacturer);
}
