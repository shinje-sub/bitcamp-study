#include <stdio.h>

float plus(float a, float b) {
    return a + b;
}

int plus(int a, int b) {
    return a + b;
}

int main(void) {
    printf("Hello!\n");
    
    int r = plus(100, 200);
    printf("r = %d\n", r);
    
    float r2 = plus(100.5f, 200.2f);
    printf("r2 = %f\n", r2);
} 






