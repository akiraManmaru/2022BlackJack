package cardgame.blackjack.gui;

import java.awt.event.ActionListener;

import cardgame.blackjack.gui.factory.WidgetFactory;
import kwing.BorderLayout;
import kwing.Button;
import kwing.Dialog;
import kwing.FlowLayout;
import kwing.Frame;
import kwing.Graphics;
import kwing.GridLayout;
import kwing.Label;
import kwing.Panel;
import kwing.RadioButton;
import kwing.TextField;
import kwing.Timer;
import kwing.swing.SWBorderLayout;
import kwing.swing.SWButton;
import kwing.swing.SWDialog;
import kwing.swing.SWFlowLayout;
import kwing.swing.SWFrame;
import kwing.swing.SWGraphics;
import kwing.swing.SWGridLayout;
import kwing.swing.SWLabel;
import kwing.swing.SWPanel;
import kwing.swing.SWRadioButton;
import kwing.swing.SWTextField;
import kwing.swing.SWTimer;

/**
 * SWTバージョンのイズヒットダイアログ
 * 
 * @author Shinji Saito
 * 
 * @version 2.0, 2007/12/05
 */
public class SWBetDialog extends BetDialog {

	public SWBetDialog(WidgetFactory factory) {
		super(factory);
	}

	public Timer createTimer(int time, ActionListener listener) {
		return new SWTimer(time, listener);
	}

	public Graphics createGraphics(int WIDTH, int HEIGHT) {
		return new SWGraphics(WIDTH, HEIGHT);
	}

	public Frame createFrame() {
		return new SWFrame();
	}

	public Panel createPanel() {
		return new SWPanel();
	}

	public BorderLayout createBorderLayout() {
		return new SWBorderLayout();
	}

	public FlowLayout createFlowLayout() {
		return new SWFlowLayout();
	}

	public GridLayout createGridLayout() {
		return new SWGridLayout();
	}

	public Label createLabel() {
		return new SWLabel();
	}

	public TextField createTextField() {
		return new SWTextField();
	}

	public Button createButton() {
		return new SWButton();
	}

	public Dialog createDialog() {
		return new SWDialog();
	}

	public RadioButton createRadioButton() {
		return new SWRadioButton();
	}

}