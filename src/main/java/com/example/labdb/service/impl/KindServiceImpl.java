package com.example.labdb.service.impl;


import com.example.labdb.dao.KindDao;
import com.example.labdb.models.Kind;
import com.example.labdb.service.KindService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.example.labdb.utils.HibernateUtil.getSessionFactory;
@Repository
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
}
