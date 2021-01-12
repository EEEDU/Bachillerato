#include<iostream>

int dev_lon(char pal[]){ 
  int lon=0, i=0; 
  while(pal[i]!='\0'){
    lon++; 
    i++; 
  }
  return(lon);
}
int main(){
  char salir;
  char pal[10]; 
  int i,n=0,a; 
  std::cout<<"Dime la palabra: ";      
  std::cin>>pal;
  for(i=0;i<dev_lon(pal);i++){
    pal[i]=a;
    if (65<=a && a<=90){
      a=a+1;
    }
    if (97<=a&&a<=132){
      a=a-32;
    }
    a=pal[i];
  } 
  std::cout<<"La plabra es: "<<pal;      
  std::cin>>salir;
}

