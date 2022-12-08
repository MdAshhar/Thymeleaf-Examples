package com.book_shop.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book_shop.entities.Book;
import com.book_shop.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository borepo;
	
	@Override
	public void saveOneData(Book b) {
		borepo.save(b);
	}
	@Override
	public List<Book> listAllData() {
		List<Book> read = borepo.findAll();
		return read;	
	}
	@Override
	public void deleteOneData(Long id) {
		borepo.deleteById(id);
	}
	@Override
	public Book findById(long id) {
		Optional<Book> bk = borepo.findById(id);
		Book book = bk.get();
		return book;
	}	
}
