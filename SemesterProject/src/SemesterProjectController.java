import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SemesterProjectController {

    @FXML
    private Button solutionBtn; 

    @FXML
    private Button checkBtn; // verify button

    @FXML
    private TextField txt1; // this is where the user puts the expression

    @FXML
    private TextField dialogBox; // this is where the correct solution is displayed if it is equal to 24

    @FXML
    private Button clearBtn;// refresh button

    @FXML
    void findSol(ActionEvent event) {
        // create method that find a possble solution, if there is not a solution for the cards given report back that there is no solution.
    }

    @FXML
    void houseKeeping(ActionEvent event) {
        //method that clears the dialog box followed by the method that give 4 random cards
       
    }

    @FXML
    void makeSure(ActionEvent event) {
        //method to check if  user enter expression is equal to 24
        
    }

    @FXML
    void userIn(ActionEvent event) {
           //method that takes what the user said and store it into temp variable if correct send it into dialog box...
           //if not, store  the value and prompts a warning message 
           
    }

}

