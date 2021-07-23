#include<stdio.h>
#include<stdlib.h>

//the base structure
struct list_element{
    struct list_element* next;
};

//the child structure
struct book{
    struct list_element element;
    char * author;
    int pages;
    double price;
};

struct list_element * get_the_last_element(struct list_element * element){

        while(element!=NULL){
            if(element->next==NULL)
                break;
            element=element->next;
        }
        return element;
};

void initilize(struct list_element * element){
    element->next=NULL;
}

void add_to_list(struct list_element * element,struct book* b){

    struct list_element * last_element=(struct list_element *)malloc(sizeof(struct list_element));

    last_element=get_the_last_element(element);
    last_element->next=(struct list_element *)b;

}

void print_list(struct book * b){

    while(b!=NULL){

            printf("the author %s ,the number of pages: %d, the price: %0.1f\n",b->author,b->pages,b->price);
            b=(struct book*)b->element.next;
    }
}

int main(){

    struct list_element *element=(struct list_element *) malloc(sizeof(struct list_element));
    initilize(element);

    struct book book1;

    book1.element.next=NULL;

    book1.author="kate and nina";
    book1.pages=200;
    book1.price=52.6;


    struct book book2;

    book2.element.next=NULL;
    book2.author="motahari";
    book2.pages=500;
    book2.price=52000;


    add_to_list(element,&book1);
    add_to_list(element,&book2);
    print_list(&book1);

return 0;
}

