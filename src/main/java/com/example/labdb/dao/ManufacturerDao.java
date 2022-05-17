package com.example.labdb.dao;


import com.example.labdb.models.Manufacturer;

import java.util.List;

public interface ManufacturerDao {

    Manufacturer addNewManufacturer(Manufacturer manufacturer);

    void updateManufacturer(Manufacturer manufacturer);

    void deleteManufacturer(Manufacturer manufacturer);

    Manufacturer getFromId(int id);

    List<Manufacturer> getAllManufacturer();
}
