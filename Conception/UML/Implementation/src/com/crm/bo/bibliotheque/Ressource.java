/**
 * 
 */
package com.crm.bo.bibliotheque;

import java.util.List;

/**
 * @author k_cha
 * @since 04/06/2020
 * @version 1.0
 *
 */
public abstract class Ressource {
	private String titre;
	private int caution;
	private Emplacement emplacement;
	private List<Exemplaire> listExemplaires;

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the caution
	 */
	public int getCaution() {
		return caution;
	}

	/**
	 * @param caution the caution to set
	 */
	public void setCaution(int caution) {
		this.caution = caution;
	}

	/**
	 * @return the emplacement
	 */
	public Emplacement getEmplacement() {
		return emplacement;
	}

	/**
	 * @param emplacement the emplacement to set
	 */
	public void setEmplacement(Emplacement emplacement) {
		this.emplacement = emplacement;
	}

	/**
	 * @return the listExemplaires
	 */
	public List<Exemplaire> getListExemplaires() {
		return listExemplaires;
	}

	/**
	 * @param listExemplaires the listExemplaires to set
	 */
	public void setListExemplaires(List<Exemplaire> listExemplaires) {
		this.listExemplaires = listExemplaires;
	}

}
