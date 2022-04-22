package cl.desafiolatam.contactmanager.services;

import java.util.List;

import cl.desafiolatam.contactmanager.model.Contact;

public interface ContactService {
	
	public List<Contact> getContactList();
	public void addContact(Contact contact);
	public void deleteContect(int idContact);

}
