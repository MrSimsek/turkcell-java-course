package com.denizsimsek;

import com.denizsimsek.classes.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static MobilePhone mobilePhone = new MobilePhone("12345");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    // write your code here

        Contact contact1 = Contact.createContact("Deniz", "123456");
        Contact contact2 = Contact.createContact("Eda", "34567");
        Contact contact3 = Contact.createContact("Ece", "893478");

        mobilePhone.addContact(contact1);
        mobilePhone.addContact(contact2);
        mobilePhone.addContact(contact3);

        boolean quit = false;
        printActions();

        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");

            int actionNumber;

            try {
                actionNumber = scanner.nextInt();

                if(actionNumber >= 0 && actionNumber <= 6) {
                    switch (actionNumber) {
                        case 0:
                            System.out.println("Shutting down...");
                            quit = true;
                            break;
                        case 1:
                            showAllContacts();
                            break;
                        case 2:
                            addNewContact();
                            break;
                        case 3:
                            updateExistingContact();
                            break;
                        case 4:
                            removeExistingContact();
                            break;
                        case 5:
                            showContact();
                            break;
                        case 6:
                            printActions();
                            break;
                    }
                } else {
                    System.out.println("Please enter an integer between 0 and 6.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Your input is invalid. Please enter an integer between 0 and 6.");
                scanner.next();
            }
        }

    }

    private static void printActions() {
        System.out.println("\nActions:");
        System.out.println("0 - Shutdown");
        System.out.println("1 - See All Contacts");
        System.out.println("2 - Add New Contact");
        System.out.println("3 - Update a Contact");
        System.out.println("4 - Remove a Contact");
        System.out.println("5 - Get a Contact");
        System.out.println("6 - See All Available Actions");
    }

    private static void showAllContacts() {
        ArrayList<Contact> contacts = mobilePhone.getAllContacts();

        System.out.println("-- All Contacts --");
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

    private static void addNewContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.next();

        System.out.println("Enter contact's phone number: ");
        String phoneNumber = scanner.next();

        Contact newContact = Contact.createContact(name, phoneNumber);

        if(mobilePhone.addContact(newContact)) {
            System.out.println("Added contact: " + newContact.getName() + " -> " + newContact.getPhoneNumber());
        } else {
            System.out.println(newContact.getPhoneNumber() + " is already in your contact list.");
        }
    }

    private static void updateExistingContact() {
        System.out.println("Enter an existing phone number: ");
        String phoneNumber = scanner.next();

        Contact existingContact = mobilePhone.getContact(phoneNumber);

        if(existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.next();

        System.out.println("Enter new contact number: ");
        String newPhoneNumber = scanner.next();

        Contact newContact = Contact.createContact(newName, newPhoneNumber);

        if(mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println(existingContact.getName() + " -> " + existingContact.getPhoneNumber() + " is changed to " + newContact.getName() + " -> " + newContact.getPhoneNumber());
        } else {
            System.out.println("Error occurred while updating contact.");
        }
    }

    private static void removeExistingContact() {
        System.out.println("Enter an existing contact phone number: ");
        String phoneNumber = scanner.next();

        Contact existingContact = mobilePhone.getContact(phoneNumber);

        if(existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.deleteContact(existingContact)) {
            System.out.println("Deleted contact: " + existingContact.getName() + " -> " + existingContact.getPhoneNumber());
        } else {
            System.out.println("Error occurred while deleting the contact.");
        }
    }

    private static void showContact() {
        System.out.println("Enter the contact's phone number: ");
        String phoneNumber = scanner.next();

        Contact existingContact = mobilePhone.getContact(phoneNumber);

        if(existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Selected contact: " + existingContact.getName() + " -> " + existingContact.getPhoneNumber());
    }

    private static void contactsExamples() {
        Contact contact1 = Contact.createContact("Deniz", "123456");
        Contact contact2 = Contact.createContact("Eda", "34567");
        Contact contact3 = Contact.createContact("Ece", "893478");
        Contact contact4 = Contact.createContact("Recep", "123456");
        Contact contact5 = Contact.createContact("Deniz", "23434534");

        mobilePhone.addContact(contact1);
        mobilePhone.addContact(contact2);
        mobilePhone.addContact(contact3);
        mobilePhone.addContact(contact4);
        mobilePhone.addContact(contact5);

        Contact contact2Updated = new Contact(contact2.getName(), "893478");

        mobilePhone.updateContact(contact2, contact2Updated);
        mobilePhone.deleteContact(contact5);

        ArrayList<Contact> contacts = mobilePhone.getAllContacts();

        System.out.println("-- All Contacts --");
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }

        mobilePhone.getContact("893478");
    }

    private static void previousExamples() {
        Person deniz = new Person("Deniz", 27, Gender.MALE);
        deniz.introduce();

        System.out.println("------------");

        Youtuber youtuber = new Youtuber(500);
        youtuber.introduce();

        Camera kodak = new Camera(100, "Kodak");
        youtuber.setCamera(kodak);

        System.out.println(youtuber.getName() + " is using " + youtuber.getCamera().getManufacturer() + " at zoom level of " + youtuber.getCamera().getZoomLevel());

        MyExample myExample = new MyExample();
        MyExample.exampleStatic();

        StorageUtils.save("userEmail", "dnz@gmail.com");
    }
}
