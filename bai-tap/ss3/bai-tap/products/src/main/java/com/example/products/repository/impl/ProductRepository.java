package com.example.products.repository.impl;
import com.example.products.model.Product;
import com.example.products.repository.IProductRepository;
import com.example.products.repository.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> findALl(String name) {
        Session session = null;
        List<Product> productList = null;
        try{
            session = SessionUtil.sessionFactory.openSession();
            productList = session.createQuery("from Product where name like concat('%', :name, '%')").setParameter("name", name).getResultList();

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
        return SessionUtil.entityManager.find(Product.class,id);
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
        Session session = null;
        Transaction transaction = null;
        try {
            session = SessionUtil.sessionFactory.openSession();
            transaction = session.getTransaction();
            transaction.begin();
            Product p = findById(product.getId());
            p.setName(product.getName());
            p.setPrice(product.getPrice());
            p.setStatus(product.getStatus());
            p.setProducer(product.getProducer());
            session.update(p);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void delete(int id) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = SessionUtil.sessionFactory.openSession();
            transaction = session.getTransaction();
            transaction.begin();
            Product product = findById(id);
            session.remove(product);
            transaction.commit();
        } catch (Exception e) {
            if (transaction!= null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
