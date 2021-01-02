package net.msmbd.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import net.msmbd.EmailManager;
import net.msmbd.view.ViewFactory;

public class LoginWindowController extends BaseController {

    @FXML private TextField txtEmailAddress;
    @FXML private PasswordField txtPassword;
    @FXML private Label lblError;

    public LoginWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    void handleLoginButton() {
        viewFactory.showMainWindow();
        Stage stage = (Stage) lblError.getScene().getWindow();
        viewFactory.closeWindow(stage);
    }

}
