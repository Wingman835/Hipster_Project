package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

/**
 * 
 * @author nduc4538
 * @version 1.1 
 */
public class HipsterController
{
	/**
	 * Creates the HipsterFrame.
	 */
	private HipsterFrame myFrame;
	/**
	 * Creates the selfHipster.
	 */
	private Hipster selfHipster;
	/**
	 * Creates the classHipsters.
	 */
	private Hipster[] classHipsters;
	/**
	 * Create a hipster counter.
	 */
	private int hipsterCount;
	
	/**
	 * Initializes the hipster objects.
	 */
	public HipsterController()
	{
		selfHipster = new Hipster();
		classHipsters = new Hipster [50];
		hipsterCount = 0;
	}
	
	/**
	 * Starts the application
	 */
	public void start()
	{
		myFrame = new HipsterFrame(this);
	}
	
	public Hipster[] getClassHipsters()
	{
		return classHipsters;
	}
	
	/**
	 * Getter for the Hipster.
	 * @return the hipster
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}
	
	/**
	 * Retrieves the Hipster from the specified position in the array.
	 * @param position - The location in the array. It must be between 0 and classHipsters.length.
	 * @return - The hipster at the position in the array.
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;
		
		if(position < classHipsters.length && position >= 0)
		{
			currentHipster = classHipsters[position];
		}
		
		return currentHipster;
	}
	
	/**
	 * Used to retrieve a random hipster object from the array of class Hipsters.
	 * @return
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;
		
		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) (random * classHipsters.length);
		currentHipster = classHipsters[randomIndex];
		
 		return currentHipster;
	}
	
	/**
	 * Creates and adds a Hipster
	 * @param books Hipster Books
	 * @param name Hipster Name
	 * @param type
	 * @param phrase
	 */
	public void addHipster(String [] books, String name, String type, String phrase)
	{
		if(hipsterCount < classHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			classHipsters[hipsterCount] = tempHipster;
			hipsterCount++;
			
		}
		else
		{
			JOptionPane.showMessageDialog(myFrame, "The class is full you are too mainstream to be added.");
		}
		
	}
	
	

}
