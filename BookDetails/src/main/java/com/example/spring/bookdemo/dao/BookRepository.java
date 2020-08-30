package com.example.spring.bookdemo.dao;

import java.util.List;

import javax.naming.ldap.SortKey;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.bookdemo.model.BookInformationn;


/**
 * The Interface BookRepository.
 */
@Repository
public interface BookRepository extends CrudRepository<BookInformationn, Long> {

	/**
	 * Find by book title.
	 *
	 * @param bookTitle the book title
	 * @return the book informationn
	 */
	BookInformationn findByBookTitle(String bookTitle);
	
	/**
	 * Find by author name.
	 *
	 * @param authorName the author name
	 * @return the book informationn
	 */
	BookInformationn findByAuthorName(String authorName);
	
	/**
	 * Gets the by year published less than equal.
	 *
	 * @param yearPunlished the year punlished
	 * @return the by year published less than equal
	 */
	List<BookInformationn> getByYearPublishedLessThanEqual(Long yearPunlished);
	
	
	/**
	 * Find all order by book title asc.
	 *
	 * @return the list
	 */
	@Query("FROM BookInformationn ORDER BY bookTitle DESC")
	List<BookInformationn> findAllOrderByBookTitleAsc();

	
   
}
