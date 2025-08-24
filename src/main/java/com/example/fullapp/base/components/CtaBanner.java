package com.example.fullapp.base.components;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
public class CtaBanner extends Div {
    public CtaBanner(String title, String body, String primaryCta, String
            secondaryCta) {
        addClassName("cta-banner");
        H3 h3 = new H3(title);
        Paragraph p = new Paragraph(body);
        Button primary = new Button(primaryCta);
        primary.addClassNames("pill", "accent");
        Button secondary = new Button(secondaryCta);
        secondary.addClassNames("pill");
        Div actions = new Div(primary, secondary);
        actions.addClassName("cta-actions");
        add(h3, p, actions);
    }
}
