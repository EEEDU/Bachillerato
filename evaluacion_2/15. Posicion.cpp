#include<iostream>
//Ejercicio 15.Posicion
using namespace std;

int main(){
	char salir;
	char pal[10];
	int a;
	cout<<"Dime una palabra: "<<endl;
	cin>>pal;
	a=pal[0];
	if (a<93){
		a=a-64;
	}
	else{
		a=a-96;
	}
	cout<<"El numero es: "<<a<<endl;
	cin>>a;
	cin>>salir;
}
	
