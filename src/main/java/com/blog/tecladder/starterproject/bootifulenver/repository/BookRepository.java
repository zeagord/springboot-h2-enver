package com.blog.tecladder.starterproject.bootifulenver.repository;

import com.blog.tecladder.starterproject.bootifulenver.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by rg3 on 5/2/17.
 */

@Repository
@RepositoryRestResource( collectionResourceRel = "book", path = "book")
public interface BookRepository extends CrudRepository<Book, Long>{

}
