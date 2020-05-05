#include<iostream>
using namespace std;
int main()
{
  int a,r;
  std::cin>>r>>a;
  if(r<=(a/2))
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
  return 0;
}