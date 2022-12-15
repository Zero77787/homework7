package homework8;

import java.util.Objects;

public class Book {
    private String nameBookDirectory;
    private int publicationYear;

    private Author author;

    public Book(String nameBookDirectory, int publicationYear, Author author) {
        this.nameBookDirectory = nameBookDirectory;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getNameBookDirectory() {
        return this.nameBookDirectory;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(nameBookDirectory, book.nameBookDirectory) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBookDirectory, publicationYear, author);
    }

    public String toString() {
        return "Название : "+nameBookDirectory + ", Год издания : " + publicationYear + ", Автор: " + author;
    }
}
