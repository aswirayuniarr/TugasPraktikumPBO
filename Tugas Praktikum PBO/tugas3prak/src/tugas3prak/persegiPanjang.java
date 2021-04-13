/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3prak;

/**
 *
 * @author Aswira Yuniar
 */
public class persegiPanjang implements hitungBidang
{
    public int panjang;
    public int lebar;
    
    public persegiPanjang(int panjang, int lebar)
    {    
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double Luas()
    {
        return panjang*lebar;
    }
       
    @Override
    public double Keliling()
    {
        return 2*panjang+2*lebar;
    }
}
