char* first_identity(void* e){


    char* result=(char*)malloc(40);
    strcpy(result,e);

    _Bool symbol=(int)strchr(result,'-');
    int num1,num2=0;

    num1=atoi(strtok(result,"+-x"));
    num2=atoi(strtok(NULL,"+-x"));

    if(num2==0){

        num2=num1;
        num1=1;
        if(symbol)
            sprintf(result,"x^2-%dx+%d",2*num1*num2,num2*num2);
        else
            sprintf(result,"x^2+%dx+%d",2*num1*num2,num2*num2);
    }

    else{
        if(symbol)
            sprintf(result,"%dx^2-%dx+%d",num1*num1,2*num1*num2,num2*num2);
        else
            sprintf(result,"%dx^2+%dx+%d",num1*num1,2*num1*num2,num2*num2);
    }



    return result;

}
