import java.util.ArrayList;
public class Library {
    private final ArrayList<Users> users = new ArrayList<>();
    public void CheckLibrary() {
        if (!users.isEmpty()) {
            System.out.println(" ");
        } else
            System.out.println("In Library no Readers");
        System.out.println("Readers in library = " + this.users.size());
    }
    public void addUser(Users users){
        this.users.add(users);
    }
    public void remove(Users users){
        this.users.remove(users);
        System.out.println();
        System.out.println(Users.UserLeaving() + " Took the Book in table and left the Library");
    }
}
