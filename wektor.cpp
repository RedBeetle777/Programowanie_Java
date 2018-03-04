#include "wektor.hpp"
#include <cmath>
#include <iomanip>
using namespace std;
wektor::wektor()
{
}

wektor::~wektor()
{
  //cout<<"usuwam wektor"<<endl;                                                                                             
}

void wektor::operator =(wektor tmp)
{
  for(int i=0;i<3;i++)
    wek[i]=tmp[i];
}

wektor wektor::operator+(wektor tmp)
{
  wektor Suma;
  for(int i=0;i<3;i++)
    Suma[i]=wek[i]+tmp[i];
  return Suma;
}

wektor wektor::operator-(wektor tmp)
{
  wektor Roznica;
  for(int i=0;i<3;i++)
    Roznica[i]=wek[i]-tmp[i];
  return Roznica;
}

wektor wektor::operator*(float tmp)
{
  wektor Iloczyn;
  for(int i=0;i<3;i++)
    Iloczyn[i]=wek[i]*tmp;
  return Iloczyn;
}

wektor wektor::operator/(float tmp)
{
  wektor Iloraz;
  if(tmp==0)
    {
      cout<<"Nie wolno dzielic przez 0"<<endl;
      return *this;
    }
  for(int i=0;i<3;i++)
    Iloraz[i]=wek[i]/tmp;
  return Iloraz;
}

zespolona wektor::operator*(wektor tmp)
{
  zespolona Iloczyn;
  for(int i=0;i<3;i++)
    {
      Iloczyn=Iloczyn + wek[i]*tmp[i];
    }
  return Iloczyn;
}
istream & operator >>(istream & in,wektor & tmp)
{
  for(int i=0;i<3;i++)
    {
      in>>tmp.wek[i];
      if(in.fail())
        {
          cout<<"To nie jest liczba!!!"<<endl;
          exit(0);
        }
    }

  return in;
}

ostream & operator <<(ostream & out,wektor tmp)
{
  out<<"|";
  for(int i=0;i<3;i++)
    out<<setw(6)<<setprecision(2)<<tmp.wek[i]<<" ";
  out<<"|";
  return out;
}

zespolona & wektor::operator[](int idx)
{
  if(idx<0)
    {
      cout<<"nie mozna odwolac sie do indeksu "<<idx<<endl;
      exit(1);
    }
  return wek[idx];
}

zespolona wektor::Dlugosc()
{
  zespolona dl;
  dl = (*this) * (*this);
  // cout<<endl<<endl<<dl<<endl<<endl;                                                                                       
  dl.Im() = sqrt(abs(dl.Im()));
  dl.Re() = sqrt(abs(dl.Re()));


  return dl;

}
