#include<iostream>
using namespace std;
int main()
{
  int tballs,truns,sruns,bballs,b,e;
  float f,c,d,g,a,h,i;
  std::cin>>tballs>>truns>>sruns>>bballs;
  a=tballs/6;
  b=bballs/6;
  e=bballs%6;
  g=e;
  f=b+ g*.1;
  c=(float)sruns/f;
  d=truns/a;
  h=static_cast<int>(c * 10 + 0.5) / 10.0;
  i=static_cast<int>(d * 10 + 0.5) / 10.0;
  std::cout<<a<<"\n";
  std::cout<<f<<"\n";
  std::cout<<h<<"\n";
  std::cout<<i<<"\n";
  if(d<=c)
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
  return 0;
}