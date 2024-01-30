package com.example.Example2_Seminar_6.repository;


import com.example.Example2_Seminar_6.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
