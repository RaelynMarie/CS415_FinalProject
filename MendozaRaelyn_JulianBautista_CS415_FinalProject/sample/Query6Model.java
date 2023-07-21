package sample;

public class Query6Model {
    String title;

    Double bookPrice;

    public Query6Model(String title, Double bookPrice) {
        this.title = title;
        this.bookPrice = bookPrice;
    }

    public String getTitle() {
        return title;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }
}

/*-- List all the books by title and price in the genre Fantasy
        SELECT DISTINCT B.title, S.bookPrice FROM Books AS B, Sells AS S WHERE B.genre = "Fantasy" AND B.ISBN = S.ISBN;*/
