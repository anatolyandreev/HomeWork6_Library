package by.htp.classes.runner;

public class Book {

	private String title;
	private int year;
	private Author[] authors;
	private int authorCounter;

	public Book() {

	}

	public Book(String title, int year) {
		this.title = title;
		this.year = year;
	}

	public void setAuthors(Author[] authors) {
		if (authors != null) {
			this.authors = authors;
		}
	}

	public Author[] getAuthors() {
		return authors;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void addAuthor(Author author) {
		if (this.authors != null) {
			if (authorCounter < authors.length) {
				authors[authorCounter] = author;
				authorCounter++;
			} else {
				Author[] authors = new Author[this.authors.length + 1];
				for (int i = 0; i < this.authors.length; i++) {
					authors[i] = this.authors[i];
				}
				this.authors = authors;
				this.authors[authorCounter] = author;
				authorCounter++;
			}
		} else {
			this.authors = new Author[2];
			this.authors[authorCounter] = author;
			authorCounter++;
		}
	}

	public Book getBookTitleByAuthorSurname(String surname) {
		Book book = null;
		boolean isFound = false;
		if (this.getAuthors() != null) {
			for (Author author : authors) {
				if (author.getSurname() == surname) {
					book = this;
					isFound = true;
				}
			}
		}
		if (isFound = true) {
			System.out.println("Найдена книга с названием " + this.getTitle() + " автор " + surname);
		}
		return book;
	}

}
