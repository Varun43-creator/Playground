#include<iostream>
int main()
{
  int w,x,y,profit;
  std::cin>>w>>x>>y;
  profit= w*x - (100 + (w*y));
  std::cout<<profit;
}
  
  