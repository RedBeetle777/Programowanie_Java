//========================================================================
// This conversion was produced by the Free Edition of
// C++ to Java Converter courtesy of Tangible Software Solutions.
// Order the Premium Edition at https://www.tangiblesoftwaresolutions.com
//========================================================================

public class GlobalMembers
{


/*
 * Inicjalizuje test kojarzac zmienna dostepna poprzez wskaznik wskBazaTestu
 * z dana tablica wyrazen, ktora reprezentuje jeden z dwoch dopuszczalnych 
 * testow.
 * Parametry:
 *    wskBazaTestu - wskaznik na zmienna reprezentujaca baze testu.
 *    sNazwaTestu  - wskaznik na napis wybranego typu testu.
 *
 * Warunki wstepne:
 *      - Parametr wskBazaTestu nie moze byc pustym wskaznikiem. Musi zawierac adres
 *        zmiennej reprezentujacej baze testu, ktora wczesniej zostal poprawnie
 *        zainicjalizowany poprzez wywolanie funkcji InicjalizujTest.
 *      - Parametr sNazwaTestu musi wskazywac na jedna z nazw tzn. "latwe" lub "trudne".
 *       
 * Zwraca:
 *       true - gdy operacja sie powiedzie i test zostanie poprawnie
 *              zainicjalizowany,
 *       false - w przypadku przeciwnym.
 */


	/*
	 * Inicjalizuje test powiazany z dana nazwa.
	 */
	public static boolean InicjalizujTest(BazaTestu wskBazaTestu, String sNazwaTestu)
	{
	  if (!strcmp(sNazwaTestu,"latwy"))
	  {
//C++ TO JAVA CONVERTER WARNING: This 'sizeof' ratio was replaced with a direct reference to the array length:
//ORIGINAL LINE: UstawTest(wskBazaTestu,TestLatwy,sizeof(TestLatwy)/sizeof(WyrazenieZesp));
		UstawTest(wskBazaTestu, TestLatwy, TestLatwy.length);
		return true;
	  }
	  /*
	   * Analogicznie zrob inicjalizacje dla testu trudne
	   */

		if (!strcmp(sNazwaTestu,"trudny"))
		{
//C++ TO JAVA CONVERTER WARNING: This 'sizeof' ratio was replaced with a direct reference to the array length:
//ORIGINAL LINE: UstawTest(wskBazaTestu,TestTrudny,sizeof(TestTrudny)/sizeof(WyrazenieZesp));
			UstawTest(wskBazaTestu, TestTrudny, TestTrudny.length);
			return true;
		}

	  cerr << "Otwarcie testu '" << sNazwaTestu << "' nie powiodlo sie." << "\n";
	  return false;
	}

/*!
 * Funkcja udostepnia nastepne pytania o ile jest odpowiednia ich ilosc.
 * Parametry:
 *       wskBazaTestu - wskaznik na zmienna reprezentujaca baze testu.
 *       wskWyrazenie - wskaznik na zmienna, do ktorej zostanie wpisane
 *                      kolejne wyrazenie z bazy testu.
 *
 * Warunki wstepne:
 *      - Parametr wskBazaTestu nie moze byc pustym wskaznikiem. Musi zawierac adres
 *        zmiennej reprezentujacej baze testu, ktora wczesniej zostal poprawnie
 *        zainicjalizowany poprzez wywolanie funkcji InicjalizujTest.
 *      - Parametr wskWyrazenie nie moze byc pustym wskaznikiem. Musi wskazywac na
 *        istniejaca zmienna.
 *
 * Zwraca:
 *       true - gdy operacja sie powiedzie i parametrowi *wskWyrazenie zostanie
 *              przypisane nowe wyrazenie zespolone z bazy,
 *       false - w przypadku przeciwnym.
 */
	/*
	 * Udostepnia nastepne pytanie z bazy.
	 */
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'wskBazaTestu', so pointers on this parameter are left unchanged:
	public static boolean PobierzNastpnePytanie(BazaTestu * wskBazaTestu, WyrazenieZesp wskWyrazenie)
	{
	  if (wskBazaTestu.IndeksPytania >= wskBazaTestu.IloscPytan)
	  {
		  return false;
	  }

//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *wskWyrazenie = wskBazaTestu->wskTabTestu[wskBazaTestu->IndeksPytania];
	  wskWyrazenie.copyFrom(wskBazaTestu.wskTabTestu[wskBazaTestu.IndeksPytania]);
	  ++wskBazaTestu.IndeksPytania;
	  return true;
	}




	/*
	 * Tablica, ktora jest widoczna tylko w tym module.
	 * Zawiera ona tresc latwego testu.
	 */
	public static WyrazenieZesp[] TestLatwy =
	{
		{
			{2, 1},
			Operator.Op_Dodaj, {1, 2}
		},
		{
			{1, 0},
			Operator.Op_Odejmij, {0, 1}
		}
	};

