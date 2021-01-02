package net.msmbd.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import net.msmbd.EmailManager;
import net.msmbd.view.ViewFactory;

public class OptionsWindowController extends BaseController {

    public OptionsWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML private Slider sliderFontSize;

    @FXML private ChoiceBox<?> chkColorTheme;

    @FXML void handleBtnApply() {

    }

    @FXML void handleBtnCancel() {

    }

}
