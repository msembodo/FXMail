package net.msmbd.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.web.WebView;
import net.msmbd.EmailManager;
import net.msmbd.view.ViewFactory;

public class MainWindowController extends BaseController {

    @FXML private TreeView<?> treeEmails;

    @FXML private TableView<?> tblEmails;

    @FXML private WebView webEmail;

    public MainWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML void handleMenuOptions() {
        viewFactory.showOptionsWindow();
    }

}
