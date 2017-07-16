/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.controllers.Alumnos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import uvframework.tools.WindowsManager;

/**
 * FXML Controller class
 *
 * @author israel
 */
public class AlumnosNuevoViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


@FXML
    private void CrearBtnClick(){
        
        
        WindowsManager.getStage("/usuarios/nuevo").hide();
        
    }   
    
    
    @FXML
    private void CancelarBtnClick(){
    
        WindowsManager.getStage("/Alumnos/nuevo").hide();
        
    }
    
    
    
}
