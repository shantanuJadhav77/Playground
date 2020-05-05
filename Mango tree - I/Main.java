#include<iostream>
using namespace std;
int main()
{
 int row,col,num,a,flag=1;
  std::cin>>row>>col>>num;
  if(num<=col)
  {
    std::cout<<"Yes";
    flag=0;
  }
    else if(num>col)
  {
    a=1+col;
    while(a<row*col)
    {
      if(num==a)
      {
        std::cout<<"Yes";
        flag=0;
       break;
      }
      a=a+col;
    }
  }
  else if(num>=(col+row-1))
  {
     a=col;
    while(a<row*col)
    {
      if(num==a)
      {
        std::cout<<"Yes";
        flag=0;
       break;
      }
      a=a+col;
    }
  }
  if(flag)
    std::cout<<"No";
  return 0;
}
