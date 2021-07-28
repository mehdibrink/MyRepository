//We want to make an binary tree
//we need to make an structure node
#include<stdio.h>
#include<stdlib.h>

struct node{

    struct node* left_node;
    struct node* right_node;
    int value;

};

int main(){
    
    
    struct node headmaster;
    struct node teacher;
    struct node students;

    headmaster.left_node=&teacher;
    headmaster.right_node=&students;

    struct node root;
    root.left_node=&headmaster;

}
