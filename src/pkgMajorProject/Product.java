package pkgMajorProject;

public class Product {
    private static int nextProdID;
    private int prodID;
    private String prodName;
    private int prodUnit;
    private double prodCost;
    private String prodDesc;

    //Constructor
    Product(){
        Product.nextProdID ++;
        prodID = Product.nextProdID;
        setProdName("None");
        setProdUnit(0);
        setProdCost(0.0f);
        setProdDesc("None");
    }

    Product(String tmpProdName, int tmpProdUnit, double tmpProdCost,String tmpProdDesc){
        Product.nextProdID ++;
        prodID = Product.nextProdID;
        setProdName(tmpProdName);
        setProdUnit(tmpProdUnit);
        setProdCost(tmpProdCost);
        setProdDesc(tmpProdDesc);
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

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }
}

