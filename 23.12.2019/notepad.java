
package NotePad;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.*;

public class Notepad extends JFrame {

	private static final long serialVersionUID = 1L;
	JFrame f;
	JMenuBar mb;
	JMenu file;
	JMenu e;
	JMenuItem open, newFile,save, exit;
	JMenuItem undo,paste, selectall ;
	JMenu format;
	JMenu help;
	JFileChooser fileChooser;
	JTextArea textArea;
	Clipboard clip ;
	
	Notepad() {
		f = new JFrame("Notepad editor");
		file = new JMenu("File");
		e = new JMenu("Edit");
		format = new JMenu("Format");
		help = new JMenu("Help");
		
		newFile = new JMenuItem("New");
		open = new JMenuItem("Open");		
		save = new JMenuItem("Save");
		exit = new JMenuItem("Exit");
		undo = new  JMenuItem("Undo                 Ctrl+Z");
		paste = new JMenuItem("Paste                Ctrl+V");
		selectall = new JMenuItem("Select All       Ctrl+A ");
		textArea = new JTextArea();
		fileChooser = new JFileChooser();
		mb = new JMenuBar();
		
		f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
                f.add(textArea);
		file.add(open);
		file.add(newFile);
		file.add(save);
		file.add(exit);
		e.add(undo);
		e.add(paste);
		e.add(selectall);
		mb.add(file);
		mb.add(e);
		mb.add(format);
		mb.add(help);
		
		f.setJMenuBar(mb);
		
		OpenListener openL = new OpenListener();
		NewListener NewL = new NewListener();
		SaveListener saveL = new SaveListener();
		ExitListener exitL = new ExitListener();
		open.addActionListener(openL);
		newFile.addActionListener(NewL);
		save.addActionListener(saveL);
		exit.addActionListener(exitL);
		
		PasteListener pasteL = new PasteListener();
		
		f.setSize(800, 600);
		f.setVisible(true);
	}
	
	class OpenListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(f)) {
				File file = fileChooser.getSelectedFile();
				textArea.setText("");
				Scanner in = null;
				try {
					in = new Scanner(file);
					while(in.hasNext()) {
						String line = in.nextLine();
						textArea.append(line+"\n");
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				} finally {
					in.close();
				}
			}
		}
	}
	
	class SaveListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(f)) {
				File file = fileChooser.getSelectedFile();
				PrintWriter out = null;
				try {
					out = new PrintWriter(file);
					String output = textArea.getText();
					System.out.println(output);
					out.println(output);
				} catch (Exception ex) {
					ex.printStackTrace();
				} finally {
					try {
						out.flush();
						} catch(Exception ex1) 
						{
							
						}
					try {
						out.close();
						} catch(Exception ex1) {
							
						}
				}
			}
		}
	}
	
	class NewListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			textArea.setText("");
			
			
		}
	}
	class ExitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	
	
	class PasteListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Transferable cliptran = clip.getContents(Notepad.this);
	         try
	             {
	             String sel = (String) cliptran.getTransferData(DataFlavor.stringFlavor);
	             textArea.replaceRange(sel,textArea.getSelectionStart(),textArea.getSelectionEnd());
	         }
	         catch(Exception exc)
	             {
	             System.out.println("not string flavour");
	         }
			
		}
	}
	
	
	public static void main(String args[]) {
		Notepad n = new Notepad();
	}
}
