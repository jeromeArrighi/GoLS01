package com.sogilis.exo;

import java.util.ArrayList;
import java.util.List;

public class Matrice {
    private Cellule[][] cellules;
    private int longueur;
    private int hauteur;

    public Matrice(int longueur, int hauteur){
        this.longueur = longueur;
        this.hauteur = hauteur;
        init();
    }

    public static void main(String[] args){
        Matrice matrice = new Matrice(4, 4);
        matrice.print();
    }

    private void init(){
        cellules = new Cellule[this.hauteur][this.longueur];
        for(int i = 0; i < hauteur; i++){
            for(int j = 0; j < longueur; j++){
                Cellule cellule = new Cellule(i,j, getRandomEtat());
                cellules[i][j] = cellule;
            }
        }

        for(int i = 0; i< hauteur; i++){
            for(int j = 0; j < longueur; j++){
                Cellule cellule = cellules[i][j];
                cellule.setCellulesVoisines(getCellulesVoisines(cellule));
            }
        }
    }

    private Cellule[] getCellulesVoisines(Cellule cellule){
        List<Cellule> listCellule = new ArrayList<Cellule>();
        int positionx = cellule.getPositionx();
        int positiony = cellule.getPositiony();
        for(int x = cellule.getPositionx()-1; x < cellule.getPositionx()+2; x++){
            for(int y = cellule.getPositiony()-1; y < cellule.getPositiony()+2; y++){
                if(x<0 || x>=longueur || y < 0 || y >= hauteur || (x == 0 && y == 0)){
                    continue;
                }
                Cellule celluleVoisine = cellules[y][x];
                listCellule.add(celluleVoisine);
            }
        }
        return listCellule.toArray(new Cellule[listCellule.size()]);
    }

    private boolean getRandomEtat(){
        return Math.random() < 0.5;
    }

    public void print(){
        for(int i = 0; i < hauteur; i++){
            for(int j = 0; j < longueur; j++){
                System.out.print(cellules[i][j].isEtat()?"*":" ");
            }
            System.out.print("\n");
        }
    }

    public Cellule[][] getCellules() {
        return cellules;
    }

    public int getLongueur() {
        return longueur;
    }

    public int getHauteur() {
        return hauteur;
    }
}
