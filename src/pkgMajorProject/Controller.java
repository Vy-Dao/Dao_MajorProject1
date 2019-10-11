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
    Product p1 = new Product();
    //

    public void rdoAnhChkHandle(Event e){

    }
    public void btnActionHandel(ActionEvent e){
    }

}
