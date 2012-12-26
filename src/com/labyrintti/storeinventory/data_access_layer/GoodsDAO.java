package com.labyrintti.storeinventory.data_access_layer;

import java.util.List;

import com.labyrintti.storeinventory.dbmodel.Goods;
 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GoodsDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public List<Goods> listGoods() {
        
    return sessionFactory.getCurrentSession().createQuery("from Goods").list();
    }

}
