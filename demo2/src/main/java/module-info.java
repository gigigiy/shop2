module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo2 to javafx.fxml;
    exports com.example.demo2;
    exports com.example.demo2.main;
    opens com.example.demo2.main to javafx.fxml;
    exports com.example.demo2.Controller;
    opens com.example.demo2.Controller to javafx.fxml;
}