#ifndef WEKTOR_H
#define WEKTOR_H
#include <iostream>
#include <cstdlib>
#include "zespolona.hpp"
class wektor
{
public:
  zespolona& operator[](int);//!przeciazenie operatora ideksowania                                                           
  void operator=(wektor);//!przeciazenie operatora =                                                                         
  wektor operator+(wektor);//!przeciazenie operatora +(wektor+wektor)                                                        
  wektor operator-(wektor);//!przeciazenie operatora -(wektor-wektor)                                                        
  zespolona operator*(wektor);//!przeciazenie operatora *(wektor*wektor)                                                     
  wektor operator*(float);//!przeciazenie operatora *(wektor*float)                                                          
  wektor operator/(float);//!przeciazenie operatora /(wektor/float)                                                          
  zespolona Dlugosc();//!wylicza długosc wektora bledu                                                                       
  friend std::istream & operator >>(std::istream & in,wektor &);//!przeciazenie wejscia(cin>>wektor)                         
  friend std::ostream & operator <<(std::ostream & out,wektor);//!przeciazenie wyjscia(cout<<wektor)                         
  wektor();//!konstruktor                                                                                                    
  virtual ~wektor();//!dekonstruktor                                                                                         
protected:
private:
  zespolona wek[3];//!tablica typu float 3 elementowa                                                                        
};

#endif // WEKTOR_H                                                                                                           




