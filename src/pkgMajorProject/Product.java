package pkgMajorProject;

public class Product {
    private static int nextProdID;
    private int prodID;
    private String prodName;
    private int prodUnit;
    private double prodCost;

    //Constructor
    Product(){
        Product.nextProdID ++;
        prodID = Product.nextProdID;
        setProdName("None");
        setProdUnit(0);
        setProdCost(0.0f);
    }

    Product(String tmpProdName, int tmpProdUnit, double tmpProdCost){
        Product.nextProdID ++;
        prodID = Product.nextProdID;
        setProdName(tmpProdName);
        setProdUnit(tmpProdUnit);
        setProdCost(tmpProdCost);
    }


    //Futures methods

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
}
