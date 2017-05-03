package com.blog.tecladder.starterproject.bootifulenver.model;


import org.hibernate.envers.Audited;

import javax.persistence.*;

/**
 * Created by rg3 on 5/2/17.
 */
@Entity
@Table(name = "api_book")
@Audited
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private Long book_id;

    @Column(name = "book_title")
    private String book_title;

    @Column(name = "book_price")
    private Double book_price;


    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public Double getBook_price() {
        return book_price;
    }

    public void setBook_price(Double book_price) {
        this.book_price = book_price;
    }
}
