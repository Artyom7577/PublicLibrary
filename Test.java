public class Test {
    public static void main(String[] args) throws InterruptedException {
        Book books = new Book.Books("Prata", "Schildt", "Reese").giveToUser();

        Users user1 = new Users.User1(books).UserName("Tina").GoToLibrary().Reed();
        Users user2 = new Users.User1(books).UserName("Tom").GoToLibrary().Reed();

        Library No1 = new Library();
        No1.addUser(user1);
        No1.addUser(user2);
        No1.CheckLibrary();

        No1.remove(user1);
        No1.CheckLibrary();
    }
}
