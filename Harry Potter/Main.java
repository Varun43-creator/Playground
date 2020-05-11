#include<iostream>
using namespace std;
int main()
{
  int n,x,y,z;
  std::cin>>n;
  x=n%10;
  y=n/1000;
  z=x+y;
  std::cout<<z;
}