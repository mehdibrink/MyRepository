#include <stdio.h>
#include <stdlib.h>

struct link_list_element{

    void * value;
    struct link_list_element* next;
    struct link_list_element* previous;

};

void initialize_list_element(struct link_list_element* element){

    element->value=NULL;
    element->next=NULL;
    element->previous=NULL;

}

struct link_list_element* get_the_last_element(struct link_list_element* first_element){

    struct link_list_element * cur=first_element;
    while(cur!=NULL){


        if(cur->next==NULL)
            break;
        cur=cur->next;
    }
    return cur;
};

void add_to_list(struct link_list_element * firstelement,char * str){

    if(firstelement->value==NULL){
        firstelement->value=str;
    }
    else{

        struct link_list_element* last_elemet=get_the_last_element(firstelement);
        struct link_list_element * element =(struct link_list_element *)malloc(sizeof(struct link_list_element));
        initialize_list_element(element);
        element->value=str;
        last_elemet->next=element;
        element->previous=last_elemet;

    }

}

void print_list(struct link_list_element *firstelement,char c){

        if(c=='d'){
            while(firstelement!=NULL){

                printf("%s\n",firstelement->value);
                firstelement=firstelement->next;
            }
        }
        if(c=='r'){
            struct link_list_element* last_element=get_the_last_element(firstelement);
            while(last_element!=NULL){
                printf("%s\n",last_element->value);
                last_element=last_element->previous;
            }
        }

}

int main()
{

    struct link_list_element first_element;
    initialize_list_element(&first_element);

    add_to_list(&first_element,"this is the first element");
    add_to_list(&first_element,"this is the second element");
    add_to_list(&first_element,"this is the third element");

    print_list(&first_element,'d');
    printf("\n\n\n");
    print_list(&first_element,'r');





   return 0;

}

