import java.io.File;

public class ThreadB extends Thread { 
		int total; 
		@Override public void run(){ 
			File f =  new File ("C://Users//Rafael//Desktop//Nova pasta (2)//teste.txt");
			
			while(!f.exists()){
				System.out.println("Arquivo não existe");
				try {
					this.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Arquivo existe");
		}
	}
