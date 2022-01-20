package dao;

import java.util.ArrayList;

import dto.Book;

public class BookRepository {
	private ArrayList<Book> listOfBooks = new ArrayList<Book>();
	private static BookRepository instance = new BookRepository();
	public BookRepository() {
		Book book1 = new Book("141141141","[Hello Coding]HTML5+CSS3",15000);
		book1.setDescription("워드나 PPT 문서를 만들 수 있나요? 그러면 문제 없습니다. 지금 바로 웹페이지 제작에 도전해보세요.");
		book1.setAuthor("황재호");
		book1.setPublisher("한빛미디어");
		book1.setTotalPages(268);
		book1.setUnitsInStock(1000);
		book1.setReleaseDate("2020/10/28");
		book1.setFilename("P1234.png");
		
		Book book2 = new Book("9999999","\"[IT모바일]스프링4 입문",27000);
		book2.setDescription("스프링은 단순히 사용 방법만 익히는 것보다 아키텍처를 어떻게 이해하고 설계하는지가 더 중요합니다.");
		book2.setAuthor("하세가와 유이치, 오오노 와타루, 토키 코헤이(권은철, 전민수");
		book2.setPublisher("한빛미디어");
		book2.setTotalPages(268);
		book2.setUnitsInStock(1000);
		book2.setReleaseDate("2020/10/28");
		book2.setFilename("P1234.png");
		
		Book book3 = new Book("8888888","IT모바일]쉽게 배우는 자바 프로그래밍",27000);
		book3.setDescription("객체 지향의 핵심과 자바의 현대적 기능을 충실히 다루면");
		book3.setAuthor("우종중");
		book3.setPublisher("한빛아카데미");
		book3.setTotalPages(268);
		book3.setUnitsInStock(1000);
		book3.setReleaseDate("2020/10/28");
		book3.setFilename("P1234.png");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
		
	}
	public ArrayList<Book> getAllBooks(){
		return listOfBooks;
	}
	
	public Book getBookById(String bookId) {
		Book bookById = null;
		
		for(int i=0;i<listOfBooks.size();i++) {
			Book book = listOfBooks.get(i);
			if(book != null && book.getBookId() != null && book.getBookId().equals(bookId)) {
				bookById = book;
				break;
			}
		}
		return bookById;
	}
	public static BookRepository getInstance() {
		return instance;
	}
	public void addBook(Book book) {
		listOfBooks.add(book);
	}
}