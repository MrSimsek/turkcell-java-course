package com.denizsimsek.classes;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contactArrayList;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactArrayList = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        if(isContactExist(contact.getPhoneNumber())) return false;

        contactArrayList.add(contact);
        return true;
    }

    private boolean isContactExist(Contact contact) {
        return contactArrayList.contains(contact);
    }

    private boolean isContactExist(String phoneNumber) {
        for(Contact contact : contactArrayList) {
            if(contact.getPhoneNumber().equals(phoneNumber)) return true;
        }

        return false;
    }

    public boolean updateContact(Contact existingContact, Contact updatedContact) {
        if(!isContactExist(existingContact)) {
            System.out.println(existingContact.getName() + " was not found in your contacts.");
            return false;
        } else if (isContactExist(updatedContact.getPhoneNumber())) {
            System.out.println(updatedContact.getPhoneNumber() + " is already in your contact list.");
            return false;
        }

        int existingContactIndex = contactArrayList.indexOf(existingContact);

        contactArrayList.set(existingContactIndex, updatedContact);
        return true;
    }

    public boolean deleteContact(Contact contact) {
        if(!isContactExist(contact)) {
            System.out.println(contact.getName() + " was not found in your contacts.");
            return false;
        }

        int contactIndex = contactArrayList.indexOf(contact);

        contactArrayList.remove(contactIndex);
        return true;
    }

    public ArrayList<Contact> getAllContacts() {
        return contactArrayList;
    }

    public Contact getContact(String phoneNumber) {
        for(Contact contact : contactArrayList) {
            if(contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }

        return null;
    }
}
