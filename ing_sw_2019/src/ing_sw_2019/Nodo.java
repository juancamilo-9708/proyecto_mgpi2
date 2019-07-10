/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ing_sw_2019;

/**
 *
 * @author JuanCamilo
 */
public class Nodo {
    
private int inf;
    private Nodo sig;
    
    public Nodo(int Dato)
    {
        this.inf=Dato;
        this.sig=null;
    }

    public int getInf() {
        return inf;
    }

    public void setInf(int inf) {
        this.inf = inf;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
}
