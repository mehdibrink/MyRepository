#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main()
{
    printf("please write the first number: ");
    int first_number;
    scanf("%d",&first_number);

    printf("\nplease write the final number: ");
    int final_number;
    scanf("%d",&final_number);

    int prime[final_number];
    int prime_index=1;
    prime[0]=2;
    for(int i=1;i<final_number;i++){
        prime[i]=0;
    }



    for(int num=3;num<=final_number;num++){

      for(int i=0;i<final_number;i++){
        if(prime[i]!=0 && num%prime[i]==0)
          {
                break;
                }
             else if(i==final_number-1){
                prime[prime_index]=num;
                prime_index++;
                break;
             }

        }

    }
    printf("\nthese are the prime numbers between %d and %d: \n\n",first_number,final_number);
    printf("\b");
    for(int i=0;i<final_number;i++){
        if(prime[i]!=0&&prime[i]>=first_number)
            printf("%d-",prime[i]);
        if(i%10==0&&prime[i]!=0&&prime[i]>=first_number&&i!=0)
            printf("\b \n\n");
    }
printf("\b \n");




   return 0;
}
