package com.sogilis.exo;

import java.util.ArrayList;

public class Cellule {
    private boolean etat;
    private int positionx;
    private int positiony;
    Cellule[] cellulesVoisines = new Cellule[8];

    public Cellule(int positionx, int positiony, boolean etat){
        this.positionx = positionx;
        this.positiony = positiony;
        this.etat = etat;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public int getPositionx() {
        return positionx;
    }

    public void setPositionx(int positionx) {
        this.positionx = positionx;
    }

    public int getPositiony() {
        return positiony;
    }

    public void setPositiony(int positiony) {
        this.positiony = positiony;
    }

    public Cellule[] getCellulesVoisines() {
        return cellulesVoisines;
    }

    public void setCellulesVoisines(Cellule[] cellulesVoisines) {
        this.cellulesVoisines = cellulesVoisines;
    }
}
