package cl.desafiolatam.contactmanager.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.contactmanager.model.Contact;
import cl.desafiolatam.contactmanager.services.ContactService;


@Service
public class ContactServiceImp implements ContactService {
	
	
	private List<Contact> listContact;
	
	
	public ContactServiceImp() {
		
		this.listContact = new ArrayList<Contact>();
	}

	@Override
	public List<Contact> getContactList() {
		
		return listContact;
	}

	@Override
	public void addContact(Contact contact) {
		contact.setIdContact(listContact.size() + 1);
		listContact.add(contact);
		
	}

	@Override
	public void deleteContect(int idContact) {
		listContact.remove(idContact - 1);
		
	}

}
