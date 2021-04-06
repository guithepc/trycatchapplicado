/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4e03;

/**
 *
 * @author guigu
 */
public class Veiculo {
    private int velocidade = 0;
    private int velocidadeMax = 100;

    public Veiculo(int velocidade) {
        this.velocidade = velocidade;
        
    }

    
    
    
    
    public int getVelocidade(){
    return this.velocidade;
    }
    
    
    public int getVelocidadeMax(){
    return this.velocidadeMax;
    }
    
    
    public void acelera(int incremento) throws MuitoRapido{
    
        if(velocidade + incremento > velocidadeMax){
            throw new MuitoRapido("tá louco mano?");
        }else{
        velocidade += incremento;
        }
    }
    
    public void desacelara(int decremento) throws AceleracaoNegativa{
    if(velocidade - decremento < 0){
        throw new AceleracaoNegativa("Einstein... quabrou a física");
    }
    else
    {
    velocidade -= decremento;
    }
    }
   
}
