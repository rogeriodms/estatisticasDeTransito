/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatisticasDeTransito;
import javax.swing.JOptionPane;
/**
 *
 * @author Rogerio
 */
public class ClasseMetodos {
    public Estatistica[] FCADRASTRAESTATISTICA(Estatistica[] estatistica)
    {
        int  i;
        for(i = 0 ; i<10 ; i++) {
            estatistica[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da cidade " + (i+1)));
            estatistica[i].NomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade " + (i+1));
            estatistica[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes " + (i+1)));
        }
      
        return estatistica;
    }
    
    public void PQTDACIDENTES(Estatistica[] estatistica){
    
        int  i;
        for(i = 0 ; i<10 ; i++){
            if(estatistica[i].QtdAcidentes > 100 &&  estatistica[i].QtdAcidentes < 500){
             System.out.println("nome: " + estatistica[i].CodigoCidade + "nome: " + estatistica[i].NomeCidade + " acidente: " + estatistica[i].QtdAcidentes);
            }
        }
    }
    public void PMAIORMENOR(Estatistica[] estatistica){
    
        int max = estatistica[0].QtdAcidentes;
        int min = estatistica[0].QtdAcidentes;
        
        int  i;
        for(i = 0 ; i<10 ; i++){
            if(estatistica[i].QtdAcidentes > max){
                max = estatistica[i].QtdAcidentes;
            }
        }
        for(i = 0 ; i<10 ; i++){
            if(estatistica[i].QtdAcidentes < min){
                max = estatistica[i].QtdAcidentes;
            }
        }
        for(i = 0 ; i<10 ; i++){
            if(estatistica[i].QtdAcidentes == max){
                System.out.println("nome: " + estatistica[i].CodigoCidade + "nome: " + estatistica[i].NomeCidade + " acidente: " + estatistica[i].QtdAcidentes);
            }
        }
    }
    public void PACIMA(Estatistica[] estatistica){
    
        double qtd = 0;
        int  i;
        for(i = 0 ; i<10 ; i++){
            qtd = qtd + estatistica[i].QtdAcidentes;
        }
        qtd = qtd /10;
        for(i = 0 ; i<10 ; i++){
            if(estatistica[i].QtdAcidentes > qtd){
                System.out.println("nome: " + estatistica[i].CodigoCidade + "nome: " + estatistica[i].NomeCidade + " acidente: " + estatistica[i].QtdAcidentes);
            }
        }
    }
}
