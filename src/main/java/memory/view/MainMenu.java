package memory.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import memory.control.ControlListener;
import memory.control.NewGameListener;
import memory.model.ProxyReadOnlyModelFasade;
import memory.view.GameBoard.GameBoard;

public class MainMenu {
	private ProxyReadOnlyModelFasade readOnlyModelFasade;
	
	//private ActionReference actionReference;
	//private Action action; 
	private GameBoard board;
	
	private JFrame ramka;
	private JButton newGame;
	private JButton wyniki;
	private JButton exit;
	
	public MainMenu(ProxyReadOnlyModelFasade readOnlyModelFasade) {
		this.readOnlyModelFasade = readOnlyModelFasade;
		//actionReference=new ActionReference();
		
		ramka=new JFrame();
		ramka.setLayout(new GridLayout(3, 1));
		
		newGame = new JButton("New Game");
		wyniki = new JButton("scores");
		exit = new JButton("exit");
		
		ramka.add(newGame);
		ramka.add(wyniki);
		ramka.add(exit);
		ramka.pack();
		
		ramka.setLocationRelativeTo(null);
		ramka.setVisible(true);
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void dodajListeneraNewGame(final NewGameListener newGameListener) {
		newGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int size = sizeOfBoard();
				//action=new ShowBoard(readOnlyModelFasade,actionReference);
				newGameListener.startGame(size);
				//board = new Board(readOnlyModelFasade);
			}
		});
	}
	
	public void dodajListeneraWyniki(ActionListener actionListener) {
		wyniki.addActionListener(actionListener);
	}
	
	public void dodajListeneraExit(ActionListener actionListener) {
		exit.addActionListener(actionListener);
	}
	
	
	
	public void dodajMouseListener(ControlListener myszka) {
		board.dodajMouseListener(myszka);
	}

	private int sizeOfBoard() {
		String[] options = {"2","4","6","8"};
		int option = JOptionPane.showOptionDialog(null, "Size of board", "size", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, "6");
		return option*2+2;
	}
	
	public void repaint() {
		board = new GameBoard(readOnlyModelFasade);
	}

	public GameBoard getBoard() {
		return board;
	}

	
	

}
