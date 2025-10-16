module ua.opnu.list {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.desktop;

    opens ua.opnu.list to javafx.fxml;
    exports ua.opnu.list;
    exports ua.opnu.list.animal;
    opens ua.opnu.list.animal to javafx.fxml;
    exports ua.opnu.list.phone;
    opens ua.opnu.list.phone to javafx.fxml;
    exports ua.opnu.list.movable;
    opens ua.opnu.list.movable to javafx.fxml;
}