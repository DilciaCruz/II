/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uvframework.models.entities;

import java.beans.*;
import uvframework.tools.validation.Validator;
import uvframework.tools.validation.ValidatorTypes;

/**
 *
 * @author Rafael Maldonado
 */
public class AlumnoEntityBeanInfo extends SimpleBeanInfo {
    
    Class targetClass = AlumnoEntity.class;
    
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        
        try  {
            PropertyDescriptor AlmCod = new PropertyDescriptor("AlmCod", targetClass, "getAlmCod", "setAlmCod");
            PropertyDescriptor AlmNom = new PropertyDescriptor("AlmNom", targetClass, "getAlmNom", "setAlmNom");
            PropertyDescriptor AlmApe = new PropertyDescriptor("AlmApe", targetClass, "getAlmApe", "setAlmApe");
            PropertyDescriptor AlmDir = new PropertyDescriptor("AlmDir", targetClass, "getAlmDir", "setAlmDir");
            PropertyDescriptor AlmTel = new PropertyDescriptor("AlmTel", targetClass, "getAlmTel", "setAlmTel");
            PropertyDescriptor AlmCel = new PropertyDescriptor("AlmCel", targetClass, "getAlmCel", "setAlmCel");
            PropertyDescriptor AlmMail = new PropertyDescriptor("AlmMail", targetClass, "getAlmMail", "setAlmMail");
            PropertyDescriptor AlmGen = new PropertyDescriptor("AlmGen", targetClass, "getAlmGen", "setAlmGen");
            PropertyDescriptor AlmEst = new PropertyDescriptor("AlmEst", targetClass, "getAlmEst", "setAlmEst");
            
            
//          PropertyDescriptor UsrTel = new PropertyDescriptor("UsrTel", targetClass, "getUsrTel", "setUsrTel");
//          PropertyDescriptor UsrEdad = new PropertyDescriptor("UsrEdad", targetClass, "getUsrEdad", "setUsrEdad");
            
            AlmCod.setValue(Validator.TYPE,ValidatorTypes.STRING);
            AlmCod.setValue(Validator.MAX_CHAR, 13);
            AlmCod.setValue(Validator.NO_EMPTY, true);
            
            AlmNom.setValue(Validator.TYPE,ValidatorTypes.STRING);
            AlmNom.setValue(Validator.MAX_CHAR, 80);
            AlmNom.setValue(Validator.NO_EMPTY, true);
            
            AlmApe.setValue(Validator.TYPE,ValidatorTypes.STRING);
            AlmApe.setValue(Validator.MAX_CHAR, 80);
            AlmApe.setValue(Validator.NO_EMPTY, true);
            
            AlmDir.setValue(Validator.TYPE,ValidatorTypes.STRING);
            AlmDir.setValue(Validator.MAX_CHAR, 100);
            AlmDir.setValue(Validator.NO_EMPTY, true);
            
            AlmTel.setValue(Validator.TYPE,ValidatorTypes.STRING);
            AlmTel.setValue(Validator.MAX_CHAR, 8);
            AlmTel.setValue(Validator.NO_EMPTY, true);
            
            AlmCel.setValue(Validator.TYPE,ValidatorTypes.STRING);
            AlmCel.setValue(Validator.MAX_CHAR, 8);
            AlmCel.setValue(Validator.NO_EMPTY, true);
            
            AlmMail.setValue(Validator.TYPE,ValidatorTypes.STRING);
            AlmMail.setValue(Validator.MAX_CHAR, 20);
            AlmMail.setValue(Validator.NO_EMPTY, true);
            
            AlmGen.setValue(Validator.TYPE,ValidatorTypes.STRING);
            AlmGen.setValue(Validator.MAX_CHAR, 1);
            AlmGen.setValue(Validator.NO_EMPTY, true);
            
            AlmEst.setValue(Validator.TYPE,ValidatorTypes.STRING);
            AlmEst.setValue(Validator.MAX_CHAR, 1);
            AlmEst.setValue(Validator.NO_EMPTY, true);
            
            
//            UsrTel.setValue(Validator.TYPE,ValidatorTypes.STRING);
//            UsrTel.setValue(Validator.MAX_CHAR, 5);
//            
//            UsrEdad.setValue(Validator.TYPE,ValidatorTypes.INTEGER);
//            UsrEdad.setValue(Validator.IS_INTEGER, true);

            PropertyDescriptor[] pds = new PropertyDescriptor[] {AlmCod,AlmNom,AlmApe,AlmDir,AlmTel,AlmCel,AlmMail,AlmGen,AlmEst};
            
            return pds;

        } catch(IntrospectionException ex) {
            ex.printStackTrace();
            return null;
        }    
    }
}
