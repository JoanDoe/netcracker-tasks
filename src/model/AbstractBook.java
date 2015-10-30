package model;

import java.util.Date;

public class AbstractBook {
    private Author author;
    private String title;
    private Date publicationDate;
    private int pagesQuantity;
    private String publishingHouse;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPagesQuantity() {
        return pagesQuantity;
    }

    public void setPagesQuantity(int pagesQuantity) {
        this.pagesQuantity = pagesQuantity;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
}
