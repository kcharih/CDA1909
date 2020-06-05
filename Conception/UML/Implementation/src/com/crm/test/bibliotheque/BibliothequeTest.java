/**
 * 
 */
package com.crm.test.bibliotheque;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.crm.bo.bibliotheque.Emplacement;
import com.crm.bo.bibliotheque.Exemplaire;
import com.crm.bo.bibliotheque.Livre;
import com.crm.bo.bibliotheque.Ressource;
import com.crm.bo.bibliotheque.Revue;
import com.crm.bo.bibliotheque.Utilisateur;

/**
 * @author k_cha
 *
 */
public class BibliothequeTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/************************************************************************
		 ******************** Création des objets principaux*********************
		 ************************************************************************/

		// Création des utilisateurs
		Utilisateur pierre = new Utilisateur("Pierre", 10);
		Utilisateur paul = new Utilisateur("paul", 25);

		// Création des livres
		Livre petitPrince = new Livre("Le Petit Prince", 10, "St-Exupery", 985647);

		// Création des revues
		Revue journalLequipe = null;
		try {
			journalLequipe = new Revue("L'Equipe", 5, 1, new SimpleDateFormat("dd/MM/yyyy").parse("05/06/2020"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Création des exemplaires
		Exemplaire ex1 = null;
		Exemplaire ex2 = null;
		Exemplaire ex3 = null;
		try {
			ex1 = new Exemplaire("1234", new SimpleDateFormat("dd/MM/yyyy").parse("20/06/2020"));
			ex2 = new Exemplaire("5678", null);
			ex3 = new Exemplaire("3695", new SimpleDateFormat("dd/MM/yyyy").parse("17/06/2020"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Création des emplacements
		Emplacement e1 = new Emplacement(3, 2, 1);

		/************************************************************************
		 ******************** Création des liens*********************************
		 ************************************************************************/

		// Ressource -> Emplacement(stocker)
		petitPrince.setEmplacement(e1);
		journalLequipe.setEmplacement(e1);

		// Emplacement -> Ressource(stocker)
		List<Ressource> listRessourcesE1 = e1.getListRessources();
		if (listRessourcesE1 == null) {
			listRessourcesE1 = new ArrayList<Ressource>();
		}
		listRessourcesE1.add(journalLequipe);
		listRessourcesE1.add(petitPrince);

		// Exemplaire -> Ressource
		ex1.setRessource(petitPrince);
		ex2.setRessource(petitPrince);
		ex3.setRessource(journalLequipe);

		// Ressource -> Exemplaire
		List<Exemplaire> listExPetitPrince = petitPrince.getListExemplaires();
		if (listExPetitPrince == null) {
			listExPetitPrince = new ArrayList<Exemplaire>();
		}
		listExPetitPrince.add(ex1);
		listExPetitPrince.add(ex2);

		List<Exemplaire> listExLequipe = journalLequipe.getListExemplaires();
		if (listExLequipe == null) {
			listExLequipe = new ArrayList<Exemplaire>();
		}
		listExLequipe.add(ex3);

		// Exemplaire -> Utilisateur(emprunter)
		ex1.setUtilisateur(pierre);
		ex3.setUtilisateur(pierre);

		// Utilisateur -> Exemplaire(emprunter)
		List<Exemplaire> listExPierre = pierre.getListExemplaires();
		if (listExPierre == null) {
			listExPierre = new ArrayList<Exemplaire>();
			pierre.setListExemplaires(listExPierre);
		}
		listExPierre.add(ex1);
		listExPierre.add(ex3);

		// Affichage du résultat
		System.out.println(pierre);

	}

}
