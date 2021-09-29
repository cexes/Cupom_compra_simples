import javax.swing.JOptionPane;

public class produtos extends teste {
    String [] produtos = new  String[] {"1 - impressora hp = 500.00  ", " 2 - grampiador = 8.00", " 3 - Caderno 10 materias  = 20.00",
"4 - Agenda = 10.00","5 - Estojo = 12.00","6 - Lancheira = 25.00","7 - Lápis de cor 12 - cores = 12.00"," 8 - Messa digitalizadora = 800.00",
" 9 -Mochila = 70.00","10 - Kit de caneta = 54.00"};
    
int decision3, pds;
double t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,soma;
double[] teste = new double[] {500, 8, 20,10,12,25,12,800,70,54};
boolean fasc = true;

     void teste(int b){
     for(int i =0; i<10; i++){
          pds = Integer.parseInt(JOptionPane.showInputDialog(null, produtos));
          if(pds == 0){
            break;
        }   switch(pds){
       
           case 1:{
            soma+= teste[0];
            break;
           }
           case 2:{
             soma += teste[1];
             break;}
            case 3:{
                soma+= teste[2];
                break;
            }
            case 4:{
                soma+= teste[3];
                break;
            }
            case 5:{
                soma += teste[4];
                break;
            }
            case 6:{
                soma += teste[5];
                break;
            }
            case 7:{
                soma+= teste[6];
                break;
            }
          case 8:{
                 soma += teste[7];
                 break;
            } 
          case 9:{
              soma += teste[8];
              break;
          }
          case 10:{
              soma += teste[9];
              break;
          }
}  
}
JOptionPane.showMessageDialog(null, "Total = "+ soma);
}}

    
  
