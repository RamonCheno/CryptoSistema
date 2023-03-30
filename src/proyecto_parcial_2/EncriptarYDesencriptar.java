/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_parcial_2;

import org.jasypt.util.text.AES256TextEncryptor;

/**
 *
 * @author Ramón
 */
public class EncriptarYDesencriptar {
    
    private AES256TextEncryptor textEncryptor = new AES256TextEncryptor();
    private String textEncrypt, textPlane;

    public EncriptarYDesencriptar() {
        
        textEncryptor.setPassword("miContrasenaSecreta");
    }
    
    public String encryptMethod(String textPlane){
        
        textEncrypt = textEncryptor.encrypt(textPlane);
        
        return textEncrypt;
    }
    public String desencryptMethod(String textEncrypt){
        
        textPlane = textEncryptor.decrypt(textEncrypt);
        
        return textPlane;
    }
    
}
