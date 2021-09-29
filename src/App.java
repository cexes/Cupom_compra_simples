import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
    produtos pc = new produtos();
    teste pp = new teste();
       int decision,decision2;
         JOptionPane.showMessageDialog(null,"Parabéns, você ganhou um cupom, você tem direito a 1 produto!!");
            decision = Integer.parseInt(JOptionPane.showInputDialog(null,"Para continuar com o seu prêmio aperte (1) caso o contrário tecle (2)"));
                
          if(decision ==1){
                        pp.carri(0);
                          decision2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja ver o que escolheu 1 para sim e 2 para não"));   
                        if(decision2 == 1){
                             JOptionPane.showMessageDialog(null, pp.car);}
                             pc.decision3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja fazer mais compras  1 - sim, 2 - não"));

                             switch (pc.decision3){
                                case 1:
                                JOptionPane.showMessageDialog(null,"Para escolher o produto basta digitar  a tecla correspondente,caso queira cancelar so apetar 0 a qualquer momento");
                               pc.teste(0);
                                break;
                                case 2:
                                 JOptionPane.showMessageDialog(null, "Obrigado *-*");
                             }
                        if(decision2 == 2){
                             JOptionPane.showMessageDialog(null, "Obrigado *-*");
                            }

              }
              else{ 
               JOptionPane.showMessageDialog(null, "Obrigado *-*");
          }
}
}