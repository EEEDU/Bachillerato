#include<iostream>
/*Un programa para hacer un cuadrado*/

int main(){
    char salir;
    int h;
    int col,fil; 
    std::cout<<"Como de grande quieres el cuadrado: ";
    std::cin>>h;
    for(col=1;col<=h;col++){
        for(fil=1;fil<=h;fil++){
            std::cout<<'*';
        }
        std::cout<<"\n";
    }         
    std::cin>>salir;
}
