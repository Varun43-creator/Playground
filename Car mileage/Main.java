#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c;
  d=a*b;
  if(d>c)
  {
    std::cout<<"Can reach";
  }
  else
  {
    std::cout<<"Cannot reach";
}
}