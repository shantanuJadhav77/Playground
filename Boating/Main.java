#include<iostream>
using namespace std;
int main()
{
  int max,child,adult,total;
  std::cin>>max>>adult>>child;
  total=adult*75+child*30;
  if(total<max)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
  return 0;
}