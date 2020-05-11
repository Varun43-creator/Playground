#include<iostream>
using namespace std;
int main()
{
 int n,x,y,z;
  std::cin>>n>>x>>y;
  int a=75*x;
  int b=30*y;
  int c=a+b;
  if(c<n)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
  
}