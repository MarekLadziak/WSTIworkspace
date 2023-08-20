package com.example.application.views.zarządzanie;

import com.example.application.data.entity.SamplePerson;
import com.example.application.data.service.SamplePersonService;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@PageTitle("Zarządzanie")
@Route(value = "zarzadzanie", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class ZarządzanieView extends Composite<VerticalLayout> {

    private MenuBar menuBar = new MenuBar();

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private TextField textField = new TextField();

    private Select select = new Select();

    private DateTimePicker dateTimePicker = new DateTimePicker();

    private DateTimePicker dateTimePicker2 = new DateTimePicker();

    private H5 h5 = new H5();

    private RichTextEditor richTextEditor = new RichTextEditor();

    private Button buttonPrimary = new Button();

    private Grid multiSelectGrid = new Grid(SamplePerson.class);

    public ZarządzanieView() {
        getContent().setWidthFull();
        setMenuBarSampleData(menuBar);
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.addClassName(Padding.MEDIUM);
        textField.setLabel("Tytuł zadania");
        select.setLabel("Priorytet");
        setSelectSampleData(select);
        dateTimePicker.setLabel("Start");
        dateTimePicker2.setLabel("Koniec");
        h5.setText("Opis");
        richTextEditor.setWidthFull();
        buttonPrimary.setText("Przydziel");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        multiSelectGrid.setSelectionMode(Grid.SelectionMode.MULTI);
        setGridSampleData(multiSelectGrid);
        getContent().add(menuBar);
        getContent().add(layoutRow);
        layoutRow.add(textField);
        layoutRow.add(select);
        layoutRow.add(dateTimePicker);
        layoutRow.add(dateTimePicker2);
        getContent().add(h5);
        getContent().add(richTextEditor);
        getContent().add(buttonPrimary);
        getContent().add(multiSelectGrid);
    }

    private void setMenuBarSampleData(MenuBar menuBar) {
        menuBar.addItem("View");
        menuBar.addItem("Edit");
        menuBar.addItem("Share");
        menuBar.addItem("Move");
    }

    private void setSelectSampleData(Select select) {
        select.setItems("First", "Second");
    }

    private void setGridSampleData(Grid grid) {
        grid.setItems(query -> samplePersonService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    @Autowired()
    private SamplePersonService samplePersonService;
}
