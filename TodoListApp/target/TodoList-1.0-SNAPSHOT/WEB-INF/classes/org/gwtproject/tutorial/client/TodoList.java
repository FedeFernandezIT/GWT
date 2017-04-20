package org.gwtproject.tutorial.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TodoList implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	@SuppressWarnings("rawtypes")
	public void onModuleLoad() {
		// We have to load icon sets before run application.
		Polymer.importHref("iron-icons/iron-icons.html", new Function() {
			@Override
			public Object call(Object arg) {
				startApplication();
				return null;
			}
		});			
	}

	private void startApplication() {
		RootPanel.get().add(new Main());		
	}

}
