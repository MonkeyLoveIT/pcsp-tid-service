package dao.impl;

import dao.BookDao;
import service.BookService;
import service.impl.BookServiceImpl;

public class BooKDaoImpl implements BookDao {
    // private BookService bookService = new BookServiceImpl();
    public void save() {
        System.out.println("book dao save");
        // bookService.save();
    }
}
