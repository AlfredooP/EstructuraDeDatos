#ifndef LISTAENLAZADA_H
#define LISTAENLAZADA_H

//DEFINICION DE LA CLASE
#include <iostream>
using namespace std;

class ListaEnlazada
{//POR DEFAULT ESTA AREA ES PRIVADA
    int dato;
    ListaEnlazada *sig;
public:
    ListaEnlazada(int d);
    ~ListaEnlazada(); //Destructor
    void insertaSigNodo(ListaEnlazada *nodo);
    void muestra();

};

#endif // LISTAENLAZADA_H
