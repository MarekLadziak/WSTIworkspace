package com.example.application.views.podgląd;

import com.example.application.components.avataritem.AvatarItem;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.PermitAll;

@PageTitle("Podgląd")
@Route(value = "Podglad-id", layout = MainLayout.class)
@PermitAll
@Uses(Icon.class)
public class PodglądView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private H2 h2 = new H2();

    private H4 h4 = new H4();

    private Paragraph textMedium = new Paragraph();

    private Hr hr = new Hr();

    private H4 h42 = new H4();

    private Paragraph textMedium2 = new Paragraph();

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    private H2 h22 = new H2();

    private AvatarItem avatarItem = new AvatarItem();

    private AvatarItem avatarItem2 = new AvatarItem();

    private AvatarItem avatarItem3 = new AvatarItem();

    private AvatarItem avatarItem4 = new AvatarItem();

    private AvatarItem avatarItem5 = new AvatarItem();

    public PodglądView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        layoutColumn2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth(null);
        h2.setText("Tytuł zadania");
        h2.setWidthFull();
        h4.setText("Opis");
        textMedium.setText(
                "Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy. Witam, mamy zlecenie na przygotowanie to i tamtego. Waszym zadanie będzie zrobienie następujących rzeczy.");
        textMedium.getStyle().set("font-size", "var(--lumo-font-size-m)");
        h42.setText("Ramy czasowe");
        textMedium2.setText("8:00 20.08.2023 -16:00 25.08.2023");
        textMedium2.getStyle().set("font-size", "var(--lumo-font-size-m)");
        layoutColumn3.setHeightFull();
        layoutColumn3.setWidth(null);
        h22.setText("Grupa");
        setAvatarItemSampleData(avatarItem);
        setAvatarItemSampleData(avatarItem2);
        setAvatarItemSampleData(avatarItem3);
        setAvatarItemSampleData(avatarItem4);
        setAvatarItemSampleData(avatarItem5);
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(h2);
        layoutColumn2.add(h4);
        layoutColumn2.add(textMedium);
        layoutColumn2.add(hr);
        layoutColumn2.add(h42);
        layoutColumn2.add(textMedium2);
        layoutRow.add(layoutColumn3);
        layoutColumn3.add(h22);
        layoutColumn3.add(avatarItem);
        layoutColumn3.add(avatarItem2);
        layoutColumn3.add(avatarItem3);
        layoutColumn3.add(avatarItem4);
        layoutColumn3.add(avatarItem5);
    }

    private void setAvatarItemSampleData(AvatarItem avatarItem) {
        avatarItem.setHeading("Aria Bailey");
        avatarItem.setDescription("Endocrinologist");
        avatarItem.setAvatar(new Avatar("Aria Bailey"));
    }
}
