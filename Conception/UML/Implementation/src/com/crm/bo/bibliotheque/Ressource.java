/**
 * 
 */
package com.crm.bo.bibliotheque;

import java.util.ArrayList;
import java.util.List;

/**
 * @author k_cha
 * @since 04/06/2020
 * @version 1.0
 *
 */
public abstract class Ressource {
	protected String titre;
	protected int caution;
	private Emplacement emplacement;
	private List<Exemplaire> listExemplaires;

	/**
	 * @param titre
	 * @param caution
	 */
	public Ressource(String titre, int caution) {
		super();
		this.titre = titre;
		this.caution = caution;
		this.listExemplaires = new ArrayList<Exemplaire>();
	}

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

	public void addExemplaire(Exemplaire exemplaire) {
		this.listExemplaires.add(exemplaire);
	}

}
