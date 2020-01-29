package com.lamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lamp.entities.Applicant;
import com.lamp.entities.dao.ApplicantDao;

@Service
public class ApplicantServiceImpl implements ApplicantService {

	@Autowired
	private ApplicantDao applicantDaoImpl;
	
	public void addApplicant(Applicant applicant) {
		
		applicantDaoImpl.addApplicant(applicant);
		
	}
}

