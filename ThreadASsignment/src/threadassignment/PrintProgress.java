/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadassignment;

/**
 *
 * @author Kyle
 */
 public class PrintProgress implements Runnable{
    public String message;
    public  volatile  boolean done = false;
    
    public PrintProgress(String message){
        this.message = message;
    }
    
    public void run(){
        print();
    }
    
    public void  print(){
        while(!done){
            try{
                System.out.println("\n" + message);
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                ;
            }
        }

    }
    
    public void done(boolean isdone){
        done = isdone;
    }
}
