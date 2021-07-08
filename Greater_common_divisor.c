int greater_common_divisor(int x,int y){
    int i=0;
    int gcd;
    while(i<=(x/2) && i<=(y/2)){
        i++;
        if(x%i==0 && y%i==0){
            gcd=i;
        }
    }

    return gcd;
}
