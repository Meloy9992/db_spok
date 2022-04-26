package com.example.labdb.dao;


import com.example.labdb.models.Kind;

public interface KindDao {

    Kind addNewKind(Kind kind);

    void updateKind(Kind kind);

    void deleteKind(Kind kind);
}
