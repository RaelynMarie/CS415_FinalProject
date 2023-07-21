package sample;

public class Query3Model {
    String username;
    Integer Currently_Reading_Count;

    public Query3Model(String username, Integer currently_Reading_Count) {
        this.username = username;
        Currently_Reading_Count = currently_Reading_Count;
    }

    public String getUsername() {
        return username;
    }

    public Integer getCurrently_Reading_Count() {
        return Currently_Reading_Count;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCurrently_Reading_Count(Integer currently_Reading_Count) {
        Currently_Reading_Count = currently_Reading_Count;
    }
}


/*SELECT U.username, Count(R.ISBN) AS Currently_Reading_Count
FROM Users AS U, READING AS R
WHERE R.bookStatus = "Reading" AND U.userID = R.userID
GROUP BY U.username;*/