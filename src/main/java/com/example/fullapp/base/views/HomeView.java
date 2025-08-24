package com.example.fullapp.base.views;

import com.example.fullapp.base.components.*;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.theme.Theme;
import org.springframework.stereotype.Component;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Springish — Home")
@Route(value = "", layout = MainLayout.class)
public class HomeView extends VerticalLayout {
    public HomeView() {
        addClassName("home");
        setSpacing(false);
        setPadding(false);
// HERO
        HeroSection hero = new HeroSection(
                "The application framework for modern Java",
                "Build production‑ready apps faster with batteries‑included patterns and integrations.");
                add(hero);
// Partner logos strip
        add(new LogoStrip());
// Feature grid
        Div features = new Div(
                new FeatureCard("Autoconfiguration",
                        "Sensible defaults that get out of your way.", "illustrations/auto.png"),
                new FeatureCard("Observability",
                "Metrics, tracing, and health, wired in.", "illustrations/obs.png"),
                new FeatureCard("Security",
                        "Battle‑tested patterns for authz and authn.", "illustrations/sec.png"),
                new FeatureCard("Data",
                        "Reactive and blocking data access made easy.", "illustrations/data.png")
                );
        features.addClassName("feature-grid");
        add(features);
// Alternating mast sections
        add(new AltSection("Production‑ready by default",
                "Opinionated starters and curated integrations help you ship fast.",
                "illustrations/production.png", AltSection.ImageSide.RIGHT));
        add(new AltSection("Ecosystem‑first",
                "Guides, starters, and samples for popular stacks.",
                "illustrations/ecosystem.png", AltSection.ImageSide.LEFT));
// CTA Banner
        add(new CtaBanner(
                "Ready to get started?",
                "Spin up a new app in minutes and iterate with confidence.",
                "Get Started", "Docs"));
        setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.STRETCH);
        setWidthFull();
        getStyle().set("max-width", "100%");
    }
}
