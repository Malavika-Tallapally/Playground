#include<iostream>
using namespace std;
int dec_to_oct(int n)
{
    //Your code goes here
  int octnum=0,i=1;
  while(n!=0)
  {
    octnum=octnum+(n%8)*i;
    n=n/8;
    i=i*10;
  }
return octnum;
}
int main()
{
    int n;
    cin>>n;
    cout<<dec_to_oct(n);
}
