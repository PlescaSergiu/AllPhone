package oop.phone;

public interface All_Phones {

    void addContact(int index,int number, String firstName, String lastName);

    void sendMessage(int number, String text);

    boolean call(int number);

    void viewHistory();

    void listMessages(int number);

    void listContacts();
}
