package model;

public class Book {
    private int id;
    private AbstractBook book;
    private int duplicateCount;
    private boolean isGiven;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AbstractBook getBook() {
        return book;
    }

    public void setBook(AbstractBook book) {
        this.book = book;
    }

    public int getDuplicateCount() {
        return duplicateCount;
    }

    public void setDuplicateCount(int duplicateCount) {
        this.duplicateCount = duplicateCount;
    }

    public boolean isGiven() {
        return isGiven;
    }

    public void setIsGiven(boolean isGiven) {
        this.isGiven = isGiven;
    }
}
