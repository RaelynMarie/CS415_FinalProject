package sample;

public class Query2Model {
    String authorName;
    Integer BookCount;

    public Query2Model(String authorName, Integer bookCount) {
        this.authorName = authorName;
        BookCount = bookCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Integer getBookCount() {
        return BookCount;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBookCount(Integer bookCount) {
        BookCount = bookCount;
    }
}

/*-- Display the names of authors with the number of books they have written
SELECT DISTINCT A.aName, COUNT(B.ISBN) AS BookCount FROM Books AS B, Authors AS A WHERE B.authorID = A.authorID GROUP BY B.authorID;*/
