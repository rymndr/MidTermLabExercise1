import java.util.Scanner;
public class RunBloodData {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);  
     
    System.out.print("Enter the blood type of patient: ");
    String bloodtype = sc.nextLine();
    
    System.out.print("Enter the Rhesus factor (+ or -): ");
    String rhesusfactor = sc.nextLine();
    
    
    BloodData bd = new BloodData(bloodtype, rhesusfactor);
    if (bloodtype.equals("")){
        bd = new BloodData();    
        bd.display();
    }
    else if
        (bloodtype.equals("A")||bloodtype.equals("AB")||bloodtype.equals("O")||bloodtype.equals("B"));
         bd.display();
    }      
   
}

