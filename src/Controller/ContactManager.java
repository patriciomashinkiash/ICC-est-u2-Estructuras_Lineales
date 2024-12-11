package Controller;

import Models.Contact;
import Models.LinkedList;

public class ContactManager {

    private LinkedList<Contact<?,?>> conctacts;

    public ContactManager() {
        conctacts = new LinkedList<>();
    }

    public void addContact(Contact<?,?> contact) {
        conctacts.appendTotail(contact);
    }

    public void findContactByName() {

    }

    public void deleteContactByName() {

    }

    public void printList() {
        conctacts.print();

    }
}