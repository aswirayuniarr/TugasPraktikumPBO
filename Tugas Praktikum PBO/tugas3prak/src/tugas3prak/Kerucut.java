/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3prak;
import tugas3prak.Lingkaran;

/**
 *
 * @author Aswira Yuniar
 */
public class Kerucut extends Lingkaran implements hitungRuang 
{
    int tinggi;
    
    public Kerucut(int tinggi, int jariJari)
    {
        super(jariJari);
        this.tinggi = tinggi;
    }
    
    @Override   
    public double Volume()
    {
        return Math.PI*jariJari*jariJari*tinggi/3;
    }
    
    @Override
    public double Luaspermukaan()
    {
        float s;
        s = (float) Math.sqrt(jariJari*jariJari+tinggi*tinggi);
        return Math.PI*jariJari*(jariJari+s);
    }
}
