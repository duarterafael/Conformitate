package gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextPane;

public class ExcutionForm extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel classDiagramLblTxt;
	private JButton classDiagramLblIncon;
	private JLabel bpmnLblTxt;
	private JButton bpmnLblIncon;
	private JTable pathsTbl;
	private JTextPane pathAsslScript;
	
	public ExcutionForm() {
		setTitle("Execution screen");
		pack();
		this.setSize(Constants.WITH_SCRREN, Constants.HEIGHT_SCRREN); 
		createVisualComponents();
	}
	
	public void createVisualComponents(){
		
		setLayout(new FlowLayout());
		
		classDiagramLblTxt = new JLabel("Classe Diagram: ");
		classDiagramLblIncon =  new JButton(new ImageIcon("E://Source codes//DissertacaoAPP//MainProject//exportUse//exportUse.png"));
		

		bpmnLblTxt = new JLabel("Business process model: ");
		bpmnLblIncon =  new JButton(new ImageIcon("E://Source codes//DissertacaoAPP//MainProject//exportUse//bpmnmodel.png"));
		
		this.add(classDiagramLblIncon);
		this.add(bpmnLblTxt);
		this.add(bpmnLblIncon);
	}

}
