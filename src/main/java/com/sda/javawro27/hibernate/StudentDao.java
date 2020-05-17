package com.sda.javawro27.hibernate;
import model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

// umożliwia wykonywanie operacji CRUD na modelu Student
public class StudentDao {
    public void saveOrUpdate(Student student) {
        SessionFactory sessionFactory = HibernateUtil.getOurSessionFactory();
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            // instrukcja która służy do zapisywania w bazie
            session.saveOrUpdate(student);
            transaction.commit();
        } catch (HibernateException he) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
