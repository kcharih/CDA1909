/**
 * 
 */
package com.crm.bo.bibliotheque;

import java.util.List;

/**
 * @author k_cha
 *
 */
public class Utilisateur {
	private String nom;
	private int caution;
	private List<Exemplaire> listExemplaires;

	/**
	 * 
	 */
	public Utilisateur() {
		super();
	}

	/**
	 * @param nom
	 * @param caution
	 */
	public Utilisateur(String nom, int caution) {
		super();
		this.nom = nom;
		this.caution = caution;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
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

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Utilisateur [nom=" + nom + ", caution=" + caution + "]\n");

		if (listExemplaires != null) {
			for (Exemplaire ex : listExemplaires) {
				sb.append("Ressource empruntée [titre=" + ex.getRessource().getTitre());
				if (ex.getRessource() instanceof Livre) {
					sb.append(", auteur=" + ((Livre) ex.getRessource()).getAuteur() + ", isbn="
							+ ((Livre) ex.getRessource()).getIsbn() + "]\n");
				} else if (ex.getRessource() instanceof Revue) {
					sb.append(", numéro volume=" + ((Revue) ex.getRessource()).getNumero_volume() + ", date parution="
							+ ((Revue) ex.getRessource()).getDate_parution() + "]\n");
				} else {
					sb.append("]");
				}
			}
		}

		return sb.toString();
	}

}
