import java.util.Scanner;

public class BookstoreTest {
	public static void main(String args[]) {
		Book bookTest = new Book();
		Scanner s = new Scanner(System.in);
		String title = s.nextLine();
		String author = s.nextLine();
		String publisher = s.nextLine();
		String pageNr = s.nextLine();
		
		int temp = Integer.parseInt(pageNr);
		while( temp == 0 ) {
			System.out.println("page nr can't be 0");
			pageNr = s.nextLine();
			temp = Integer.parseInt(pageNr);
		}
		s.close();
		
		bookTest.title = title;
		bookTest.author = author;
		bookTest.publisher = publisher;
		bookTest.pageCount = temp;
		
		System.out.println(bookTest.title);
		System.out.println(bookTest.author);
		System.out.println(bookTest.publisher);
		System.out.println(bookTest.pageCount);
		
		BookStoreCheck checking = new BookStoreCheck();
		
		Book book1 = new Book();
		Book book1copy = new Book();
		Book book2 = new Book();
		
		book1.title = "A Game of Thrones";
		book1.author = "GRRM";
		book1.publisher = "Nemira";
		book1.pageCount = 800;
		
		book1copy.title = "A Game of Thrones";
		book1copy.author = "GRRM";
		book1copy.publisher = "Nemira";
		book1copy.pageCount = 800;
		
		book2.title = "Harry Potter";
		book2.author = "JK Rowling";
		book2.publisher = "Pigna";
		book2.pageCount = 315;
		
		System.out.println(checking.getkThicc(book1, book2).title);
		System.out.println(checking.checkIdentical(book1, book1copy));
		System.out.println(checking.checkIdentical(book1, book2));
		
		
		Book lastBook = new Book();
		lastBook.title = "behind HER eYeS";
		lastBook.author = "Sarah Pinborough";
		lastBook.publisher = "PENGUIN";
		lastBook.pageCount = 400;
		
		System.out.println("BOOK_TITLE: " + lastBook.title.toUpperCase());
		System.out.println("BOOK_AUTHOR: " + lastBook.author);
		System.out.println("BOOK_PUBLISHER: " + lastBook.publisher.toLowerCase());
	}
}
