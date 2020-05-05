#include<iostream>
using namespace std;
int main()
{
  int a,amt;
  std::cin>>a;
  if(a<=200)
    amt=a*.5;
  else if(a<=400)
    amt=a*.65+100;
  else if(a<=600)
    amt=a*.80+200;
  else 
    amt=a*1.25+425;
  std::cout<<"Rs."<<amt;
  return 0;
}