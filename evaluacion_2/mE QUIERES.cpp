#include<iostream>

using namespace std;

int main(){
	char salir;
	char pal;
	int n;
	cout<<"Me quieres?(s/n): ";
    cin>>pal;
    if(pal=='s'){
        cout<<"YUJUUUU  <3";
    }
    else{
         std::cout<<"Jo :(";     
    }
	cout<<"\n";
	cout<<"Del 1 al 10? ";
	cin>>n;
	if (n<5){
		cout<<"llorar";
	}
	if (n>=5 && n<9){
		cout<<"Sonreir y dar beso en la mejila";
	}
	if (n>=10){
		cout<<"DAR UN MORREO";
	}
	cin>>salir;
}

