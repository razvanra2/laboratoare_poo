
public class BookStoreCheck {
	public boolean checkIdentical(Book b1, Book b2) {
		if( b1.title.equals(b2.title) && b1.author.equals(b2.author) && b1.publisher.equals(b2.publisher) && b1.pageCount == b2.pageCount) {
			return true;
		}
		return false;
	}

	public Book getkThicc(Book b1, Book b2) {
		if(b1.pageCount > b2.pageCount)
			return b1;
		return b2;
	}
}
