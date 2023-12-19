class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Александр Пушкин", "Евгений Онегин", 1833);

        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год написания: " + book.getYear());

        book.setAuthor("Лев Толстой");
        book.setTitle("Война и мир");
        book.setYear(1869);

        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год написания: " + book.getYear());
    }
}