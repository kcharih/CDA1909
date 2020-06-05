/**
 * 
 */
package com.crm.bo.bibliotheque;

import java.util.Date;

/**
 * @author k_cha
 *
 */
public class Exemplaire {
	private String code_barre;
	private Date date_retour;
	private Ressource ressource;
	private Utilisateur utilisateur;

	/**
	 * 
	 */
	public Exemplaire() {
		super();
	}

	/**
	 * @param code_barre
	 * @param date_retour
	 */
	public Exemplaire(String code_barre, Date date_retour) {
		super();
		this.code_barre = code_barre;
		this.date_retour = date_retour;
	}

	/**
	 * @return the code_barre
	 */
	public String getCode_barre() {
		return code_barre;
	}

	/**
	 * @param code_barre the code_barre to set
	 */
	public void setCode_barre(String code_barre) {
		this.code_barre = code_barre;
	}

	/**
	 * @return the date_retour
	 */
	public Date getDate_retour() {
		return date_retour;
	}

	/**
	 * @param date_retour the date_retour to set
	 */
	public void setDate_retour(Date date_retour) {
		this.date_retour = date_retour;
	}

	/**
	 * @return the ressource
	 */
	public Ressource getRessource() {
		return ressource;
	}

	/**
	 * @param ressource the ressource to set
	 */
	public void setRessource(Ressource ressource) {
		this.ressource = ressource;
	}

	/**
	 * @return the utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
