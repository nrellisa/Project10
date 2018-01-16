/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer_User
 */
public class MarkahKeseluruhan {
public static void main (String[] args){
    
    int Funda = 87;
    int CompOrg = 90;
    int WebProg = 68;
    int SystInterface = 50;
    double Jumlah;
    double Purata;
    double Peratus;
    
    System.out.println("Fundamental of Programming : "+Funda+"\t Computer Organization and Architecture : "+CompOrg ); 
    System.out.println("Web Programming : "+WebProg+"\t \t System Interface : "+SystInterface);
    
    Jumlah = Funda+CompOrg+WebProg+SystInterface;
    Purata = Jumlah/4;
    Peratus = Jumlah*100/400;
    

    System.out.println("Jumlah Markah Keseluruhan : "+Jumlah);
    System.out.println("Purata Markah Keseluruhan : "+Purata);
    System.out.println("Peratus Markah Keseluruhan : "+Peratus);
}
}
