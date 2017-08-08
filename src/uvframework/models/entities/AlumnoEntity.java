/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.models.entities;

import java.beans.PropertyVetoException;
import uvframework.tools.validation.ConstrainedObject;

/**
 *
 * @author Daniela Ordoñez
 */
public class AlumnoEntity extends ConstrainedObject{
    public String AlmCod;
    public String AlmNom;
    public String AlmApe;
    public String AlmDir;
    public String AlmTel;
    public String AlmCel;
    public String AlmMail;
    public String AlmGen;
    public String AlmEst;
    
    
    public void setAlmCod(String newAlmCod) throws PropertyVetoException{
        validate("AlmCod", AlmCod, newAlmCod);
        AlmCod = newAlmCod;
    }
    
    public void setAlmNom(String newAlmNom) throws PropertyVetoException{
        validate("AlmNom", AlmNom, newAlmNom);
        AlmNom = newAlmNom;
    }
    
    public void setAlmApe(String newAlmApe) throws PropertyVetoException{
        validate("AlmApe", AlmApe, newAlmApe);
        AlmApe = newAlmApe;
    }
    
    public void setAlmDir(String newAlmDir) throws PropertyVetoException{
        validate("AlmDir", AlmDir, newAlmDir);
        AlmDir = newAlmDir;
    }
    
    public void setAlmTel(String newAlmTel) throws PropertyVetoException{
        validate("AlmTel", AlmTel, newAlmTel);
        AlmTel = newAlmTel;
    }
    
    public void setAlmCel(String newAlmCel) throws PropertyVetoException{
        validate("AlmCel", AlmCel, newAlmCel);
        AlmCel = newAlmCel;
    }
    
    public void setAlmMail(String newAlmMail) throws PropertyVetoException{
        validate("AlmMail", AlmMail, newAlmMail);
        AlmMail = newAlmMail;
    }
    
    public void setAlmGen(String newAlmGen) throws PropertyVetoException{
        validate("AlmGen", AlmGen, newAlmGen);
        AlmGen = newAlmGen;
    }
    
    public void setAlmEst(String newAlmEst) throws PropertyVetoException{
        validate("AlmEst", AlmEst, newAlmEst);
        AlmEst = newAlmEst;
    }
    
    public String getAlmCod(){
        return AlmCod;
    }
    
    public String getAlmNom(){
        return AlmNom;
    }
    
    public String getAlmApe(){
        return AlmApe;
    }
    
    public String getAlmDir(){
        return AlmDir;
    }
    
    public String getAlmTel(){
        return AlmTel;
    }
    
     public String getAlmCel(){
        return AlmCel;
    }
     
      public String getAlmMail(){
        return AlmMail;
    }
      
       public String getAlmGen(){
        return AlmGen;
    }
        public String getAlmEst(){
        return AlmEst;
    }
    
}    
