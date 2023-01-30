module com.example.demoproject1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoproject1 to javafx.fxml;
    exports com.example.demoproject1;
}