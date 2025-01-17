
#include <iostream>
using namespace std;

struct Nodo{
    int info;
    Nodo *sig;
};

int main()
{
    int i;
    Nodo lista, *nodo;
    lista.sig = 0;
    cout<<"Direccion de lista: "<<&lista<<endl;
    nodo = &lista;
    cout<<"Direccion de nodo: "<<nodo<<endl;

    for(int i=0; i<= 10; i++){
        nodo->sig = new Nodo;
    }

    return 0;
}
