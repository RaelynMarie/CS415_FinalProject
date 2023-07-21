package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;


public class Controller {
    //Query 1 variables
    @FXML
    private Label showQuery1;

    @FXML
    private TableView<BooksModel> booksTableView;

    @FXML
    private TableColumn<BooksModel, Long> ISBNTableColumn;

    @FXML
    private TableColumn<BooksModel, String> titleTableColumn;

    @FXML
    private TableColumn<BooksModel, String> genreTableColumn;

    @FXML
    private TableColumn<BooksModel, Integer> authorIDTableColumn;

    @FXML
    private TableColumn<BooksModel, Integer> publisherIDTableColumn;

    @FXML
    private TableColumn<BooksModel, Date> publishDateTableColumn;

    ObservableList<BooksModel> booksModelObservableList = FXCollections.observableArrayList();

    //Query 2 variables
    @FXML
    private Label showQuery2;

    @FXML
    private TableView<Query2Model> query2Tableview;

    @FXML
    private TableColumn<Query2Model, String> aNameTableColumn;

    @FXML
    private TableColumn<Query2Model, Integer> bookCountTableColumn;

    ObservableList<Query2Model> query2ModelObservableList = FXCollections.observableArrayList();

    //Query 3 variables
    @FXML
    private Label showQuery3;

    @FXML
    private TableView<Query3Model> query3Tableview;

    @FXML
    private TableColumn<Query3Model, String> usernameTableColumn;

    @FXML
    private TableColumn<Query3Model, Integer> bookCount2TableColumn;

    ObservableList<Query3Model> query3ModelObservableList = FXCollections.observableArrayList();

    //Query 4 variables
    @FXML
    private Label showQuery4;

    @FXML
    private TableView<Query4Model> query4Tableview;

    @FXML
    private TableColumn<Query4Model, String> username2TableColumn;

    @FXML
    private TableColumn<Query4Model, String> title2TableColumn;

    ObservableList<Query4Model> query4ModelObservableList = FXCollections.observableArrayList();

    //Query 5 variables
    @FXML
    private Label showQuery5;

    @FXML
    private TableView<Query5Model> query5Tableview;

    @FXML
    private TableColumn<Query5Model, Long> ISBN2TableColumn;

    @FXML
    private TableColumn<Query5Model, String> title3TableColumn;

    ObservableList<Query5Model> query5ModelObservableList = FXCollections.observableArrayList();

    //Query 6 variables
    @FXML
    private Label showQuery6;

    @FXML
    private TableView<Query6Model> query6Tableview;

    @FXML
    private TableColumn<Query6Model, String> title4TableColumn;

    @FXML
    private TableColumn<Query6Model, Double> bookPriceTableColumn;

    ObservableList<Query6Model> query6ModelObservableList = FXCollections.observableArrayList();

    //Query 7 variables
    @FXML
    private Label showQuery7;

    @FXML
    private TableView<Query7Model> query7Tableview;

    @FXML
    private TableColumn<Query7Model, String> title5TableColumn;

    @FXML
    private TableColumn<Query7Model, String> publisherNameTableColumn;

    ObservableList<Query7Model> query7ModelObservableList = FXCollections.observableArrayList();

    //Query 7 variables
    @FXML
    private Label showQuery8;

    @FXML
    private TableView<Query8Model> query8Tableview;

    @FXML
    private TableColumn<Query8Model, String> genre2TableColumn;

    @FXML
    private TableColumn<Query8Model, Integer> avgAGETableColumn;

    ObservableList<Query8Model> query8ModelObservableList = FXCollections.observableArrayList();

    //Insert variables
    @FXML
    private ComboBox<String> BookStatusComboBoxInsert;

    @FXML
    private TextField InsertBookTitleFormTextField;

