/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2prueba;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Emily Barrientos
 */
public class inicio {
    
    private static final Scanner scanner = new Scanner (System.in);
    private static int opcion = -1;
    
     public static void ej1(int niv){
         
         int total = 0;
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/dbempl?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","BarrientoS12");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "SELECT * FROM dbempl.tb_vendedores where niv ="+niv;
            // paso 5 ejecutamos el query
            ResultSet resultado = sentencia.executeQuery(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
            
                 while(resultado.next()){
                System.out.println("NIV= "+resultado.getInt(1));
                System.out.println("Nombre= "+resultado.getString(2));
                System.out.println("Enero= "+resultado.getInt(3));
                System.out.println("Febrero= "+resultado.getInt(4));
                System.out.println("Marzo= "+resultado.getInt(5));
                System.out.println("Abril= "+resultado.getInt(6));
                System.out.println("Mayo= "+resultado.getInt(7));
                System.out.println("Junio= "+resultado.getInt(8));
                
                total = resultado.getInt(3)+resultado.getInt(4)+resultado.getInt(5)+resultado.getInt(6)+resultado.getInt(7)+resultado.getInt(8);
                System.out.println("Total= "+total);
//                System.out.println("TOTAL ="+resultado.getInt(9));
//                System.out.println("total ="+resultado.getInt(10));
            }
            
            //Mensaje para Conectar
//            if (conexion != null){
//                System.out.println("Conectado");
//            }

        } catch (SQLException ex) {
            System.out.println("Hubo problema"+ex.getMessage());
            ex.printStackTrace(System.out);
        }
}
     
     public static void eje2(){
                  int total = 0;
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/dbempl?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","BarrientoS12");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "SELECT * FROM dbempl.tb_vendedores";
            // paso 5 ejecutamos el query
            ResultSet resultado = sentencia.executeQuery(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
            
                 while(resultado.next()){
                System.out.println("****NIV= "+resultado.getInt(1)+"*****");
                System.out.println("Nombre= "+resultado.getString(2));
                System.out.println("Enero= "+resultado.getInt(3));
                System.out.println("Febrero= "+resultado.getInt(4));
                System.out.println("Marzo= "+resultado.getInt(5));
                System.out.println("Abril= "+resultado.getInt(6));
                System.out.println("Mayo= "+resultado.getInt(7));
                System.out.println("Junio= "+resultado.getInt(8));
                
                total = resultado.getInt(3)+resultado.getInt(4)+resultado.getInt(5)+resultado.getInt(6)+resultado.getInt(7)+resultado.getInt(8);
                System.out.println("Total= "+total);
//                System.out.println("TOTAL ="+resultado.getInt(9));
//                System.out.println("total ="+resultado.getInt(10));
            }
            
            //Mensaje para Conectar
//            if (conexion != null){
//                System.out.println("Conectado");
//            }

        } catch (SQLException ex) {
            System.out.println("Hubo problema"+ex.getMessage());
            ex.printStackTrace(System.out);
        }
 
     }
     
     public static void elim(int niv){
         
                  int total = 0;
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/dbempl?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","BarrientoS12");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            
            PreparedStatement p = null;
            String sql = "DELETE FROM dbempl.tb_vendedores where niv ="+niv;
            p = conexion.prepareStatement(sql);
            p.execute();
            
            // paso 5 ejecutamos el query
            //ResultSet resultado = sentencia.executeQuery(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
            
//                 while(resultado.next()){
//                System.out.println("NIV= "+resultado.getInt(1));
//                System.out.println("Nombre= "+resultado.getString(2));
//                System.out.println("Enero= "+resultado.getInt(3));
//                System.out.println("Febrero= "+resultado.getInt(4));
//                System.out.println("Marzo= "+resultado.getInt(5));
//                System.out.println("Abril= "+resultado.getInt(6));
//                System.out.println("Mayo= "+resultado.getInt(7));
//                System.out.println("Junio= "+resultado.getInt(8));
//                
//                total = resultado.getInt(3)+resultado.getInt(4)+resultado.getInt(5)+resultado.getInt(6)+resultado.getInt(7)+resultado.getInt(8);
//                System.out.println("Total= "+total);
////                System.out.println("TOTAL ="+resultado.getInt(9));
////                System.out.println("total ="+resultado.getInt(10));
//            }
            
            //Mensaje para Conectar
//            if (conexion != null){
//                System.out.println("Conectado");
//            }

        } catch (SQLException ex) {
            System.out.println("Hubo problema"+ex.getMessage());
            ex.printStackTrace(System.out);
        }
     }
     
     public static void act(String nombre, int niv){
         //int total = 0;
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/dbempl?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","BarrientoS12");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "UPDATE dbempl.tb_vendedores SET nombre=?" + "WHERE niv= "+niv;
            // paso 5 ejecutamos el query
            
            PreparedStatement prest = conexion.prepareStatement(sql);
            
            prest.setString(1, nombre);
            
            if(prest.executeUpdate() > 0){
                System.out.println("Los datos han sido modificados");
            }else{
                System.out.println("No se ha podido realizar la actualizacion");
            }
        } catch (SQLException ex) {
            System.out.println("Hubo problema"+ex.getMessage());
            ex.printStackTrace(System.out);
        }
     }

    public static void main(String[] args) {
        
            while (opcion != 0) {
            try {
                System.out.println("Elige opcion:\n1.- Consultar empleado en especifico"
                        + "\n2.- Consultar todo los empleados\n"
                        + "3.- Eliminar\n"
                        + "4.- Actualizar\n"
                        + "0.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                    Scanner t = new Scanner(System.in);
                    int i;
                    System.out.println("Ingrese el NIV: ");
                    i = t.nextInt();
                    ej1(i);
                        break;
                    case 2:
                        //2. listar todos los empleados
                        eje2();
                        break;
                    case 3:
                        //3. scanner para el ingreso de datos del NIV y la confirmacion
                    Scanner e = new Scanner(System.in);
                    Scanner tec = new Scanner(System.in);
                    int x,num;
                    System.out.println("Ingrese el NIV que deseea eliminar: ");
                    x = e.nextInt();
                        System.out.println("Esta seguro de eliminarlo?");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        System.out.println("Ingrese el numero de la opcion");
                        num = tec.nextInt();
                        if (num == 1){
                            elim(x);
                            System.out.println("Se ha eliminado con exito");
                        }else if( num == 2){
                            System.out.println("Se ha cancelado");
                        }else{
                            System.out.println("Ingrese una numeracion entre 1 y 2");
                        }
                        
                        break;
                    case 4:
                        //4. Modificar/actualizar el nombre, con ingreso de datos del NIV
                    Scanner ac = new Scanner(System.in);
                    //para leer el NIV ingresado
                    Scanner nue = new Scanner(System.in);
                    //para leer el nuevo nombre
                    int a;
                    String n;
                    System.out.println("Ingrese el NIV que desee modificar: ");
                    a = ac.nextInt();
                    //leer enteros
                        System.out.println("Ingrese el nuevo nombre: ");
                        n = nue.nextLine();
                        //leer string
                        act(n,a);
                        //llamar a la clase con sus parametros
                       
                        break;
                    case 0:
                        System.out.println("!Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }
    }
    
//        Scanner t = new Scanner(System.in);
//        int i;
//        System.out.println("Ingrese el NIV: ");
//        i = t.nextInt();
//        Inicio(i);
//        ej1(i);
        
}
