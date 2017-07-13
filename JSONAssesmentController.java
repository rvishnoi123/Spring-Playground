package com.example.SpringPlayground;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringPlayground.assess.Activities;
import com.example.SpringPlayground.assess.Emails;
import com.example.SpringPlayground.assess.Status;
import com.example.SpringPlayground.assess.User;
import com.example.SpringPlayground.entity.Flight;
import com.fasterxml.jackson.annotation.JsonView;

@RestController
public class JSONAssesmentController {
@GetMapping("/active")

	public List<Activities> getActivity()
	{
	User user= new User();
	user.setId(12);
	user.setUsername("Rishabh");
	List<Emails> lemail=new ArrayList<Emails>();
	Emails email=new Emails();
	email.setId(32);
	email.setAddress("HoysalaNagar");
	email.setPrimary(true);
	lemail.add(email);
	user.setEmails(lemail);
	
	
	
	Status status=new Status();
		status.setText("hello");
		status.setDate(new Date());
		Activities activities=new Activities();
     	activities.setUser(user);
		activities.setStatus(status);
		
		List<Activities> sample=new ArrayList<Activities>();
		sample.add(activities);
		sample.add(activities);
		return sample;
	}
	
	
}