	/*
	 * Analogicznie zdefiniuj test "trudne"
	 *
	 */

	public static WyrazenieZesp[] TestTrudny =
	{
		{
			{3, 0},
			Operator.Op_Mnoz, {0, 3}
		},
		{
			{4, 8},
			Operator.Op_Dziel, {1, 0}
		}
	};



	/*
	 * W bazie testu ustawia wybrany test jako biezacy test i indeks pytania
	 * ustawia na pierwsze z nich.
	 * Parametry:
	 *    wskBazaTestu - wskaznik na zmienna reprezentujaca baze testu,
	 *    wskTabTestu  - wskaznik na tablice zawierajaca wyrazenia arytmetyczne
	 *                   bedace przedmiotem testu,
	 *    IloscElemTab - ilosc pytan w tablicy.
	 *   
	 * Warunki wstepne:
	 *      - Parametr wskBazaTestu nie moze byc pustym wskaznikiem. Musi zawierac adres
	 *        zmiennej reprezentujacej baze testu, ktora wczesniej zostal poprawnie
	 *        zainicjalizowany poprzez wywolanie funkcji InicjalizujTest.
	 *      - Parametr wskTabTestu zawiera wskaznik na istniejaca tablice.
	 *      - Parametr IloscPytan zawiera wartosc, ktora nie przekracza ilosci elementow
	 *        w tablicy dostepnej poprzez wskTabTestu.
	 */
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: void UstawTest( BazaTestu *wskBazaTestu, WyrazenieZesp *wskTabTestu, unsigned int IloscPytan )
	public static void UstawTest(BazaTestu wskBazaTestu, WyrazenieZesp wskTabTestu, int IloscPytan)
	{
	  wskBazaTestu.wskTabTestu = wskTabTestu;
	  wskBazaTestu.IloscPytan = IloscPytan;
	  wskBazaTestu.IndeksPytania = 0;
	}


/*!
 * Realizuje dodanie dwoch liczb zespolonych.
 * Argumenty:
 *    Skl1 - pierwszy skladnik dodawania,
 *    Skl2 - drugi skladnik dodawania.
 * Zwraca:
 *    Sume dwoch skladnikow przekazanych jako parametry.
 */


	/*
	 * Dalej powinny pojawic sie zapowiedzi definicji przeciazen operatorow
	 */


//C++ TO JAVA CONVERTER TODO TASK: The following operator cannot be converted to Java:
	LZespolona operator + (LZespolona Skl1, LZespolona Skl2)
	{
	  LZespolona Wynik = new LZespolona();

	  Wynik.re = Skl1.re + Skl2.re;
	  Wynik.im = Skl1.im + Skl2.im;
	  return Wynik;
	}
//C++ TO JAVA CONVERTER TODO TASK: The following operator cannot be converted to Java:
	LZespolona operator - (LZespolona Skl1, LZespolona Skl2)
	{
		LZespolona Wynik = new LZespolona();

		Wynik.re = Skl1.re - Skl2.re;
		Wynik.im = Skl1.im - Skl2.im;
		return Wynik;
	}
//C++ TO JAVA CONVERTER TODO TASK: The following operator cannot be converted to Java:
	LZespolona operator * (LZespolona Skl1, LZespolona Skl2)
	{
		LZespolona Wynik = new LZespolona();

		Wynik.re = Skl1.re * Skl2.re + Skl1.im * Skl2.im;
		Wynik.im = Skl1.re * Skl2.im + Skl1.im * Skl2.re;
		return Wynik;
	}
	//LZespolona  operator / (LZespolona  Skl1,  LZespolona  Skl2);
	//LZespolona  operator = (LZespolona  Skl1,  LZespolona  Skl2);
	private istream rightShift(std::istream in, LZespolona v)
	{
		/*
		char znak;
		strm >> znak;
		
		 if (strm.fail()) return strm;
		 if (znak != '('){
		 strm.setstate(ios::failbit);
		 return strm;
		 }
		*/

		v.re = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		/*
		to samo co wyżej do sprawdzenia czy jest błąd
		*/
		v.im = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

		/*
		
		*/

		return cin;
	}
	private ostream leftShift(std::ostream out, LZespolona v)
	{
		System.out.print('(');
		System.out.print(v.re);
		System.out.print('+');
		System.out.print(v.im);
		System.out.print(')');
		System.out.print("\n");
	}
	public static void Wyswietl(LZespolona rzeczywista, LZespolona urojona)
	{
		System.out.print("Czesc rzeczywista: ");
		System.out.print(rzeczywista.re);
		System.out.print("Czesc urojona: ");
		System.out.print(urojona.im);
		System.out.print("\n");
	}




















