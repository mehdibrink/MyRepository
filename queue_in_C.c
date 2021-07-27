//We want to create a queue
//we need a queue element structure
//we need a queue structure
#include<stdio.h>
#include<stdlib.h>

struct queue_element{

    int value;
    struct queue_element* left_element;
};

struct queue{

    struct queue_element* first;
};

void initialize_qelement(struct queue_element * element,int value){

    element->left_element=NULL;
    element->value=value;
}

void initialize_q(struct queue* q,struct queue_element* qe){
    q->first=qe;
}

void add_to_queue(struct queue_element* standing,struct queue_element * before){

    if(standing->left_element!=NULL){

        before->left_element=standing->left_element;
    }
    standing->left_element=before;

}

struct queue_element* dequeue(struct queue *queue){

    struct queue_element* front=queue->first;

    if(front!=NULL){

        queue->first=front->left_element;
    }

    return front;
}

int main(){

    struct queue_element ahmad;
    initialize_qelement(&ahmad,30);

    struct queue queue1;
    initialize_q(&queue1,&ahmad);

    struct queue_element mehdi;
    initialize_qelement(&mehdi,50);

    add_to_queue(&ahmad,&mehdi);

    struct queue_element hamid;
    initialize_qelement(&hamid,60);

    add_to_queue(&ahmad,&hamid);

    printf("the first number: %d\n",dequeue(&queue1)->value);
    printf("the second number: %d\n",dequeue(&queue1)->value);
    printf("the third number: %d\n",dequeue(&queue1)->value);
    printf("the forth number: %p",dequeue(&queue1)->value);


}
