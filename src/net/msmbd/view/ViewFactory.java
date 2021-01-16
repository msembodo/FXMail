package net.msmbd.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.msmbd.EmailManager;
import net.msmbd.controller.BaseController;
import net.msmbd.controller.LoginWindowController;
import net.msmbd.controller.MainWindowController;
import net.msmbd.controller.OptionsWindowController;

import java.io.IOException;

public class ViewFactory {

    private EmailManager emailManager;

    public ViewFactory(EmailManager emailManager) { this.emailManager = emailManager; }

    // view options handling
    private ColorTheme colorTheme = ColorTheme.DEFAULT;
    private FontSize fontSize = FontSize.MEDIUM;

    public ColorTheme getColorTheme() { return colorTheme; }

    public void setColorTheme(ColorTheme colorTheme) { this.colorTheme = colorTheme; }

    public FontSize getFontSize() { return fontSize; }

    public void setFontSize(FontSize fontSize) { this.fontSize = fontSize; }

    public void showLoginWindow() {
        BaseController controller = new LoginWindowController(emailManager, this, "LoginWindow.fxml");
        initializeStage(controller);
    }

    public void showMainWindow() {
        BaseController controller = new MainWindowController(emailManager, this, "MainWindow.fxml");
        initializeStage(controller);
    }

    public void showOptionsWindow() {
        BaseController controller = new OptionsWindowController(emailManager, this, "OptionsWindow.fxml");
        initializeStage(controller);
    }

    private void initializeStage(BaseController controller) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(controller.getFxmlName()));
        fxmlLoader.setController(controller);
        Parent parent;
        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void closeWindow(Stage stage) { stage.close(); }

}
