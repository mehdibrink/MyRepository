//We want to make an array list that do the below things
//adding to the list
//removing from the list
//get the item by its index
//destruct the list
#include<stdio.h>
#include<stdlib.h>
#include<memory.h>
#include<stdbool.h>

#define ELEMENTS_INCREASE 10

struct array_list{

    // this is where that we want to store the elements of our list
    char * ptr;
    //the real number of elements that we allocate
    int elements_allocated;
    //the number of elements that we put value in that
    int elements_by_value;
    //the element size
    int element_size;

};

void initialize(struct array_list * list,size_t element_size){

    list->ptr=(char*)malloc(element_size*ELEMENTS_INCREASE);
    list->elements_allocated=10;
    list->elements_by_value=0;
    list->element_size=element_size;
}

void add_to_list(struct array_list * list, void * value){

    if(list->elements_by_value==list->elements_allocated){
        list->ptr=(char*)realloc(list->ptr,ELEMENTS_INCREASE);
        list->elements_allocated+=ELEMENTS_INCREASE;
    }
    memcpy(&list->ptr[list->elements_by_value *list->element_size],value,list->element_size);
    list->elements_by_value++;

}

bool array_get_item(struct array_list * list,int index,void* destenation){
    if(index>=list->elements_by_value){
            printf("out of bounder");
            return false;
    }
    memcpy(destenation,&list->ptr[index*list->element_size],list->element_size);
    return true;
}

bool array_remove_item(struct array_list* list,int index){
    if(index>=list->elements_by_value){
        printf("out of bounder");
        return false;
    }
    for(int i=index;i<list->elements_by_value;i++){

        memcpy(&list->ptr[i*list->element_size],&list->ptr[(i+1)*list->element_size],list->element_size);
    }
    list->elements_by_value-=1;
    return true;
}

void destruct(struct array_list* list){

    free(list->ptr);
    list->elements_allocated=0;
    list->elements_by_value=0;
    list->element_size=0;
}


int main(){


    struct array_list list1;

    initialize(&list1,4);
    int number=10;

    add_to_list(&list1,&number);
    int result=0;
    array_get_item(&list1,0,&result);
    number=90;
    add_to_list(&list1,&number);

    array_remove_item(&list1,2);


    array_get_item(&list1,0,&result);

    printf("%d",result);

    destruct(&list1);

    array_get_item(&list1,0,&result);
}
