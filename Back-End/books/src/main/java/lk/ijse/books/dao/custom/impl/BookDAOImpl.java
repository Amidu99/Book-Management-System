package lk.ijse.books.dao.custom.impl;

import lk.ijse.books.dao.custom.BookDAO;
import lk.ijse.books.entity.BookInfo;
import org.hibernate.Session;
import java.util.List;

public class BookDAOImpl implements BookDAO {
    @Override
    public BookInfo search(String id, Session session) throws Exception {
        return null;
    }

    @Override
    public boolean add(BookInfo entity, Session session) throws Exception {
        return false;
    }

    @Override
    public boolean update(BookInfo entity, Session session) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id, Session session) throws Exception {
        return false;
    }

    @Override
    public List<BookInfo> getAll(Session session) throws Exception {
        return null;
    }
}