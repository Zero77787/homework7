package homework7;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джоан","Роулинг" );
        Author author2 = new Author("Андрей","Кочергин" );
        Book book1 =  new Book("Гарри Поттер",1992,author1);
        Book book2 =  new Book("Мужик с топором",2008,author2);
        book1.setPublicationYear(2022);

    }
}