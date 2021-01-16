package net.msmbd.controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.util.StringConverter;
import net.msmbd.EmailManager;
import net.msmbd.view.ColorTheme;
import net.msmbd.view.FontSize;
import net.msmbd.view.ViewFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class OptionsWindowController extends BaseController implements Initializable {

    public OptionsWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setupThemePicker();
        setupSizePicker();
    }

    private void setupSizePicker() {
        sliderFontSize.setMin(0);
        sliderFontSize.setMax(FontSize.values().length - 1);
        sliderFontSize.setValue(viewFactory.getFontSize().ordinal());
        sliderFontSize.setMinorTickCount(0);
        sliderFontSize.setMajorTickUnit(1);
        sliderFontSize.setBlockIncrement(1);
        sliderFontSize.setSnapToTicks(true);
        sliderFontSize.setShowTickMarks(true);
        sliderFontSize.setShowTickLabels(true);
        sliderFontSize.setLabelFormatter(new StringConverter<Double>() {
            @Override
            public String toString(Double aDouble) {
                int i = aDouble.intValue();
                return FontSize.values()[i].toString();
            }

            @Override
            public Double fromString(String s) {
                return null;
            }
        });
        sliderFontSize.valueProperty().addListener((obs, oldVal, newVal) -> {
            sliderFontSize.setValue(newVal.intValue());
        });
    }

    private void setupThemePicker() {
        chkColorTheme.setItems(FXCollections.observableArrayList(ColorTheme.values()));
        chkColorTheme.setValue(viewFactory.getColorTheme());
    }

    @FXML private Slider sliderFontSize;

    @FXML private ChoiceBox<ColorTheme> chkColorTheme;

    @FXML void handleBtnApply() {

    }

    @FXML void handleBtnCancel() {

    }

}
