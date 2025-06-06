package com.glittersparkle;
import com.birdbrain.Finch;
public class Example {
    public static void main(String[] args){
Finch bird = new Finch();

//
//
bird.playNote(60,0.5);
bird.setBeak(100, 100, 100);
bird.pause(1);
//
//
bird.stop();
bird.disconnect();
    }
}
