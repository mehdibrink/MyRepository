#include <stdio.h>

int main(){

    int primes[100]={2,3};
    int i;
    int j=0;
    int k=0;
    int pindex=2;
    _Bool isprime=1;

    for(i=5;i<=100;i++)
        {
        
        while((i/primes[j])>=primes[j])
        {
        
            if(i%(primes[j])==0){
                isprime=0;
                break;
        }
        
        j++;
      }

      j=0;
      
      if(isprime){
        primes[pindex]=i;
        pindex++;
      }
      
      isprime=1;
        }

printf("these are the prime numbers between 30 to 100:\n");

    while(primes[k]!=0)
    {
    printf("%d  ",primes[k]);
    k++;

    }   
    
return 0;
}

