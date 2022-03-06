package com.github.precompiler.view;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.RouterLink;


public class MainLayout extends AppLayout {
    public MainLayout() {
        createHeader();
        createDrawer();
    }

    private void createHeader() {
        H1 logo = new H1("DemoApp");
        HorizontalLayout header = new HorizontalLayout(
                new DrawerToggle(),
                logo
        );

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.setWidth("100%");
        addToNavbar(header);

    }

    private void createDrawer() {
        RouterLink childView1Link = new RouterLink("ChildView1", ChildView1.class);
        childView1Link.setHighlightCondition(HighlightConditions.sameLocation());

        RouterLink childView2Link = new RouterLink("ChildView2", ChildView2.class);
        childView2Link.setHighlightCondition(HighlightConditions.sameLocation());

        addToDrawer(new VerticalLayout(
                childView1Link
        ), new VerticalLayout(childView2Link));
    }
}