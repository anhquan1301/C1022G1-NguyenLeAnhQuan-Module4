package com.example.products.repository.impl;

import com.example.products.model.Product;
import com.example.products.repository.IProductRepository;
import com.example.products.repository.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> findALl(String name) {
        Session session = null;
        List<Product> productList = null;
        try{
            session = SessionUtil.sessionFactory.openSession();
            productList = session.createQuery("from Product where name =:name").setParameter("name", name).getResultList();

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
        Session session = null;
        Transaction transaction = null;
        try{
            session = SessionUtil.sessionFactory.openSession();
            transaction = session.getTransaction();
            transaction.begin();
            session.persist(product);
            transaction.commit();
        }catch (Exception e){
            if(transaction!=null){
                transaction.rollback();
            }
        }finally {
            if(session!=null){
                session.close();
            }
        }
    }

    @Override
    public void edit(Product product) {

    }

    @Override
    public void delete(int id) {

    }
}
