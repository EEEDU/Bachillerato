#include <iostream>

using namespace std;

int main(){
	char a;
	int i,op;
	std::cout<<"ELIGE UNA OPCION \n"<<"1- Codigo a ASCII \n"<<"2- ASCII a codigo \n"<<"Que quieres hacer: ";
	std::cin>>op;
	
	if (op==1){
		std::cout<<"Dime el codigo ASCII: ";
		std::cin>>i;
		a=i;
		std::cout<<"El caracter es: "<<a<<endl;
	}
	if (op==2){
		std::cout<<"Dime el caracter: ";
		std::cin>>a;
		i=a;
		std::cout<<"El codigo ASCII es: "<<i<<endl;
	}
}
