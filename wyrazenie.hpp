#ifndef WYRAZENIE_H
#define WYRAZENIE_H
#include "macierz.hpp"
#include <iostream>
class wyrazenie
{
public:
  wyrazenie();
  macierz Odwotrna(macierz);//!wyliczanie macierzy odwotnej                                                                   
  zespolona Wyznacznik(macierz);//!wyliczanie wyznacznika macierzy                                                            
  macierz D(macierz);//!tworzenie macierz dopelien                                                                            
  macierz T(macierz);//!tworzenie macierzy transponowanej                                                                     
  void Wylicz();//!wyliczanie wektora x                                                                                       
  void Blad();//!funkcja ktora wyswietla wektory bledu oraz dlugosc wektora bledu                                             
  friend std::istream & operator>>(std::istream &in, wyrazenie & w);//!przeciazenie wejscia                                   
  friend std::ostream & operator<<(std::ostream &out, wyrazenie w);//!przeciazenie wejscia                                    
  ~wyrazenie();//!dekonstruktor                                                                                               
protected:
private:
  macierz mac;//!zmienna typu macierz                                                                                         
  wektor wek,wynik;//!wektory wek - y, wynik -x                                                                               
  bool counted;//!bool pomocniczy sluzacy do sprawzenia czy wynik zostal juz wyliczony                                        

};

#endif // WYRAZENIE_H                                                                                                         



