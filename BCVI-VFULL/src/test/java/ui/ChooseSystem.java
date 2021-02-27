package ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import br.Br;
import ep.Ep;
import eresidency_adminustration.EResidencyAdmin;
import eresidency_private.EResidencyPrivate;
import eresidency_public.EResidencyPublic;
import eresidency_qc.EResidencyQc;
import evisa_administration.EVisaAdminImplementation;
import evisa_private.EVisaPrivateImplementation;
import evisa_public.EVisaPublicImplementation;
import evisa_qc.EvisaQc;
import fid.FIDImplementation;
import flm.FLMImplementation;
import mvt_central.MVTImplementation;
import mvt_port.MVTPortImplementation;
import transersal.TransversalImplementation;
import watchlist.WatchListImplementation;

public class ChooseSystem {

	DrawChooseSystem frame;
	
	public ChooseSystem() {
		frame = new DrawChooseSystem();
		frame.setTitle("Choose System");
		frame.setVisible(true);
		frame.setBounds(10, 10, 370, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		ImageIcon img = new ImageIcon("././././images/idemia.jpg");
		frame.setIconImage(img.getImage());
	}

	public class DrawChooseSystem extends JFrame implements ActionListener {
		private static final long serialVersionUID = 1L;
		Container container = getContentPane();
		ImageIcon icon = new ImageIcon("././././images/idemia.jpg");
		JLabel label = new JLabel(icon);
		JLabel labe2 = new JLabel("Choose System");
		JCheckBox chooseAllSystems = new JCheckBox("All");
		JCheckBox chooseBCSystem = new JCheckBox("BC");
		JCheckBox chooseEVisaSystem = new JCheckBox("EVisa");
		JCheckBox chooseEresidencySystem = new JCheckBox("EResidency");
		JButton runTestCases = new JButton("RUN");

		public DrawChooseSystem() {
			// calling layout manager
			setLayoutManager();
			setLocationAndSize();
			addComponentsToContainer();
			addActionEvent();// calling add action event method
		}

		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {
			// Coding Part of showPassword JCheckBox
			if (e.getSource() == chooseAllSystems) {
				if (chooseAllSystems.isSelected()) {
					chooseBCSystem.setSelected(true);
					chooseEVisaSystem.setSelected(true);
					chooseEresidencySystem.setSelected(true);
					chooseBCSystem.setEnabled(false);
					chooseEVisaSystem.setEnabled(false);
					chooseEresidencySystem.setEnabled(false);
				} else {
					chooseBCSystem.setSelected(false);
					chooseEVisaSystem.setSelected(false);
					chooseEresidencySystem.setSelected(false);
					chooseBCSystem.setEnabled(true);
					chooseEVisaSystem.setEnabled(true);
					chooseEresidencySystem.setEnabled(true);
				}
			}
			// Coding Part of run button
			if (e.getSource() == runTestCases) {
				if (chooseAllSystems.isSelected()) {
					//border control
					Br br=new Br();
					FIDImplementation fidImplementation=new FIDImplementation();
					FLMImplementation flmImplementation=new FLMImplementation();
					TransversalImplementation transversalImplementation=new TransversalImplementation();
					WatchListImplementation watchListImplementation=new WatchListImplementation();
					MVTImplementation mvtImplementation=new MVTImplementation();
					MVTPortImplementation mvtPortImplementation=new MVTPortImplementation();
					Ep ep=new Ep();
					//visa
					EVisaPublicImplementation runEvisaPublic = new EVisaPublicImplementation();
					EVisaPrivateImplementation runEvisaPrivate = new EVisaPrivateImplementation();
					EvisaQc runEvisaQc = new EvisaQc();
					EVisaAdminImplementation runEvisaAdmin = new EVisaAdminImplementation();
					//residency
					EResidencyPublic runEresidencyPublic = new EResidencyPublic();
					EResidencyPrivate runEresidencyPrivate = new EResidencyPrivate();
					EResidencyQc runEresidencyQc = new EResidencyQc();
					EResidencyAdmin runEresidencyAdmin = new EResidencyAdmin();
					//navigate to result frame
					ResultFrame resultFrame=new ResultFrame();
				    frame.dispose();
				
				}else {
				if (chooseBCSystem.isSelected()) {
					Br br=new Br();
					FIDImplementation fidImplementation=new FIDImplementation();
					FLMImplementation flmImplementation=new FLMImplementation();
					TransversalImplementation transversalImplementation=new TransversalImplementation();
					WatchListImplementation watchListImplementation=new WatchListImplementation();
					MVTImplementation mvtImplementation=new MVTImplementation();
					MVTPortImplementation mvtPortImplementation=new MVTPortImplementation();
					Ep ep=new Ep();
					//navigate to result frame
					ResultFrame resultFrame=new ResultFrame();
				    frame.dispose();
				}
				if (chooseEVisaSystem.isSelected()) {
					EVisaPublicImplementation runPublic = new EVisaPublicImplementation();
					EVisaPrivateImplementation runPrivate = new EVisaPrivateImplementation();
					EvisaQc runQc = new EvisaQc();
					EVisaAdminImplementation runAdmin = new EVisaAdminImplementation();
					//navigate to result frame
					ResultFrame resultFrame=new ResultFrame();
				    frame.dispose();
				}
				if (chooseEresidencySystem.isSelected()) {
					EResidencyPublic runPublic = new EResidencyPublic();
					EResidencyPrivate runPrivate = new EResidencyPrivate();
					EResidencyQc runQc = new EResidencyQc();
					EResidencyAdmin runAdmin = new EResidencyAdmin();
					//navigate to result frame
					ResultFrame resultFrame=new ResultFrame();
				    frame.dispose();
				}
			}}
		}

		public void setLayoutManager() {
			container.setLayout(null);
		}

		public void setLocationAndSize() {
			// Setting location and Size of each components using setBounds() method.
			label.setBounds(120, 40, 130, 130);
			labe2.setBounds(145, 175, 100, 30);
			chooseAllSystems.setBounds(150, 250, 150, 30);
			chooseBCSystem.setBounds(150, 280, 150, 30);
			chooseEVisaSystem.setBounds(150, 310, 150, 30);
			chooseEresidencySystem.setBounds(150, 340, 150, 30);
			runTestCases.setBounds(110, 400, 150, 30);
		}

		public void addActionEvent() {
			// adding Action listener to components
			chooseAllSystems.addActionListener(this);
			chooseBCSystem.addActionListener(this);
			chooseEVisaSystem.addActionListener(this);
			chooseEresidencySystem.addActionListener(this);
			runTestCases.addActionListener(this);
		}

		public void addComponentsToContainer() {
			// Adding each components to the Container
			container.add(chooseAllSystems);
			container.add(chooseBCSystem);
			container.add(chooseEVisaSystem);
			container.add(chooseEresidencySystem);
			container.add(label);
			container.add(labe2);
			container.add(runTestCases);
		}

	}
}