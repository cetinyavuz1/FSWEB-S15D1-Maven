package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("John Doe", "123123123"));
        contacts.add(new Contact("Jane Doe", "124124124"));
        contacts.add(new Contact("Baby Doe", "125125125"));
        MobilePhone mobilePhone = new MobilePhone("11111111", contacts);

        System.out.println(mobilePhone.getMyContacts().size());

        Contact contact = new Contact("Test", "12345678");
        mobilePhone.addNewContact(new Contact("Test", "12345678"));

        System.out.println(mobilePhone.getMyContacts().size());

        System.out.println(mobilePhone.removeContact(contact));
        System.out.println(mobilePhone.getMyContacts().size());

    }
}
