#include<iostream>
int main()
{
int x,y,r,i,a;
float f,d;
std::cin>>x>>y>>r;
i=x*y*r/100;
a=x+i;
d=i*0.02;
  f=a-d;
std::cout<<i<<"\n";
std::cout<<a<<"\n";
std::cout<<d<<"\n";
  std::cout<<f;
}

