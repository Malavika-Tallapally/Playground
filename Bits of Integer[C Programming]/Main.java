#include<stdio.h>
int dec_to_bin(int n)
{
   //Your code goes here
  int count=0;
  while(n>0)
  {
    count++;
    n=n/2;
  }
  return count;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
