/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

/**
 *
 * @author Omar
 */
public class A7Q8 {

    public static boolean allDigitsOdd(int num){
        
        for (int i = 0; i < num; i++) {
            int remainder = num % 10;
        if(remainder % 2 == 0){
            return false;
        }else if(!(remainder % 2 == 0)){
            num = (num - remainder)/10;
        }
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
