/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.models;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import uvframework.models.entities.AlumnoEntity;
import uvframework.tools.MySQLConn;

/**
 *
 * @author Daniela Ordoñez
 */
public class AlumnosModel {

    public static Boolean Nuevo(AlumnoEntity alumno) {
        try {
            String qry = "INSERT INTO alumno VALUES (?,?,?,?,?,?,?,?);";

            PreparedStatement ps = MySQLConn.conn.prepareStatement(qry);

            ps.setString(1, alumno.AlmCod);
            ps.setString(2, alumno.AlmNom);
            ps.setString(3, alumno.AlmApe);
            ps.setString(4, alumno.AlmDir);
            ps.setString(5, alumno.AlmTel);
            ps.setString(6, alumno.AlmCel);
            ps.setString(7, alumno.AlmMail);
            ps.setString(8, alumno.AlmGen);

            int err = ps.executeUpdate();
            return err != 0;

        } catch (Exception ex) {
            Logger.getLogger(AlumnosModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
