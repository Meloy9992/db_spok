package com.example.labdb.service;


import com.example.labdb.models.Manufacturer;

import java.util.List;

public interface ManufacturerService {

    Manufacturer addNewManufacturer(Manufacturer manufacturer);

    void updateManufacturer(Manufacturer manufacturer);

    void deleteManufacturer(Manufacturer manufacturer);

    Manufacturer getFromId(int id);

    List<Manufacturer> getAllManufacturer();
}
