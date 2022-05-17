package com.example.labdb.dao;


import com.example.labdb.models.Kind;

import java.util.List;

public interface KindDao {

    Kind addNewKind(Kind kind);

    void updateKind(Kind kind);

    void deleteKind(Kind kind);

    Kind getFromId(int id);

    List<Kind> getAllGroup();
}
