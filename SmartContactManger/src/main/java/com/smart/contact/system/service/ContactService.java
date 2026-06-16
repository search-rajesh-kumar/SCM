package com.smart.contact.system.service;

import com.smart.contact.system.model.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {

    Contact createAndUpdateContact(Contact contact);

    List<Contact> findAllContacts();

    Optional<Contact> findContactById(int cId);

    void deleteContactById(int cId);

}
