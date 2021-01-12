#include<iostream>

using namespace std;

int dev_lon(char pal[]){
	int lon=0;
	int i=0;
	while(pal[i]!='\0'){
		lon++;
		i++;
	}
	return (lon);
}
int main(){
	char salir;
	int n;
	char pal[10];
	cout<<"Dime el numero: ";
	cin>>n;
	cout<<"Dime una palabra: ";
	cin>>pal;
	if (dev_lon(pal)==n){
		cout<<"Es la cantidad correcta";
	}
	else {
		cout<<"No es la cantidad correcta";
	}
	cin>>salir;
}

