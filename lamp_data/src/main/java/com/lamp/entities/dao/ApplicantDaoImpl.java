package com.lamp.entities.dao;


import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lamp.entities.Applicant;

import org.springframework.stereotype.Repository;

@Repository
public class ApplicantDaoImpl implements ApplicantDao {

	@Autowired 
	private SessionFactory sessionFactory;
	
	private Logger logger = Logger.getLogger(ApplicantDaoImpl.class.getName());
	
	@Transactional
	public void addApplicant(Applicant applicant) {
			
		Session currentSession = sessionFactory.getCurrentSession();
		
		logger.info("Saving applicant in the database" + applicant.toString());
		currentSession.save(applicant);
	}
	
	
	
	

}
