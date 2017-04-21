package edu.up.cs301threadslab;

/**
 * Created by luchini18 on 4/20/2017.
 */
public class AddRemoveStarThread extends Thread {
    private StarAnimation starAnimation;

    public AddRemoveStarThread(StarAnimation initAnim){
        starAnimation = initAnim;
    }

    @Override
    public void run() {
      synchronized (starAnimation) {
          double rand = Math.random();
          if (rand > 0.5) {
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
              starAnimation.addStar();
          } else {
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
              starAnimation.removeStar();
          }

          try {
              Thread.sleep(2);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }
}
