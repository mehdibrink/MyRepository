float sqaure_root(float x){
    float sr=0;
    float i=0;
    float j=0;
    float f=0;
    float u=0;
    while(i<=(x/2)){
        i++;
        u=i;
        while(j<10)
        {

            if((u*u)==x){
                sr=u;

            }
            else if(u*u<x){
                sr=u;

            }
            f=0.1;
            j++;
            u+=f;


            }
            j=0;

    }
    return sr;
}
