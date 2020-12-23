//video-5_3_start
package com.simonis.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simonis.demo.entitites.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	@Query(value="select * from Book b where b.author_id=:id", nativeQuery=true)
	List<Book> getBooksByAuthor(@Param("id")Long authorid);
}
//video-5_3_end