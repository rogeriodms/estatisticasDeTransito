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
class Estatistica{	
  int CodigoCidade;	
  String NomeCidade;	
  int QtdAcidentes;	
	
  // Método Construtor	
  Estatistica()
   {	
     this(0 ,"" , 0);	
   }	

  // Método Procedimento
  Estatistica( int gcodigoCidade,	
         String gnomeCidade,	
         int gqtdAcidentes )	
   {	
     CodigoCidade   = gcodigoCidade;	
     NomeCidade  = gnomeCidade;	
     QtdAcidentes  = gqtdAcidentes;	
   }	
 }	

public class ClassePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ClasseMetodos m = new ClasseMetodos();
    Estatistica[ ] estatistica = new Estatistica[10];
    int i;
    for (i = 0 ; i < 10 ; i++){
       estatistica[i] = new Estatistica(); 
    }
     
    int opc = 0;
        do {
         opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro Estatística \n2 - Consulta por quantidade de acidentes \n3 - Consulta por estatísticas de acidentes \n4 - Acidentes acima da média das 10 cidades \n9 - Fim"));
         switch (opc)
              {
                    case 1: estatistica = m.FCADRASTRAESTATISTICA(estatistica);
                                 break;
                    case 2: m.PQTDACIDENTES(estatistica);
                                 break;
                    case 3: m.PMAIORMENOR(estatistica);
                                 break;
                    case 4: m.PACIMA(estatistica);
                                break;
                    case 9: JOptionPane.showMessageDialog(null,"finaliza");
                                 break;
                    default: JOptionPane.showMessageDialog(null,"opc inválida");
              }
        }
        while(opc != 9);
    }
}
