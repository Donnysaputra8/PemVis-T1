/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

/**
 *
 * @author Donny Saputra
 */
public class UserID {
    private static String KD;
    
    public static void setUserLogin(String kode){
    KD = kode;
    }
    
    public static String getUserLogin(){
        return KD;
    }
}
