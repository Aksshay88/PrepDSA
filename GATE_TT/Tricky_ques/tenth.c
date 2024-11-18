#include "stdio.h"
char *f();
char a='a';
int main (int argc, int char *argv[]){
    char *temp=f();
    printf("%&",temp);
    return 0;
}
char *f(){
    return &a;
}
