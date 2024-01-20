package cholog;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "author")
    private Set<BookAuthor> bookAuthors = new HashSet<>();

    @OneToOne
    private Person person;

    public Author(Person person) {
        this.person = person;
    }

    public Author() {}

    public Long getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }
}
