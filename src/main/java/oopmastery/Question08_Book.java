package oopmastery;

public class Question08_Book {

    private String title;
    private boolean borrowed;

    public Question08_Book(String title) {
        // TODO:
        // Store the title
        // A new book should not be borrowed
        this.title = title;
        this.borrowed = false;
    }

    public void borrow() {
        // TODO:
        // Only allow borrowing if
        // the book is not already borrowed
        if(!this.borrowed == false)this.borrowed =true;
    }

    public void returnBook() {
        // TODO:
        // Mark the book as returned
    }

    public boolean isBorrowed() {
        // TODO:
        return false;
    }

    public String getTitle() {
        // TODO:
        return this.title;
    }
}