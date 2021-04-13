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
public class Lingkaran implements hitungBidang
{
    public int jariJari;
        public Lingkaran(int jari)
        {
            this.jariJari = jariJari;
        }
    
        @Override
        public double Luas()
        {
            return Math.PI*jariJari*jariJari;
        }
    
        @Override
        public double Keliling()
        {
            return Math.PI*2*jariJari;
        }
    }
