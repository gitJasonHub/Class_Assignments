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
public class Count implements Runnable {
    public int startNum;
    
    public Count(int startn){
        startNum = startn;
    }
    
    public void run(){
        count();
    }
    
    public void count(){
        for(int i = startNum; i < 101; i+=2){
            System.out.print(i + " ");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                ;
            }
        }
    }
}
