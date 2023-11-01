package org.FlipkardTest;



public class PageManagerFlipkard {
	private  FlipkardPomPg1 search ;
	public FlipkardPomPg1 getSearch() {
		if (search==null) {
			search =new FlipkardPomPg1();
		}
		return search;
}
	private  FlipkardProduct1 product ;
	public FlipkardProduct1 getProduct() {
		if (product==null) {
			product =new FlipkardProduct1();
		}
		return product;

}
	private  FlipkardProduct2 product1 ;
	public FlipkardProduct2 getProduct1() {
		if (product1==null) {
			product1 =new FlipkardProduct2();
		}
		return product1;
}
}