import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int i,liczba,suma=0;
    Scanner input = new Scanner(System.in); 
    System.out.println("Wpisz 5 kolejnych liczb, a do sumy zostana dodane tylko te podzielne przez 3.");
    for(i=0;i<5;i++)
        {
          liczba = input.nextInt();
          if(liczba % 3 == 0)
          {
            suma += liczba;
            System.out.println("Podana liczba jest podzielna przez 3 dodano do sumy.");
          }
        }
    System.out.println("Suma podanych liczb podzielnych przez 3 wynosi:" + suma);
  }
}