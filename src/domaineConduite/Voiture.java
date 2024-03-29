package domaineConduite;

import java.util.Observable;

public class Voiture extends Observable {

	private int coordXEnMetres;
	private int coordYEnMetres;
	private int vitesseXMetreParSecondes;
	private int vitesseYMetreParSecondes;
	private int angle;

	public static final int largeurDomaine = 1000;

	public Voiture(int coordXEnMetres, int coordYEnMetres) {
		this.coordXEnMetres = coordXEnMetres;
		this.coordYEnMetres = coordYEnMetres;
		this.vitesseXMetreParSecondes = 0;
		this.vitesseYMetreParSecondes = 0;
	}

	public Voiture(int coordXEnMetres, int coordYEnMetres, int vitesseXMetreParSecondes, int vitesseYMetreParSecondes) {
		this.coordXEnMetres = coordXEnMetres;
		this.coordYEnMetres = coordYEnMetres;
		this.vitesseXMetreParSecondes = vitesseXMetreParSecondes;
		this.vitesseYMetreParSecondes = vitesseYMetreParSecondes;
	}

	public Voiture(int coordXEnMetres, int coordYEnMetres, int angle) {
		this.coordXEnMetres = coordXEnMetres;
		this.coordYEnMetres = coordYEnMetres;
		this.angle = angle;
	}

	public int getCoordXEnMetres() {
		return coordXEnMetres;
	}

	public int getCoordYEnMetres() {
		return coordYEnMetres;
	}

	public int getVitesseXMetreParSecondes() {
		return vitesseXMetreParSecondes;
	}

	public int getVitesseYMetreParSecondes() {
		return vitesseYMetreParSecondes;
	}
	
	public void avancerEnFonctionDeLaVitesse() {
		coordXEnMetres += vitesseXMetreParSecondes;
		notificationObservateurs();
	}

	private void notificationObservateurs() {
		this.setChanged();
		this.notifyObservers();
	}
	
	public int getAngle() {
		return angle;
	}
}