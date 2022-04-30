import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    String phrase = input.nextLine();

    while (!phrase.equals("quit")) { 
    //while loop with quit as sentinal value
      System.out.println(phrase.toUpperCase()); 
      //print out phrase in uppercase
      phrase = input.nextLine(); 
      //collect new user input
    }

  }
}
