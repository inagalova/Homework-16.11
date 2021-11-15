package npmg.edu.library;

public class Book {
	private String title;
	private String author;
	private String publisher;
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	public Book() {
		this("Harry_Potter", "J.K.Rowling", "Klett");
	}
	public String toString() {
		return String.format("%s %s, %s", getTitle(), getAuthor(), getPublisher());
	}
	
}
