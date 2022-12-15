package homework8;

import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surNameAuthor;

    public Author(String nameAuthor, String surNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surNameAuthor = surNameAuthor;

    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }
    public String getSurNameAuthor(){
        return this.surNameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(surNameAuthor, author.surNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surNameAuthor);
    }

    public String toString() {
        return nameAuthor + " " + surNameAuthor;
    }
}
