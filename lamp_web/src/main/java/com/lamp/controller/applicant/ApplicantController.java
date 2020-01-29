package com.lamp.controller.applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lamp.ApplicantService;
import com.lamp.entities.Applicant;


@RestController
public class ApplicantController {

	@Autowired
	public ApplicantService applicantServiceImpl;
	
	@PostMapping("/apply")
	public Applicant addApplicant(@RequestBody Applicant applicant) {
		
		
		return null;
		
	}
	
	
}
