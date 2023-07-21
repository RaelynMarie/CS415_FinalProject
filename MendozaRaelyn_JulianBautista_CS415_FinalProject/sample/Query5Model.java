package sample;

public class Query5Model {
    Long ISBN;

    String title;

    public Query5Model(Long ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    public Long getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

/*-- Find all the books by ISBN and Title with ratings greater than or equal to 4.0
-- Written by Authors who published with Random House
SELECT DISTINCT R.ISBN, B.title FROM Reading AS R, Books AS B WHERE R.rating >= 4.0 AND R.ISBN = B.ISBN AND R.authorID IN (SELECT DISTINCT A.authorID FROM Authors AS A, Publishers AS P WHERE A.publisherID = P.publisherID AND P.publisherName = "Random House");*/