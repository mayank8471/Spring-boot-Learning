package com.mayank.Convertes;

import java.io.File;
import java.util.Arrays;

import com.mayank.bindings.Address;
import com.mayank.bindings.Person;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class ConverterJavaToXml {

	public static void main(String[] args) throws JAXBException {
		
		Address addr = new Address();
		addr.setCity("prayagraj");
		addr.setCountry("India");
		addr.setState("UP");
		
		Person p1 = new Person();
		
		
		p1.setId(101);
		p1.setName("Mayank");
		p1.setAge(23);
		p1.setPhno((long) 1234567);
		p1.setAddress(addr);
		p1.setType("Docter");
		
		 JAXBContext instance = JAXBContext.newInstance(Person.class);
		 Marshaller marshaller = instance.createMarshaller();
		 
		 marshaller.marshal(p1, new File("Person.xml"));
		 
		 System.out.println("Completes.....");
	}
}
