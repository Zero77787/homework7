package homework7;

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
        public void setPublicationYear ( int publicationYear){
            this.publicationYear = publicationYear;
        }

        }


