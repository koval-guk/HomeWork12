package phonebook;

public class App {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("bot1","111");
        phoneBook.add("bot2","222");
        phoneBook.add("bot3","333");
        phoneBook.add("bot4","444");
        phoneBook.add("bot5","555");
        phoneBook.add("bot6","666");
        phoneBook.add("bot7","777");
        phoneBook.add("bot8","888");
        phoneBook.add("bot9","999");
        phoneBook.add("bot3","000");
        System.out.println(phoneBook.find("bot3"));
        System.out.println(phoneBook.findAll("bot3"));
    }
}
