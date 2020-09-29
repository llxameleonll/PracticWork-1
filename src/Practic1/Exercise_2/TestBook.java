package Practic1.Exercise_2;

public class TestBook {

    public static void main(String[] args) {
        Book b1 = new Book("Pushkin", 100);
        System.out.println(b1);

        Book b2 = new Book ("Lermontov", 234);
        System.out.println(b2);

        Book b3 = new Book ("Tolstoy", 88);
        System.out.println(b3);

        Book b4 = new Book ("Turgenev", 94);
        System.out.println(b4);

        Book b5 = new Book ("Dostoevsky", 211);
        System.out.println(b5);

        Book b6 = new Book ("Nekrasov");
        System.out.println(b6);

    }

}

