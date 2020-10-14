#include<stdio.h>
int isprime(int n)
{
	//Your code goes here
  int count=0;
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
      count++;
  }
  if(count==2)
    return 1;
  return 0;
}
void print(int a, int b)
{
    int i;
    for(i=a;i<=b;i++)
    {
        if(isprime(i)==1)
            printf("%d ",i);
    }
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    print(a,b);
    return 0;
}
