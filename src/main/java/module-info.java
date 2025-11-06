module org.example.eldordadopn5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.eldordadopn5 to javafx.fxml;
    exports org.example.eldordadopn5;
}