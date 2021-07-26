//We want to make an stack
//first we need to make an array
//a function that push data to stack
//a function that pops up an item from the stack
#include<stdio.h>
#include<stdlib.h>

int stack[100];
int layer_num=0;

void push(int value){
    stack[layer_num]=value;
    layer_num++;
}

int pop(){
    layer_num--;
    return stack[layer_num];
}

int main(){

    push(200);
    push(80);
    push(1002);

    printf("%d\n",pop());
    printf("%d",pop());


}
