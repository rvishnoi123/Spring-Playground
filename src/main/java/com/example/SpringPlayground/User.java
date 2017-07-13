package com.example.SpringPlayground.assess;

import java.util.List;

import com.example.SpringPlayground.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class User {
private int id;
private String username;
@JsonView(Views.DetailView.class)
private List<Emails> emails;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public List<Emails> getEmails() {
	return emails;
}
public void setEmails(List<Emails> emails) {
	this.emails = emails;
}

}
