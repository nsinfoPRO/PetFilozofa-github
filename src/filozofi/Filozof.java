/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filozofi;

import static java.lang.Thread.yield;

/**
 *
 * @author Nenad
 */
public class Filozof extends Thread {

    private int index;
    private Stapic levi;
    private Stapic desni;
    private int statistikajela;

    public Filozof(int index, Stapic left, Stapic right) {
        this.index = index;
        this.levi = left;
        this.desni = right;
        statistikajela = 0;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            levi.take();
            desni.take();
            statistikajela++;
            levi.release();
            desni.release();
            yield();
        }
    }

    public String toString() {
        return ("[" + index + "] filozof je jeo [" + statistikajela + "]" + "puta");
    }
}
