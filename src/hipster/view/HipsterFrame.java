package hipster.view;

import hipster.controller.HipsterController;

import javax.swing.JFrame;

public class HipsterFrame extends JFrame
{
	
	/**
	 * Creates the baseController.
	 */
	private HipsterController baseController;
	/**
	 * Creates the basePanel.
	 */
	private HipsterPanel basePanel;
	
	/**
	 * Initializes the Hipster Frame.
	 * @param baseController Controller
	 */
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Creates the Frame and adds it's panel, size, and visibility.
	 */
	public void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(900, 600);
		this.setVisible(true);
	}

}
