//========================================================================
// This conversion was produced by the Free Edition of
// C++ to Java Converter courtesy of Tangible Software Solutions.
// Order the Premium Edition at https://www.tangiblesoftwaresolutions.com
//========================================================================

/*
 * Modeluje pojecie baze testu z zestawem pytan w tablicy
 * oraz informacji o maksymalnej ilosci pytan, jak
 * tez indeksem nastepnego pytania, ktore ma byc pobrane
 * z bazy.
 */
public class BazaTestu
{
  public WyrazenieZesp[] wskTabTestu; // Wskaznik na tablice zawierajaca pytania testu
//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: unsigned int IloscPytan;
  public int IloscPytan; // Ilosc wszystkich pytan
//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: unsigned int IndeksPytania;
  public int IndeksPytania; // Numer pytania, ktore ma byc pobrane jako nastepne
}