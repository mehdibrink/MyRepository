#include<stdio.h>

int main(){

  int prime_nums[100]={3,5};
  int i;
  int j=0;
  int k=0;
  _Bool isprime=1;

  for(i=1;i<=100;i++)
  {
  
      while(i/(prime_nums[j])>=prime_nums[j])
      {
  
          if(i%prime_nums[j]==0){
            isprime=0;
            break;}
            
        j++;
      }

      j=0;
    
      if(isprime){
        prime_nums[k+2]=i;
        k++;
      }
      
  }

}
