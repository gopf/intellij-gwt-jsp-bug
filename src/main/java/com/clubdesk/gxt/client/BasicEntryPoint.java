package com.clubdesk.gxt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class BasicEntryPoint implements EntryPoint {
  @Override
  public void onModuleLoad() {
    Button b = new Button("Jump!", new ClickHandler() {
      public void onClick(ClickEvent event) {
        Window.open("test.jsp", "Test", null);
      }
    });

    // Add it to the root panel.
    RootPanel.get().add(b);
  }
}
