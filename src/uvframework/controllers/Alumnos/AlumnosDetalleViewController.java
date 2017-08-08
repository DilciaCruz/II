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
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import uvframework.UVF;
import uvframework.models.AlumnosModel;
import uvframework.models.entities.AlumnoEntity;
import uvframework.tools.WindowsManager;

/**
 * FXML Controller class
 *
 * @author israel
 */

public class AlumnosDetalleViewController implements Initializable {

    @FXML private TextField AlmCod;
    @FXML private TextField AlmNom;
    @FXML private TextField AlmApe;
    @FXML private TextField AlmDir;
    @FXML private TextField AlmTel;
    @FXML private TextField AlmCel;
    @FXML private TextField AlmMail;
    @FXML private TextField AlmGen;
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        AlumnoEntity data = AlumnosModel.getOne(UVF.workdata.get("AlmCod").toString());
        
        AlmCod.setText(data.AlmCod);
        AlmNom.setText(data.AlmNom);
        AlmApe.setText(data.AlmApe);
        AlmDir.setText(data.AlmDir);
        AlmTel.setText(data.AlmTel);
        AlmCel.setText(data.AlmCel);
        AlmMail.setText(data.AlmMail);
        AlmGen.setText(data.AlmGen);   
        
        
        
    }    
    
     
      @FXML
    private void AceptarBtnClick() {
    
    WindowsManager.getStage("/Alumnos/detalle", false).hide();
    
    }

    
}

    

