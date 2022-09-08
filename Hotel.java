/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author LENOVO
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kamar = "Mawar";
        String hari = "Weekend";
        int harga = 0;
        
        if(kamar.equals("Melati")) {
            Object Weekend;
            if(hari.equals("Weekday")) {
                harga = 250000;
            }
            else if(hari.equals("Weekend")) {
                harga = 500000;
            }
            else {
                harga = 0;
            }
        }
        else if(kamar.equals("Mawar")) {
            if(hari.equals("Weekday")) {
                harga = 300000;
            }
            else if(hari.equals("Weekend")) {
                harga = 450000;
            }
            else {
                harga = 0;
            }
        }
        else {
            harga = 0;
        }
        System.out.println("Harga kamar " + kamar + " pada " + hari + " = " + harga);
    }
    
}
