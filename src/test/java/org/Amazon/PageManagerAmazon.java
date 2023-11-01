package org.Amazon;



public class PageManagerAmazon{
private AmazonPomPg1 login ;
private AmazonPomPg2 searchProduct;
private AmazonPomPg3  addCard;
public AmazonPomPg1 getLogin() {
	if (login==null) {
		login =new AmazonPomPg1();
	}
	return login;
}
	public AmazonPomPg2 getsearchProduct() {
		if (searchProduct==null) {
			searchProduct =new AmazonPomPg2();
		}
		return searchProduct;
	}
	public AmazonPomPg3 getaddCard() {
		if (addCard==null) {
			addCard =new AmazonPomPg3();
		}
		return addCard;
	}



}
