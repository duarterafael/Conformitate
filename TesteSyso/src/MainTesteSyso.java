import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class MainTesteSyso extends JFrame
{
    private JPanel topPanel;
    private JTextPane tPane;

    public MainTesteSyso()
    {
//        topPanel = new JPanel();        
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);            
//
//        EmptyBorder eb = new EmptyBorder(new Insets(10, 10, 10, 10));
//
//        tPane = new JTextPane();                
//        tPane.setBorder(eb);
//        //tPane.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
//        tPane.setMargin(new Insets(5, 5, 5, 5));
//
//        topPanel.add(tPane);
//
//        for (int i = 0; i < 10; i++) {
//			if(i%2==0){
//				appendToPane(tPane, "Erro de execução.\n", Color.RED);
//			}else{
//				appendToPane(tPane, "Erro de execução.\n", Color.ORANGE);
//			}
//		}
////        appendToPane(tPane, "Erro de execução.\n", Color.RED);
////        appendToPane(tPane, "I wish I could be ONE of THE BEST on ", Color.BLUE);
////        appendToPane(tPane, "Stack", Color.DARK_GRAY);
////        appendToPane(tPane, "Over", Color.MAGENTA);
////        appendToPane(tPane, "flow", Color.ORANGE);
//
//        getContentPane().add(topPanel);
//
//        pack();
//        setVisible(true);   
//    
//    String useReturnMsg =  "Class `Cliente' does not have an attribute `nome333'";
//	String className = useReturnMsg .substring(useReturnMsg.indexOf("`")+1, useReturnMsg.indexOf("'"));
//	 String attName = useReturnMsg.substring(useReturnMsg.lastIndexOf("`")+1, useReturnMsg.lastIndexOf("'"));
//	 
//	 System.out.println("A classe "+className+" não possui o atributo "+attName);

    	
    	String useReturnMsg =  "<input>:1:1: Undefined operation `Integer.+(String)'.";
    	if(useReturnMsg.contains("Undefined operation")){
    		 String operation = useReturnMsg.substring(useReturnMsg.indexOf("`")+1, useReturnMsg.lastIndexOf("'"));
    	     System.out.println("Erro: Operação indefinido. "+operation+".");
        }
    	
}

    private void appendToPane(JTextPane tp, String msg, Color c)
    {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }

    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
            {
                public void run()
                {
                    new MainTesteSyso();
                }
            });
    }
}

