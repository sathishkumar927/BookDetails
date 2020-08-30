package com.example.spring.bookdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * The Class BookInformationn.
 */
@Entity
 @Table(name="book_information",
		 uniqueConstraints = @UniqueConstraint(name="book_title",columnNames = "bookTitle"
		 ))
public class BookInformationn {
	
	/** The book id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int bookId;
	
	/** The book title. */
	@Column(nullable = false,unique = true)
	private String bookTitle;
	
	/** The author name. */
	private String authorName;
	
	/** The year published. */
	private long yearPublished;
	
	/**
	 * Instantiates a new book informationn.
	 */
	public BookInformationn() {}
	
	/**
	 * Instantiates a new book informationn.
	 *
	 * @param id the id
	 * @param booktitle the booktitle
	 * @param authorName the author name
	 * @param yearPublished the year published
	 */
	public BookInformationn(int id,String booktitle,String authorName,long yearPublished) {
		this.bookId = id;
		this.bookTitle = booktitle;
		this.authorName = authorName;
		this.yearPublished = yearPublished;
	}
	
	/**
	 * Gets the book id.
	 *
	 * @return the book id
	 */
	public int getBookId() {
		return bookId;
		
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
	 * Gets the author name.
	 *
	 * @return the author name
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * Sets the book id.
	 *
	 * @param bookId the new book id
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	/**
	 * Sets the book title.
	 *
	 * @param bookTitle the new book title
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	/**
	 * Sets the author name.
	 *
	 * @param authorName the new author name
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/**
	 * Sets the year published.
	 *
	 * @param yearPublished the new year published
	 */
	public void setYearPublished(long yearPublished) {
		this.yearPublished = yearPublished;
	}

	/**
	 * Gets the year published.
	 *
	 * @return the year published
	 */
	public long getYearPublished() {
		return yearPublished;
	}
}
