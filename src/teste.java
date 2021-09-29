import javax.swing.JOptionPane;

public class teste{
   int passage,cont, t1,t2,t3,t4,t5,t6,t7;
    String [] car  =  new String [7];
             void carri(int carri){
                   for(int i = 1; i<2; i++){
              passage = Integer.parseInt(JOptionPane.showInputDialog(null,"Para o " + i +
                  " Item, digite o número correspondido ao que deseja" 
               + "\n1 - Pacote de lápis" +
                  "\n2 - Apontador elétrico"
               + "\n 3 - Borracha limpa tipo" 
               + "\n4 - 70 folhas de sulfite" 
               + "\n5 - Grampiador " 
               + "\n6 - Caneta Estabilo preta"
               + "\n 8 - Agenda com 100 folhas" + "\n 10 - Para sair")); 
            if(passage ==10){

                 JOptionPane.showMessageDialog(null, "Obrigado *-*");
                  break;
         }

         switch(passage){
               case 1:{    
            car [0] = "Pacote com lápis";
                break;}
               case 2:{
            car[1] = "Apontador elétrico";
                 break;}
      
              case 3:{
               car[2] ="Borracha limpa tipo";
               break;}
         
             case 4:{
         car[3] = "70 folhas";}
            break;
            case 5:{
         car[4] ="Grampeador";
            break;}
         
           case 6:{
         car[5] ="Caneta estabilo preta";
            break;}

           case 7:{
              car[6] ="Agenda com 100 folhas";
              break;}
              
      }
}
}

}

    
        
 
    
  


  

