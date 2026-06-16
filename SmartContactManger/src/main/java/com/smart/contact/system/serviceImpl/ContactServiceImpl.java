package com.smart.contact.system.serviceImpl;

import com.smart.contact.system.model.Contact;
import com.smart.contact.system.repository.ContactRepo;
import com.smart.contact.system.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactRepo contactRepo;

    @Override
    public Contact createAndUpdateContact(Contact contact) {
        Optional<Contact> oldContactData = contactRepo.findById(contact.getcId());
        if(oldContactData.isPresent()){
            Contact newContactData = oldContactData.get();
            newContactData.setcId(contact.getcId());
            newContactData.setName(contact.getName());
            newContactData.setSecondName(contact.getSecondName());
            newContactData.setWork(contact.getWork());
            newContactData.setEmail(contact.getEmail());
            newContactData.setPhone(contact.getPhone());
            newContactData.setImageUrl(contact.getImageUrl());
            newContactData.setDescription(contact.getDescription());
            return contactRepo.save(newContactData);
        }else {
            return contactRepo.save(contact);
        }
    }

    @Override
    public List<Contact> findAllContacts() {
        return contactRepo.findAll();
    }

    @Override
    public Optional<Contact> findContactById(int cId) {
        return contactRepo.findById(cId);
    }

    @Override
    public void deleteContactById(int cId) {
        contactRepo.deleteById(cId);
    }
}
