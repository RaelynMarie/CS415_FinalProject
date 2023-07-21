package sample;

public class Query7Model {
    String title;

    String publisherName;

    public Query7Model(String title, String publisherName) {
        this.title = title;
        this.publisherName = publisherName;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
}

/*-- Display the publisher name and book title of the publisher with the highest priced book
SELECT B.title, P.publisherName AS Publisher FROM Sells AS S, Books AS B, Publishers as P WHERE S.ISBN = B.ISBN AND B.publisherID = P.publisherID AND S.bookPrice = (SELECT MAX(S.bookPrice) AS MaxBook FROM Sells AS S);*/