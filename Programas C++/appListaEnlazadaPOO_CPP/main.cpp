//#include <iostream>

//using namespace std;
#include "listaenlazada.h"

int main()
{
    ListaEnlazada *primero = new ListaEnlazada(15);
    ListaEnlazada *nodo = primero;
    for(int i = 0; i< 5; i++){
        ListaEnlazada *nodoAux = new ListaEnlazada(i*i);
        nodo->insertaSigNodo(nodoAux);
        nodo = nodoAux;
    }
    primero->muestra();
    nodo->muestra();
    return 0;
}
