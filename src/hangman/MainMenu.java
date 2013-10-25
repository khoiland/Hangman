/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Kellie
 */
public class MainMenu extends JFrame{

    public MainMenu()
	{
		super("Hangman");
		
		JMenu menu = new JMenu("Menu");
		menu.setMnemonic('M');
		JMenuItem displayItem = new JMenuItem("Display Instructions");
		displayItem.setMnemonic('D');
		menu.add(displayItem);
		JMenuItem newItem = new JMenuItem("New Game");
		newItem.setMnemonic('N');
		menu.add(newItem);
                JMenuItem saveItem = new JMenuItem("Save");
                saveItem.setMnemonic('S');
                menu.add(saveItem);
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.setMnemonic('x');
		menu.add(exitItem);
		
		//adding action listener to menu items
		displayItem.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					System.out.println("Display is Pressed");
				}
			}
		);
		newItem.addActionListener(
			new ActionListener(){
                                @Override
				public void actionPerformed(ActionEvent e)
				{
					System.out.println("New Game is pressed");
				}
			}
		);
                saveItem.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e)
				{
					System.out.println("Save is pressed");
				}
			}
		);
		exitItem.addActionListener(
			new ActionListener(){
                                @Override
				public void actionPerformed(ActionEvent e)
				{
					System.out.println("Exit is pressed");
				}
			}
		);						
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		bar.add(menu);
		
		getContentPane();
		setSize(200, 200);
		setVisible(true);
	}
	
}

