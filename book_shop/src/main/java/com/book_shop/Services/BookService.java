package com.book_shop.Services;
import java.util.List;

import com.book_shop.entities.Book;

public interface BookService {
	public void saveOneData(Book b);

	public List<Book> listAllData();

	public void deleteOneData(Long id);

	public Book findById(long id);

}
