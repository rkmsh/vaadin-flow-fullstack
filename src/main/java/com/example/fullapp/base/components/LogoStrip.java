package com.example.fullapp.base.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
public class LogoStrip extends Div {
    public LogoStrip() {
        addClassName("logo-strip");
        for (int i = 0; i < 6; i++) {
            Image logo = new Image("images/logos/logo" + (i + 1) + ".png", "Logo");
            logo.addClassName("logo");
            add(logo);
        }
    }
}
