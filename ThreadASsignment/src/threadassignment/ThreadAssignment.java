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
public class ThreadAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable countEvens = new Count(0);
        Runnable countOdds = new Count(1);
        Runnable displayProgress = new PrintProgress("running...");

        
        
        Thread thread1 = new Thread(countEvens);
        Thread thread2 = new Thread(countOdds);
        Thread thread3 = new Thread(displayProgress);
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        try{
            thread1.join();
            thread2.join();
        }
        catch(Exception e){
            ;
        }
        ((PrintProgress)displayProgress).done(true);
        
        System.out.println("\n All Finished!");

        
        
        

    }
    
}
