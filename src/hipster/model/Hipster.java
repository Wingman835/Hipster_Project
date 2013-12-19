package hipster.model;

public class Hipster
{
	private String name;
	private String hipsterType;
	private String hipsterPhrase;
	private String [] hipsterBooks;
	
	/**
	 * Creates the self hipster with it's values.
	 */
	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Nick Duckworth";
		hipsterType = "Gangster Hipster";
		hipsterPhrase = "Aye dog, where's mah sugar?";
		
		fillTheBooks();
	}
	
	/**
	 * Constructor for the Hipster Object.
	 * @param name of the hipster.
	 * @param hipsterType the type of hipster.
	 * @param hipsterPhrase of a hipster.
	 * @param hipsterBooks books that are hipster.
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase, String[] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	
	}
	
	/**
	 * Add's values for books in the books list.
	 */
	private void fillTheBooks()
	{
		hipsterBooks[0] = "feed";
		hipsterBooks[1] = "befse";
		hipsterBooks[2] = "bbbaaa";
		hipsterBooks[3] = "fafafafa";
		hipsterBooks[4] = "efilui";
	}
	
	/**
	 * Getter method for name.
	 * @return Hipster Name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Setter method for name
	 * @param name Hipster Name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * Getter method for hipster type.
	 * @return hipster type.
	 */
	public String getHipsterType()
	{
		return hipsterType;
	}
	
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}
	public String [] getHipsterBooks()
	{
		return hipsterBooks;
	}
	public void setHipsterBooks(String [] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

}
