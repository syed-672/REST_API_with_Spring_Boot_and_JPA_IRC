package org.crud.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class UserModel {
	@Id
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getUserph() {
		return userph;
	}
	public void setUserph(String userph) {
		this.userph = userph;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	private int userid;
	private String user;
	private String userph;
	private String useremail;
}
