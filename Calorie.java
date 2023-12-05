import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calorie
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try {
            File myObj = new File("calories.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}