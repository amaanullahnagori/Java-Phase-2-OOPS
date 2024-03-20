//package com.company;

 class AnnonymusDemo {
    public static void main(String[] args) {

        Hel h=new Hel();
        h.out();

    }
}
interface P1
{
    void display();
}
class Hel {
    public void out() {
        P1 p = new P1() {                    //annoymus class
            @Override
            public void display() {
                System.out.println("anonymous display");
            }

        };
        p.display();
    }
}

