package com.example.labdb.service;


import com.example.labdb.models.Manufacturer;

public interface ManufacturerService {

    Manufacturer addNewManufacturer(Manufacturer manufacturer);

    void updateManufacturer(Manufacturer manufacturer);

    void deleteManufacturer(Manufacturer manufacturer);
}
