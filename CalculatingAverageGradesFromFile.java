
package calculating.average.grades.from.file;
import java.util.Scanner;
import java.io.File;
public class CalculatingAverageGradesFromFile {

    public static void main(String[] args) {
       Scanner input = null;
        try{
        input = new Scanner (new File ("C:\\Users\\Seif\\Desktop\\Record.txt"));
        }
        catch (Exception ex){
            System.out.println("Cannot read file");
        }
        int sum=0;
        double average=0;
        int counter=0;
        while (input.hasNext()){
            int numbers = input.nextInt();
            counter++;
            for (int i=0 ; i <= counter ; i++){
                sum = sum + numbers;
                
            }
            average = sum / counter;
            
        }
        System.out.println("The Average is "+average);
    } 
}
