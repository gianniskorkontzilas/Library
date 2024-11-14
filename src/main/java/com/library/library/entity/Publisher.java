package com.library.library.entity;

import jakarta.persistence.*;
import com.library.library.entity.Book;

import java.util.Set;

@Entity
@Table(name="publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "publisher_id",length = 11)
    private int publisherid;

    @Column(name = "name",length = 45)
    private String name;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;

    public Publisher(int publisherid, String name) {
        this.publisherid = publisherid;
        this.name = name;
    }

    public Publisher(String name) {
        this.name = name;
    }

    public Publisher() {
    }

    public int getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(int publisherid) {
        this.publisherid = publisherid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Publisher{" +
                "publisherid=" + publisherid +
                ", name='" + name + '\'' +
                '}';
    }
}
