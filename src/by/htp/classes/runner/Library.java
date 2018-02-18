package by.htp.classes.runner;

public class Library {
	
	private Book[] books;
	private int bookCounter;

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public int getBooksNumber() {
		return books.length;
	}
	
	public void addBook(Book book) {
		bookCounter = getBooksNumber();
		if (this.books != null) {
			if (bookCounter < books.length) {
				books[bookCounter] = book;
				bookCounter++;
			} else {
				Book[] books = new Book[this.books.length + 1];
				for (int i = 0; i < this.books.length; i++) {
					books[i] = this.books[i];
				}
				this.books = books;
				this.books[bookCounter] = book;
				bookCounter++;
			}
		} else {
			this.books = new Book[2];
			this.books[bookCounter] = book;
			bookCounter++;
		}
	}
	
	public void deleteBookWithLoop(String title) {
		boolean isFound = false;
		for (int i = 0; i < books.length; i++) {
			if (books[i].getTitle() == title) {
				System.out.println("Книга с названием " + title + " найдена в библиотеке");
				isFound = true;
				Book[] tempBooks = new Book[books.length-1];
				for (int j = i; j < books.length-1; j++) {
					books[j] = books[j+1];
				}
				for (int k = 0; k< tempBooks.length; k++) {
					tempBooks[k] = books[k];
				}
				books = tempBooks;
			}
			}
		if (isFound == false) {
			System.out.println("Книга с названием " + title + " в библиотеке не найдена, увы, попытайте счастье еще разок");
		} else {
			System.out.println("Книга с названием " + title + " была удалена из библиотеки");
		}
	}
	

	
	public void searchBooksByAuthorSurname(String surname) {
		for (Book book : books) {
			book.getBookTitleByAuthorSurname(surname);
				}
			}
		
	
	
	//TODO
	public void deleteBooksWithArrayCopy(String title) {
		
	}

}
