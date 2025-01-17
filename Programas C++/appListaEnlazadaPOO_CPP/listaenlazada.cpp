#include "listaenlazada.h"
#include <stdio.h>

ListaEnlazada::ListaEnlazada(int d)
{
    dato = d;
    sig = nullptr; //NULL;
}

ListaEnlazada::~ListaEnlazada()
{
    delete sig;
}

void ListaEnlazada::insertaSigNodo(ListaEnlazada *nodo)
{
    if(sig == NULL){
        sig = nodo;
        nodo->sig = NULL;
    }
    else{
        nodo->sig = sig;
        sig = nodo;
    }
}

void ListaEnlazada::muestra()
{
    ListaEnlazada *nodoAux;
    nodoAux = this;
    while(nodoAux != 0){
        cout<<hex<<"Dir. Nodo"<<nodoAux<<dec<<" Dato : "<<nodoAux->dato<<" Dir. Sig : "<<hex<<nodoAux->sig<<endl;
        nodoAux = nodoAux->sig;
    }
    cout<<endl;
}
