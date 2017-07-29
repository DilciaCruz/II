/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.controllers.Alumnos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import uvframework.models.AlumnosModel;
import uvframework.models.entities.AlumnoEntity;
import uvframework.tools.WindowsManager;

/**
 * FXML Controller class
 *
 * @author israel
 */
public class AlumnosNuevoViewController implements Initializable {

    ObservableList<String> Generos = FXCollections.observableArrayList("M","F");
    @FXML private TextField AlmCod;
    @FXML private TextField AlmNom;
    @FXML private TextField AlmApe;
    @FXML private TextField AlmDir;
    @FXML private TextField AlmTel;
    @FXML private TextField AlmCel;
    @FXML private TextField AlmMail;
    @FXML private ComboBox AlmGen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       AlmGen.setItems(Generos);
    }

    @FXML
    private void CrearBtnClick() {
        AlumnoEntity alumno = new AlumnoEntity();

        alumno.AlmCod = AlmCod.getText();
        alumno.AlmNom = AlmNom.getText();
        alumno.AlmApe = AlmApe.getText();
        alumno.AlmDir = AlmDir.getText();
        alumno.AlmTel = AlmTel.getText();
        alumno.AlmCel = AlmCel.getText();
        alumno.AlmMail = AlmMail.getText();
        alumno.AlmGen = (String) AlmGen.getValue();

        if (AlumnosModel.Nuevo(alumno)) {
            JOptionPane.showMessageDialog(null, "Alumno Ingresado Correctamente");
            WindowsManager.getStage("/Alumnos/nuevo").hide();
        } else {
            JOptionPane.showMessageDialog(null, "Error creando alumno");
        }

    }

    @FXML
    private void CancelarBtnClick() {

        WindowsManager.getStage("/Alumnos/nuevo", false).hide();

    }

}
