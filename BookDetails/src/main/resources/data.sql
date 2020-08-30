DROP TABLE IF EXISTS book_information;
 
CREATE TABLE book_information (
  book_id INT AUTO_INCREMENT  PRIMARY KEY,
  book_title VARCHAR(250) unique NOT NULL,
  author_name VARCHAR(250) NOT NULL,
  year_published int DEFAULT NULL
);
 
INSERT INTO book_information (book_title, author_name,year_published) VALUES
  ('Harry Potter', 'ABC', 2000),
  ('Kite Runner', 'Khalid', 2010),
  ('Life', 'Satzee', 2020);
  
  DROP TABLE IF EXISTS book_additional_info;
  
  CREATE TABLE book_additional_info (
  id INT AUTO_INCREMENT  PRIMARY KEY,
   book_title VARCHAR(250) NOT NULL,
  page_count int DEFAULT NULL
);

INSERT INTO book_additional_info (book_title, page_count) VALUES
  ('Harry Potter',  200),
  ('Kite Runner',  300),
  ('Life',  400);
  
  