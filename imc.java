package imc;
 
import javax.swing.JOptionPane;
 
 
public class IMC {
 
   
    public static void main(String[] args) {
     
        double peso, altura, imc;
        String respAltura;
        String respPeso;
               
        respAltura = JOptionPane.showInputDialog ("Digite sua altura: ");
        altura = Double.parseDouble(respAltura);
        respPeso = JOptionPane.showInputDialog ("Digite o seu peso: ");
        peso = Double.parseDouble(respPeso);
       
        imc = peso / (altura * altura);
 
        if(imc < 17) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Você está Muito Abaixo do Peso!");
    }
        if(imc >= 17 && imc <= 18.49 ) {
           JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Você está Abaixo do Peso!");
    }
        if(imc > 18.50 && imc <= 24.99) {
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Seu peso está normal!");
    }
        if(imc >= 25 && imc <= 29.99){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Você está acima do peso!");
    }
        if(imc >= 30 && imc <= 34.99){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Obesidade nível 1!");
    }
        if(imc >= 35 && imc <= 39.99){
             JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Obesidade nível 2, Severa!");
    }
        if(imc >= 40){
             JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc + "\n" + "Obesidade nível 3, Mórbida!");
    }
  }
}
