#include<iostream>
using namespace std;
int main()
{
  int nos;
  float time;
  std::cin>>nos>>time;
  if(nos==1)
    std::cout<<time;
  else if(nos==2)
    std::cout<<time+time*50/100;
  else if(nos==3)
    std::cout<<time*2;
  else
    std::cout<<"Number of items is more";
  return 0;
}