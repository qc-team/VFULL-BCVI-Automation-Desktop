package ui;

import java.awt.Container;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ResultFrame {
	
	DrawResultFrame frame;
	
	public ResultFrame() {
		frame = new DrawResultFrame();
		frame.setTitle("Results");
		frame.setVisible(true);
		frame.setBounds(10, 10, 370, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		ImageIcon img = new ImageIcon("././././images/idemia.jpg");
		frame.setIconImage(img.getImage());
	}
	
	public class DrawResultFrame extends JFrame implements ActionListener{
		
		private static final long serialVersionUID = 1L;
		Container container = getContentPane();
		ImageIcon icon = new ImageIcon("././././images/idemia.jpg");
		JLabel label = new JLabel(icon);
		JLabel labe2 = new JLabel("Results");
		JButton back = new JButton("Back");
		JButton showReport = new JButton("Show Test Report");

		public DrawResultFrame() {
			// calling layout manager
			setLayoutManager();
			setLocationAndSize();
			addComponentsToContainer();
			addActionEvent();// calling add action event method

		}

		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			// Coding Part of back button
						if (e.getSource() == back) {
							frame.dispose();
							ChooseSystem chooseSystem=new ChooseSystem();
						}
			// Coding Part of show results button	
						if (e.getSource() == showReport) {
							File htmlFile = new File("Evisa/public/testReport.html");
							try {
								Desktop.getDesktop().browse(htmlFile.toURI());
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
		}

		public void setLayoutManager() {
			container.setLayout(null);
		}

		public void setLocationAndSize() {
			// Setting location and Size of each components using setBounds() method.
			label.setBounds(120, 0, 130, 130);
			labe2.setBounds(155, 125, 100, 30);
			back.setBounds(50, 300, 100, 30);
			showReport.setBounds(200, 300, 140, 30);

		}

		public void addComponentsToContainer() {
			// Adding each components to the Container
			container.add(label);
			container.add(labe2);
			container.add(back);
			container.add(showReport);
		}

		public void addActionEvent() {
			// adding Action listener to components
			back.addActionListener(this);
			showReport.addActionListener(this);
		}
	}

}
