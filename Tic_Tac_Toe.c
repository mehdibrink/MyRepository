#include <stdio.h>
#include <stdlib.h>

//required global variables
char places[9]={'1','2','3','4','5','6','7','8','9'};
int input;

//functions
void drawtable();
int check_winner(int );
void check_input(int x);
void get_input();
void start_game();
void introduction();


int main(){

introduction();
start_game();

return 0;

}

void introduction(){

    drawtable();
    printf("\n\n\t\t\thello to tic tac toe game:\n\nplayer1=X , player2=O\n");
}

void start_game(){

    int choose;
    get_input();
    printf("do you want to play again?choose(1=yes,0=no):");
    scanf("%d",&choose);
    while(choose!=0||choose!=1){
            printf("please write the correct number:");
            scanf("%d",&choose);
        }

    if(choose==0){
        printf("Have a nice day!!");
    }
    else{
        get_input();
    }
}


void get_input(){

    int i;
    for(i=1;i<=9;i++){

        if(i%2!=0){

            printf("\n\nplayer1,choose your number:");
            scanf("%d",&input);
            check_input(1);
            places[input-1]='X';

            drawtable();

            if(check_winner(i)!=-1){
                break;
            }

        }
        else
        {
            printf("\n\nplayer2,choose your number:");
            scanf("%d",&input);
            check_input(2);
            places[input-1]='O';
            drawtable();
            if(check_winner(i)!=-1){
                break;
            }

        }

        }
}

void drawtable(){
    system("cls");
    printf("\n  %c | %c | %c \n",places[6],places[7],places[8]);
    printf(" ___ ___ ___\n\n");
    printf("  %c | %c | %c \n",places[3],places[4],places[5]);
    printf(" ___ ___ ___\n\n");
    printf("  %c | %c | %c ",places[0],places[1],places[2]);


}

int check_winner(int x){

    int rvalue=0;

    if(((places[0]=='X')&&places[1]=='X'&&places[2]=='X')){
        printf("\nplayer1 wins!!");
    }
    else if((places[3]=='X'&&places[4]=='X'&&places[5]=='X')){
        printf("\nplayer1 wins!!");
    }
    else if((places[6]=='X'&&places[7]=='X'&&places[8]=='X')){
        printf("\nplayer1 wins!!");
    }



    else if((places[0]=='X'&&places[3]=='X'&&places[6]=='X')){
       printf("\nplayer1 wins!!");
    }
    else if((places[1]=='X'&&places[4]=='X'&&places[7]=='X')){
        printf("\nplayer1 wins!!");
    }
    else if((places[2]=='X'&&places[5]=='X'&&places[8]=='X')){
        printf("\nplayer1 wins!!");
    }



    else if((places[0]=='X'&&places[4]=='X'&&places[8]=='X')){
        printf("\nplayer1 wins!!");
    }
    else if((places[2]=='X'&&places[4]=='X'&&places[6]=='X')){
        printf("\nplayer1 wins!!");
    }

    //--------------------------OOOO
    else if((places[0]=='O'&&places[1]=='O'&&places[2]=='O')){
        printf("\nplayer2 wins!!");
    }
    else if((places[3]=='O'&&places[4]=='O'&&places[5]=='O')){
        printf("\nplayer2 wins!!");
    }
    else if((places[6]=='O'&&places[7]=='O'&&places[8]=='O')){
        printf("\nplayer2 wins!!");
    }
   //-----------------------------------

    else if((places[0]=='O'&&places[3]=='O'&&places[6]=='O')){
        printf("\nplayer2 wins!!");
    }
    else if((places[1]=='O'&&places[4]=='O'&&places[7]=='O')){
        printf("\nplayer2 wins!!");
    }
    else if((places[2]=='O'&&places[5]=='O'&&places[8]=='O')){
        printf("\nplayer2 wins!!");
    }
    //-------------------------------------
    else if((places[0]=='O'&&places[4]=='O'&&places[8]=='O')){
        printf("\nplayer2 wins!!");
    }
    else if((places[2]=='O'&&places[4]=='O'&&places[6]=='O')){
        printf("\nplayer2 wins!!");
    }

    else if(x==9){
       printf("\nno one wins!!");
    }
    else{
        rvalue=-1;
    }
    return rvalue;

}

void check_input(int x){

    while((places[input-1]=='O'||places[input-1]=='X')||(input>9)||(input<1))
    {
        if(x==1){
            printf("\nplease write a correct number\nplayer1,choose your number:");
            scanf("%d",&input);

        }
        if(x==2){
            printf("\nplease write a correct number\nplayer1,choose your number:");
            scanf("%d",&input);
        }

    }
}
