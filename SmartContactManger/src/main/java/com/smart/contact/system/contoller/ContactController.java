package com.smart.contact.system.contoller;

import com.smart.contact.system.model.Contact;
import com.smart.contact.system.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContactController {
    @Autowired
    ContactService contactService;

    @PostMapping("/createAndUpdateContact")
    private Contact createAndUpdateContact(@RequestBody Contact contact){
        return contactService.createAndUpdateContact(contact);
    }

    @GetMapping("/findAllContacts")
    private List<Contact> findAllContacts(){
        return contactService.findAllContacts();
    }

    @GetMapping("/findContactById/{cId}")
    private Optional<Contact> findContactById(@PathVariable int cId){
        return contactService.findContactById(cId);
    }

    @DeleteMapping("/deleteContactById/{cId}")
    private Optional<Contact> deleteContactById(@PathVariable int cId){
        Optional<Contact> findContactById = contactService.findContactById(cId);
        if(findContactById.isPresent()){
            contactService.deleteContactById(cId);
            return contactService.findContactById(cId);
        }else{
            return Optional.empty();
        }
    }
}
