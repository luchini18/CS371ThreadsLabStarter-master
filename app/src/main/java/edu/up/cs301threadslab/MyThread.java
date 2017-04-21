package edu.up.cs301threadslab;

/**
 * Created by luchini18 on 4/20/2017.
 */
public class MyThread extends Thread {
    private AnimationView myAV;

    public MyThread(AnimationView initAV){
        myAV = initAV;
    }

    @Override
    public void run() {

        for(;;){
            myAV.postInvalidate();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
