package pakete;


import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        main2 arreglo[];
        int facturas=Integer.parseInt((JOptionPane.showInputDialog("ingrese el numero de facturas")));
        int total=0;

        for(int i=0;i<facturas;i++){

            int cantidad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de productos"));
            arreglo=new main2[cantidad];
            main3 clase=new main3(cantidad);

            for(int f=0;f<cantidad;f++){
                String name=JOptionPane.showInputDialog("ingrese el nombre ");
                int price=Integer.parseInt(JOptionPane.showInputDialog("ingrese el preciio"));
                int cantidad1=Integer.parseInt((JOptionPane.showInputDialog("ingrese la cantidad")));
                main2 product=new main2(name,price,cantidad1);
                arreglo[f]=product;
            }

            clase.setProducto(arreglo);
            total+=clase.calcular();
            JOptionPane.showMessageDialog(null,"el total es "+ i +" es"+ clase.getValue());


        }
        JOptionPane.showMessageDialog(null,"el totao de las 5 facturas es "+ total);



    }
}