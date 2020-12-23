//video-5_3_start
package com.simonis.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simonis.demo.entitites.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
//video-5_3_end