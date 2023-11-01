package org.Hotel;


public class PageManagerHotel {
	private HotelAdactinPg1    login ;
	private HotelAdactinPg2  searchHotel ;
	private HotelAdactinPg3  selectHotel;
	private HotelAdactinPg4 bookHotel;

	public HotelAdactinPg1 getLogin() {
		if (login==null) {
			login =new HotelAdactinPg1();
		}
		return login;
		}
	public HotelAdactinPg2 getsearchHotel() {
		if (searchHotel==null) {
			searchHotel =new HotelAdactinPg2();
		}
		return searchHotel;
		}
	public HotelAdactinPg3 getselectHotel() {
		if (selectHotel==null) {
			selectHotel =new HotelAdactinPg3();
		}
		return selectHotel;
		}
	public HotelAdactinPg4 getbookHotel() {
		if (bookHotel==null) {
			bookHotel =new HotelAdactinPg4();
		}
		return bookHotel;
		}


	}


