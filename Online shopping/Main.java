#include<iostream>
using namespace std;
int main()
{
  int famt,fdisc,fship,samt,sdisc,sship,aamt,adisc,aship,ftot,stot,atot;
  std::cin>>famt>>fdisc>>fship>>samt>>sdisc>>sship>>aamt>>adisc>>aship;
  ftot=famt - famt*fdisc/100 + fship;
  stot=samt - samt*sdisc/100 + sship;
  atot=aamt - aamt*adisc/100 + aship;
  std::cout<<"In Flipkart Rs."<<ftot;
  std::cout<<"\nIn Snapdeal Rs."<<stot;
  std::cout<<"\nIn Amazon Rs."<<atot;
  if(ftot<stot && ftot<atot)
    std::cout<<"\nHe will prefer Flipkart";
  else if( stot==ftot && stot<atot)
    std::cout<<"\nHe will prefer Flipkart";
  else if(stot<atot)
    std::cout<<"\nHe will prefer Snapdeal";
  else
    std::cout<<"\nHe will prefer Amazon";
  return 0;
}