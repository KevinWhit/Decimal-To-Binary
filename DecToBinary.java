/*Kevin Whitlock
dec 30/18
Converts positive decimal numbers to binary
*/
package dec.to.binary;

import java.util.Scanner;


public class DecToBinary {

   
    public static void main(String[] args) {
        //double variables
        double decNum=-1;
        double total=0;
        double temp=0;
        
        //string variable
        String binary="";
        
        //boolean variable
        boolean valid=true;
        
        //int variablea
        int counter=0;
        int whereStart=0;
        
        //create input scanner
        Scanner input = new Scanner(System.in);
        
        //collects positive int
        while (decNum<0){
        System.out.print("Enter a positive decimal number to convert to binary: ");
        decNum=input.nextInt();
        }
        input.close();
        
        //stores int entered for later
        temp=decNum;
        
        //finds the place value to start at
        while (valid){
            total=Math.pow(2, counter);
            if(total> decNum){
                whereStart=counter-1;
                valid=false;
            } 
            counter++;
        }
        
        //loops until complete converted
        while (decNum!=0){
            //starts at the place value and goes through
            for (int i=whereStart; i>=0;i--){
                total=Math.pow(2, i);
             
                //if less add 1
                if (total<=decNum){
                    decNum=decNum-total;
                    binary=binary+"1";
                //else 0 character    
                }else{
                    binary=binary+"0";
                }
                
                if (decNum<0){
                    decNum=0;
                }
            }
        }
        
        //output answer
        System.out.println(temp+ " in binary is: "+binary);
        
        
        
    }
    
}
