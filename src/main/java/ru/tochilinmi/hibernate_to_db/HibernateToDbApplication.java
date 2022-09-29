package ru.tochilinmi.hibernate_to_db;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.tochilinmi.hibernate_to_db.entities.EmployeeEntity;
import ru.tochilinmi.hibernate_to_db.utils.HibernateUtil;

@SpringBootApplication
public class HibernateToDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateToDbApplication.class, args);

        try(Session session = HibernateUtil.getSession()) {
            session.beginTransaction();

            EmployeeEntity employee = new EmployeeEntity("Joe", "frontend", "IT", 23, 60.3);
            session.save(employee);

            employee= new EmployeeEntity("Mike", "backend", "IT", 22, 90.0);
            session.save(employee);

            session.getTransaction().commit();
        }catch (Throwable cause){
            cause.printStackTrace();
        }

    }

}
