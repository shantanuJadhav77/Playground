#include<iostream>
using namespace std;
int main()
{
  float mil;
  int pet,dist;
  std::cin>>mil>>pet>>dist;
  if(dist<=(mil*pet))
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
  return 0;
}