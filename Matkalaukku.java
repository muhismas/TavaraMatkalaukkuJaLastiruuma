
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
public class Matkalaukku {
    private ArrayList<Tavara> tavarat;
    private int maksimipaino;
    
    public Matkalaukku(int maksimipaino){
        this.tavarat = new ArrayList<>();
        this.maksimipaino = maksimipaino;
    }
    
    public void lisaaTavara(Tavara tavara){
        if(this.yhteispaino()+tavara.getPaino()<=this.maksimipaino){
            this.tavarat.add(tavara);
        }
    }
    
    public void tulostaTavarat() {
        for(Tavara tavara : tavarat){
            System.out.println(tavara.getNimi()+"("+tavara.getPaino()+" kg)");
        }
    }
    
    public int yhteispaino(){
        int yhteispaino=0;
        for(Tavara tavara : this.tavarat){
            yhteispaino += tavara.getPaino();
        }
        return yhteispaino;
    }
    
    public Tavara raskainTavara() {
        if(this.tavarat.isEmpty()){
            return null;
        }
        Tavara raskain = this.tavarat.get(0);
        for (int i=0; i<this.tavarat.size()-1; i++){
            if(raskain.getPaino()<this.tavarat.get(i+1).getPaino()){
                raskain = this.tavarat.get(i+1);
            }
        }
        return raskain;
    }
    
    public String toString() {
        if(this.tavarat.size()==0){
            return "ei tavaroita (0kg)";
        }
        if(this.tavarat.size()==1){
            return "1 tavara ("+yhteispaino()+"kg)";
        }
        
        return this.tavarat.size()+" tavaraa("+yhteispaino()+"kg)";
        
    }

    
}
