module FXMail {
//    requires javafx.base;
    requires javafx.controls;
//    requires javafx.swt;
    requires javafx.web;
    requires javafx.graphics;
    requires javafx.fxml;

    opens net.msmbd;
    opens net.msmbd.view;
    opens net.msmbd.controller;
}