import java.util.Stack;

public class StackDemo15 {
    public static void main(String[] args) {
        Book15 book1 = new Book15("1234", "Dasar Pemrograman");
        Book15 book2 = new Book15("7145", "Hafalah Shalat Delisa");
        Book15 book3 = new Book15("3562", "Muhammad Al-Fatih");

        Stack<Book15> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book15 temp = books.peek();
        if (temp != null) System.out.println(temp.toString());

        Book15 temp2 = books.pop();
        if (temp != null) System.out.println(temp2.toString());

        for (Book15 book : books) System.out.println(book.toString());

        System.out.println(books);
        System.out.println(books.search(book2));
        
    }
}
