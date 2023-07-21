package sample;

public class Query8Model {
    String genre;

    Integer avgAGE;

    public Query8Model(String genre, Integer avgAGE) {
        this.genre = genre;
        this.avgAGE = avgAGE;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getAvgAGE() {
        return avgAGE;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAvgAGE(Integer avgAGE) {
        this.avgAGE = avgAGE;
    }
}

/*-- Display the average age of readers for each genre
SELECT B.genre, ROUND(AVG(U.age)) AS avgAGE FROM Books AS B, Reading AS R, Users AS U WHERE B.ISBN = R.ISBN AND R.userID = U.userID AND R.bookStatus = "Completed" GROUP BY B.genre;*/
