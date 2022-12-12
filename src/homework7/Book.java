package homework7;

public class Book {
    private String nameBookDirectory;
    private int publicationYear;

    public Book(String nameBookDirectory, int publicationYear) {
        this.nameBookDirectory = nameBookDirectory;
        this.publicationYear = publicationYear;
    }

    public String getNameBookDirectory() {
        return this.nameBookDirectory;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setYearPublication(int yearPublication) {
        this.publicationYear = publicationYear;
    }
}