    @FXML
    private Label welcomeText;



    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToInsertionScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("insertion.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToHomeScreen(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("homeScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToQueryList(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("listQueriesScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToQuery1Scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("query1Scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToQuery2Scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("query2Scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToQuery3Scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("query3Scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToQuery4Scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("query4Scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToQuery5Scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("query5Scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToQuery6Scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("query6Scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToQuery7Scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("query7Scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToQuery8Scene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("query8Scene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void insertToDatabaseButtonClick(javafx.event.ActionEvent actionEvent){

        String bookTitle = InsertBookTitleFormTextField.getText();
        String status = BookStatusComboBoxInsert.getValue();

        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT ISBN, authorID FROM Books WHERE title = \"" + bookTitle + "\";";
        try {
            //create statement object, that will be used to execute query and get results
            Statement stmt = connectDB.createStatement();
            ResultSet query1 = stmt.executeQuery(connectQuery);
            Long ISBN2 = null;
            Integer authorID2 = null;
            double rating = 0.0;
            while(query1.next()){
                ISBN2 = query1.getLong("ISBN");
                authorID2 = query1.getInt("authorID");
            }

            if(status.equals("Completed")){
                Random random = new Random();
                rating = Math.round((1.0 + random.nextDouble() * 4.0) * 100.0) / 100.0;
            }
            Random rand = new Random();
            Integer userID = rand.nextInt(499) + 2;

            String insertStmt = "INSERT INTO READING VALUES (" + userID + ", " + ISBN2 + ", " + authorID2 + ", \"" + status + "\", " + rating + ");";
            stmt.executeUpdate(insertStmt);

            welcomeText.setText("Book \"" + bookTitle + "\" inserted successfully as \"" + status + "\"");
        }catch (Exception e){
            welcomeText.setText(e.toString());
        }

    }

    public void query1ButtonClick(javafx.event.ActionEvent actionEvent) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT ISBN, title, genre, authorID, publisherID, publishDate FROM Books;";
        showQuery1.setText(connectQuery);
        try {
            //create statement object, that will be used to execute query and get results
            Statement stmt = connectDB.createStatement();
            ResultSet query1 = stmt.executeQuery(connectQuery);

            while(query1.next()){
                Long ISBN = query1.getLong("ISBN");
                String title = query1.getString("title");
                String genre = query1.getString("genre");
                Integer authorID = query1.getInt("authorID");
                Integer publisherID = query1.getInt("publisherID");
                Date publishDate = query1.getDate("publishDate");


                booksModelObservableList.add(new BooksModel(ISBN, title, genre, authorID, publisherID, publishDate));
            }

            ISBNTableColumn.setCellValueFactory(new PropertyValueFactory<>("ISBN"));
            titleTableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
            genreTableColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));
            authorIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("authorID"));
            publisherIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("publisherID"));
            publishDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("publishDate"));

            booksTableView.setItems(booksModelObservableList);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void runQuery2Click(javafx.event.ActionEvent actionEvent) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT A.authorName, COUNT(B.ISBN) AS BookCount FROM Books AS B, Authors AS A WHERE A.authorID = B.authorID GROUP BY B.authorID;";
        showQuery2.setText(connectQuery);
        try {
            //create statement object, that will be used to execute query and get results
            Statement stmt = connectDB.createStatement();
            ResultSet query1 = stmt.executeQuery(connectQuery);

            while(query1.next()){
                String authorName = query1.getString("authorName");
                Integer bookCount = query1.getInt("bookCount");

                query2ModelObservableList.add(new Query2Model(authorName, bookCount));
            }

            aNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("authorName"));
            bookCountTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookCount"));

            query2Tableview.setItems(query2ModelObservableList);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void runQuery3Click(javafx.event.ActionEvent actionEvent) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT U.username, Count(R.ISBN) AS currently_Reading_Count FROM Users AS U, READING AS R WHERE R.bookStatus = \"Reading\" AND U.userID = R.userID GROUP BY U.username;";
        showQuery3.setText(connectQuery);
        try {
            //create statement object, that will be used to execute query and get results
            Statement stmt = connectDB.createStatement();
            ResultSet query1 = stmt.executeQuery(connectQuery);

            while(query1.next()){
                String username = query1.getString("username");
                Integer currently_Reading_Count = query1.getInt("currently_Reading_Count");

                query3ModelObservableList.add(new Query3Model(username, currently_Reading_Count));
            }

            usernameTableColumn.setCellValueFactory(new PropertyValueFactory<>("username"));
            bookCount2TableColumn.setCellValueFactory(new PropertyValueFactory<>("currently_Reading_Count"));

            query3Tableview.setItems(query3ModelObservableList);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void runQuery4Click(javafx.event.ActionEvent actionEvent) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT U.username, B.title FROM Users AS U, Books AS B, Reading AS R WHERE R.bookStatus = \"Completed\" AND U.userID = R.userID AND B.ISBN = R.ISBN ORDER BY U.username ASC;";
        showQuery4.setText(connectQuery);
        try {
            //create statement object, that will be used to execute query and get results
            Statement stmt = connectDB.createStatement();
            ResultSet query1 = stmt.executeQuery(connectQuery);

            while(query1.next()){
                String username = query1.getString("username");
                String title = query1.getString("title");

                query4ModelObservableList.add(new Query4Model( username, title));
            }

            username2TableColumn.setCellValueFactory(new PropertyValueFactory<>("username"));
            title2TableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

            query4Tableview.setItems(query4ModelObservableList);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void runQuery5Click(javafx.event.ActionEvent actionEvent) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT DISTINCT R.ISBN, B.title FROM Reading AS R, Books AS B WHERE R.rating >= 4.0 AND R.ISBN = B.ISBN AND R.authorID IN (SELECT DISTINCT A.authorID FROM Authors AS A, Publishers AS P WHERE A.publisherID = P.publisherID AND P.publisherName = \"Random House\");";
        showQuery5.setText(connectQuery);
        try {
            //create statement object, that will be used to execute query and get results
            Statement stmt = connectDB.createStatement();
            ResultSet query1 = stmt.executeQuery(connectQuery);

            while(query1.next()){
                Long ISBN = query1.getLong("ISBN");
                String title = query1.getString("title");

                query5ModelObservableList.add(new Query5Model(ISBN, title));
            }

            ISBN2TableColumn.setCellValueFactory(new PropertyValueFactory<>("ISBN"));
            title3TableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));

            query5Tableview.setItems(query5ModelObservableList);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void runQuery6Click(javafx.event.ActionEvent actionEvent) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT DISTINCT B.title, S.bookPrice FROM Books AS B, Sells AS S WHERE B.genre = \"Fantasy\" AND S.ISBN = B.ISBN;";
        showQuery6.setText(connectQuery);
        try {
            //create statement object, that will be used to execute query and get results
            Statement stmt = connectDB.createStatement();
            ResultSet query1 = stmt.executeQuery(connectQuery);

            while(query1.next()){
                String title = query1.getString("title");
                Double bookPrice = query1.getDouble("bookPrice");

                query6ModelObservableList.add(new Query6Model(title, bookPrice));
            }

            title4TableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
            bookPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("bookPrice"));

            query6Tableview.setItems(query6ModelObservableList);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void runQuery7Click(javafx.event.ActionEvent actionEvent) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT B.title, P.publisherName FROM Sells AS S, Books AS B, Publishers as P WHERE S.ISBN = B.ISBN AND B.publisherID = P.publisherID AND S.bookPrice = (SELECT MAX(S.bookPrice) AS MaxBook FROM Sells AS S);";
        showQuery7.setText(connectQuery);
        try {
            //create statement object, that will be used to execute query and get results
            Statement stmt = connectDB.createStatement();
            ResultSet query1 = stmt.executeQuery(connectQuery);

            while(query1.next()){
                String title = query1.getString("title");
                String publisherName = query1.getString("publisherName");

                query7ModelObservableList.add(new Query7Model(title, publisherName));
            }

            title5TableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
            publisherNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("publisherName"));

            query7Tableview.setItems(query7ModelObservableList);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void runQuery8Click(javafx.event.ActionEvent actionEvent) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String connectQuery = "SELECT B.genre, ROUND(AVG(U.age)) AS avgAGE FROM Books AS B, Reading AS R, Users AS U WHERE B.ISBN = R.ISBN AND R.userID = U.userID AND R.bookStatus = \"Completed\" GROUP BY B.genre;";
        showQuery8.setText(connectQuery);
        try {
            //create statement object, that will be used to execute query and get results
            Statement stmt = connectDB.createStatement();
            ResultSet query1 = stmt.executeQuery(connectQuery);

            while(query1.next()){
                String genre = query1.getString("genre");
                Integer avgAGE = query1.getInt("avgAGE");

                query8ModelObservableList.add(new Query8Model(genre, avgAGE));
            }

            genre2TableColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));
            avgAGETableColumn.setCellValueFactory(new PropertyValueFactory<>("avgAGE"));

            query8Tableview.setItems(query8ModelObservableList);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
