import java.awt.GridLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{
	public Janela() {
		//JFrame frame = new JFrame();
		//Atributos da janela
		super("login");
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		GridLayout boder = new GridLayout();
		c.add(boder., new JButton("login"));
		/*JButton login = new JButton();
		getContentPane().add(login);;*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Janela();
	}
}
