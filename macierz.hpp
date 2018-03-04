#ifndef MACIERZ_H
#define MACIERZ_H
#include "wektor.hpp"

class macierz
{
public:
  wektor & operator[](int idx);//!przeciazenie operatora nawiasu kwadratowego, sluczy do odwolywania sie do poszczegolnych k\
omorek w mac                                                                                                                 
macierz();//!konstruktor                                                                                                   
  wektor operator *(wektor);//!przeciazenie operatora *, do wykonania mnozenia macierz razy wektor(iloczyn wektorowy)        
  macierz operator *(double);//!przeciazenie operatora razy, macierz razy zmienna typu double                                
  macierz operator/(double);
  macierz operator/(zespolona);
  void operator =(macierz);
  friend std::istream & operator >>(std::istream & in,macierz &);//!przeciazenie wejscia                                     
  friend std::ostream & operator <<(std::ostream & out,macierz);//!przeciazenie wyjscia                                      
  virtual ~macierz();
protected:
private:
  wektor mac[3];
};

#endif // MACIERZ_H                                                                                                          



