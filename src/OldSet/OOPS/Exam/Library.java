package OldSet.OOPS.Exam;
/*
import java.util.OldSet.OOPS.HashMap;

public class Library {
    private OldSet.OOPS.HashMap<OldSet.OOPS.String,Book> bookMap = new OldSet.OOPS.HashMap<>();
    private int totalBookCount = 0;

    public void addBook(Book book){
        bookMap.put(book.getIsbn(),book);
        if(book.isAvailable()){
            totalBookCount++;
        }
    }
    public void borrowbook(OldSet.OOPS.String isbn) throws BookNotFoundException{
        if(!bookMap.containsKey(isbn)){
            throw new BookNotFoundException("Error: Book with ISBN"+ isbn +"not found.");
        }
        Book book = bookMap.get(isbn);
        if(!book.isAvailable()){
            throw new IllegalStateException("Error: The book" + book.getTitle() +" is already borrowed.");
        }
    }
}


 */
