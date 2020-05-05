#include<iostream>
using namespace std;
int main()
{
  int byear,cyear;
  std::cin>>byear>>cyear;
  if(byear>cyear)
    std::cout<<(100-byear)+cyear;
  else 
    std::cout<<cyear-byear;
  return 0;
}