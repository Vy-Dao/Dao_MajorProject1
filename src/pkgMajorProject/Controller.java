package pkgMajorProject;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Controller {

    //Creating Buttons, radio, checkbox, all of the control action
    @FXML Button btnSubmit; @FXML Button btnPrintInv; @FXML Button btnPrintInvTable; @FXML Button btnClear;
    @FXML ImageView imgItem;
    @FXML TextField txfItemName; @FXML TextField txfItemCost;
    @FXML TextArea txaCart; @FXML TextArea txaDesc;
    @FXML ToggleGroup grpBoardGames; @FXML ToggleGroup grpPhones; @FXML ToggleGroup grpPayments;
        //Checkbox
    @FXML CheckBox chkApple; @FXML CheckBox chkBanana; @FXML CheckBox chkCherie; @FXML CheckBox chkCoconut; @FXML CheckBox chkGrape; @FXML CheckBox chkOrange;
    @FXML CheckBox chkWatermelon; @FXML CheckBox chkPeach; @FXML CheckBox chkPineapple; @FXML CheckBox chkKiwi; @FXML CheckBox chkBroccoli; @FXML CheckBox chkCarrot;
    @FXML CheckBox chkAsparagus; @FXML CheckBox chkBean; @FXML CheckBox chkCorn; @FXML CheckBox chkOnion; @FXML CheckBox chkPepper; @FXML CheckBox chkPotato;
    @FXML CheckBox chkPumpkin; @FXML CheckBox chkYam;
        //ChoiceBox
    @FXML ChoiceBox chbApple; @FXML ChoiceBox chbBanana; @FXML ChoiceBox chbCherie; @FXML ChoiceBox chbCoconut; @FXML ChoiceBox chbGrape; @FXML ChoiceBox chbOrange;
    @FXML ChoiceBox chbWatermelon; @FXML ChoiceBox chbPeach; @FXML ChoiceBox chbPineapple; @FXML ChoiceBox chbKiwi; @FXML ChoiceBox chbBroccoli; @FXML ChoiceBox chbCarrot;
    @FXML ChoiceBox chbAsparagus; @FXML ChoiceBox chbBean; @FXML ChoiceBox chbCorn; @FXML ChoiceBox chbOnion; @FXML ChoiceBox chbPepper; @FXML ChoiceBox chbPotato;
    @FXML ChoiceBox chbPumpkin; @FXML ChoiceBox chbYam;
        //RadioButton
    @FXML RadioButton rdoJenga; @FXML RadioButton rdoConnect4; @FXML RadioButton rdoUno; @FXML RadioButton rdoClue; @FXML RadioButton rdoMonopoly; @FXML RadioButton rdoHeadsUp;
    @FXML RadioButton rdoPixel4; @FXML RadioButton rdoiPhone ; @FXML RadioButton rdoSGalaxy; @FXML RadioButton rdoOnePlus; @FXML RadioButton rdoRazer; @FXML RadioButton rdoNokia;

        //CheckBox for Radiobutton
    @FXML ChoiceBox chbJenga; @FXML ChoiceBox chbConnect4; @FXML ChoiceBox chbUno; @FXML ChoiceBox chbClue; @FXML ChoiceBox chbMonopoly; @FXML ChoiceBox chbHeadsUp;
    @FXML ChoiceBox chbPixel4; @FXML ChoiceBox chbiPhone; @FXML ChoiceBox chbSamsung; @FXML ChoiceBox chbOnePlus; @FXML ChoiceBox chbRazer; @FXML ChoiceBox chbNokia;
        //RadioButton for Payment
    @FXML RadioButton rdoCards; @FXML RadioButton rdoCash;

    //Creating products
    Product p1 = new Product("Apple",10,1.0f,"Apples are extremely rich in important antioxidants, flavanoids, and dietary fiber.","apple.gif");
    Product p2 = new Product("Banana",20,1.5f,"Bananas contain many important nutrients, may improve digestive health, and may aid weight loss","banana.gif");
    Product p3 = new Product("Cherries",5,2.0f,"Cherries are full of antioxidants and rich in antioxidants and anti-inflammatory compounds","cherries.jpg");
    Product p4 = new Product("Coconut",6,.5f,"Coconut is a high-fat fruit that has a wide range of health benefits. These include providing you with disease-fighting antioxidants, promoting blood sugar regulation, and reducing certain risk factors for heart disease.","coconutmeat.gif");
    Product p5 = new Product("Grape",7,1.25f,"The nutrients in grapes may help protect against cancer, eye problems, cardiovascular disease, and other health conditions. Resveratrol is a key nutrient in grapes that may offer health benefits.","grapes.jpg");
    Product p6 = new Product("Orange",30,1.52f,"Oranges are a healthy source of fiber, vitamin C, thiamine, folate, and antioxidants. They have multiple health benefits.","orange.gif");
    Product p7 = new Product("Watermelon",40,3.0f,"Watermelons are mostly water — about 92 percent — but this refreshing fruit is soaked with nutrients. Each juicy bite has significant levels of vitamins A, B6 and C, lots of lycopene, antioxidants and amino acids. There's even a modest amount of potassium.","watermelon.gif");
    Product p8 = new Product("Peach",12,2.5f,"Peaches are good for digestion. They can boost your immune system, perk up your skin too. Peaches protect your eyes. They may lower cancer risk.","peach.jpg");
    Product p9 = new Product("Pineapple",12,0.25f,"Pineapples are tropical fruits that are rich in vitamins, enzymes and antioxidants. It may boost immunity and suppress inflammation","pineapple.jpg");
    Product p10 = new Product("Kiwi",2,3.25f,"Kiwi is high source of vitamin C. If you thought that lemons and oranges were the highest sources of Vitamin C, then think again. It also help sleep induce","kiwi.gif");
    Product p11 = new Product("Broccoli",15,0.6f,"Broccoli is a great source of vitamins K and C, a good source of folate (folic acid) and also provides potassium, fiber.","broccoli.jpg");
    Product p12 = new Product("Carrot",21,1.34f,"Carrots contain vitamin A, antioxidants, and other nutrients. Evidence suggests that eating more antioxidant-rich fruits and vegetables, such as carrots, can help reduce the risks of cancer and cardiovascular disease.","carrots.jpg");
    Product p13 = new Product("Asparagus",23,1.90f,"Asparagus is a nutrient-packed vegetable. It is a very good source of fiber, folate, vitamins A, C, E and K, as well as chromium, a trace mineral that enhances the ability of insulin to transport glucose from the bloodstream into cells","asparagus.jpg");
    Product p14 = new Product("Bean",9,0.68f,"Not only are green beans a nice, crunchy, low-calorie food but also they provide many key nutrients.Young, tender green beans are a good source of vitamin C, dietary fiber, folate, vitamin K and silicon (needed for healthy bones, skin, and hair)","greenbeans.gif");
    Product p15 = new Product("Corn",12,2.1f,"Reduces the risk of Anemia. Corn is rich is in Vitamin B12, folic acid and iron which helps in the production of red blood cells in the body","corn.jpg");
    Product p16 = new Product("Onion",16,0.55f,"Onions are rich in antioxidants. They may protect against cancer. Onions improve bone density. Onions also support healthy digestion. They may help lower cholesterol.","onionwhite.gif");
    Product p17 = new Product("Pepper",23,1.22f,"Bell peppers are rich in many vitamins and antioxidants, especially vitamin C and various carotenoids. It can improved eye health and reduced risk of several chronic diseases.","peppergreen.jpg");
    Product p18 = new Product("Potato",14,3.9f,"Potatoes also contain a variety of phytonutrients that have antioxidant activity. Among these important health-promoting compounds are carotenoids, flavonoids, and caffeic acid.","potatoes.jpg");
    Product p19 = new Product("Pumpkin",18,2.1f,"The potassium contained within pumpkins can have a positive effect on blood pressure. The antioxidants in pumpkin could help prevent degenerative damage to the eyes.","pumpkin.jpg");
    Product p20 = new Product("Yam",22,2.14f,". They're a great source of fiber, potassium, manganese, copper, and antioxidants. Yams are linked to various health benefits and may boost brain health, reduce inflammation, and improve blood sugar control.","yamroot.gif");
    Product p21 = new Product("Jenga",7,6.88f,"Want a game experience that combines friends, skill, suspense, laughter, and maybe a little luck? You gotta get the Classic Jenga game! It’s the perfect game for everyone, with edge-of-your-seat, gravity-defying action. Do you dive right in and pull your block, or take your time and study the stack? Any way you choose, show your Jenga style!","jenga.jpeg");
    Product p22 = new Product("Connect4",8,5.51f,"Challenge a friend to rule the grid in Connect 4 Classic Grid, the game where strategy drives the competition! Line ‘em up and go for the win! Choose the gold discs or the red discs and drop them into the grid. When you get 4 discs in a row, you win. It’s simple, fast, and fun. Master the grid.","Connect4.jpeg");
    Product p23 = new Product("Uno",23,9.84f,"UNO is the card game that's easy to pick up and impossible to put down! All it takes to win is a little coordination between colors (red, green, blue, and yellow) and numbers. This fun family card game is takes only minutes to learn and is so much fun to play!","Uno.jpeg");
    Product p24 = new Product("Clue",13,8.77f,"The mystery you love to solve again and again is even more intense! Clue is back with a modern twist, and you have to find out who is responsible for murdering the host at a millionaire's mansion or a boardwalk.","Clue.jpeg");
    Product p25 = new Product("Monopoly",14,12.00f,"Challenge friends and family and play the Monopoly Ultimate Banking game! This game presents a modern banking version of the Monopoly game in which Monopoly money is no more! Featuring an Ultimate Banking unit with touch technology, players can instantly buy properties, set rent, and tap their way to fortune.","Monopoly.jpeg");
    Product p26 = new Product("Heads Up",21, 11.04f,"Heads Up! Party Game lets you play the party game version of the popular app seen on The Ellen DeGeneres Show! Put on a headband and place game cards in with the words facing out - without looking at them!","HeadsUp.jpeg");
    Product p27 = new Product("Google Pixel 3XL",29,999.85f,"The Google Pixel 4XL takes what's good about the iPhone and applies it to Android. Whether you think that's a good or a bad thing, the Pixel 4XL needs to be experienced to be fully understood. It is one of the best Android phones you can buy right now and quite possibly has the best camera available.","pixel4.jpg");
    Product p28 = new Product("iPhone Pro Max",30,1099.00f,"The iPhone 11 Pro takes what made the XS great and improves battery life and the camera. The iPhone has arguably taken back the crown for best mobile camera, though the pending Pixel 4 has us curious to see if Apple can keep the title for long. Aside from the tempting camera, there's little else here to lure Android fans away, but we still have to admit it's a great phone.","iphon11Promax.png");
    Product p29 = new Product("Samsung Galaxy S10 Plus",22,999.99f,"The Samsung Galaxy S10 Plus is the best phone Samsung has ever sold, but still struggles with image quality.","galaxys10.jpg");
    Product p30 = new Product("OnePlus 7 Pro",15,829.00f,"The OnePlus 7T Pro is as close as OnePlus has gotten to the upper echelons of smartphone tech. It brings finesse to a game that the company has perfected, and melds top of the line hardware with a software build that truly impresses.","OnePlus 7 Pro.jpg");
    Product p31 = new Product("Razer - Phone 2",9,799.99f,"The Razer Phone 2 is one of the few high-end flagships you can buy this year at the sub-$1,000 price point. It improves on the original Razer Phone by adding IP certification, wireless charging, and is still fantastic for gaming. It's an excellent flagship choice as long as your main priority isn't the camera.","Razer - Phone 2.jpg");
    Product p32 = new Product("Nokia 220",31,19.99f," Nokia 220 4G can access to the Internet, Facebook, and in some markets even HD voice calls. But unlike even the cheapest smartphone, you can get that with a battery life that lasts days, not hours.","Nokia 220.jpg");
    //

    //Creating link list for inventory
    static LinkedList<Product> allProduct = new LinkedList<Product>();
    static LinkedList<Product> allProductSubmitted = new LinkedList<Product>();
    static LinkedList<Integer> allProductUnit = new LinkedList<Integer>();

    public void SubmitCard(){
        txaCart.setText("Item in the cart are (Submitted):\n");
        for (int ct = 0; ct < allProductSubmitted.size(); ct++){
            Product tmpProductItem = allProductSubmitted.get(ct);
            int index = ct+1;
            txaCart.appendText(String.format("%n%d. %s - Unit %d",index,tmpProductItem.getProdName(),allProductUnit.get(ct)));
        }
    }

    public void unSubmitCart(){
        txaCart.setText("Item in the cart are (Un-submit):\n");
        for (int ct = 0; ct < allProduct.size(); ct++){
            Product tmpProductItem = allProduct.get(ct);
            int index = ct+1;
            txaCart.appendText(String.format("%n%d. %s",index,tmpProductItem.getProdName()));
        }
    }

    public void addProduct(Product tmpProd,ChoiceBox tmpChb){
        allProduct.add(tmpProd);
        tmpChb.setDisable(false);
        List<Integer> tmplist = new ArrayList<Integer>();
        for(int ct = 0; ct < tmpProd.getProdUnit(); ct++){
            tmplist.add(ct);
        }
        ObservableList<Integer> tmp = FXCollections.observableArrayList(tmplist);
        tmpChb.setItems(tmp);
        tmpChb.getSelectionModel().selectFirst();
    }

    public void inforProdcut(Product tmpProd){
            Image img = new Image(tmpProd.getProdImgURL());
            imgItem.setImage(img);
            txfItemName.setText(tmpProd.getProdName());
            txfItemCost.setText(String.format("$%.2f",tmpProd.getProdCost()));
            txaDesc.setText(tmpProd.getProdDesc());
            txaDesc.setWrapText(true);
        }
    public void removeProduct(Product tmpProd, ChoiceBox tmpChb){
        System.out.println(tmpProd.getProdName() + " has been deleted from the cart");
        allProduct.remove(tmpProd);
        tmpChb.setValue(0);
        tmpChb.setDisable(true);
    }

    public void  removeRdoProduct(Product tmpP1, Product tmpP2, Product tmpP3, Product tmpP4, Product tmpP5, ChoiceBox tmpCb1, ChoiceBox tmpCb2, ChoiceBox tmpCb3, ChoiceBox tmpCb4, ChoiceBox tmpCb5){
        if (allProduct.contains(tmpP1)){
            System.out.println(tmpP1.getProdName() + " has been deleted from the cart");
            allProduct.remove(tmpP1);
            tmpCb1.setValue(0);
            tmpCb1.setDisable(true);
        }
        else if (allProduct.contains(tmpP2)){
            System.out.println(tmpP2.getProdName() + " has been deleted from the cart");
            allProduct.remove(tmpP2);
            tmpCb2.setValue(0);
            tmpCb2.setDisable(true);
        }
        else if (allProduct.contains(tmpP3)){
            System.out.println(tmpP3.getProdName() + " has been deleted from the cart");
            allProduct.remove(tmpP3);
            tmpCb3.setValue(0);
            tmpCb3.setDisable(true);
        }
        else if (allProduct.contains(tmpP4)){
            System.out.println(tmpP4.getProdName() + " has been deleted from the cart");
            allProduct.remove(tmpP4);
            tmpCb4.setValue(0);
            tmpCb4.setDisable(true);
        }
        else if (allProduct.contains(tmpP5)){
            System.out.println(tmpP5.getProdName() + " has been deleted from the cart");
            allProduct.remove(tmpP5);
            tmpCb5.setValue(0);
            tmpCb5.setDisable(true);
        }

    }
    private void addUnitOnProduct(Product tmpProduct) {
        if (tmpProduct.getProdID() == 1){ allProductUnit.add(Integer.parseInt(chbApple.getValue().toString()));}
        else if (tmpProduct.getProdID() == 2){ allProductUnit.add(Integer.parseInt(chbBanana.getValue().toString()));}
        else if (tmpProduct.getProdID() == 3){ allProductUnit.add(Integer.parseInt(chbCherie.getValue().toString()));}
        else if (tmpProduct.getProdID() == 4){ allProductUnit.add(Integer.parseInt(chbCoconut.getValue().toString()));}
        else if (tmpProduct.getProdID() == 5){ allProductUnit.add(Integer.parseInt(chbGrape.getValue().toString()));}
        else if (tmpProduct.getProdID() == 6){ allProductUnit.add(Integer.parseInt(chbOrange.getValue().toString()));}
        else if (tmpProduct.getProdID() == 7){ allProductUnit.add(Integer.parseInt(chbWatermelon.getValue().toString()));}
        else if (tmpProduct.getProdID() == 8){ allProductUnit.add(Integer.parseInt(chbPeach.getValue().toString()));}
        else if (tmpProduct.getProdID() == 9){ allProductUnit.add(Integer.parseInt(chbPineapple.getValue().toString()));}
        else if (tmpProduct.getProdID() == 10){ allProductUnit.add(Integer.parseInt(chbKiwi.getValue().toString()));}
    }

    //Action Handler
    public void rdoAnhChkHandle(Event e){
        if((e.getSource()==chkApple) && (! allProduct.contains(p1))){
            addProduct(p1,chbApple);
            inforProdcut(p1);
        }
        else if(chkApple.isSelected() == false && (allProduct.contains(p1))){
            inforProdcut(p1);
            removeProduct(p1,chbApple);
        }
        else if ((e.getSource()==chkBanana) && (!allProduct.contains(p2))){
            addProduct(p2,chbBanana);
            inforProdcut(p2);
        }
        else if(chkBanana.isSelected() == false && (allProduct.contains(p2))){
            inforProdcut(p2);
            removeProduct(p2,chbBanana);
        }

        else if((e.getSource()==chkCherie) && (! allProduct.contains(p3))){
            addProduct(p3,chbCherie);
            inforProdcut(p3);
        }
        else if(chkCherie.isSelected() == false && (allProduct.contains(p3))){
            inforProdcut(p3);
            removeProduct(p3,chbCherie);
        }
        else if ((e.getSource()==chkCoconut) && (!allProduct.contains(p4))){
            addProduct(p4,chbCoconut);
            inforProdcut(p4);
        }
        else if(chkBanana.isSelected() == false && (allProduct.contains(p4))){
            inforProdcut(p4);
            removeProduct(p4,chbCoconut);
        }
        else if ((e.getSource()==chkGrape) && (!allProduct.contains(p5))){
            addProduct(p5,chbGrape);
            inforProdcut(p5);
        }
        else if(chkBanana.isSelected() == false && (allProduct.contains(p5))){
            inforProdcut(p5);
            removeProduct(p5,chbGrape);
        }
        else if ((e.getSource()==chkOrange) && (!allProduct.contains(p6))){
            addProduct(p6,chbOrange);
            inforProdcut(p6);
        }
        else if(chkOrange.isSelected() == false && (allProduct.contains(p6))){
            inforProdcut(p6);
            removeProduct(p6,chbOrange);
        }
        else if ((e.getSource()==chkWatermelon) && (!allProduct.contains(p7))){
            addProduct(p7,chbWatermelon);
            inforProdcut(p7);
        }
        else if(chkWatermelon.isSelected() == false && (allProduct.contains(p7))){
            inforProdcut(p7);
            removeProduct(p7,chbWatermelon);
        }

        else if ((e.getSource()==chkPeach) && (!allProduct.contains(p8))){
            addProduct(p8,chbPeach);
            inforProdcut(p8);
        }
        else if(chkPeach.isSelected() == false && (allProduct.contains(p8))){
            inforProdcut(p8);
            removeProduct(p8,chbPeach);
        }

        else if ((e.getSource()==chkPineapple) && (!allProduct.contains(p9))){
            addProduct(p9,chbPineapple);
            inforProdcut(p9);
        }
        else if(chkPineapple.isSelected() == false && (allProduct.contains(p9))){
            inforProdcut(p9);
            removeProduct(p9,chbPineapple);
        }

        else if ((e.getSource()==chkKiwi) && (!allProduct.contains(p10))){
            addProduct(p10,chbKiwi);
            inforProdcut(p10);
        }
        else if(chkKiwi.isSelected() == false && (allProduct.contains(p10))){
            inforProdcut(p10);
            removeProduct(p10,chbKiwi);
        }

        else if ((e.getSource()==chkBroccoli) && (!allProduct.contains(p11))){
            addProduct(p11,chbBroccoli);
            inforProdcut(p11);
        }
        else if(chkBroccoli.isSelected() == false && (allProduct.contains(p11))){
            inforProdcut(p11);
            removeProduct(p11,chbBroccoli);
        }

        else if ((e.getSource()==chkCarrot) && (!allProduct.contains(p12))){
            addProduct(p12,chbCarrot);
            inforProdcut(p12);
        }
        else if(chkCarrot.isSelected() == false && (allProduct.contains(p12))){
            inforProdcut(p12);
            removeProduct(p12,chbCarrot);
        }

        else if ((e.getSource()==chkAsparagus) && (!allProduct.contains(p13))){
            addProduct(p13,chbAsparagus);
            inforProdcut(p13);
        }
        else if(chkAsparagus.isSelected() == false && (allProduct.contains(p13))){
            inforProdcut(p13);
            removeProduct(p13,chbAsparagus);
        }

        else if ((e.getSource()==chkBean) && (!allProduct.contains(p14))){
            addProduct(p14,chbBean);
            inforProdcut(p14);
        }
        else if(chkBean.isSelected() == false && (allProduct.contains(p14))){
            inforProdcut(p14);
            removeProduct(p14,chbBean);
        }

        else if ((e.getSource()==chkCorn) && (!allProduct.contains(p15))){
            addProduct(p15,chbCorn);
            inforProdcut(p15);
        }
        else if(chkCorn.isSelected() == false && (allProduct.contains(p15))){
            inforProdcut(p15);
            removeProduct(p15,chbCorn);
        }

        else if ((e.getSource()==chkOnion) && (!allProduct.contains(p16))){
            addProduct(p16,chbOnion);
            inforProdcut(p16);
        }
        else if(chkOnion.isSelected() == false && (allProduct.contains(p16))){
            inforProdcut(p16);
            removeProduct(p16,chbOnion);
        }

        else if ((e.getSource()==chkPepper) && (!allProduct.contains(p17))){
            addProduct(p17,chbPepper);
            inforProdcut(p17);
        }
        else if(chkPepper.isSelected() == false && (allProduct.contains(p17))){
            inforProdcut(p17);
            removeProduct(p17,chbPepper);
        }

        else if ((e.getSource()==chkPotato) && (!allProduct.contains(p18))){
            addProduct(p18,chbPotato);
            inforProdcut(p18);
        }
        else if(chkPotato.isSelected() == false && (allProduct.contains(p18))){
            inforProdcut(p18);
            removeProduct(p18,chbPotato);
        }

            else if ((e.getSource()==chkPumpkin) && (!allProduct.contains(p19))){
            addProduct(p19,chbPumpkin);
            inforProdcut(p19);
        }
        else if(chkPumpkin.isSelected() == false && (allProduct.contains(p19))){
            inforProdcut(p19);
            removeProduct(p19,chbPumpkin);
        }

        else if ((e.getSource()==chkYam) && (!allProduct.contains(p20))){
            addProduct(p20,chbYam);
            inforProdcut(p20);
        }
        else if(chkYam.isSelected() == false && (allProduct.contains(p20))){
            inforProdcut(p20);
            removeProduct(p20,chbYam);
        }

        else if ((e.getSource()==rdoJenga) && (!allProduct.contains(p21))){
            addProduct(p21,chbJenga);
            inforProdcut(p21);
            removeRdoProduct(p22,p23,p24,p25,p26,chbConnect4,chbUno,chbClue,chbMonopoly,chbHeadsUp);

        }
        else if ((e.getSource()==rdoConnect4) && (!allProduct.contains(p22))){
            addProduct(p22,chbConnect4);
            inforProdcut(p22);
            removeRdoProduct(p21,p23,p24,p25,p26,chbJenga,chbUno,chbClue,chbMonopoly,chbHeadsUp);
        }
        else if ((e.getSource()==rdoUno) && (!allProduct.contains(p23))){
            addProduct(p23,chbUno);
            inforProdcut(p23);
            removeRdoProduct(p22,p21,p24,p25,p26,chbConnect4,chbJenga,chbClue,chbMonopoly,chbHeadsUp);
        }
        else if ((e.getSource()==rdoClue) && (!allProduct.contains(p24))){
            addProduct(p24,chbClue);
            inforProdcut(p24);
            removeRdoProduct(p22,p23,p21,p25,p26,chbConnect4,chbUno,chbJenga,chbMonopoly,chbHeadsUp);
        }
        else if ((e.getSource()==rdoMonopoly) && (!allProduct.contains(p25))){
            addProduct(p25,chbMonopoly);
            inforProdcut(p25);
            removeRdoProduct(p22,p23,p24,p21,p26,chbConnect4,chbUno,chbClue,chbJenga,chbHeadsUp);
        }
        else if ((e.getSource()==rdoHeadsUp) && (!allProduct.contains(p26))){
            addProduct(p26,chbHeadsUp);
            inforProdcut(p26);
            removeRdoProduct(p22,p23,p24,p25,p21,chbConnect4,chbUno,chbClue,chbMonopoly,chbJenga);
        }
        else if ((e.getSource()==rdoPixel4) && (!allProduct.contains(p27))){
            addProduct(p27,chbPixel4);
            inforProdcut(p27);
            removeRdoProduct(p28,p29,p30,p31,p32,chbiPhone,chbSamsung,chbOnePlus,chbRazer,chbNokia);
        }
        else if ((e.getSource()==rdoiPhone) && (!allProduct.contains(p28))){
            addProduct(p28,chbiPhone);
            inforProdcut(p28);
            removeRdoProduct(p27,p29,p30,p31,p32,chbPixel4,chbSamsung,chbOnePlus,chbRazer,chbNokia);
        }
        else if ((e.getSource()==rdoSGalaxy) && (!allProduct.contains(p29))){
            addProduct(p29,chbSamsung);
            inforProdcut(p29);
            removeRdoProduct(p27,p28,p30,p31,p32,chbPixel4,chbiPhone,chbOnePlus,chbRazer,chbNokia);
        }
        else if ((e.getSource()==rdoOnePlus) && (!allProduct.contains(p30))){
            addProduct(p30,chbOnePlus);
            inforProdcut(p30);
            removeRdoProduct(p27,p28,p29,p31,p32,chbPixel4,chbiPhone,chbSamsung,chbRazer,chbNokia);
        }
        else if ((e.getSource()==rdoRazer) && (!allProduct.contains(p31))){
            addProduct(p31,chbRazer);
            inforProdcut(p31);
            removeRdoProduct(p27,p28,p29,p30,p32,chbPixel4,chbiPhone,chbSamsung,chbOnePlus,chbNokia);
        }
        else if ((e.getSource()==rdoNokia) && (!allProduct.contains(p32))){
            addProduct(p32,chbNokia);
            inforProdcut(p32);
            removeRdoProduct(p27,p28,p29,p30,p31,chbPixel4,chbiPhone,chbSamsung,chbOnePlus,chbRazer);
        }

        //Payment options
        else if(e.getSource()==rdoCards){
            Image img = new Image("cards.jpg");
            imgItem.setImage(img);
            txfItemName.setText("Credit/Debit Cards");
            txfItemCost.setText(String.format("$%.2f",0f));
            txaDesc.setText("You will not have any discount if you are using Credit/Debit Cards to pay for you items");
            txaDesc.setWrapText(true);
        }
        else if(e.getSource()==rdoCash){
            Image img = new Image("currency.jpg");
            imgItem.setImage(img);
            txfItemName.setText("Cash");
            txfItemCost.setText(String.format("$-%.2f%s",5.00f,"%"));
            txaDesc.setText("You will receive 5% discount on the total amount of your items if you are using cash to pay for you items");
            txaDesc.setWrapText(true);
        }
        unSubmitCart();
    }

    public void chbImageHandel(Event e){
        if (e.getSource() == chbApple){
            inforProdcut(p1);
        }
        else if(e.getSource() == chbBanana){
            inforProdcut(p2);
        }
        else if (e.getSource() == chbCherie){
            inforProdcut(p3);
        }
        else if(e.getSource() == chbCoconut){
            inforProdcut(p4);
        }
        else if(e.getSource() == chbGrape){
            inforProdcut(p5);
        }
        else if(e.getSource() == chbOrange){
            inforProdcut(p6);
        }
        else if(e.getSource() == chbWatermelon){
            inforProdcut(p7);
        }
        else if(e.getSource() == chbPeach){
            inforProdcut(p8);
        }
        else if(e.getSource() == chbPineapple){
            inforProdcut(p9);
        }
        else if(e.getSource() == chbKiwi){
            inforProdcut(p10);
        }
        else if(e.getSource() == chbBroccoli){
            inforProdcut(p11);
        }
        else if(e.getSource() == chbCarrot){
            inforProdcut(p12);
        }
        else if(e.getSource() == chbAsparagus){
            inforProdcut(p13);
        }
        else if(e.getSource() == chbBean){
            inforProdcut(p14);
        }
        else if(e.getSource() == chbCorn){
            inforProdcut(p15);
        }
        else if(e.getSource() == chbOnion){
            inforProdcut(p16);
        }
        else if(e.getSource() == chbPepper){
            inforProdcut(p17);
        }
        else if(e.getSource() == chbPotato){
            inforProdcut(p18);
        }
        else if(e.getSource() == chbPumpkin){
            inforProdcut(p19);
        }
        else if(e.getSource() == chbYam){
            inforProdcut(p20);
        }
        else if(e.getSource() == chbJenga){
            inforProdcut(p21);
        }
        else if(e.getSource() == chbConnect4){
            inforProdcut(p22);
        }
        else if(e.getSource() == chbUno){
            inforProdcut(p23);
        }
        else if(e.getSource() == chbClue){
            inforProdcut(p24);
        }
        else if(e.getSource() == chbMonopoly){
            inforProdcut(p25);
        }
        else if(e.getSource() == chbHeadsUp){
            inforProdcut(p26);
        }
        else if(e.getSource() == chbPixel4){
            inforProdcut(p27);
        }
        else if(e.getSource() == chbiPhone){
            inforProdcut(p28);
        }
        else if(e.getSource() == chbSamsung){
            inforProdcut(p29);
        }
        else if(e.getSource() == chbOnePlus){
            inforProdcut(p30);
        }
        else if(e.getSource() == chbRazer){
            inforProdcut(p31);
        }
        else if(e.getSource() == chbNokia){
            inforProdcut(p32);
        }
    }
    public void btnActionHandel(ActionEvent e){
        if (e.getSource() == btnClear){
            chkApple.setSelected(false); chkBanana.setSelected(false); chkCherie.setSelected(false); chkCoconut.setSelected(false); chkGrape.setSelected(false);
            chkOrange.setSelected(false); chkWatermelon.setSelected(false); chkPeach.setSelected(false); chkPineapple.setSelected(false); chkKiwi.setSelected(false);
            chkBroccoli.setSelected(false); chkCarrot.setSelected(false); chkAsparagus.setSelected(false); chkBean.setSelected(false);
            chkCorn.setSelected(false); chkOnion.setSelected(false); chkPepper.setSelected(false); chkPotato.setSelected(false); chkPumpkin.setSelected(false); chkYam.setSelected(false);
            rdoJenga.setSelected(false); rdoConnect4.setSelected(false); rdoUno.setSelected(false); rdoClue.setSelected(false); rdoMonopoly.setSelected(false); rdoHeadsUp.setSelected(false);
            rdoPixel4.setSelected(false); rdoiPhone.setSelected(false); rdoSGalaxy.setSelected(false); rdoOnePlus.setSelected(false); rdoRazer.setSelected(false); rdoNokia.setSelected(false);
            rdoCash.setSelected(false); rdoCards.setSelected(false);

            chbApple.setDisable(true); chbBanana.setDisable(true); chbCherie.setDisable(true); chbCoconut.setDisable(true); chbGrape.setDisable(true);
            chbOrange.setDisable(true); chbWatermelon.setDisable(true); chbPeach.setDisable(true); chbPineapple.setDisable(true); chbKiwi.setDisable(true);
            chbBroccoli.setDisable(true); chbCarrot.setDisable(true); chbAsparagus.setDisable(true); chbBean.setDisable(true);
            chbCorn.setDisable(true); chbOnion.setDisable(true); chbPepper.setDisable(true); chbPotato.setDisable(true); chbPumpkin.setDisable(true); chbYam.setDisable(true);
            chbJenga.setDisable(true); chbConnect4.setDisable(true); chbUno.setDisable(true); chbClue.setDisable(true); chbMonopoly.setDisable(true); chbHeadsUp.setDisable(true);
            chbPixel4.setDisable(true); chbiPhone.setDisable(true); chbSamsung.setDisable(true); chbOnePlus.setDisable(true); chbRazer.setDisable(true); chbNokia.setDisable(true);

            chbApple.setValue(null); chbBanana.setValue(null); chbCherie.setValue(null); chbCoconut.setValue(null); chbGrape.setValue(null);
            chbOrange.setValue(null); chbWatermelon.setValue(null); chbPeach.setValue(null); chbPineapple.setValue(null); chbKiwi.setValue(null);
            chbBroccoli.setValue(null); chbCarrot.setValue(null); chbAsparagus.setValue(null); chbBean.setValue(null);
            chbCorn.setValue(null); chbOnion.setValue(null); chbPepper.setValue(null); chbPotato.setValue(null); chbPumpkin.setValue(null); chbYam.setValue(null);
            chbJenga.setValue(null); chbConnect4.setValue(null); chbUno.setValue(null); chbClue.setValue(null); chbMonopoly.setValue(null); chbHeadsUp.setValue(null);
            chbPixel4.setValue(null); chbiPhone.setValue(null); chbSamsung.setValue(null); chbOnePlus.setValue(null); chbRazer.setValue(null); chbNokia.setValue(null);

            allProduct.clear();
            allProductUnit.clear();
            unSubmitCart();
            imgItem.setImage(null);
            txfItemName.clear();
            txfItemCost.clear();
            txaDesc.clear();
        }

        //Change this e get score to submit / and try to make a flag to change submit from disable to enable if we have more than 1 item in the List also try to finish
        //the addUnitOnProduct function
        else if(e.getSource()==btnPrintInv){
            allProductUnit.clear();
            allProductSubmitted = allProduct;
            for (int ct = 0; ct < allProductSubmitted.size(); ct++){
                addUnitOnProduct(allProductSubmitted.get(ct));
            }
            SubmitCard();
            }
        }
    }


