#include<iostream>
int dev_lon(char pal[]){
	int lon=0,i=0;
	while (pal[i]!='\0'){
		lon++;
		i++;
	}
	return(lon);
}
int contar_letras(char pal[]){
    int i,n=0;
    std::cout<<"Dime la palabra: ";
    std::cin>>pal;
    for(i=0;i<dev_lon(pal);i++){
      n++;
    }
    std::cout<<n;
    return(n);
}
int pulubru(char pal[]){
    char voc[]={'a','e','i','o'};
    int i,nvoc;
    for(i=0;i<dev_lon(pal);i++){
      for(nvoc=0;nvoc<4;nvoc++){
        if(pal[i]==voc[nvoc]){
          pal[i]='u';
      
        }           
      }     
    }
    std::cout<<"Tu pulubru us: "<<pal;
    return(0);
}
int main(){
	char salir;
	char pal[10];
	std::cout<<"Dime una palabra: ";
	std::cin>>pal;
	std::cout<<contar_letras;
	std::cout<<pulubru;
	std::cin>>salir;
}
