package com.example.application.views.logowanie;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Logowanie")
@Route(value = "logowanie", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class LogowanieView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private VerticalLayout layoutColumn4 = new VerticalLayout();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    private LoginForm loginForm = new LoginForm();

    private VerticalLayout layoutColumn5 = new VerticalLayout();

    public LogowanieView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setHeightFull();
        layoutColumn4.setWidth(null);
        layoutColumn2.setHeightFull();
        layoutColumn2.setWidth(null);
        layoutColumn2.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth(null);
        layoutRow.setFlexGrow(1.0, layoutColumn5);
        layoutColumn5.setHeightFull();
        layoutColumn5.setWidth(null);
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn4);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(layoutColumn3);
        layoutColumn3.add(loginForm);
        layoutRow.add(layoutColumn5);
    }
}
