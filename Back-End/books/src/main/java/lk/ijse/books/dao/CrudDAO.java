package lk.ijse.books.dao;

import org.hibernate.Session;
import java.util.List;

public interface CrudDAO<T> extends SuperDAO {
    T search(String id , Session session) throws Exception;
    boolean add(T entity , Session session) throws Exception;
    boolean update(T entity , Session session) throws Exception;
    boolean delete(String id , Session session) throws Exception;
    List<T> getAll(Session session) throws Exception;
}