package com.github.precompiler.view;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("hello")
public class HelloView extends VerticalLayout {
    public HelloView() {
        add(new Text("Hello World"));
    }
}
