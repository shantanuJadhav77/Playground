#include<iostream>
using namespace std;
int main()
{
  int a,b,d,e,f;
  std::cin>>a;
  b=a%10;
  d=(a)%1000;
  e=a-d;
  f=e/1000;
  std::cout<<(f+b);
  return 0;
}