public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUser kid1 = new KidUser();
        kid1.age = 10;
        kid1.registerAccount();
        kid1.bookType = "Kids";
        kid1.requestBook();

        KidUser kid2 = new KidUser();
        kid2.age = 18;
        kid2.registerAccount();
        kid2.bookType = "Fiction";
        kid2.requestBook();

        AdultUser adult1 = new AdultUser();
        adult1.age = 5;
        adult1.registerAccount();
        adult1.bookType = "Kids";
        adult1.requestBook();

        AdultUser adult2 = new AdultUser();
        adult2.age = 23;
        adult2.registerAccount();
        adult2.bookType = "Fiction";
        adult2.requestBook();
    }
}
