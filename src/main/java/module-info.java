module com.photocollection.photocollection {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.photocollection to javafx.fxml;
    exports com.photocollection;
}