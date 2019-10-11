package pkgMajorProject;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

public class Controller {

    //Creating Buttons, radio, checkbox, all of the control action
    @FXML Button btnSubmit; @FXML Button btnPrintInv; @FXML Button btnPrintInvTable; @FXML Button btnClear;
    @FXML ImageView imgItem;
    @FXML TextField txfItemName; @FXML TextField txfItemCost; @FXML TextField txf;
    //Creating products
    Product p1 = new Product("Potato",10,5.00f);
    //
    public void rdoAnhChkHandle(Event e){

    }
    public void btnActionHandel(ActionEvent e){
    }

}
