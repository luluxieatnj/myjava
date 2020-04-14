package com.xll.threadtest.tltest;

import java.util.Random;

public class MyThread implements Runnable {
    private static ThreadLocal<GamePic> tl = new ThreadLocal();

    @Override
    public void run() {
        GamePic gamePic = getGamePic();

        System.out.println(Thread.currentThread().getName() + "---" + gamePic.toString());
    }

    public GamePic getGamePic() {
        GamePic gamePic = tl.get();
        if (gamePic == null) {
            gamePic = new GamePic(new Random().nextInt(100));
            tl.set(gamePic);
        }
        return gamePic;
    }
}
