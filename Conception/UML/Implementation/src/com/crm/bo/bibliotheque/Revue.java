/**
 * 
 */
package com.crm.bo.bibliotheque;

import java.util.Date;

/**
 * @author k_cha
 *
 */
public class Revue extends Ressource {
	private int numero_volume;
	private Date date_parution;

	/**
	 * @param titre
	 * @param caution
	 * @param numero_volume
	 * @param date_parution
	 */
	public Revue(String titre, int caution, int numero_volume, Date date_parution) {
		super(titre, caution);
		this.numero_volume = numero_volume;
		this.date_parution = date_parution;
	}

	/**
	 * @return the numero_volume
	 */
	public int getNumero_volume() {
		return numero_volume;
	}

	/**
	 * @param numero_volume the numero_volume to set
	 */
	public void setNumero_volume(int numero_volume) {
		this.numero_volume = numero_volume;
	}

	/**
	 * @return the date_parution
	 */
	public Date getDate_parution() {
		return date_parution;
	}

	/**
	 * @param date_parution the date_parution to set
	 */
	public void setDate_parution(Date date_parution) {
		this.date_parution = date_parution;
	}

}
