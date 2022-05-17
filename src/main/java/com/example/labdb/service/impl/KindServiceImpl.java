package com.example.labdb.service.impl;


import com.example.labdb.dao.KindDao;
import com.example.labdb.models.Kind;
import com.example.labdb.service.KindService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Service
public class KindServiceImpl implements KindService {

    private KindDao kindDao;

    @Autowired
    public KindServiceImpl(KindDao kindDao) {
        this.kindDao = kindDao;
    }

    @Override
    public Kind addNewKind(Kind kind){
    return kindDao.addNewKind(kind);
    }

    @Override
    public void updateKind(Kind kind){
        kindDao.updateKind(kind);
    }

    @Override
    public void deleteKind(Kind kind){
    kindDao.deleteKind(kind);
    }

    @Override
    public Kind getFromId(int id) {
        return kindDao.getFromId(id);
    }

    @Override
    public List<Kind> getAllGroup() {
        return kindDao.getAllGroup();
    }
}
