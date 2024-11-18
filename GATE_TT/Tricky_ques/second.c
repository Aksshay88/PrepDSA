#include "stdio.h"
#include "stdlib.h"
int main(int argc, char *argv[]){
    char temp [20];
    gcvt(23.45,2,temp);
    printf(temp);
    return 0;
}
