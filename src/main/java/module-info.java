module elieldm.funcionarios {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    //requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens elieldm.funcionarios to javafx.fxml;
    opens elieldm.funcionarios.Util to javafx.fxml;
    opens elieldm.funcionarios.Controller to javafx.fxml;

    exports elieldm.funcionarios;
    exports elieldm.funcionarios.Util;
    exports elieldm.funcionarios.Controller to javafx.fxml;
}
