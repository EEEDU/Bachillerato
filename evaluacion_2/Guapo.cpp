#include<iostream>


int main(){
    //Definicion de variables
    char salir;
    char respuesta;
    std::cout<<"Hola mundo \n";
    std::cout<<"Eres guapa?(s/n): ";
    std::cin>>respuesta;
    //&& significa and
    //|| significa or
    if(respuesta=='s'||respuesta=='S'){
         std::cout<<"Hola guapo";
    }
    else{
         std::cout<<"Hola feo";     
    }
    std::cin>>salir;
    
}
