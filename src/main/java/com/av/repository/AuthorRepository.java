package com.av.repository;

import com.av.db.Author;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;


@RepositoryRestResource(path = "author")
public interface AuthorRepository extends JpaRepository<Author, Long> {

    List<Author> findAll();
    @EntityGraph(
            attributePaths = {"books"}
    )
    Optional<Author> findAuthorByName(String name);


}
