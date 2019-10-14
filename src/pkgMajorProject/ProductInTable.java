/*
Author : Vy Dao
Course : CSIS 335
Assignment: Major Project1
Due Date : 10/14/2019
Date handed : 10/14/2019
Description: This file contain the ProductInTable class that extends from Product that allow the developer to creating different object to work with tableview
 */
package pkgMajorProject;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProductInTable extends Product {
    private int prodIDInTable;
    private String prodNameInTable;
    private int prodTotalUnit;
    private double prodCost;

    ProductInTable(int tmpID, String tmpName, int tmpUnit, double tmpCost){
        setProdIDInTable(tmpID);
        setProdNameInTable(tmpName);
        setProdTotalUnit(tmpUnit);
        BigDecimal bd = new BigDecimal(tmpCost).setScale(2, RoundingMode.HALF_UP);
        setProdCost(bd.doubleValue());
    }
    public int getProdIDInTable() {
        return prodIDInTable;
    }

    public void setProdIDInTable(int prodIDInTable) {
        this.prodIDInTable = prodIDInTable;
    }

    public String getProdNameInTable() {
        return prodNameInTable;
    }

    public void setProdNameInTable(String prodNameInTable) {
        this.prodNameInTable = prodNameInTable;
    }

    public int getProdTotalUnit() {
        return prodTotalUnit;
    }

    public void setProdTotalUnit(int prodTotalUnit) {
        this.prodTotalUnit = prodTotalUnit;
    }

    public double getProdCost() {
        return prodCost;
    }

    public void setProdCost(double prodCost) {
        this.prodCost = prodCost;
    }
}
