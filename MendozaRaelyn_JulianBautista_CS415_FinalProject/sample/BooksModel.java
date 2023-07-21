package sample;

import java.sql.Date;

public class BooksModel {
    Long ISBN;
    String title;
    String genre;
    Integer authorID;
    Integer publisherID;
    Date publishDate;

    public BooksModel(Long ISBN, String title, String genre, Integer authorID, Integer publisherID, Date publishDate) {
        this.ISBN = ISBN;
        this.title = title;
        this.genre = genre;
        this.authorID = authorID;
        this.publisherID = publisherID;
        this.publishDate = publishDate;
    }

    public Long getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getAuthorID() {
        return authorID;
    }

    public Integer getPublisherID() {
        return publisherID;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthorID(Integer authorID) {
        this.authorID = authorID;
    }

    public void setPublisherID(Integer publisherID) {
        this.publisherID = publisherID;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
