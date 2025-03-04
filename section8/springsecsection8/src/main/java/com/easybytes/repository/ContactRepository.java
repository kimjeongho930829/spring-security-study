package com.easybytes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.easybytes.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {
	
	
}
