package com.example.fullapp.base.components;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class HeroSection extends VerticalLayout {
    public HeroSection(String title, String subtitle) {
        addClassName("hero");
        setPadding(false);
        setSpacing(false);
        setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);
        H1 h1 = new H1(title);
        h1.addClassNames("hero-title");
        Paragraph sub = new Paragraph(subtitle);
        sub.addClassNames("hero-subtitle");
        Button getStarted = new Button("Get Started");
        getStarted.addClassNames("pill", "accent");
        Button learn = new Button("Read the Docs");
        learn.addClassNames("pill");
        add(h1, sub, new Span(), getStarted, learn);
    }
}
