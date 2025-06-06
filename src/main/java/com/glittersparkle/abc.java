package com.glittersparkle;
import com.birdbrain.Finch;

public class abc {
    public static void main(String[] args) {
        Finch bird = new Finch();//instantiates

        bird.setBeak(0, 100, 0);//green
        bird.setTail("all", 0, 100, 0);//make all tail lights turn on green  
        bird.setMotors(50, -50);//left wheel move forward, right backwards, spins
        bird.pause(2);//wait
        bird.stop();//make sure its stopped

        bird.setMotors(-30, 30);//SPOM
        bird.pause(1);
        bird.setMotors(30, 30);//spin both wheels forwards
        bird.pause(1); //wait

        bird.setMotors(30, -30);//right wheel move forward, left backwards, spins
        bird.setTail("all", 100, 0, 0);//make all tail lights turn on red  
        bird.pause(1);
        bird.setMotors(-30, 30);//move backwards
        bird.pause(2); //wait
        bird.stop();//makes sure its stopped

        bird.setBeak(100, 15, 80);//pinkish

        int[] pattern = {2,2,2,2,1,1,2,2,2,1,1,2,2,1,1,2,2};
        for (int i = 0; i < 4; i++) {//for loop to make it go 4 times
            bird.setTail("all", 100, 100, 100);//make all tail lights turn on  
            bird.playNote(58, 1);//play note 68
            bird.pause(0.5);//wait
            bird.setTail("all", 0, 0, 0);//make all tail lights turn off
            bird.playNote(78, 1);//play note 99
            bird.pause(0.5);//wait
        }

        bird.setBeak(100, 0, 0);//change beak color
        bird.pause(0.3);//wait
        bird.setBeak(0, 0, 100);//change beak color
        bird.playNote(90, 0.2);//play note 
        bird.pause(0.2);//wait
        // Flash individual tail lights
        bird.setTail(1, 100, 0, 0);//change tail clor spot 1
        bird.playNote(80, 0.2);//play note 
        bird.pause(0.2);//wait
        bird.setTail(2, 0, 100, 0);//change tail color spot 2
        bird.playNote(70, 0.2);//play note 
        bird.pause(0.2);//wait
        bird.setTail(3, 0, 0, 100);//change tail color spot 3
        bird.playNote(60, 0.2);//play note 
        bird.pause(0.2);//wait
        bird.setTail(4, 100, 100, 0);//change tail color spot 4
        bird.playNote(50, 0.2);//play note 
        bird.pause(0.2);//wait
        bird.setTurn("R", 250, 100); //spin around 190degrees
        bird.print("Kai and Caras Finch");//message
        bird.pause(11);//shorter wait, keep tempo
        bird.setMotors(60, 60);//spin both wheels forwards
        bird.pause(1);//wait
        bird.setMotors(-60, -60);//spins both wheels backwards
        bird.pause(1);//wait
        bird.stop();
        bird.setMotors(100, -100);//spins 
        bird.pause(0.5);//wait
        bird.setMotors(-100, 100);//spins 
        bird.pause(0.5);//wait
        bird.playNote(87, 1);//play note
        bird.pause(1);
        bird.playNote(72, 1);//play note
        bird.pause(1);
        bird.playNote(45, 1);//play note
        bird.pause(1);
        bird.playNote(87, 1);//play note
        bird.pause(1);
        bird.setBeak(0, 50, 100);//change the color
        bird.pause(0.5);//wait
        bird.playNote(72, 1);//play note
        bird.pause(1);
        bird.playNote(75, 2);//play note
        bird.pause(2);
        bird.playNote(79, 1);//play note 
        bird.playNote(75, 2);//play note
        bird.pause(2);
        bird.playNote(79, 1);//play note
        bird.pause(1);
        //now I make a light show
        bird.pause(0.2);//wait
        bird.setTail(4, 100, 100, 0);//change tail color spot 4
        bird.playNote(45, 1);//play note 
        bird.pause(0.2);//wait
        bird.setTail(3, 0, 0, 100);//change tail color spot 3
        bird.playNote(65, 1);//play note 
        bird.pause(0.2);//wait
        bird.setTail(2, 0, 100, 0);//change tail color spot 2
        bird.playNote(85, 1);//play note 
        bird.pause(0.2);//wait
        bird.setTail(1, 100, 0, 0);//change tail clor spot 1
        bird.playNote(100, 1);//play note 

        bird.setMotors(100, -100);//spins 
        bird.playNote(87, 0.5);//play note 
        bird.pause(0.5);
        bird.playNote(55, 0.5);//play note 
        bird.pause(0.5);
        bird.playNote(45, 0.5);//play note 
        bird.pause(0.5);
        bird.setTurn("L", 160, 100); //spin around 90 degrees
        bird.print("This is the end!!!");// print message
        bird.pause(2);
        for (int i = 0; i < 4; i++) {//for loop to make it go 4 times
            bird.setTail("all", 100, 100, 100);//make all tail lights turn on  
            bird.pause(0.5);//wait
            bird.setTail("all", 0, 0, 0);//make all tail lights turn off
            bird.pause(0.5);//wait
        }
bird.playNote(100, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(90, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(80, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(90, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(100, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(100, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(100, 0.8); // play note 99
bird.pause(0.8);
bird.playNote(90, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(90, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(90, 0.8); // play note 99
bird.pause(0.8);
bird.playNote(100, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(110, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(110, 0.8); // play note 99
bird.pause(0.8);
bird.playNote(100, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(90, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(80, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(90, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(100, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(100, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(100, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(90, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(80, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(80, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(90, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(80, 0.3); // play note 99
bird.pause(0.3);
bird.playNote(70, 0.8); // play note 99
bird.pause(0.8);
        bird.stopAll();
        bird.disconnect();
    }
}
