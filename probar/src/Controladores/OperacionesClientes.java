/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Modelos.Clientes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Diego
 */
public class OperacionesClientes {
    
      private Session sesion;
    
     //con transactional podemos volver a ejecutar otros métodos
    @Transactional
    private void iniciaOperacion(){
    
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        sesion = sessionFactory.openSession();
        sesion.beginTransaction();
    }
    
    @Transactional
    private void terminaOperacion(){
        sesion.getTransaction().commit();
        sesion.close();
    }
    @Transactional
    public int guardaCliente(Clientes cliente){
        int id = 0;
        iniciaOperacion();
        id = (int)sesion.save(cliente);
        terminaOperacion();
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
        return id;
    }
    @Transactional 
    public ArrayList<Clientes> ListaClientes(){
         
         ArrayList<Clientes> listaClientes = null;
         iniciaOperacion();
         listaClientes = (ArrayList<Clientes>) sesion.createQuery("from Clientes").list();
         terminaOperacion();         
         return listaClientes;
     }
       @Transactional
    public int eliminaCliente(Clientes cliente){
        int id = cliente.getIdclientes();
        iniciaOperacion();
        sesion.delete(cliente);
        terminaOperacion();
        JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
        return id;
    }
    
    public ArrayList<Clientes> obtenerCliente(int id){
        
         ArrayList<Clientes> listaClientes = null;
         iniciaOperacion();
         listaClientes = (ArrayList<Clientes>) sesion.createQuery("from Clientes where="+id).list();
         terminaOperacion();         
         return listaClientes;
    }
}
