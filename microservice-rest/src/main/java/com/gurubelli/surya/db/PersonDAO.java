package com.gurubelli.surya.db;

import org.hibernate.SessionFactory;

import com.gurubelli.surya.core.Person;

import io.dropwizard.hibernate.AbstractDAO;

public class PersonDAO extends AbstractDAO<Person> {

	public PersonDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}
	//public Person

}
