package com.github.precompiler.view;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
@PageTitle("Main | ChildView1")
public class ChildView1 extends VerticalLayout {
    public ChildView1() {
        add(new Text("ChildView 1"));
    }
}
