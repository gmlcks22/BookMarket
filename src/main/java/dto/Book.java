package dto;

import java.io.Serializable;

public class Book implements Serializable {
	
	private static final long serialVersionUID = -427470057203867700L;
	
	private String bookId; // 도서 ID
	private String name; // 도서명
	private int unitPrice; // 가격
	private String author; // 저자
	private String description;
	private String publisher;
	private String category;
	private long unitsInStock;
	private String releasedate;
	private String condition;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String bookId, String name, int unitPrice) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public String getBookId() {return bookId;}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getName() { return name;}

	public void setname(String name) {
		this.name = name;
	}

	public int getUnitPrice() {return unitPrice;}

	public void setUtitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getAuthor() {return author;}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription(String description) {return description;}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPuvlisher() {return publisher;}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCategory() {return category;}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitsInStock(long unitsInStock) {return unitsInStock;}

	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getReleaseDate() {return releasedate;}

	public void setReleaseDate(String releasedate) {
		this.releasedate = releasedate;
	}

	public String getCondition() {return condition;}

	public void setCondition(String condition) {
		this.condition = condition;
	}
}
