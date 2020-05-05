#include<iostream>
using namespace std;
int main()
{
  int max,weight;
  std::cin>>max>>weight;
  if(max==weight)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else if(max>weight)
    std::cout<<"Yes, you can enter.";
  else
    std::cout<<"Sorry, you can't enter";
  return 0;
}