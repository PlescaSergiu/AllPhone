package oop.phone;

import java.util.ArrayList;
import java.time.LocalTime;
import java.util.List;

public abstract class Phone implements All_Phones {
    LocalTime time = LocalTime.now();

    private Contacts contacts;
    private List<Contacts> agenda = new ArrayList<>();
    private List<Contacts> callHistory = new ArrayList<>();
    private List<Message> messageHistory = new ArrayList<Message>();
    private long IMEI;
    private int batterylevel;


    public long getIMEI() {
        return IMEI;
    }

    public void setIMEI(long IMEI) {
        this.IMEI = IMEI;
    }

    public int getBatterylevel() {
        return batterylevel;
    }

    public void setBatterylevel(int batterylevel) {
        this.batterylevel = batterylevel;
    }

    @Override
    public void addContact(int index, int number, String firstName, String lastName) {
        agenda.add(index, new Contacts(number, firstName, lastName));

    }


    @Override
    public void listContacts() {
        for (int i = 0; i < agenda.size(); i++) {
            System.out.print("\n" + agenda.get(i));
        }
    }

    @Override
    public void sendMessage(int number, String text) {
        int messageIndex = 0;
        if (text.length() > 100) {
            System.out.println("Error!!The message contains more than 100 characters");
            return;
        }
        System.out.println("\nMessage was sent to " + number + " at " + time.toString());
        messageHistory.add(new Message(number, text));

        batterylevel -= 1;

    }


    @Override
    public boolean call(int number) {
        int index;
        boolean foundnumber = false;
        for (index = 0; index < agenda.size(); index++) {
            if (agenda.get(index).getNumber() == number) {
                callHistory.add(agenda.get(index));
                System.out.println("Calling " + agenda.get(index));
                foundnumber = true;
                break;
            }

        }
        if (foundnumber == false) {
            agenda.add(new Contacts(number));
            System.out.println("Calling " + number);
            callHistory.add(agenda.get(index));


        }
        batterylevel -= 2;
        return false;
    }


    @Override
    public void viewHistory() {
        for (int i = 0; i < callHistory.size(); i++) {
            System.out.print("\nYou call" + callHistory.get(i) + " at " + time.toString());
        }


    }

    @Override
    public void listMessages(int number) {
        System.out.println("Listing messages to " + number);
        for (Message stringMessage : messageHistory) {

            if (stringMessage.getNumber() == number) {

                System.out.println(stringMessage.toString());

            }

        }


    }

    static class Message {

        private int number;
        private String message;

        public Message(int number, String message) {
            this.number = number;
            this.message = message;
        }

        public int getNumber() {
            return number;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public String toString() {
            return "Message{" +
                    "number='" + number + '\'' +
                    ", text= " + message + '\'' +
                    '}';
        }
    }

}



