package com.mayank.Convertes;

import java.io.File;

import com.mayank.bindings.Person;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class ConvertXmlToJava {

	public static void main(String[] args) throws JAXBException {
		File xmlFile = new File("Person.xml");
		
		JAXBContext context = JAXBContext.newInstance(Person.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Object object = unmarshaller.unmarshal(xmlFile);
		
		Person p1 = (Person) object;
		
		System.out.println(p1);
	}
}
