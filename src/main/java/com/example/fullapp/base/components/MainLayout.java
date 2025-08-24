package com.example.fullapp.base.components;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility;
import com.vaadin.flow.theme.Theme;

public class MainLayout extends AppLayout {
    public MainLayout() {
        addToNavbar(createTopBar());
        setPrimarySection(Section.NAVBAR);
    }
    private HorizontalLayout createTopBar() {
// Logo & Brand
        Image logo = new Image("images/logos/leaf.svg", "Brand");
        logo.setWidth("28px");
        Span brand = new Span("Springish");
        brand.addClassNames(LumoUtility.FontSize.XLARGE,
                LumoUtility.FontWeight.SEMIBOLD);
        HorizontalLayout left = new HorizontalLayout(logo, brand);
        left.setAlignItems(FlexComponent.Alignment.CENTER);
        left.addClassNames(LumoUtility.Gap.SMALL);
// Nav items (mimicking spring.io sections)
        MenuBar menu = new MenuBar();
        menu.addItem(new RouterLink("Why",
                com.example.fullapp.base.views.HomeView.class));
        menu.addItem(new Anchor("#projects", "Projects"));
        menu.addItem(new Anchor("#guides", "Guides"));
        menu.addItem(new Anchor("#commercial", "Commercial"));
        menu.addItem(new Anchor("#about", "About"));
// CTA Buttons
        Button docs = new Button("Docs");
        docs.addClassNames("pill");
        docs.getElement().setAttribute("theme", "primary");
        Button getStarted = new Button("Get Started");
        getStarted.addClassNames("pill", "accent");
        HorizontalLayout right = new HorizontalLayout(menu, docs, getStarted);
        right.setAlignItems(FlexComponent.Alignment.CENTER);
        right.addClassNames(LumoUtility.Gap.MEDIUM);
        HorizontalLayout bar = new HorizontalLayout(left, new Div(), right);
        bar.setWidthFull();
        bar.expand(bar.getComponentAt(1));
        bar.setAlignItems(FlexComponent.Alignment.CENTER);
        bar.addClassNames("topbar");
        return bar;
    }
}
