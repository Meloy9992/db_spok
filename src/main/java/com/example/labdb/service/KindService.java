package com.example.labdb.service;


import com.example.labdb.models.Kind;

public interface KindService {

    Kind addNewKind(Kind kind);

    void updateKind(Kind kind);

    void deleteKind(Kind kind);
}
