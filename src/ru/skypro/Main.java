package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //easy
        Author asprin = new Author("Asprin", "Robert");
        Author perumov = new Author("Perumov", "Nik");
        Author king = new Author("King", "Stephen");
        Author pushkin = new Author("Pushkin", "Alexander");
        Author gogol = new Author("Gogol", "Nikolay");

        perumov.setFirstName("Nick");

        Book book1 = new Book("Thieves' World", asprin, 1979);
        Book book2 = new Book("Ring of Darkness", perumov, 1992);

        book2.setYear(1993);

        System.out.println("\nMinimal level");
        System.out.printf("Название: %s. Год публикации: %d. Автор: %s.%n", book1.getName(), book1.getYear(), book1.getAuthor());
        System.out.printf("Название: %s. Год публикации: %d. Автор: %s.%n", book2.getName(), book2.getYear(), book2.getAuthor());
        System.out.println();

        //medium
        System.out.println("Medium level");

        Book[] arrayBooks = new Book[7];

        addBooks(arrayBooks,book1);
        addBooks(arrayBooks,book2);

        Book book3 = new Book("The green mile", king, 1996);
        Book book4 = new Book("Ruslan and Ludmila", pushkin, 1820);
        Book book5 = new Book("Dead souls", gogol, 1842);


        addBooks(arrayBooks, book3);
        addBooks(arrayBooks, book5);
        addBooks(arrayBooks, book4);

        printArray(arrayBooks);

    }
    public static void printArray(Book[] array) {
        System.out.println("Вывод массива");
        for (Book book : array) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public static void addBooks(Book[] array, Book plusBook) {
        if (isFull(array)) {
            System.out.println("Невозможно добавить книгу " + plusBook + ", в массиве нет места");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = plusBook;
                return;
            }
        }
    }

    public static boolean isFull(Book[] array) {
        boolean full = false;
        for (Book book : array) {
            if (book == null) {
                full = false;
            } else {
                full = true;
            }
        }
        return full;
    }
}









