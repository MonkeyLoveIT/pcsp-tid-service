package service.impl;

import dao.BookDao;
import service.BookService;

public class BookServiceImpl implements BookService {
    // 删除业务层中使用new的方式创建的对象
    private BookDao bookDao;
    public void save(){
        System.out.println("book service save");
        bookDao.save();
    }

    // 提供set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
