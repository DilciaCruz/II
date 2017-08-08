/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.controllers.Alumnos;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import uvframework.UVF;
import uvframework.models.AlumnosModel;
import uvframework.models.entities.AlumnoEntity;
import uvframework.tools.TableViewAdapter;
import uvframework.tools.TableViewColumn;
import uvframework.tools.TableViewRow;
import uvframework.tools.WindowsManager;

/**
 * FXML Controller class
 *
 * @author USUARIO
 */
public class AlumnosViewController implements Initializable {

    @FXML
    private TableView ResultadoTable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void BuscarBtnClick() throws SQLException {

        ResultSet rs = AlumnosModel.buscar("");

        TableViewAdapter tva = new TableViewAdapter(ResultadoTable);
        ArrayList titles = new ArrayList();

        titles.add(new TableViewColumn("AlmCod", "Codigo"));
        titles.add(new TableViewColumn("AlmNom", "Nombre"));
        titles.add(new TableViewColumn("AlmApe", "Apellido"));
        titles.add(new TableViewColumn("AlmDir", "Direccion"));
        titles.add(new TableViewColumn("AlmTel", "Telefono"));
        titles.add(new TableViewColumn("AlmCel", "Celular"));
        titles.add(new TableViewColumn("AlmMail", "Correo"));
        titles.add(new TableViewColumn("AlmGen", "Genero"));
        titles.add(new TableViewColumn("AlmEst", "Estado"));

        //tva.setRowClickHandler((e)->{this.TableRowClick();});
        tva.setRowDoubleClickHandler((e) -> {
            this.TableRowClick();
        });

        tva.fromResultSet(rs, titles);
    }

    private void TableRowClick() {

        String AlmCod = ((TableViewRow) ResultadoTable.getSelectionModel().getSelectedItem()).get("AlmCod").toString();

        UVF.workdata.put("AlmCod", AlmCod);

        WindowsManager.getStage("/Alumnos/editar", true).show();

    }

    @FXML
    private void NuevoBtnClick() {
        WindowsManager.getStage("/Alumnos/nuevo").show();
    }

    @FXML
    private void EditarBtnClick() {
        String AlmCod = ((TableViewRow) ResultadoTable.getSelectionModel().getSelectedItem()).get("AlmCod").toString();

        UVF.workdata.put("AlmCod", AlmCod);

        WindowsManager.getStage("/Alumnos/editar", true).show();

    }

    @FXML
    private void DetalleBtnClick() {
        String AlmCod = ((TableViewRow) ResultadoTable.getSelectionModel().getSelectedItem()).get("AlmCod").toString();

        UVF.workdata.put("AlmCod", AlmCod);

        WindowsManager.getStage("/Alumnos/detalle", true).show();
    }

    @FXML
    private void EliminarBtnClick() {
        String AlmCod = ((TableViewRow) ResultadoTable.getSelectionModel().getSelectedItem()).get("AlmCod").toString();

        UVF.workdata.put("AlmCod", AlmCod);
        WindowsManager.getStage("/Alumnos/eliminar", true).show();
    }
}
