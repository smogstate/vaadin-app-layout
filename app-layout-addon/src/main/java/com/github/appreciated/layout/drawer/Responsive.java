package com.github.appreciated.layout.drawer;

import com.vaadin.annotations.HtmlImport;
import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.VerticalLayout;

import java.io.IOException;

/**
 * Created by Johannes on 01.05.2017.
 */
@JavaScript("vaadin://bower_components/webcomponentsjs/webcomponents-lite.js")

@HtmlImport("vaadin://bower_components/font-roboto/roboto.html")
@HtmlImport("vaadin://bower_components/iron-icons/iron-icons.html")
@HtmlImport("vaadin://bower_components/paper-icon-button/paper-icon-button.html")
@HtmlImport("vaadin://bower_components/paper-item/paper-icon-item.html")
@HtmlImport("vaadin://bower_components/app-layout/app-toolbar/app-toolbar.html")
@HtmlImport("vaadin://bower_components/app-layout/app-drawer/app-drawer.html")
@HtmlImport("vaadin://bower_components/app-layout/app-drawer-layout/app-drawer-layout.html")

public class Responsive extends CustomLayout {
    private final VerticalLayout contentHolder = new VerticalLayout();

    public Responsive() throws IOException {
        super(Responsive.class.getResourceAsStream("responsive.html"));
        setSizeFull();
        addStyleName("app-drawer-responsive");
        super.addComponent(contentHolder, "content");
    }

    public VerticalLayout getContentHolder() {
        return contentHolder;
    }

    @Override
    public void addComponent(Component c) {
        contentHolder.addComponent(c);
    }
}