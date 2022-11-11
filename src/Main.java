public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King");
        Book book1 = new Book ("It", author1, 1986);
        System.out.println(book1.getBookName() + " " + author1.getAuthorFirstName () + " " + author1.getAuthorLastName () + " " + book1.getPublishingYear());

        Author author2 = new Author("Lewis", "Carroll");
        Book book2 = new Book ("Alice's Adventures in Wonderland", author2, 1865);
        System.out.println(book2.getBookName() + " " + author2.getAuthorFirstName () + " " + author2.getAuthorLastName () + " " + book2.getPublishingYear());
        book2.setPublishingYear(1862);
        System.out.println("book2.getPublishingYear() = " + book2.getPublishingYear());

    }
}