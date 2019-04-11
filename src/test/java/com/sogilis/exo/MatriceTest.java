package com.sogilis.exo;

import org.junit.Assert;
import org.junit.Test;

public class MatriceTest {

    @Test
    public void mainTest(){
       Matrice matrice = new Matrice(4, 4);
        Assert.assertEquals(4, matrice.getCellules().length);
        Assert.assertEquals(4, matrice.getCellules()[0].length);
        Assert.assertEquals(4, matrice.getHauteur());
        Assert.assertEquals(4, matrice.getLongueur());

        Cellule cellule00 = matrice.getCellules()[0][0];
        Cellule[] cellules00Voisines = cellule00.getCellulesVoisines();
        Assert.assertNotNull(cellules00Voisines[0]);
        Assert.assertNotNull(cellules00Voisines[1]);
        Assert.assertNotNull(cellules00Voisines[2]);
        Assert.assertEquals(3, cellules00Voisines.length);
    }
}
