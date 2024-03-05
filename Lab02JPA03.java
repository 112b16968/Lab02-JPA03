import java.util.Scanner;

public class Lab02JPA03 {
    public static void main(String[] args) {

       for (int i =0 ; i<2 ; i++){ 
        System.out.println("Input:");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();
        if (number1 % 2 == 0) {
            System.out.println("The number is even.");
            
        }else{
            System.out.println("the number is odd.");

        }

    }   
    input1.close();
    }    
    
}
