module robert.reiknivel {
    requires javafx.controls;
    requires javafx.fxml;


    opens robert.reiknivel to javafx.fxml;
    exports robert.reiknivel;
}