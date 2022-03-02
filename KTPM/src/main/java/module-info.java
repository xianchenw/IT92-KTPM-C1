module com.mycompany.ktpm {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ktpm to javafx.fxml;
    exports com.mycompany.ktpm;
}
