package com.example.security.Controller;

public class JwtRequest {

	private String useremail;
	private String password;

	public JwtRequest(String useremail, String password) {
		super();
		this.useremail = useremail;
		this.password = password;
	}

	@Override
	public String toString() {
		return "JwtRequest [useremail=" + useremail + ", password=" + password + "]";
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
