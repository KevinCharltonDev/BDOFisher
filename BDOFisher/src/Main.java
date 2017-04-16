import java.awt.AWTException;
import javax.swing.*;

public class Main extends JFrame {
	
	private static final long serialVersionUID = 1827964071009464081L;

	public Main() throws AWTException {
		super("Analysis Window");
		
	}

	public static void main(String[] args) throws AWTException {
		new Main();
	}

	public void exit(){
		System.exit(0);
	}
}
