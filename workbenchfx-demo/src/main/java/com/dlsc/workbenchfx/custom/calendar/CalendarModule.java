package com.dlsc.workbenchfx.custom.calendar;

import com.dlsc.workbenchfx.module.AbstractModule;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.scene.Node;

public class CalendarModule extends AbstractModule {

  public CalendarModule() {
    super("Calendar", FontAwesomeIcon.CALENDAR);
  }

  @Override
  public Node activate() {
    return new CalendarView();
  }

}
