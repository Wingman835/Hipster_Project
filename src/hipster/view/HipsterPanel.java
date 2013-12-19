package hipster.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;

import hipster.controller.HipsterController;
import hipster.model.Hipster;
import hipster.view.PicturePanel;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class HipsterPanel extends JPanel
{
	/**
	 * Controller
	 */
	private HipsterController baseController;

	/**
	 * Hipster Button
	 */
	private JButton addHipsterButton;
	/**
	 * Random Button
	 */
	private JButton showRandomButton;
	/**
	 * Specific Button
	 */
	private JButton showSpecificButton;
	/**
	 * Current Button
	 */
	private JButton showSelfButton;
	/**
	 * Name Field Label
	 */
	private JLabel nameLabel;
	/**
	 * Phrase Field Label
	 */
	private JLabel phraseLabel;
	/**
	 * Type Field Label
	 */
	private JLabel typeLabel;
	/**
	 * Books Field Label
	 */
	private JLabel booksLabel;
	/**
	 * Pull-down bar for the hipsters.
	 */
	private JComboBox selectedHipsterComboBox;
	/**
	 * Name Field
	 */
	private JTextField nameField;
	/**
	 * Phrase Field
	 */
	private JTextField phraseField;
	/**
	 * Type Field
	 */
	private JTextField typeField;
	/**
	 * Books Field
	 */
	private JTextArea booksArea;
	/**
	 * Hipster Image
	 */
	private PicturePanel picturePanel;
	/**
	 * URL for the image file.
	 */
	private URL imageURL;
	/**
	 * Setup the layout for the SpringLayout.
	 */
	private SpringLayout baseLayout;
	/**
	 * Sets up the Array.
	 */
	private String[] baseArray;

	/**
	 * Initializes components in the HipsterPanel.
	 * 
	 * @param baseController
	 *            Controller
	 */
	public HipsterPanel(HipsterController baseController)
	{
		this.baseController = baseController;

		addHipsterButton = new JButton("Add a Hipster");
		showRandomButton = new JButton("Show a random Hipster");
		showSpecificButton = new JButton("Show a certain Hipster");
		showSelfButton = new JButton("Show the original Hipster");
		nameField = new JTextField(25);
		phraseField = new JTextField(25);
		typeField = new JTextField(25);
		nameLabel = new JLabel("Hipster's Name:");
		booksLabel = new JLabel("Hipster's Book:");
		phraseLabel = new JLabel("Hipster's Phrase:");
		typeLabel = new JLabel("Hipster's Type:");
		booksArea = new JTextArea(5, 25);
		baseArray = new String[3];

		imageURL = getClass().getResource("/hipster/view/images/hipster.jpg");
		picturePanel = new PicturePanel(imageURL, 200, 200);

		baseLayout = new SpringLayout();

		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * Sets the default options for the pull-down menu.
	 */
	private void setupComboBox()
	{
		baseArray[0] = "Me";
		baseArray[1] = "Myself";
		baseArray[2] = "I";

		selectedHipsterComboBox = new JComboBox(baseArray);
	}

	/**
	 * Creates the panel by setting it's layout, color, and adding it's
	 * components.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		add(addHipsterButton);
		add(showRandomButton);
		add(showSpecificButton);
		add(showSelfButton);
		add(nameLabel);
		add(phraseLabel);
		add(typeLabel);
		add(booksLabel);
		add(nameField);
		add(typeField);
		add(phraseField);
		add(booksArea);
		add(picturePanel);
		add(selectedHipsterComboBox);

		this.setBackground(new Color(75, 160, 30));
		this.setSize(2000, 800);
		booksArea.setWrapStyleWord(true);
		booksArea.setLineWrap(true);
	}
	
	/**
	 * Auto-generated layout code for the SpringLayout settings.
	 */
	private void setupLayout()
	{
		 baseLayout.putConstraint(SpringLayout.NORTH, showSelfButton, 65, SpringLayout.SOUTH, showRandomButton);
	        baseLayout.putConstraint(SpringLayout.WEST, showSpecificButton, 263, SpringLayout.WEST, this);
	        baseLayout.putConstraint(SpringLayout.SOUTH, showSpecificButton, -83, SpringLayout.SOUTH, this);
	        baseLayout.putConstraint(SpringLayout.WEST, showSelfButton, 0, SpringLayout.WEST, nameLabel);
	        baseLayout.putConstraint(SpringLayout.WEST, showRandomButton, 0, SpringLayout.WEST, nameLabel);
	        baseLayout.putConstraint(SpringLayout.NORTH, addHipsterButton, 22, SpringLayout.SOUTH, booksArea);
	        baseLayout.putConstraint(SpringLayout.WEST, addHipsterButton, 0, SpringLayout.WEST, nameLabel);
	        baseLayout.putConstraint(SpringLayout.NORTH, selectedHipsterComboBox, 18, SpringLayout.SOUTH, showRandomButton);
	        baseLayout.putConstraint(SpringLayout.WEST, selectedHipsterComboBox, 0, SpringLayout.WEST, addHipsterButton);
	        baseLayout.putConstraint(SpringLayout.NORTH, booksLabel, 0, SpringLayout.NORTH, booksArea);
	        baseLayout.putConstraint(SpringLayout.WEST, booksLabel, 0, SpringLayout.WEST, nameLabel);
	        baseLayout.putConstraint(SpringLayout.NORTH, nameField, 22, SpringLayout.NORTH, this);
	        baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 6, SpringLayout.NORTH, nameField);
	        baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, phraseLabel);
	        baseLayout.putConstraint(SpringLayout.NORTH, typeLabel, 6, SpringLayout.NORTH, typeField);
	        baseLayout.putConstraint(SpringLayout.WEST, typeLabel, 0, SpringLayout.WEST, phraseLabel);
	        baseLayout.putConstraint(SpringLayout.NORTH, phraseLabel, 6, SpringLayout.NORTH, phraseField);
	        baseLayout.putConstraint(SpringLayout.WEST, phraseLabel, 10, SpringLayout.WEST, this);
	        baseLayout.putConstraint(SpringLayout.NORTH, booksArea, 18, SpringLayout.SOUTH, phraseField);
	        baseLayout.putConstraint(SpringLayout.WEST, booksArea, 0, SpringLayout.WEST, nameField);
	        baseLayout.putConstraint(SpringLayout.NORTH, phraseField, 17, SpringLayout.SOUTH, typeField);
	        baseLayout.putConstraint(SpringLayout.NORTH, typeField, 11, SpringLayout.SOUTH, nameField);
	        baseLayout.putConstraint(SpringLayout.WEST, typeField, 0, SpringLayout.WEST, nameField);
	        baseLayout.putConstraint(SpringLayout.WEST, phraseField, 0, SpringLayout.WEST, nameField);
	        baseLayout.putConstraint(SpringLayout.WEST, nameField, 175, SpringLayout.WEST, this);
	        baseLayout.putConstraint(SpringLayout.NORTH, picturePanel, -220, SpringLayout.SOUTH, this);
	        baseLayout.putConstraint(SpringLayout.WEST, picturePanel, -200, SpringLayout.EAST, this);
	        baseLayout.putConstraint(SpringLayout.SOUTH, picturePanel, -20, SpringLayout.SOUTH, this);
	        baseLayout.putConstraint(SpringLayout.EAST, picturePanel, -20, SpringLayout.EAST, this);
	        baseLayout.putConstraint(SpringLayout.NORTH, showRandomButton, 18, SpringLayout.SOUTH, addHipsterButton);
	}

	/**
	 * Gets data to place into the fields depending on the selected hipster.
	 * @param currentHipster - The selected hipster.
	 */
	private void populateFields(Hipster currentHipster)
	{

		nameField.setText(currentHipster.getName());
		typeField.setText(currentHipster.getHipsterType());
		phraseField.setText(currentHipster.getHipsterPhrase());
		booksArea.setText("");

		for (String temp : currentHipster.getHipsterBooks())
		{
			booksArea.append(temp + ", ");
		}

		imageURL = getClass().getResource(
				"/hipster/view/images/" + currentHipster.getName() + ".jpg");

		if (imageURL != null)
		{
			picturePanel.setPictureSource(imageURL);
			picturePanel.repaint();
		}

		else
		{
			imageURL = getClass().getResource(
					"/hipster/view/images/default.jpg");
			picturePanel.setPictureSource(imageURL);
			picturePanel.repaint();
			JOptionPane.showMessageDialog(this, "No picture for this hipster.");

		}
	}
	
	/**
	 * Makes the fields blank by default and prevents errors.
	 * @param hasError Boolean to see if an error is being made.
	 */
	private void blankFields(boolean hasError)
	{
		nameField.setText("");
		typeField.setText("");
		phraseField.setText("");
		booksArea.setText("");
		if (hasError)
		{
			JOptionPane.showMessageDialog(this, "Please use valid options.");
		}
	}
	
	/**
	 * Sends information to the controller to add a new hipster to the array.
	 */
	private void sendHipsterInfoToController()
	{
		String [] books = booksArea.getText().split("' ");
		baseController.addHipster(books, nameField.getText(), typeField.getText(), phraseField.getText());
		JOptionPane.showMessageDialog(this, "Hipster added to the array.");
	}

	/**
	 * Organizes names in the combo box alphabetically.
	 * @return
	 */
	private String[] getNamesForComboBox()
	{
		int realValues = 0;
		for (int count = 0; count < baseController.getClassHipsters().length; count++)
		{
			if (baseController.getClassHipsters()[count] != null)
			{
				realValues++;
			}
		}

		String[] tempNames = new String[realValues];

		for (int realSize = 0; realSize < realValues; realSize++)
		{
			tempNames[realSize] = baseController.getClassHipsters()[realSize]
					.getName();
		}

		return tempNames;
	}

	/**
	 * Shows new information in the combo box after hipsters are added.
	 */
	private void updateHipsterComboBox()
	{
		String[] comboValues = getNamesForComboBox();
		selectedHipsterComboBox.setModel(new DefaultComboBoxModel(comboValues));
	}

	/**
	 * Creates a listener that checks for when an event happens.
	 */
	private void setupListeners()
	{
		addHipsterButton.addActionListener(new ActionListener()
		{
			/**
			 * Checks when you click the Add Hipster Button.
			 */
			public void actionPerformed(ActionEvent click)
			{
				sendHipsterInfoToController();
				updateHipsterComboBox();
				blankFields(false);
			}
		});

		showSelfButton.addActionListener(new ActionListener()
		{
			/**
			 * Checks when you click the Show Original Hipster Button.
			 */
			public void actionPerformed(ActionEvent click)
			{
				Hipster selfHipster = baseController.getSelfHipster();
				populateFields(selfHipster);
			}
		});

		showSpecificButton.addActionListener(new ActionListener()
		{
			/**
			 * Checks when you push the Show Specific Hipster Button.
			 */
			public void actionPerformed(ActionEvent click)
			{
				Hipster selectedHipster = baseController.getSpecifiedHipster(0);
				if (selectedHipster != null)
				{
					populateFields(selectedHipster);
				} else
				{
					blankFields(true);
				}
			}

		});
		
		showRandomButton.addActionListener(new ActionListener()
		{
			/**
			 * Checks when you push the Show Random Hipster Button.
			 */
			public void actionPerformed(ActionEvent click)
			{
				Hipster randomHipster = baseController.getRandomHipster();
				if (randomHipster != null)
				{
					populateFields(randomHipster);
				} else
				{
					blankFields(true);
				}
			}

		});
		
		selectedHipsterComboBox.addItemListener(new ItemListener()
		{
			
			/**
			 * Checks to see if you selected something in the selected hipster 
			 */
			@Override
			public void itemStateChanged(ItemEvent itemSelected)
			{
				int currentSelection = selectedHipsterComboBox.getSelectedIndex();
				if (currentSelection >= 0)
				{
					Hipster selectedHipster = baseController.getSpecifiedHipster(currentSelection);
					if (selectedHipster != null)
					{
						populateFields(selectedHipster);
					}
					else
					{
						blankFields(true);
					}
				}
			}
		});
	}
}
