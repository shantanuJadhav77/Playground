#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x,y;
  int dist1,dist;
  cin>>x>>y;
  dist1=(x-3)*(x-3)+(y-4)*(y-4);
  dist=sqrt(dist1);
  cout<<dist;
}