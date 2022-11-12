package com.bar.foo;

import gg.xp.reevent.events.EventContext;
import gg.xp.reevent.events.InitEvent;
import gg.xp.reevent.scan.HandleEvents;
import gg.xp.reevent.scan.ScanMe;
import gg.xp.xivsupport.gui.TitleBorderFullsizePanel;
import gg.xp.xivsupport.gui.extra.PluginTab;

import javax.swing.*;
import java.awt.*;

@ScanMe
public class MySampleTabOutOfTree implements PluginTab {

	private JLabel initLabel;

	@Override
	public String getTabName() {
		return "My Sample Tab";
	}

	@Override
	public Component getTabContents() {
		TitleBorderFullsizePanel panel = new TitleBorderFullsizePanel("My Sample Plugin Tab");
		panel.add(new JLabel("It Works! (Out of tree version)"));
		initLabel = new JLabel("No Init Event Received Yet...");
		panel.add(initLabel);
		return panel;
	}

	@HandleEvents
	public void handleEvents(EventContext context, InitEvent init) {
		if (init != null) {
			initLabel.setText("Init Event Received!");
		}
	}
}
