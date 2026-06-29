package Exam;

public class BookNotFound {
    public class BookNotFoundException extends Exception {
        public BookNotFoundException(String message) {
            super(message);
        }
    }
}
