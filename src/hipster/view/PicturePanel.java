package hipster.view;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PicturePanel extends JPanel
{
	/**
	 * The base image being used.
	 */
	private Image baseImage;
	/**
	 * The icon for the image.
	 */
	private ImageIcon pictureSource;
	/**
	 * An int for width.
	 */
	private int width;
	/**
	 * An int for heigth.
	 */
	private int height;

	/**
	 * Constructor for the PicturePanel
	 * @param imagePath path of the image
	 * @param width size
	 * @param height size
	 */
	public PicturePanel(URL imagePath, int width, int height)
	{
		this.width = width;
		this.height = height;
		this.pictureSource = new ImageIcon(imagePath);
	}
	
	/**
	 * Method to set an image.
	 * @param imagePath
	 */
	public void setPictureSource(URL imagePath)
	{
		this.pictureSource = new ImageIcon(imagePath);
	}
	
	/**
	 * An override method to let us use our own image file.
	 */
	@Override
	protected void paintComponent(Graphics panelGraphics)
	{
		super.paintComponent(panelGraphics);
		baseImage = pictureSource.getImage();
		panelGraphics.drawImage(baseImage, 0, 0, width, height, null);
	}
}
