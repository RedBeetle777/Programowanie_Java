#include "wyrazenie.hpp"
using namespace std;
#include <iomanip>
#include <cstdlib>
//#include <conio.h>                                                                                                         
wyrazenie::wyrazenie()
{
  counted=false;
}

wyrazenie::~wyrazenie()
{

}

void wyrazenie::Blad()
{
  wektor epsilon;
  epsilon = mac*wynik-wek;
  cout<<"wektor bledu to:"<<endl;
  cout<<epsilon<<endl;
  cout<<"Dlugosc wektora bledu to: "<<epsilon.Dlugosc();

}

macierz wyrazenie::Odwotrna(macierz a)
{
  macierz A = T(D(a));
  cout<<endl<<A<<endl<<endl;
  Wyznacznik(mac);
  cout<<A<<endl<<endl;
  cin.get();
  // getch();                                                                                                                
  cout <<endl<<"Macierz odwrotna:"<<endl<< A<<endl<<endl;
  return A;
}

zespolona wyrazenie::Wyznacznik(macierz a)
{
  zespolona wyznacznik;

  wyznacznik = a[0][0]*a[1][1]*a[2][2];
  wyznacznik+=a[1][0]*a[2][1]*a[0][2];
  wyznacznik+=a[2][0]*a[0][1]*a[1][2];
  wyznacznik-=a[0][2]*a[1][1]*a[2][0];
  wyznacznik-=a[1][2]*a[2][1]*a[0][0];
  wyznacznik-=a[2][2]*a[0][1]*a[1][0];

  cout<<wyznacznik<<endl<<endl;
  //if(wyznacznik ==0)                                                                                                       
  //{                                                                                                                        
  //     cout<<"Wyznacznik jest rowny 0,nie mozna odwrocic macierzy!"<<endl;                                                 
  //     exit(0);                                                                                                            
  // }                                                                                                                       

  return wyznacznik;
}

macierz wyrazenie::D(macierz tmp)
{
  macierz zwrot;
  zwrot[0][0]=tmp[1][1]*tmp[2][2]-(tmp[1][2]*tmp[2][1]);
  zwrot[0][1]=tmp[1][0]*tmp[2][2]-(tmp[2][0]*tmp[1][2]);
  zwrot[0][2]=tmp[1][0]*tmp[2][1]-(tmp[1][1]*tmp[2][0]);
  zwrot[1][0]=tmp[0][1]*tmp[2][2]-(tmp[2][1]*tmp[0][2]);
  zwrot[1][1]=tmp[0][0]*tmp[2][2]-(tmp[0][2]*tmp[2][0]);
  zwrot[1][2]=tmp[0][0]*tmp[2][1]-(tmp[0][1]*tmp[2][0]);
  zwrot[2][0]=tmp[0][1]*tmp[1][2]-(tmp[0][2]*tmp[1][1]);
  zwrot[2][1]=tmp[0][0]*tmp[1][2]-(tmp[0][2]*tmp[1][0]);
  zwrot[2][2]=tmp[0][0]*tmp[1][1]-(tmp[1][0]*tmp[0][1]);


  for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
        {
          if(((i+1)+(j+1))%2==1)
            {
              zwrot[i][j]=zwrot[i][j]*(-1);
            }
          else
            {
              zwrot[i][j]=zwrot[i][j];
            }
        }
    }

  return zwrot;
}


macierz wyrazenie::T(macierz tmp)
{
  macierz transponowana;
  for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)
        {transponowana[i][j]=tmp[j][i];}
    }

  //cout<<transponowana;                                                                                                     
  return transponowana;
}

void wyrazenie::Wylicz()
{
  wynik = Odwotrna(mac)*wek;

  counted=true;
}


istream & operator>>(istream & in,wyrazenie & w)
{
  w.counted=false;
  cout<<"Wczytaj macierz"<<endl;
  in>>w.mac;
  cout<<"Wczytaj wektor"<<endl;
  in>>w.wek;
  return in;
}

ostream & operator <<(ostream & out, wyrazenie w)
{
  for(int i=0;i<3;i++)
    {
      out<<"| ";
      for(int j=0;j<3;j++)
        out<<setw(4)<<setprecision(2)<<w.mac[i][j]<<" ";
      out<<"| |";
      if(w.counted==false)
        out<<"x_"<<i+1;
      else
        out<<setw(5)<<setprecision(2)<<w.wynik[i];
      out<<(i==1 ? "|  = |" :"|    |")<<w.wek[i]<<"|"<<endl;
    }
  return out;
}

