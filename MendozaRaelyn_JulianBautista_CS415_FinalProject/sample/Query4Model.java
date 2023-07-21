package sample;

public class Query4Model {
    String username;
    String title;

    public Query4Model(String username, String title) {
        this.username = username;
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public String getTitle() {
        return title;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

/*-- Display the username and book title for users of completed books
SELECT U.username, B.title FROM Users AS U, Books AS B, Reading AS R
WHERE R.bookStatus = "Completed" AND U.userID = R.userID AND R.ISBN = B.ISBN
ORDER BY U.username ASC;*/
