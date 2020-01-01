package com.yichen.thinking.in.java.chapter10.exercise14;

public class Ch10ex14 {
    public static void main(String[] args) {
        DangerousMonster dangerousMonster = new DangerousMonster() {
            @Override
            public void destroy() {

            }

            @Override
            public void menace() {

            }
        };
        HorrorShow.u(dangerousMonster);
        HorrorShow.v(dangerousMonster);

        Vampire vampire = new Vampire() {
            @Override
            public void drinkBlood() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void menace() {

            }
        };

        HorrorShow.u(vampire);
        HorrorShow.v(vampire);
        HorrorShow.w(vampire);
    }
}
