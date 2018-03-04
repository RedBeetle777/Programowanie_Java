#include <iostream>
#include "wyrazenie.hpp"
using namespace std;

int main()
{


  wyrazenie wyr;
  cin>>wyr;

  cout<<wyr<<endl;
  wyr.Wylicz();
  cout<<wyr<<endl<<endl;
  wyr.Blad();


  return 0;
}
/*!Działanie programu!!!!                                                                                                    
1. Wczytujemy od uzytkownika macierz 3x3 oraz wektor                                                                         
2. Wyswietlamy wyrazenie ktore zostalo wczytane do programu                                                                  
3. Wyliczamy wektor z wyrazenia Ax=y, x=A^(-1)*x                                                                             
4. Wyswietlamy wyrazenie teraz juz cale                                                                                      
5. Wyliczenie bledu                                                                                                          
                                                                                                                             
ZEBY MAKEFILE ZADZIALAL TO WSZYSTKIE PLIKI MUSZA BYC W JEDNYM FOLDERZE(MAIN.CPP WEKTOR.CPP/H MACIERZ.CPP/H WYRAZENIE.CPP/H)  
                                                                                                                             
                                                                                                                             
                                                                                                                             
*/


