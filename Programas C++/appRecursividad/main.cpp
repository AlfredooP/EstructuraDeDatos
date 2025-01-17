#include <iostream>

using namespace std;
int serieFibonacci(int n){
        if(n == 1 || n == 2)
            return 1;
        else
            return serieFibonacci(n-1) + serieFibonacci(n-2);

    }

int combinaciones(int n, int r){
        int resul = 0;
        if(n == 1 || r == 0 || n <= r)
            return 1;
        else
            resul = combinaciones(n-1, r) + combinaciones(n-1, r-1);
        return resul;
    }

int main()
{
    cout << "Hello World!" << endl;
    /*int num = 6;
    int valorFibonacci = serieFibonacci(num);
    cout<<"VALOR DE FIBONACCI PARA: "<< num <<" = " << valorFibonacci;
    */
    int combinaciones_ = combinaciones(4,2);
    cout<<"Las combinaciones de {"<<4<<","<<2<<"} = "<<combinaciones_;
    return 0;
}
