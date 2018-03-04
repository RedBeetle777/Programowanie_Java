#include "macierz.hpp"

using namespace std;

macierz::macierz()

{

  //ctor                                                                                                                     

}



macierz::~macierz()

{

}



istream & operator >>(istream & in,macierz & tmp)

{

  for(int i=0;i<3;i++)

    in>>tmp[i];

  return in;

}



ostream & operator <<(ostream & out,macierz tmp)

{

  for(int i=0;i<3;i++)

    out<<tmp[i]<<endl;

  return out;
}



void macierz::operator=(macierz tmp)

{

  for(int i=0;i<3;i++)

    {

      for(int j=0;j<3;j++)

        mac[i][j]=tmp[i][j];

    }



}

wektor & macierz::operator[](int idx)

{

  if(idx<0)

    {

      cout<<"nie mozna odwolac sie do indeksu "<<idx<<endl;

      exit(1);

    }

  return mac[idx];

}



wektor macierz::operator*(wektor tmp)

{

  wektor iloczyn;

  zespolona suma;
  for(int i=0;i<3;i++)
    {
      suma=zespolona();
      for(int k=0;k<3;k++)

        suma=suma + mac[i][k]*tmp[k];
      iloczyn[i]=suma;
    }
  return iloczyn;

}




macierz macierz::operator*(double tmp)

{

  macierz iloczyn;



  for(int i=0;i<3;i++)

    {

      for(int j=0;j<3;j++)

        iloczyn[i][j]=mac[i][j]*tmp;

    }



  return iloczyn;

}




macierz macierz::operator/(double tmp)

{

  macierz iloraz;



  if(tmp==0)

    {

      cout<<"Nie wolno dzielic przez 0"<<endl;

      return *this;//!wskanik na t klase                                                                                     

    }



  for(int i=0;i<3;i++)

    {

      for(int j=0;j<3;j++)

        iloraz[i][j]=mac[i][j]/tmp;

    }

  return iloraz;

}



macierz macierz::operator/(zespolona tmp)

{

  macierz iloraz;

  for(int i=0;i<3;i++)

    {

      for(int j=0;j<3;j++)

        iloraz[i][j]=mac[i][j]/tmp;

    }



  return iloraz;



}


