
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s1901557
 */
public class Lastiruuma {
    private int maksimipaino;
    private ArrayList<Matkalaukku> matkalaukut;
    
    public Lastiruuma(int maksimipaino){
        matkalaukut = new ArrayList<>();
        this.maksimipaino = maksimipaino;
    }   
    
    public void lisaaMatkalaukku(Matkalaukku matkalaukku){
        if(this.yhteispaino()+matkalaukku.yhteispaino()<=this.maksimipaino){
            matkalaukut.add(matkalaukku);
        }
    }
    
    public int yhteispaino(){
        int yhteispaino = 0;
        for(Matkalaukku matkalaukku : matkalaukut){
            yhteispaino += matkalaukku.yhteispaino();
        }
        return yhteispaino;
    }
    
    public void tulostaTavarat() {
        for(Matkalaukku matkalaukku : matkalaukut){
            matkalaukku.tulostaTavarat();
        }
    }
    
    public String toString() {
        if(this.matkalaukut.size()<1){
            return "ei matkalukkuja (0 kg)";
        } else if(this.matkalaukut.size()==1){
            return "1 matkalaukku ("+this.yhteispaino() +" kg)";
        } else {
            return this.matkalaukut.size()+" matkalaukkua ("+this.yhteispaino()+" kg)";
        }
    }
}