//import java.io.File;
//
//
//
//
//public class MainTesteSyso {
//	public static void main(String[] args)
//	{
//		
//		ThreadB b = new ThreadB();
//		b.start(); 
////		synchronized(b){ 
////			try{ 
////				System.out.println("Aguardando o arquivo ser criado"); 
////				b.wait(); 
////			}catch(InterruptedException e){ 
////				e.printStackTrace(); 
////			} 
////			System.out.println("O Arquivo foi criado"); 
////		}
//		for (int i = 0; i < 1000000; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(300);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}		
////		File f =  new File ("C://Users//Rafael//Desktop//Nova pasta (2)//teste.txt");
////		
////		while(!f.exists()){
////			System.out.println("Arquivo não existe");
////		}
////		System.out.println("Arquivo existe");
////	    PrintStream origOut = System.out;
////	    PrintStream interceptor = new Interceptor(origOut);	ZA
////	    System.setOut(interceptor);// just add the interceptor
////	    
////	    OutraClasse ac = new OutraClasse();
////	    ac.metodo();
////		System.out.println("Esta moendo fio");
////		try {
////			Thread.sleep(3000);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		System.out.println("Esta moendo fio2");
//		
////		HashMap<Integer, Integer> map =  new HashMap<Integer, Integer>();
////		int qtyRandGenerated =  999999999;
////		for (int i = 0; i <= 100; i++) {
////			map.put(i, 0);
////		}
////		for (int i = 0; i < qtyRandGenerated; i++) {
////			int randValue = randInt(0, 100);
////			map.put(randValue, map.get(randValue)+1);
////		}
////		
////		for (Integer key : map.keySet()) { 
////			Double precet = ((map.get(key).doubleValue()/qtyRandGenerated)*100);
////			System.out.println("O valor "+key+ " foi gerado randomicamente "+map.get(key)+" e isso representa "+precet+"%");
////		}
////		String str = "Rafael,Denis,Fernando,Carlos";
////		
////		for (int i = 0; i < 100; i++) {
////			System.out.println(getRandomInteger("0:100"));
////			System.out.println(getRandomSting(str));
////		}
//		
////		Integer tst1, tst2, tst3;
////		tst1 = new Integer("123");
////		tst2 = new Integer("123aaaa");
////		tst3 = new Integer("bbbb");
////		
////		System.out.println(tst1+" "+tst2+" "+tst3);
////		System.out.println(getShellUSECMDCreate("c4, c2, c3:criar(Cliente)"));
////
////		System.out.println(getShellUSECMDCreate("v1:criar(Carro)"));
////
////		System.out.println(getShellUSECMDCreate("a1:criar(Aluguel)entre(v1,c1)"));
////		
////		System.out.println(getShellUSECMDDestroy("c3,c4,v1:Destruir"));
////		
////		System.out.println(getShellUSECMDSET("c1:atriuir(nome,'rafael')"));
////		
////		System.out.println(getShellUSECMDAssoc("c1,c2,c3:associar(carroPopular)"));
////		
////		System.out.println(getShellUSECMDDesassoc("c1,c2,c3:desassociar(carroPopular)"));
//		
//		
//	}
//	
//	
//	private static String getShellUSECMDCreate(String userCMD){
//		String returnedCMD = "!create ";
//		returnedCMD += userCMD.substring(0, userCMD.indexOf(":"));
//		returnedCMD += ":"+userCMD.substring(userCMD.indexOf("(")+1,userCMD.indexOf(")"));
//		
//		if(userCMD.contains("entre")){
//			returnedCMD += " between "+userCMD.substring(userCMD.lastIndexOf("("),userCMD.lastIndexOf(")")+1);
//		}
//		
//		return returnedCMD;
//	}
//	
//	private static String getShellUSECMDDestroy(String userCMD){
//		String returnedCMD = "!destroy ";
//		returnedCMD += userCMD.substring(0, userCMD.indexOf(":"));
//		
//		return returnedCMD;
//	}
//	
//	private static String getShellUSECMDSET(String userCMD){
//		String returnedCMD = "!set ";
//		returnedCMD += userCMD.substring(0, userCMD.indexOf(":"));
//		returnedCMD += "."+userCMD.substring(userCMD.indexOf("(")+1, userCMD.indexOf(","));
//		returnedCMD += ":="+userCMD.substring(userCMD.indexOf(",")+1, userCMD.indexOf(")"));
//		
//		
//		return returnedCMD;
//	}
//	
//	private static String getShellUSECMDRandonSet(String userCMD){
//		return "";
//	}
//	
//	private static String getShellUSECMDAssoc(String userCMD){
//		String returnedCMD = "!insert ";
//		returnedCMD += userCMD.substring(0, userCMD.indexOf(":"));
//		returnedCMD += " into "+userCMD.substring(userCMD.indexOf("(")+1,userCMD.indexOf(")"));
//		return returnedCMD;
//	}
//	
//	private static String getShellUSECMDDesassoc(String userCMD){
//		String returnedCMD = "!delete ";
//		returnedCMD += userCMD.substring(0, userCMD.indexOf(":"));
//		returnedCMD += " from "+userCMD.substring(userCMD.indexOf("(")+1,userCMD.indexOf(")"));
//		return returnedCMD;
//	}
//	
//	
//	
////	
////	
////	
////	public static String getRandomSting(String str){
////		String[] strList = str.split(",");
////		int randonIndex = getRandomInteger(0, strList.length-1);
////		return strList[randonIndex];
////	}
////	public static int getRandomInteger(String str) {
////		String[] strList = str.split(":");
////		if(strList.length == 2){
////			return getRandomInteger(new Integer(strList[0]), new Integer(strList[1]));
////		}
////		return -1;
////	}
////	
////	public static int getRandomInteger(int min, int max) {
////
////	    Random rand = new Random();
////
////	    int randomNum = rand.nextInt((max - min) + 1) + min;
////
////	    return randomNum;
////	}  
//}
