import java.util.ArrayList;
public class Users {
    private static String userName;
    private Users(User1 Allusers){
        userName = Allusers.userName;
    }
    public static class User1 {
        private String userName;
        public User1(Book bookss){
            ArrayList<Book> books = new ArrayList<>();
            books.add(bookss);
        }
        public User1 GoToLibrary() throws InterruptedException{
            System.out.println(userName + " goes to the library ");
            Thread.sleep(1000);
            System.out.println(userName + " choose one of this books -> " + Book.getBookName());
            Thread.sleep(1000);
            return this;
        }
        public User1 UserName(String name) throws InterruptedException{
            this.userName = name;
            Thread.sleep(1000);
            return this;
        }
        public Users Reed(){
            System.out.println("And than " + userName + " starts reading the book");
            return new Users(this);
        }
    }
    public static String UserLeaving(){
        return userName;
    }
}
