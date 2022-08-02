package pakete;

import javax.swing.*;

public class main3 {

private main2 producto[];
private int value;

public int getValue(){return value;}
    public void setValue(int value){this.value=value;}

    public main3(int mostrarProducto){
    producto=new main2[mostrarProducto];
    value=0;
    }
    public int calcular(){
    for(int i=0;i<producto.length;i++){
        value+=producto[i].mostrarCantidad()*producto[i].getPrecio();
    }
    return value;
    }
    public main2[] getProducto(){return producto;}

    public void setProducto(main2[]producto){this.producto=producto;}




}