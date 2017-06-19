/**
 * 
 */
package main;


/**
 * @author Axel
 * @author Geoffrey
 */
public class Template {
	
	
	/**
	 * @param width
	 * @param height
	 */
	public Template(int id, int width, int height) {
		this.id = id;
		this.width = width;
		this.height = height;
	}
	/**
	 * 
	 */
	public Template() {
		
	}
	/**
	 * int id
	 */
	public int id;
	
	/**
	 * @return the id
	 */
	protected int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	protected void setId(int id) {
		this.id = id;
	}
	/**
	 * int width
	 */
	public int width;
	/**
	 * int Height
	 */
	public int height;
	/**
	 * String Alphabet
	 */
	public String alphabet;

	
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width
	 * the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the alphabet
	 */
	public String getAlphabet() {
		return alphabet;
	}

	/**
	 * @param alphabet the alphabet to set
	 */
	public void setAlphabet(String alphabet) {
		this.alphabet = alphabet;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Template [id=" + id + ", width=" + width + ", height=" + height + "]";
	}

	

}
