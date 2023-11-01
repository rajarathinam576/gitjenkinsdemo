package org.FacebookTest;

public class PageManagerFb {
	private FacebookPomPg1 login ;
	public FacebookPomPg1 getLogin() {
		if (login==null) {
			login =new FacebookPomPg1();
		}
		return login;
}

private FacebookPomPg2 signUp ;
public FacebookPomPg2 getSignUp() {
	if (signUp==null) {
		signUp =new FacebookPomPg2();
	}
	return signUp;
}
private FacebookPomPg3 forgotPassword ;
public FacebookPomPg3 getforgotPassword () {
	if (forgotPassword ==null) {
		forgotPassword  =new FacebookPomPg3();
	}
	return forgotPassword ;
}
}