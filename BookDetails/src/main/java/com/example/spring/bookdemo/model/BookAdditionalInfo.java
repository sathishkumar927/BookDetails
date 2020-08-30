package com.example.spring.bookdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The Class BookAdditionalInfo.
 */
@Entity
public class BookAdditionalInfo {

	/** The id. */
	@Id
	private int id;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Gets the book title.
	 *
	 * @return the book title
	 */
	public String getBookTitle() {
		return bookTitle;
	}

	/**
	 * Instantiates a new book additional info.
	 */
	public BookAdditionalInfo() {
		
	}
	
	

	/**
	 * Instantiates a new book additional info.
	 *
	 * @param id the id
	 * @param bookTitle the book title
	 * @param pageCount the page count
	 */
	public BookAdditionalInfo(int id, String bookTitle, int pageCount) {
		this.id = id;
		this.bookTitle = bookTitle;
		this.pageCount = pageCount;
	}

	/**
	 * Gets the page count.
	 *
	 * @return the page count
	 */
	public int getPageCount() {
		return pageCount;
	}

	/** The book title. */
	private String bookTitle;
	
	/** The page count. */
	private int pageCount;
}
