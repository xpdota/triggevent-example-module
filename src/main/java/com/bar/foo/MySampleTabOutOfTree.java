package com.bar.foo;

import gg.xp.reevent.scan.ScanMe;
import gg.xp.xivsupport.gui.TitleBorderFullsizePanel;
import gg.xp.xivsupport.gui.extra.PluginTab;

import javax.swing.*;
import java.awt.*;

@ScanMe
public class MySampleTabOutOfTree implements PluginTab {
	@Override
	public String getTabName() {
		return "My Sample Tab";
	}

	@Override
	public Component getTabContents() {
		TitleBorderFullsizePanel panel = new TitleBorderFullsizePanel("My Sample Plugin Tab");
		panel.add(new JLabel("It Works! (Out of tree version)"));
		return panel;
	}
}
