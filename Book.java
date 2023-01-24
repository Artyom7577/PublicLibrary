import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Book {
    private static String name;
    public static class Books{
        private final String name;
        public Books(String ... bookname){
            this.name = Arrays.toString(bookname);
            List<String> books = new ArrayList<>();
            books.add(Arrays.toString(bookname));
        }
        public Book giveToUser(){
            return new Book(this);
        }
    }
    private Book(Books bookss){
        name = bookss.name;
    }
    public static String getBookName(){
        return name;
    }
}
