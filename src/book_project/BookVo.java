package book_project;

public class BookVo {
	
	//필드
	private String Book_id;
	private String Author;
	private String title;
	private String pub;
	private int pub_date;
	
	//생성자
	public BookVo() {
	}

	public BookVo(String book_id, String author, String title, String pub, int pub_date) {
		Book_id = book_id;
		Author = author;
		this.title = title;
		this.pub = pub;
		this.pub_date = pub_date;
	}

	//메소드
	public String getBook_id() {
		return Book_id;
	}

	public void setBookid(String book_id) {
		Book_id = book_id;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public int getPub_date() {
		return pub_date;
	}

	public void setPub_date(int pub_date) {
		this.pub_date = pub_date;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "BookVo [Book_id=" + Book_id + ", Author=" + Author + ", title=" + title + ", pub=" + pub + ", pub_date="
				+ pub_date + "]";
	}
	

}
