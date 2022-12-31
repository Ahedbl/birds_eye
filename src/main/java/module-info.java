module com.example.birds_eye {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.birds_eye to javafx.fxml;
    exports com.example.birds_eye;
}