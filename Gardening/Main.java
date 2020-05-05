#include<iostream>
using namespace std;
int main()
{
  int row,col,num,a;
  std::cin>>row>>col>>num;
  a=(col-2)*row;
  if((row)<num && (row+row)>=num)
    std::cout<<"It is a mango tree";
    else if(a<num && (a+row)>=num)
      std::cout<<"It is a mango tree";
    else
      std::cout<<"It is not a mango tree";
  return 0;
}