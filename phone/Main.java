package oop.phone;

public class Main {
    public static void main(String... args) {
        Contacts help = new Contacts();
        Phone phone = new Samsung.SamsungGalaxy6("Glass", "red", 13141211);
        Phone note9 = new Samsung.SamsungNote9("Alumin", "blue", 1321421);


        phone.addContact(0,1098765, "Mihai", "Eminescu");
        phone.addContact(1,5684185, "Ion", "Creanga");
        phone.listContacts();

        phone.sendMessage(13142421," Salut!");
        phone.sendMessage(13142421," Salut!");


        phone.call(5684185);
        phone.call(5684185);
        phone.call(5684185);

        phone.call(32131241);

        phone.listMessages(13142421);

        phone.viewHistory();
        int batterylevel  = phone.getBatterylevel();
        System.out.println("\n"+batterylevel+" battery level left ");


    }
}
