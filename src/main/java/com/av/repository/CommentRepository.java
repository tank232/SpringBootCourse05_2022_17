package com.av.repository;


import com.av.db.Book;
import com.av.db.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "comment")
public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Override
    List<Comment> findAll();


    Optional<Comment> findCommentByBook(Book book);


}
