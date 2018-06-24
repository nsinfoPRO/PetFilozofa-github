/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filozofi;

/**
 *
 * @author Nenad
 */
// Stapic za jelo. */
public class Stapic {
// Status stapica. */

    private boolean free;
// Stapic je inicijalno slobodan. */

    public Stapic() {
        free = true;
    }
// Stapic se koristi. */

    public synchronized void take() {            // synchronized metodu koristimo posto je nas objekat
        try {                                    //vidljiv za vise od jednog thread-a,koji istovremeno 
            while (!free) {
                wait();
            }
        } catch (Exception ex) {
        }
        free = false;
    }
// Stapic se oslobadja. */

    public synchronized void release() {          
        free = true;                             // thread-ove koji cekaju na ovaj objekat
        notify();                                // notify() metoda klase Obјеct,obavestava sve
    }
}
