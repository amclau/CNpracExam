#include<string.h>
#include<stdlib.h>
#include<stdio.h>
#include<stdbool.h>
int chartoint(char c)
{
int ans;
ans=c-'0';
return ans;
}
void main()
{
char ip[16];
printf("Enter ip address");
scanf("%s",&ip);

int sum=0;
int i=0;
while (true)
{
   if(ip[i]=='.')
   {
    break;
   }
   sum=sum*10+chartoint(ip[i]); 
   i++;
}

// for (int i = 0; i < 3; i++)
// // {
//    sum=sum*10+chartoint(ip[i]); 
// }
printf("%d ip address",sum);
}