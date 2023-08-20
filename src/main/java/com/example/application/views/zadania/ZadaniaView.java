package com.example.application.views.zadania;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.PermitAll;

@PageTitle("Zadania")
@Route(value = "Zadania", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
public class ZadaniaView extends Composite<VerticalLayout> {

    private H6 h6 = new H6();

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private Avatar avatar = new Avatar();

    private H2 h2 = new H2();

    private Button buttonPrimary = new Button();

    private HorizontalLayout layoutRow2 = new HorizontalLayout();

    private H4 h4 = new H4();

    private ProgressBar progressBar = new ProgressBar();

    private Hr hr = new Hr();

    private H6 h62 = new H6();

    private HorizontalLayout layoutRow3 = new HorizontalLayout();

    private Avatar avatar2 = new Avatar();

    private H2 h22 = new H2();

    private Button buttonPrimary2 = new Button();

    private H4 h42 = new H4();

    private ProgressBar progressBar2 = new ProgressBar();

    private Hr hr2 = new Hr();

    public ZadaniaView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        h6.setText("20.08.2023");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidthFull();
        avatar.setName("Firstname Lastname");
        h2.setText("Tytuł zadania");
        buttonPrimary.setText("Podgląd");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow2.setWidthFull();
        layoutRow2.addClassName(Gap.MEDIUM);
        h4.setText("Niski priorytet");
        progressBar.setValue(0.5);
        h62.setText("18.08.2023");
        layoutRow3.setWidthFull();
        layoutRow3.addClassName(Gap.MEDIUM);
        avatar2.setName("Firstname Lastname");
        h22.setText("Tytuł zadania");
        buttonPrimary2.setText("Podgląd");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        h42.setText("Wysoki priorytet");
        progressBar2.setValue(0.5);
        getContent().add(h6);
        getContent().add(layoutRow);
        layoutRow.add(avatar);
        layoutRow.add(h2);
        layoutRow.add(buttonPrimary);
        getContent().add(layoutRow2);
        layoutRow2.add(h4);
        getContent().add(progressBar);
        getContent().add(hr);
        getContent().add(h62);
        getContent().add(layoutRow3);
        layoutRow3.add(avatar2);
        layoutRow3.add(h22);
        layoutRow3.add(buttonPrimary2);
        getContent().add(h42);
        getContent().add(progressBar2);
        getContent().add(hr2);
    }
}
