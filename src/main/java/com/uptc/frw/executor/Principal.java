package com.uptc.frw.executor;

import com.uptc.frw.conf.PersistenceUtil;
import com.uptc.frw.entity.*;
import jakarta.persistence.EntityManager;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        EntityManager em = PersistenceUtil.getEntityManager();
        Book book1 = new Book(140l, "Libro1", 10.2);
        Book book2 = new Book(150l, "Libro 2", 10.2);
        Person person = new Person(1003l, "Pepito", "Perez", "COL");
        ArrayList<Person> authorsList = new ArrayList<Person>();
        authorsList.add(person);
        book1.setAuthors(authorsList);
        book2.setAuthors(authorsList);
        em.getTransaction().begin();
        em.persist(book1);
        em.persist(book2);
        em.persist(person);
        em.getTransaction().commit();
        em.close();

    }
    public static void persistBook() {
        EntityManager em = PersistenceUtil.getEntityManager();
        Book book = new Book(100l, "Libro 1", 10.2);
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
        em.close();
    }

    public static void getBook(){
        EntityManager em = PersistenceUtil.getEntityManager();
        Book book = em.find(Book.class, 100L);
        System.out.println(book);
    }

    public static void refreshBook(){
        EntityManager em = PersistenceUtil.getEntityManager();
        // estado nuevo
        Book book = em.find(Book.class, 100l);
        System.out.println(book);
        book.setPrice(20.5);
        em.refresh(book);
        System.out.println(book);
    }

    public static void removeBook(){
        EntityManager em = PersistenceUtil.getEntityManager();
        Book book = em.find(Book.class, 100l);
        em.getTransaction().begin();
        em.remove(book);
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
        em.close();
    }

    public static void updateBook(){
        EntityManager em = PersistenceUtil.getEntityManager();
        Book book = em.find(Book.class, 100l);
        em.getTransaction().begin();
        book.setTitle("Titulo nuevo");
        em.getTransaction().commit();
    }

    public static void detachBook(){
        EntityManager em = PersistenceUtil.getEntityManager();
        Book book = em.find(Book.class, 100l);
        em.getTransaction().begin();
        book.setTitle("Titulo nuevo nuevo");
        em.detach(book);
        em.getTransaction().commit();
        em.getTransaction().begin();
        em.merge(book);
        em.getTransaction().commit();
    }

    public static void createBookAndEdition(){
        EntityManager em = PersistenceUtil.getEntityManager();
        Book book = new Book(110l, "Libro 1", 10.2);
        em.getTransaction().begin();
        Edition edition = new Edition(book.getId(), 2023, 1, "Edicion de lujo", book);
        em.persist(book);
        em.persist(edition);
        em.getTransaction().commit();
        em.close();
    }

    public static void searchBookAndEdition(){
        EntityManager em = PersistenceUtil.getEntityManager();
        Book book = em.find(Book.class, 110l);
        System.out.println(book);
        System.out.println(book.getEditions());
        em.close();
    }

    public static void searchEditionAndBook(){
        EntityManager em = PersistenceUtil.getEntityManager();
        Edition edition = em.find(Edition.class, 110l);
        System.out.println(edition);
        System.out.println(edition.getBook());
        em.close();
    }

}
