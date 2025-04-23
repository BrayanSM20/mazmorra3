module programacion {
    requires javafx.controls;
    requires javafx.fxml;

    opens programacion to javafx.fxml;
    exports programacion;
}
