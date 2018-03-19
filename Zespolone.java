package pl.maciekfaron;
import java.util.Scanner;
import java.util.Random;

public class Zespolone {

	public static void main(String[] args) {
		
		System.out.println("Wybierz '1' jeżeli chcesz manualnie wprowadzić wartości ");
		System.out.println("Wybierz '2' jeżeli chcesz automatycznie wygenerować wartości ");
		System.out.println("Podaj numer: ");
		//Scanner in = new Scanner(System.in);
		Scanner wy = new Scanner(System.in);
		int re1 = 0;
		int im1 = 0;
		int re2 = 0;
		int im2 = 0;
		int wyb = wy.nextInt();
		
		switch (wyb)
		{
			case 1:
			{
				System.out.println("Wybrano manualne wpisywanie wartości");
				System.out.println(" ");

				Scanner in = new Scanner(System.in);
				System.out.println("podaj pierwszą liczbę:");
				System.out.print("Część rzeczywista: ");
				re1 = in.nextInt();
				System.out.print("Część urojona: ");
				im1 = in.nextInt();
				System.out.println(" ");
				if ( im1 < 0 )
				{
					System.out.println("Wprowadzono liczbę: "+re1+" - "+ Math.abs(im1) + "i");
				}
				else
				{
					System.out.println("Wprowadzono liczbę: "+re1+" + "+im1+"i");
				}
				System.out.println(" ");
				System.out.println("podaj drugą liczbę:");
				System.out.print("Część rzeczywista: ");
				re2 = in.nextInt();
				System.out.print("Część urojona: ");
				im2 = in.nextInt();
				System.out.println(" ");
				if ( im2 < 0 )
				{
					System.out.println("Wprowadzono liczbę: "+re2+" - "+ Math.abs(im2)+"i");
				}
				else
				{
					System.out.println("Wprowadzono liczbę zespoloną: "+re2+" + "+im2+"i");
				}
				System.out.println(" ");
				break;
				
			}
			
			case 2:
			{
				
				System.out.println("Wybrano opcję losowych wartości ");
				System.out.println(" ");
				Random randomGeneratorRe1 = new Random();
				Random randomGeneratorIm1 = new Random();
				Random randomGeneratorRe2 = new Random();
				Random randomGeneratorIm2 = new Random();
				
				re1 = randomGeneratorRe1.nextInt(100);
				im1 = randomGeneratorIm1.nextInt(100);
				re2 = randomGeneratorRe2.nextInt(100);
				im2 = randomGeneratorIm2.nextInt(100);
				
				if ( im1 < 0 )
				{
					System.out.println("Wygenerowano liczbę: "+re1+" - "+ Math.abs(im1) + "i");
				}
				else
				{
					System.out.println("Wygenerowano liczbę: "+re1+" + "+im1+"i");
				}
				
				if ( im2 < 0 )
				{
					System.out.println("Wygenerowano liczbę: "+re2+" - "+ Math.abs(im2) + "i");
				}
				else
				{
					System.out.println("Wygenerowano liczbę: "+re2+" + "+im2+"i");
				}
				System.out.println(" ");
				break;
			}
		}
		
		System.out.println("*******************************************");
		System.out.println("Wybierz działanie"); 
		System.out.println("Dla '+' wpisz 1 ");
		System.out.println("Dla '-' wpisz 2 ");
		System.out.println("Dla '*' wpisz 3 ");
		int reW=0;
		int imW=0;
		Scanner dz = new Scanner(System.in);
		int mat = dz.nextInt();
		switch (mat)
		{
			case 1:
			{
				reW= re1+re2;
				imW= im1+im2;
				break;
			}
			case 2:
			{
				reW = re1 - re2;
				imW=im1-im2;
				break;
			}
			case 3:
			{
				reW=re1*re2-im1*im2;
				imW=re2*im1+re1*im2;
				break;
			}
		}
		if ( imW < 0 )
		{
			System.out.println("Wynik: "+ reW + " - "+ Math.abs(imW) +"i");
		}
		else
		{
			System.out.println("Wynik: "+ reW + " + "+ imW +"i");
		}
		//in = null;
	}
}
