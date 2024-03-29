/*
Author : Vy Dao
Course : CSIS 335
Assignment: Major Project1
Due Date : 10/14/2019
Date handed : 10/14/2019
Description: This file contains the Product view with all of its method.
 */
package pkgMajorProject;

public class Product{
    protected static int nextProdID;
    protected int prodID;
    protected String prodName;
    protected int prodUnit;
    protected double prodCost;
    protected String prodDesc;
    protected String prodImgURL;

    //Constructor
    Product(){
        Product.nextProdID ++;
        prodID = Product.nextProdID;
        setProdName("None");
        setProdUnit(0);
        setProdCost(0.0f);
        setProdDesc("None");
        setProdImgURL("");
    }

    Product(String tmpProdName, int tmpProdUnit, double tmpProdCost,String tmpProdDesc,String tmpProdImgURL){
        Product.nextProdID ++;
        prodID = Product.nextProdID;
        setProdName(tmpProdName);
        setProdUnit(tmpProdUnit);
        setProdCost(tmpProdCost);
        setProdDesc(tmpProdDesc);
        setProdImgURL(tmpProdImgURL);
    }


    // Getters and setters
    public static int getNextProdID() {
        return nextProdID;
    }
    public int getProdID() {
        return prodID;
    }

    public void setProdUnit(int tmpUnit){
        prodUnit = tmpUnit;
    }

    public int getProdUnit(){
        return  prodUnit;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdCost() {
        return prodCost;
    }

    public void setProdCost(double prodCost) {
        this.prodCost = prodCost;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public String getProdImgURL() {
        return prodImgURL;
    }

    public void setProdImgURL(String proImgURL) {
        this.prodImgURL = proImgURL;
    }



}

