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

    public synchronized void take() {
        try {
            while (!free) {
                wait();
            }
        } catch (Exception ex) {
        }
        free = false;
    }
// Stapic se oslobadja. */

    public synchronized void release() {
        free = true;
        notify();
    }
}
