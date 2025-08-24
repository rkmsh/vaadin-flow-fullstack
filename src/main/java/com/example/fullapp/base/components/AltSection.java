package com.example.fullapp.base.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
public class AltSection extends Div {
    public enum ImageSide { LEFT, RIGHT }
    public AltSection(String title, String body, String imagePath, ImageSide
            side) {
        addClassName("alt-section");
        Div text = new Div(new H2(title), new Paragraph(body));
        text.addClassName("alt-text");
        Image img = new Image("images/" + imagePath, title);
        img.addClassName("alt-image");
        if (side == ImageSide.LEFT) {
            add(img, text);
        } else {
            add(text, img);
        }
    }
}
