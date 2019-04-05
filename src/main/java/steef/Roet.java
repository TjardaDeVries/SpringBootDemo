package steef;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;
import lombok.extern.slf4j.Slf4j;

@Route("")
@Slf4j
public class Roet extends VerticalLayout  {
  Roet() {
    log.info("Adding route {}", this);


    add(new Text("Hi there from Roet in vaadinboot"));
    add(new Hr());
    add(new Text("Onderstaand een tabje"));

    final HorizontalLayout menu = new HorizontalLayout();

    final Tabs tabs = new Tabs();
    final Tab tab = new Tab("Nu gaattie bij opstarten twee keer laden!!");
    final Tab tab2 = new Tab("Soms doet hij het in 1 keer");
    tabs.add(tab,tab2);

    menu.add(tabs);
    add(menu);


  }
}
