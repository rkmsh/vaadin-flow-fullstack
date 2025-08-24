package com.example.fullapp.base.components;

import com.vaadin.flow.component.HtmlComponent;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
public class FeatureCard extends Div {
    public FeatureCard(String title, String body, String imagePath) {
        addClassName("feature-card");
        Image img = new Image("images/" + imagePath, title);
        img.addClassName("feature-image");
        H3 h3 = new H3(title);
        Paragraph p = new Paragraph(body);
        add(img, h3, p);
    }
}