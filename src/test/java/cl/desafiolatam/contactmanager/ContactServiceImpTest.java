package cl.desafiolatam.contactmanager;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cl.desafiolatam.contactmanager.model.Contact;
import cl.desafiolatam.contactmanager.services.ContactService;
import cl.desafiolatam.contactmanager.services.impl.ContactServiceImp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContactServiceImpTest {
	
	private Contact contact;
	private ContactService contactService;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
		contact = new Contact();
		contactService = new ContactServiceImp();
	}
	
	@Test
	public void getContactListTest() {
		assertEquals(new ArrayList<Contact>(), contactService.getContactList());
	}
	
	@Test
	public void addContactTest() {
		contact.setNombre("Pablo");
		contact.setApellidoPaterno("Polanco");
		contact.setApellidoMaterno("Valdes");
		contact.setDireccion("calle falsa 123");
		contact.setIdContact(1);
		contact.setTelefono(123456789);
		contactService.addContact(contact);
		assertEquals(contact,contactService.getContactList().get(0));

	}
	
	@Test
	public void deleteContectTest() {
		int id = 1;
		contact.setNombre("Pablo");
		contact.setApellidoPaterno("Polanco");
		contact.setApellidoMaterno("Valdes");
		contact.setDireccion("calle falsa 123");
		contact.setIdContact(1);
		contact.setTelefono(123456789);
		contactService.addContact(contact);
		contactService.deleteContect(id);
		assertEquals(0, contactService.getContactList().size());
		
	}

}
