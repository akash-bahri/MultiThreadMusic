    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
     */
    package multithreadmusic;

    /**
     *
     * @author Akash Bahri
     */

    class Thread1 extends Thread {
        private FilePlayer filePlayer = new FilePlayer();
        private String[] tones = {"do", "mi", "sol", "si"};

        @Override
        public void run() {
            for (String tone : tones) {
//                if("do-octave"==tone)
//                {}
//                else{
            filePlayer.play(tone);
            
                
            }
        }
    }

    class Thread2 extends Thread {
        private FilePlayer filePlayer = new FilePlayer();
        private String[] tones = {"re", "fa", "la", "do-octave"};

        public void run() {
            for (String tone : tones) {

                filePlayer.play(tone);
             
//                
            }
            
        }
    }
    
    
    class Doremi {
        public void play(){
            Thread1 thread1 = new Thread1();
            Thread2 thread2 = new Thread2();
            thread1.start();
            
             try {
            // Adding a slight delay to ensure Thread 1 sasdtarts playing before Thread 2
            Thread.sleep(1000); // Adjust this delay as neededs
        } catch (InterruptedException e) {
        }
            thread2.start();
        } 
        }
   
    public class MultiThreadMusic {
        public static void main(String[] args) {
        
        Doremi d = new Doremi();
        d.play();
        
    }
    }

