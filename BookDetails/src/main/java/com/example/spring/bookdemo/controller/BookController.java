package com.example.spring.bookdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.bookdemo.model.BookInformationn;
import com.example.spring.bookdemo.service.BookService;



/**
 * The Class BookController.
 */
@RestController("books")
public class BookController {

		
	/** The book service. */
	@Autowired
	BookService  bookService;
	
	/**
	 * Gets the books.
	 *
	 * @return the books
	 */
	@GetMapping("/getBooks")
	public List<BookInformationn> getBooks() {
		return bookService.getAllBooksInfo();
		
		
	}
	
	/**
	 * Register book.
	 *
	 * @param bookInformationn the book informationn
	 * @return the int
	 */
	@RequestMapping(value="/registerBook",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public int registerBook(@RequestBody BookInformationn bookInformationn) {
			return  bookService.save(bookInformationn);
		
	}
	
	/**
	 * Find by book title.
	 *
	 * @param bookTitle the book title
	 * @return the book informationn
	 */
	@GetMapping("/getByTitle")
	public BookInformationn findByBookTitle(@RequestParam String bookTitle) {
		
		return  bookService.findByBookTitle(bookTitle);
		
	}
	
	/**
	 * Find by author name.
	 *
	 * @param authorName the author name
	 * @return the book informationn
	 */
	@GetMapping("/getByAuthor")
	public BookInformationn findByAuthorName(@RequestParam String authorName) {
		
		return  bookService.findByAuthorNamee(authorName);
		
	}
	
	/**
	 * Find by year.
	 *
	 * @param year the year
	 * @return the list
	 */
	@GetMapping("/getByYear")
	public List<BookInformationn> findByYear(@RequestParam Long year) {
		
		return  bookService.getByYearPublishedLessThanEqual(year);
		
	}
	
	/**
	 * Sort by name.
	 *
	 * @return the list
	 */
	@GetMapping("/sortByName")
	public List<BookInformationn> sortByName(){
		return  bookService.sortByName();
	}
	
}