	public static int Main(int argc, String[] args)
	{

	  if (argc < 2)
	  {
		System.out.print("\n");
		System.out.print(" Brak opcji okreslajacej rodzaj testu.");
		System.out.print("\n");
		System.out.print(" Dopuszczalne nazwy to:  latwy, trudny.");
		System.out.print("\n");
		System.out.print("\n");
		return 1;
	  }


	  BazaTestu BazaT = new BazaTestu(null, 0, 0);

	  if (InicjalizujTest(BazaT, args[1]) == false)
	  {
		cerr << " Inicjalizacja testu nie powiodla sie." << "\n";
		return 1;
	  }



	  System.out.print("\n");
	  System.out.print(" Start testu arytmetyki zespolonej: ");
	  System.out.print(args[1]);
	  System.out.print("\n");
	  System.out.print("\n");

	  WyrazenieZesp WyrZ_PytanieTestowe = new WyrazenieZesp();

	  while (PobierzNastpnePytanie(BazaT, WyrZ_PytanieTestowe))
	  {
		System.out.print(" Pierwsza liczba: ");
		System.out.print('(');
		System.out.print(WyrZ_PytanieTestowe.Arg1.re);
		System.out.print('+');
		System.out.print(WyrZ_PytanieTestowe.Arg1.im);
		System.out.print("i)(");
		System.out.print(WyrZ_PytanieTestowe.Arg2.re);
		System.out.print('+');
		System.out.print(WyrZ_PytanieTestowe.Arg2.im);
		System.out.print(')');
		System.out.print("\n");
	  }


	  System.out.print("\n");
	  System.out.print(" Koniec testu");
	  System.out.print("\n");
	  System.out.print("\n");


		/*
		 //przy wczytaniu 3x błędne info to ma się wywalić
		 #define LICZ 3
		 
		 for (int i = 0; i<LICZ; ++i)
		 {
		 cin >> odp;
		 if(!cin.fail())break;
		 
		 //jeżeli pętla się wykona 3 razy to program ma się nie wykonać(daj jakiegoś couta informującego)
		 //jeżeli nie zrobi się 3 razy tylko mniej to ma kontynuować z zadaniem
		 }
		 */

	}


/*
 * Tu nalezy zdefiniowac funkcje, ktorych zapowiedzi znajduja sie
 * w pliku naglowkowym.
 */

/*
iostream operator >> (iostream &strm, Operator &Op)
 {
 char znak;
 strm >> znak;
 if(strm.fail())return strm;
 switch(znak){
 case '+';
 Op=Op_Dodaj
 break;
 .
 .
 .
 }default: strm.setstate(ios::failbit)
 return strm;
*/

/*
void Wyswietl(WyrazenieZesp WyrZ)
{
    if (WyrZ.Op == 0)
    {
        cout << WyrZ.Arg1 << '+' << WyrZ.Arg2 << endl;
    }else if (WyrZ.Op == 1)
    {
        //cout << WyrZ.Arg1 << '-' << WyrZ.Arg2 << endl;
    }else if (WyrZ.Op == 2)
    {
        //cout << WyrZ.Arg1 << '*' << WyrZ.Arg2 << endl;
    }
}
*/


	/*
	 * Funkcje ponizej nalezy zdefiniowac w module.
	 *
	 */


	public static void WyswietlLiczbe(double WyrZ1, double WyrZ2)
	{
		System.out.print(WyrZ1);
		System.out.print(WyrZ2);
		System.out.print("\n");
	}
	public static LZespolona Oblicz(WyrazenieZesp WyrZ)
	{
		if (WyrZ.Op.getValue() == 0)
		{
			double R = WyrZ.Arg1.re + WyrZ.Arg2.re;
			double I = WyrZ.Arg1.im + WyrZ.Arg2.im;

			WyswietlLiczbe(R, I);
		}
		else if (WyrZ.Op.getValue() == 1)
		{
			double R = WyrZ.Arg1.re - WyrZ.Arg2.re;
			double I = WyrZ.Arg1.im - WyrZ.Arg2.im;

			WyswietlLiczbe(R, I);
		}
		else if (WyrZ.Op.getValue() == 2)
		{
			double R = WyrZ.Arg1.re * WyrZ.Arg2.re + WyrZ.Arg1.im * WyrZ.Arg2.im;
			double I = WyrZ.Arg1.re * WyrZ.Arg2.im + WyrZ.Arg1.im * WyrZ.Arg2.re;

			WyswietlLiczbe(R, I);
		}
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void Wyswietl(WyrazenieZesp WyrZ);
	public static void WczytajLiczbe(double WyrZ1, double WyrZ2)
	{
		WyrZ1 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		WyrZ2 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	}
	public static void WczytajWyrazenie(WyrazenieZesp WyrZ)
	{
		WyrZ.Arg1.re = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		WyrZ.Arg1.im = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		WyrZ.Arg2.re = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		WyrZ.Arg2.im = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	}











}
