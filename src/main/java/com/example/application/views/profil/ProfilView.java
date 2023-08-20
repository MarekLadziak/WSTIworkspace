package com.example.application.views.profil;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import jakarta.annotation.security.PermitAll;

@PageTitle("Profil")
@Route(value = "Profil", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
public class ProfilView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private VerticalLayout layoutColumn5 = new VerticalLayout();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private MenuBar menuBar = new MenuBar();

    private H3 h3 = new H3();

    private HorizontalLayout layoutRow2 = new HorizontalLayout();

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    private TextField textField = new TextField();

    private DatePicker datePicker = new DatePicker();

    private EmailField emailField = new EmailField();

    private VerticalLayout layoutColumn4 = new VerticalLayout();

    private TextField textField2 = new TextField();

    private HorizontalLayout layoutRow3 = new HorizontalLayout();

    private TextField textField3 = new TextField();

    private TextField textField4 = new TextField();

    private HorizontalLayout layoutRow4 = new HorizontalLayout();

    private Button buttonPrimary = new Button();

    private Button buttonSecondary = new Button();

    private VerticalLayout layoutColumn6 = new VerticalLayout();

    public ProfilView() {
        getContent().setWidthFull();
        getContent().addClassName(Padding.LARGE);
        getContent().setHeightFull();
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutColumn5.setHeightFull();
        layoutColumn5.setWidth(null);
        layoutRow.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth(null);
        setMenuBarSampleData(menuBar);
        h3.setText("Informacje");
        layoutRow2.setWidthFull();
        layoutRow2.addClassName(Gap.LARGE);
        layoutRow2.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth(null);
        textField.setLabel("Imię");
        textField.setWidthFull();
        datePicker.setLabel("Data urodzenia");
        datePicker.setWidthFull();
        emailField.setLabel("Email");
        emailField.setWidthFull();
        layoutRow2.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth(null);
        textField2.setLabel("Nazwisko");
        textField2.setWidthFull();
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidthFull();
        textField3.setLabel("Telefon");
        layoutRow3.setFlexGrow(1.0, textField3);
        textField4.setLabel("Hasło");
        textField4.setWidthFull();
        layoutRow4.addClassName(Gap.MEDIUM);
        buttonPrimary.setText("Zapisz");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Anuluj");
        layoutRow.setFlexGrow(1.0, layoutColumn6);
        layoutColumn6.setWidth(null);
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn5);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(menuBar);
        layoutColumn2.add(h3);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(layoutColumn3);
        layoutColumn3.add(textField);
        layoutColumn3.add(datePicker);
        layoutColumn3.add(emailField);
        layoutRow2.add(layoutColumn4);
        layoutColumn4.add(textField2);
        layoutColumn4.add(layoutRow3);
        layoutRow3.add(textField3);
        layoutColumn4.add(textField4);
        layoutColumn2.add(layoutRow4);
        layoutRow4.add(buttonPrimary);
        layoutRow4.add(buttonSecondary);
        layoutRow.add(layoutColumn6);
    }

    private void setMenuBarSampleData(MenuBar menuBar) {
        menuBar.addItem("View");
        menuBar.addItem("Edit");
        menuBar.addItem("Share");
        menuBar.addItem("Move");
    }
}
