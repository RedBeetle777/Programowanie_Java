#ifndef ZESPOLONA_H
#define ZESPOLONA_H
#include <iostream>


class zespolona
{
public:
  zespolona():_Re(0),_Im(0){};//!konstruktor bezparametryczny                                                                  
  zespolona(double r,double i):_Re(r),_Im(i){};//!konstruktor parametryczny                                                    
  virtual ~zespolona();
  friend std::istream & operator >>(std::istream &, zespolona &);//!przeciazenie wejscia                                      
  friend std::ostream & operator <<(std::ostream &, zespolona);//!przeciazenie wyjscia                                        
  zespolona operator+(zespolona);//!operator zespolona + zespolona                                                            
  zespolona operator*(zespolona);//!operator zespolona * zespolona                                                            
  zespolona operator*(double);//!operator zespolona + liczba                                                                  
  zespolona operator-(zespolona);//!operator zespolona - zespolona                                                            
  zespolona operator/(double);//!operator zespolona / liczba                                                                  
  zespolona operator/(zespolona);//!operator zespolona + zespolona                                                            
  zespolona operator=(zespolona);//!operator zespolona = zespolona                                                            
  zespolona operator+=(zespolona);//!operator zespolona += zespolona                                                          
  zespolona operator-=(zespolona);//!operator zespolona -= zespolona                                                          
  bool operator==(double);//!sprawczenie czy Re i Im równa sie jakiejsc liczbie                                               
  double Re() const{return _Re;};
  double &Re(){return _Re;};
  double Im() const{return _Im;};
  double &Im(){return _Im;};
protected:
private:
  double _Re, _Im;
};

#endif // ZESPOLONA_H                                                                                                         




