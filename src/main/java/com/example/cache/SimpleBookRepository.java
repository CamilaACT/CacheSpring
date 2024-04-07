package com.example.cache;

import org.springframework.cache.annotation.Cacheable;//segunda parte
import org.springframework.stereotype.Component; //primer ejercicio

@Component
public class SimpleBookRepository implements BookRepository {

  @Override
  @Cacheable("books") //esto se aumenta
  public Book getByIsbn(String isbn) {
    simulateSlowService();
    return new Book(isbn, "Some book");
  }

  // Don't do this at home
  private void simulateSlowService() {
    try {
      long time = 3000L;
      Thread.sleep(time);
    } catch (InterruptedException e) {
      throw new IllegalStateException(e);
    }
  }

}
