/**
 * 
 */
package com.crm.bo.bibliotheque;

/**
 * @author k_cha
 *
 */
public class Livre extends Ressource {

	private String auteur;
	private int isbn;

	/**
	 * 
	 */
	public Livre() {
		super();
	}

	/**
	 * @param auteur
	 * @param isbn
	 */
	public Livre(String titre, int caution, String auteur, int isbn) {
		super();
		this.setTitre(titre);
		this.setCaution(caution);
		this.auteur = auteur;
		this.isbn = isbn;
	}

	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

}
