package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author asprin = new Author("Asprin", "Robert");
        Author perumov = new Author("Perumov", "Nik");
        perumov.setFirstName("Nick");

        Book book1 = new Book("Thieves' World", asprin, 1979);
        Book book2 = new Book("Ring of Darkness", perumov, 1992);
        book2.setYear(1993);

        System.out.println("\nMinimal level");
        System.out.printf("Название: %s. Год публикации: %d. Автор: %s.%n", book1.getName(), book1.getYear(), book1.getAuthor());
        System.out.printf("Название: %s. Год публикации: %d. Автор: %s.%n", book2.getName(), book2.getYear(), book2.getAuthor());
    }
}
