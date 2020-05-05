#include<iostream>
using namespace std;
int main()
{
  int amt,rate,years;
  float interest,tamt,disc,famt;
  cin>>amt>>rate>>years;
  interest=amt*rate*years/100;
  tamt=interest+amt;
  disc=interest*2/100;
  famt=tamt-disc;
  cout<<interest<<endl;
  cout<<tamt<<endl;
  cout<<disc<<endl;
  cout<<famt<<endl;
  return 0;
}