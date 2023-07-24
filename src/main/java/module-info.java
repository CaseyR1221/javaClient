module module11.client {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens module11.client to javafx.fxml;
    exports module11.client;
}