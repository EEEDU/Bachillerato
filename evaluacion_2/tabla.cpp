#include<iostream>

int main(){
    int ntabla;
    char salir;
    std::cout << "Que tabla deseas que muestre: ";
    std::cin >> ntabla;
    std::cout << "********************************\n";
    std::cout << "****      TABLA DEL ";
    std::cout << ntabla;
    std::cout << "       ****\n";
    std::cout << "********************************\n";
    for (int i=0;i<=10;i++){
        std::cout << ntabla;
        std::cout << " * ";
        std::cout << i;
        std::cout << " = ";
        std::cout << ntabla*i<<"\n";
    }
    
    std::cin >> salir;
}
