/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    
        public static Boolean Editar(AlumnoEntity alumno){
        try {
           
            String qry = "UPDATE alumno set AlmNom = ?,AlmApe=?,AlmDir=?,AlmTel=?,AlmCel=?,AlmMail=?, AlmGen =? where AlmCod=?;";
            
            PreparedStatement pst = MySQLConn.conn.prepareStatement(qry);
                        
            pst.setString(1, alumno.AlmNom);
            pst.setString(2, alumno.AlmApe);
            pst.setString(3, alumno.AlmDir);
            pst.setString(4, alumno.AlmTel);
            pst.setString(5, alumno.AlmCel);
            pst.setString(6, alumno.AlmMail);
            pst.setString(7, alumno.AlmGen);
            pst.setString(8, alumno.AlmCod);
            int err = pst.executeUpdate();
            
            return err != 0;
            
        } catch (SQLException ex) {
                       
            Logger.getLogger(AlumnosModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
        
        
        
        public static AlumnoEntity getOne(String AlmCod){
        try {
            AlumnoEntity row = new AlumnoEntity();
            String qry = "SELECT * FROM alumno WHERE AlmCod = ?;";
            
            PreparedStatement pst = MySQLConn.conn.prepareStatement(qry);
            pst.setString(1, AlmCod);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                row.AlmCod= rs.getString("AlmCod");
                row.AlmNom = rs.getString("AlmNom");
                row.AlmApe = rs.getString("AlmApe");
                row.AlmDir = rs.getString("AlmDir");
                row.AlmTel = rs.getString("AlmTel");
                row.AlmCel = rs.getString("AlmCel");
                row.AlmMail = rs.getString("AlmMail");
                row.AlmGen = rs.getString("AlmGen");            
            }else{
                row = null;
            }
            
            return row;
            
        } catch (SQLException ex) {
                       
            Logger.getLogger(AlumnosModel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static ResultSet buscar(String key){
        try {
           
            String qry = "SELECT * FROM alumno WHERE AlmCod LIKE ? OR AlmNom LIKE ? OR AlmApe LIKE ? OR AlmDir LIKE ? OR AlmTel LIKE ? OR AlmCel LIKE ? OR AlmMail LIKE ? OR AlmGen LIKE ?;";
            
            PreparedStatement pst = MySQLConn.conn.prepareStatement(qry);
            
            pst.setString(1, '%'+key+'%');
            pst.setString(2, '%'+key+'%');
            pst.setString(3, '%'+key+'%');
            pst.setString(4, '%'+key+'%');
            pst.setString(5, '%'+key+'%');
            pst.setString(6, '%'+key+'%');
            pst.setString(7, '%'+key+'%');
            pst.setString(8, '%'+key+'%');
            
            return pst.executeQuery();
            
        } catch (SQLException ex) {
                       
            Logger.getLogger(AlumnosModel.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
