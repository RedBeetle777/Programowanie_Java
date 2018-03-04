#include "zespolona.hpp"
using namespace std;
zespolona::~zespolona()
{
  //dtor                                                                                                                      
}

istream & operator >> (istream & in, zespolona & z)
{
  //cout<<"Podaj wartosci x i y:(x+y*j)"<<endl;                                                                               
  in>>z._Re>>z._Im;
  return in;
}

ostream & operator <<(ostream & out, zespolona z)
{

  out<<"{"<<z._Re<<(z._Im<0 ? "":"+")<<z._Im<<"j}";
  return out;
}

zespolona zespolona::operator+(zespolona tmp)
{
  zespolona Suma;
  Suma.Re()=_Re+tmp.Re();
  Suma.Im()=_Im+tmp.Im();
  return Suma;
}

zespolona zespolona::operator+=(zespolona tmp)
{
  return (*this + tmp);
}

zespolona zespolona::operator*(zespolona tmp)
{
  zespolona iloczyn;
  iloczyn.Re()= (_Re * tmp.Re() - _Im * tmp.Im());
  iloczyn.Im()= (_Re * tmp.Im() + tmp.Re() *_Im);
  return iloczyn;

}
zespolona zespolona::operator*(double tmp)
{
  zespolona iloczyn;
  iloczyn.Im()=_Im*tmp;
  iloczyn.Re()=_Re*tmp;
  return iloczyn;

}

zespolona zespolona::operator-(zespolona tmp)
{
  zespolona iloczyn;
  iloczyn.Im()=_Im-tmp.Im();
  iloczyn.Re()=_Re-tmp.Re();
  return iloczyn;

}

zespolona zespolona::operator-=(zespolona tmp)
{
  return (*this - tmp);

}

zespolona zespolona::operator/(double tmp)
{
  zespolona iloczyn;
  iloczyn.Im()=_Im/tmp;
  iloczyn.Re()=_Re/tmp;
  return iloczyn;

}

zespolona zespolona::operator/(zespolona tmp)
{
  zespolona iloczyn;
  iloczyn.Im()=0;
  iloczyn.Re()=((_Re*tmp.Re() + _Im*tmp.Im())/(tmp.Im()*tmp.Im() + tmp.Re()*tmp.Re())) + ((_Im*tmp.Re() + _Re*tmp.Im())/(tmp.\
															 Im()*tmp.Im() + tmp.Re()*tmp.Re()));
  return iloczyn;

}

zespolona zespolona::operator=(zespolona tmp)
{
  _Im=tmp.Im();
  _Re=tmp.Re();

  return *this;
}


bool zespolona::operator==(double tmp)
{
  if(_Im==tmp && _Re==tmp)
    return true;
  return false;
}


