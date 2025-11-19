module it.cineca.hr.desktop_application_working {
   requires javafx.controls;
   requires javafx.fxml;
   requires java.desktop;

   opens it.cineca.hr.desktop_application_working to javafx.fxml;
   exports it.cineca.hr.desktop_application_working;
   exports it.cineca.hr.desktop_application_working.persistence;
   opens it.cineca.hr.desktop_application_working.persistence to javafx.fxml;
}