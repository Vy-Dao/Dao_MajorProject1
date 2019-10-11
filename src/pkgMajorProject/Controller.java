package pkgMajorProject;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class Controller {

    //Creating Buttons, radio, checkbox, all of the control action
    @FXML Button btnSubmit; @FXML Button btnPrintInv; @FXML Button btnPrintInvTable; @FXML Button btnClear;
    @FXML ImageView imgItem;
    @FXML TextField txfItemName; @FXML TextField txfItemCost;
    @FXML TextArea txaCart; @FXML TextArea txaDesc;
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
    Product p1 = new Product("Apple",10,1.0f,"Apples are extremely rich in important antioxidants, flavanoids, and dietary fiber.");
    Product p2 = new Product("Banana",20,1.5f,"Bananas contain many important nutrients, may improve digestive health, and may aid weight loss");
    Product p3 = new Product("Cherie",5,2.0f,"Cherries are full of antioxidants and rich in antioxidants and anti-inflammatory compounds");
    Product p4 = new Product("Coconut",6,.5f,"Coconut is a high-fat fruit that has a wide range of health benefits. These include providing you with disease-fighting antioxidants, promoting blood sugar regulation, and reducing certain risk factors for heart disease.");
    Product p5 = new Product("Grape",7,1.25f,"The nutrients in grapes may help protect against cancer, eye problems, cardiovascular disease, and other health conditions. Resveratrol is a key nutrient in grapes that may offer health benefits.");
    Product p6 = new Product("Orange",30,1.52f,"Oranges are a healthy source of fiber, vitamin C, thiamine, folate, and antioxidants. They have multiple health benefits.");
    Product p7 = new Product("Watermelon",40,3.0f,"Watermelons are mostly water — about 92 percent — but this refreshing fruit is soaked with nutrients. Each juicy bite has significant levels of vitamins A, B6 and C, lots of lycopene, antioxidants and amino acids. There's even a modest amount of potassium.");
    Product p8 = new Product("Peach",12,2.5f,"Peaches are good for digestion. They can boost your immune system, perk up your skin too. Peaches protect your eyes. They may lower cancer risk.");
    Product p9 = new Product("Pineapple",12,0.25f,"Pineapples are tropical fruits that are rich in vitamins, enzymes and antioxidants. It may boost immunity and suppress inflammation");
    Product p10 = new Product("Kiwi",2,3.25f,"Kiwi is high source of vitamin C. If you thought that lemons and oranges were the highest sources of Vitamin C, then think again. It also help sleep induce");
    Product p11 = new Product("Broccoli",15,0.6f,"Broccoli is a great source of vitamins K and C, a good source of folate (folic acid) and also provides potassium, fiber.");
    Product p12 = new Product("Carrot",21,1.34f,"Carrots contain vitamin A, antioxidants, and other nutrients. Evidence suggests that eating more antioxidant-rich fruits and vegetables, such as carrots, can help reduce the risks of cancer and cardiovascular disease.");
    Product p13 = new Product("Asparagus",23,1.90f,"Asparagus is a nutrient-packed vegetable. It is a very good source of fiber, folate, vitamins A, C, E and K, as well as chromium, a trace mineral that enhances the ability of insulin to transport glucose from the bloodstream into cells");
    Product p14 = new Product("Bean",9,0.68f,"Not only are green beans a nice, crunchy, low-calorie food but also they provide many key nutrients.Young, tender green beans are a good source of vitamin C, dietary fiber, folate, vitamin K and silicon (needed for healthy bones, skin, and hair)");
    Product p15 = new Product("Corn",12,2.1f,"Reduces the risk of Anemia. Corn is rich is in Vitamin B12, folic acid and iron which helps in the production of red blood cells in the body");
    Product p16 = new Product("Onion",16,0.55f,"Onions are rich in antioxidants. They may protect against cancer. Onions improve bone density. Onions also support healthy digestion. They may help lower cholesterol.");
    Product p17 = new Product("Pepper",23,1.22f,"Bell peppers are rich in many vitamins and antioxidants, especially vitamin C and various carotenoids. It can improved eye health and reduced risk of several chronic diseases.");
    Product p18 = new Product("Potato",14,3.9f,"Potatoes also contain a variety of phytonutrients that have antioxidant activity. Among these important health-promoting compounds are carotenoids, flavonoids, and caffeic acid.");
    Product p19 = new Product("Pumpkin",18,2.1f,"The potassium contained within pumpkins can have a positive effect on blood pressure. The antioxidants in pumpkin could help prevent degenerative damage to the eyes.");
    Product p20 = new Product("Yam",22,2.14f,". They're a great source of fiber, potassium, manganese, copper, and antioxidants. Yams are linked to various health benefits and may boost brain health, reduce inflammation, and improve blood sugar control.");
    Product p21 = new Product("Jenga",7,6.88f,"Want a game experience that combines friends, skill, suspense, laughter, and maybe a little luck? You gotta get the Classic Jenga game! It’s the perfect game for everyone, with edge-of-your-seat, gravity-defying action. Do you dive right in and pull your block, or take your time and study the stack? Any way you choose, show your Jenga style!");
    Product p22 = new Product("Connect4",8,5.51f,"Challenge a friend to rule the grid in Connect 4 Classic Grid, the game where strategy drives the competition! Line ‘em up and go for the win! Choose the gold discs or the red discs and drop them into the grid. When you get 4 discs in a row, you win. It’s simple, fast, and fun. Master the grid.");
    Product p23 = new Product("Uno",23,9.84f,"UNO is the card game that's easy to pick up and impossible to put down! All it takes to win is a little coordination between colors (red, green, blue, and yellow) and numbers. This fun family card game is takes only minutes to learn and is so much fun to play!");
    Product p24 = new Product("Clue",13,8.77f,"The mystery you love to solve again and again is even more intense! Clue is back with a modern twist, and you have to find out who is responsible for murdering the host at a millionaire's mansion or a boardwalk.");
    Product p25 = new Product("Monopoly",14,12.00f,"Challenge friends and family and play the Monopoly Ultimate Banking game! This game presents a modern banking version of the Monopoly game in which Monopoly money is no more! Featuring an Ultimate Banking unit with touch technology, players can instantly buy properties, set rent, and tap their way to fortune.");
    Product p26 = new Product("Heads Up",21, 11.04f,"Heads Up! Party Game lets you play the party game version of the popular app seen on The Ellen DeGeneres Show! Put on a headband and place game cards in with the words facing out - without looking at them!");
    Product p27 = new Product("Google Pixel 4XL",29,999.85f,"The Google Pixel 3 takes what's good about the iPhone and applies it to Android. Whether you think that's a good or a bad thing, the Pixel 3 needs to be experienced to be fully understood. It is one of the best Android phones you can buy right now and quite possibly has the best camera available.");
    Product p28 = new Product("iPhone Pro Max",30,1099.00f,"The iPhone 11 Pro takes what made the XS great and improves battery life and the camera. The iPhone has arguably taken back the crown for best mobile camera, though the pending Pixel 4 has us curious to see if Apple can keep the title for long. Aside from the tempting camera, there's little else here to lure Android fans away, but we still have to admit it's a great phone.");
    Product p29 = new Product("Samsung Galaxy S10 Plus",22,999.99f,"The Samsung Galaxy S10 Plus is the best phone Samsung has ever sold, but still struggles with image quality.");
    Product p30 = new Product("OnePlus 7 Pro",15,829.00f,"The OnePlus 7T Pro is as close as OnePlus has gotten to the upper echelons of smartphone tech. It brings finesse to a game that the company has perfected, and melds top of the line hardware with a software build that truly impresses.");
    Product p31 = new Product("Razer - Phone 2",9,799.99f,"The Razer Phone 2 is one of the few high-end flagships you can buy this year at the sub-$1,000 price point. It improves on the original Razer Phone by adding IP certification, wireless charging, and is still fantastic for gaming. It's an excellent flagship choice as long as your main priority isn't the camera.");
    Product p32 = new Product("Nokia 220",31,19.99f," Nokia 220 4G can access to the Internet, Facebook, and in some markets even HD voice calls. But unlike even the cheapest smartphone, you can get that with a battery life that lasts days, not hours.");
    //

    public void rdoAnhChkHandle(Event e){
    }
    public void btnActionHandel(ActionEvent e){
    }

}
