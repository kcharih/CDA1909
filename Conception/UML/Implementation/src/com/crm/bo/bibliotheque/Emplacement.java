/**
 * 
 */
package com.crm.bo.bibliotheque;

import java.util.List;

/**
 * @author k_cha
 *
 */
public class Emplacement {
	private int travee;
	private int etagere;
	private int niveau;
	private List<Ressource> listRessources;

	/**
	 * 
	 */
	public Emplacement() {
		super();
	}

	/**
	 * @param travee
	 * @param etagere
	 * @param niveau
	 */
	public Emplacement(int travee, int etagere, int niveau) {
		super();
		this.travee = travee;
		this.etagere = etagere;
		this.niveau = niveau;
	}

	/**
	 * @return the travee
	 */
	public int getTravee() {
		return travee;
	}

	/**
	 * @param travee the travee to set
	 */
	public void setTravee(int travee) {
		this.travee = travee;
	}

	/**
	 * @return the etagere
	 */
	public int getEtagere() {
		return etagere;
	}

	/**
	 * @param etagere the etagere to set
	 */
	public void setEtagere(int etagere) {
		this.etagere = etagere;
	}

	/**
	 * @return the niveau
	 */
	public int getNiveau() {
		return niveau;
	}

	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	/**
	 * @return the listRessources
	 */
	public List<Ressource> getListRessources() {
		return listRessources;
	}

	/**
	 * @param listRessources the listRessources to set
	 */
	public void setListRessources(List<Ressource> listRessources) {
		this.listRessources = listRessources;
	}

}
