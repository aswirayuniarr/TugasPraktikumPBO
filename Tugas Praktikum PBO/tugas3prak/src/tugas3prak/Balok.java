/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3prak;
import tugas3prak.persegiPanjang;
/**
 *
 * @author Aswira Yuniar
 */
public class Balok extends persegiPanjang implements hitungRuang
{
    int tinggi;
    public Balok(int panjang, int lebar, int tinggi)
    {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double Volume()
    {
        return panjang*lebar*tinggi;
    }
    
    @Override
    public double Luaspermukaan()
    {
        double luaspermukaanbalok;
        luaspermukaanbalok = (2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi);
        return luaspermukaanbalok;
    }
}
