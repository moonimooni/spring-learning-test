package cholog;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "book")
    private Set<BookAuthor> bookAuthors = new HashSet<>();

    @ManyToOne
    private Publisher publisher;

    public Book() {}

    public Book(String name, Publisher publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Set<BookAuthor> getAuthors() {
        return bookAuthors;
    }
}
