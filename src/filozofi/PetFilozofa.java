
package filozofi;

/**
 *
 * @author Nenad
 */
public class PetFilozofa {

    public static void main(String[] args) {
        Stapic[] sticks = new Stapic[5];
        for (int i = 0; i < 5; i++) {
            sticks[i] = new Stapic();
        }
        Filozof a = new Filozof(1, sticks[4], sticks[0]);
        Filozof b = new Filozof(2, sticks[0], sticks[1]);
        Filozof c = new Filozof(3, sticks[1], sticks[2]);
        Filozof d = new Filozof(4, sticks[2], sticks[3]);
        Filozof e = new Filozof(5, sticks[3], sticks[4]);
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        try {

            Thread.sleep(2000);                       //pravi razmak od 2 ms
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println(a);                       //stampa na konzoli 
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
    }
}
