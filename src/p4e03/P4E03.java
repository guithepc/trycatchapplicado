/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4e03;

/**
 *
 * @author guigu
 */
public class P4E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo(50);
        
        
        try {
            v1.acelera(51);
            
        } catch (Exception e) {
            System.out.println("###ERROR###: " + e);
        }
    }
    
}
