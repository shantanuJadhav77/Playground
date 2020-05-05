#include<iostream>
using namespace std;
int main()
{
  int age;
  float time,a=13.3;
  std::cin>>age>>time;
  if(age<13)
  {
    if(time==a)
      std::cout<<"$2.00";
    else
      std::cout<<"$4.00";
  }
  else
  {
    if(time==a)
      std::cout<<"$5.00";
    else
      std::cout<<"$8.00";
  }
  return 0;
}