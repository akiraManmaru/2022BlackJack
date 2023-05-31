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
import kwing.awt.AWBorderLayout;
import kwing.awt.AWButton;
import kwing.awt.AWDialog;
import kwing.awt.AWFlowLayout;
import kwing.awt.AWFrame;
import kwing.awt.AWGraphics;
import kwing.awt.AWGridLayout;
import kwing.awt.AWLabel;
import kwing.awt.AWPanel;
import kwing.awt.AWRadioButton;
import kwing.awt.AWTextField;
import kwing.awt.AWTimer;

/**
 * AWTバージョンのイズヒットダイアログ
 * 
 * @author Shinji Saito
 * 
 * @version 2.0, 2007/12/05
 */
public class AWBetDialog extends BetDialog {

	public AWBetDialog(WidgetFactory factory) {
		super(factory);
	}

	public Timer createTimer(int time, ActionListener listener) {
		return new AWTimer(time, listener);
	}

	public Graphics createGraphics(int WIDTH, int HEIGHT) {
		return new AWGraphics(WIDTH, HEIGHT);
	}

	public Frame createFrame() {
		return new AWFrame();
	}

	public Panel createPanel() {
		return new AWPanel();
	}

	public BorderLayout createBorderLayout() {
		return new AWBorderLayout();
	}

	public FlowLayout createFlowLayout() {
		return new AWFlowLayout();
	}

	public GridLayout createGridLayout() {
		return new AWGridLayout();
	}

	public Label createLabel() {
		return new AWLabel();
	}

	public TextField createTextField() {
		return new AWTextField();
	}

	public Button createButton() {
		return new AWButton();
	}

	public Dialog createDialog() {
		return new AWDialog();
	}

	public RadioButton createRadioButton() {
		return new AWRadioButton();
	}
}