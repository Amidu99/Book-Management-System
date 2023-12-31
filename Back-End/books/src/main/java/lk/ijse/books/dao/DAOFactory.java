package lk.ijse.books.dao;

import lk.ijse.books.dao.custom.impl.BookDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {}

    public static DAOFactory getDAOFactory() {
        return daoFactory == null ? daoFactory = new DAOFactory():daoFactory;
    }

    public enum DAOTypes {
        BOOK
    }

    public SuperDAO getDAO(DAOTypes daoTypes) {
        switch (daoTypes) {
            case BOOK: return new BookDAOImpl();
            default: return null;
        }
    }
}