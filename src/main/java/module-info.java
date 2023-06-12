module com.ba.dbjw {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires lombok;
    requires jakarta.persistence;
    requires java.naming;
    requires org.hibernate.orm.core;
    requires java.persistence;
    requires cloudinary.core;

    exports com.ba.dbjw;
    exports com.ba.dbjw.Controllers;
    exports com.ba.dbjw.Views;
    exports com.ba.dbjw.Entity.User;
    exports com.ba.dbjw.Entity.UserAuth;
    exports com.ba.dbjw.Models.Enums;

    opens com.ba.dbjw to javafx.fxml;
    opens com.ba.dbjw.Entity.UserAuth to org.hibernate.orm.core;
    opens com.ba.dbjw.Entity.Product to org.hibernate.orm.core, javafx.base;
    opens com.ba.dbjw.Controllers to javafx.fxml;
    opens com.ba.dbjw.Controllers.Admin to javafx.fxml;
    opens com.ba.dbjw.Models.Enums to org.hibernate.orm.core;
}