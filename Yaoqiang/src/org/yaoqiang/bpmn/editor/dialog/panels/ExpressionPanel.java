package org.yaoqiang.bpmn.editor.dialog.panels;

import javax.swing.BoxLayout;

import org.yaoqiang.bpmn.editor.dialog.PanelContainer;
import org.yaoqiang.bpmn.editor.dialog.XMLMultiLineTextPanel;
import org.yaoqiang.bpmn.editor.dialog.XMLPanel;
import org.yaoqiang.bpmn.model.elements.XMLElement;

/**
 * ExpressionPanel
 * 
 * @author Shi Yaoqiang(shi_yaoqiang@yahoo.com)
 */
public class ExpressionPanel extends XMLPanel {

	private static final long serialVersionUID = 1L;

	protected XMLMultiLineTextPanel mtp;

	public ExpressionPanel(PanelContainer pc, XMLElement owner, String title, int width, int height) {
		this(pc, owner, title, width, height, true);
	}

	public ExpressionPanel(PanelContainer pc, XMLElement owner, String title, int width, int height, boolean enabled) {
		super(pc, owner);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		mtp = new XMLMultiLineTextPanel(pc, owner, title, width, height);
		mtp.setEnabled(enabled);
		this.add(mtp);
	}

	public XMLMultiLineTextPanel getMtp() {
		return mtp;
	}

	public void saveObjects() {
		mtp.saveObjects();
	}

}
