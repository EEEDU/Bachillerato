#include<iostream>

using namespace std;

int main() {
  char salir;
  int i;
  typedef struct{
    char nombre[20];
    int edad;
    char email[20];
  }datos;
  //reservo lugar y lop nombro
  datos alumno[3];
  //un puntero
  datos *aux;
  //Que el puntero vaya a amlumno1
  aux=&alumno[i];
  for(i=0;i<3;i++){
    cout<<"Como te llamas alumno "<<i+1<<": ";
    cin>>alumno[i].nombre;
    cout<<"Cual es tu edad alumno "<<i+1<<": ";
    cin>>alumno[i].edad;
    cout<<"Cual es tu email alumno "<<i+1<<": ";
    cin>>alumno[i].email;
    cout<<"\n";
  }
  cout<<"\n";
  for(i=0;i<3;i++){
    cout<<"Tu nombre alumno "<<i+1<<" es: "<<alumno[i].nombre<<"\n";
    cout<<"Tu edad alumno "<<i+1<<" es: "<<alumno[i].edad<<"\n";
    cout<<"Tu email alumno"<<i+1<<" es: "<<alumno[i].email<<"\n";
    cout<<"\n";
  }
  cin>>salir;
}

