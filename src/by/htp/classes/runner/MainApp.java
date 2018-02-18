package by.htp.classes.runner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MainApp {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

		Date date1 = df.parse("13-01-2001");
		Date date2 = df.parse("06-06-1903");
		Date date3 = df.parse("13-01-2001");
		Date date4 = df.parse("06-06-1903");
		Date date5 = df.parse("06-06-1903");
		Date date6 = df.parse("06-06-1903");


		Author auth1 = new Author("NameAuthor1", "SurnameAuthor1", date1);
		Author auth2 = new Author("NameAuthor2", "SurnameAuthor1", date2);
		Author auth3 = new Author("NameAuthor3", "SurnameAuthor3", date3);
		Author auth4 = new Author("NameAuthor4", "SurnameAuthor4", date4);
		Author auth5 = new Author("NameAuthor5", "SurnameAuthor5", date5);
		Author auth6 = new Author("NameAuthor6", "SurnameAuthor6", date6);

		Book book1 = new Book("Book1", 2006);
		Book book2 = new Book("Book2", 1950);
		Book book3 = new Book("Book3", 2001);
		Book book4 = new Book("Book4", 2011);
		Book book5 = new Book("Book5", 2011);

	//	Book book12 = book1;
		
	//	Author[] authors = new Author[]{auth1, auth2};
		
		book2.addAuthor(auth1);
		book2.addAuthor(auth2);
		book2.addAuthor(auth3);
		book2.addAuthor(auth4);
		book2.addAuthor(auth5);
		book2.addAuthor(auth6);
		
		Book[] books = {book1, book2, book3, book4};
		
		System.out.println(book2.getAuthors().length);
		System.out.println();
		
		Library lib = new Library();
		lib.setBooks(books);
		for (Book book : lib.getBooks()) {
			System.out.println(book.getTitle());
		}	
		System.out.println("======================");
		
		lib.deleteBookWithLoop("Book4");
		for (Book book : lib.getBooks()) {
			System.out.println(book.getTitle());
		}
		System.out.println("======================");
		
		lib.addBook(book5);
		for (Book book : lib.getBooks()) {
			System.out.println(book.getTitle());
		}
		

		lib.searchBooksByAuthorSurname("SurnameAuthor1");
	}
}
