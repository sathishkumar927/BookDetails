package com.example.spring.bookdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.naming.ldap.SortKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.spring.bookdemo.dao.BookRepository;
import com.example.spring.bookdemo.model.BookInformationn;

/**
 * The Class BookService.
 */
@Service
public class BookService {
	
	/** The book repository. */
	@Autowired
	BookRepository bookRepository;
	
	/**
	 * Gets the all books info.
	 *
	 * @return the all books info
	 */
	public List<BookInformationn> getAllBooksInfo(){
		List<BookInformationn> bookInformationList = new ArrayList<BookInformationn>();
		bookRepository.findAll().forEach(bookInfo->bookInformationList.add(bookInfo));
		return bookInformationList;
	}

	/**
	 * Save.
	 *
	 * @param bookInformationn the book informationn
	 * @return the int
	 */
	public int save(BookInformationn bookInformationn) {
		return bookRepository.save(bookInformationn).getBookId();
		
	}

	/**
	 * Find by book title.
	 *
	 * @param bookTitle the book title
	 * @return the book informationn
	 */
	public BookInformationn findByBookTitle(String bookTitle) {
		return bookRepository.findByBookTitle(bookTitle);
	}
	
	/**
	 * Find by author namee.
	 *
	 * @param authorName the author name
	 * @return the book informationn
	 */
	public BookInformationn findByAuthorNamee(String authorName) {
		return bookRepository.findByAuthorName(authorName);
	}
	
	/**
	 * Gets the by year published less than equal.
	 *
	 * @param yearPublished the year published
	 * @return the by year published less than equal
	 */
	public List<BookInformationn> getByYearPublishedLessThanEqual(Long yearPublished) {
		return bookRepository.getByYearPublishedLessThanEqual(yearPublished);
	}

	/**
	 * Sort by name.
	 *
	 * @return the list
	 */
	public List<BookInformationn> sortByName() {
		 return bookRepository.findAllOrderByBookTitleAsc();	
	}
}
