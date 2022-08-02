package pakete;

import javax.swing.*;

public class main2 {

   public String producto;
   public int cantidad;
   private int precio;



   public String mostrarProducto(){return  producto;}
   public void setProducto(String producto){this.producto=producto;}

   public int mostrarCantidad(){return cantidad;}
   public void setCantidad(int cantidad){this.cantidad=cantidad;}

   public int getPrecio(){return precio;}
   public  void setPrecio(int precio){this.precio=precio;}

   public main2(String producto,int cantidad, int precio){
      this.producto=producto;
      this.cantidad=cantidad;
      this.precio=precio;
   }

}

