/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos;

/**
 *
 * @author link
 */
public class Filosofos {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int peso = 5;
        int numero = 5;
        Tenedor[] tenedores = new Tenedor[numero];
        Filosofo[] filosofos = new Filosofo[numero];
        for (int i = 0; i < numero; i++) {
            tenedores[i] = new Tenedor();
        }
        for (int i = 0; i < numero; i++) {
            filosofos[i] = new Filosofo(tenedores[i], tenedores[(i+1)%numero],i,peso);
            filosofos[i].start();
            // Para romper el interbloqueo circular
            /*
             if (i < (numero - 1)) {
                filosofos[i] = new Filosofo(tenedores[i], tenedores[i+1],i,peso);
                filosofos[i].start();
            }else{
               filosofos[i] = new Filosofo(tenedores[0], tenedores[i],i,peso); 
               filosofos[i].start();
            }
            */
           
        }
    }
    
}
