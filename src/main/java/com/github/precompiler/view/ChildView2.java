package com.github.precompiler.view;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "cv2", layout = MainLayout.class)
@PageTitle("Main | ChildView2")
public class ChildView2 extends VerticalLayout {
    public ChildView2() {
        add(new TextField("username"));
        add(new PasswordField("password"));
    }
}
