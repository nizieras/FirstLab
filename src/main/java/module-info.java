module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires annotations;

    opens org.example to javafx.fxml;
    exports org.example;
}