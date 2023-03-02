package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import com.example.repository.SessionUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> findAll(String name) {
        Session session = null;
        List<Product> productList = null;
        try{
            session = SessionUtil.sessionFactory.openSession();
            productList = session.createQuery("from Product where name = ?").setParameter(0, name).getResultList();

        }catch (Exception e){
        }finally {
            if(session!=null){
                session.close();
            }
        }
        return productList;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void edit(Product product) {

    }

    @Override
    public void delete(int id) {

    }
}
