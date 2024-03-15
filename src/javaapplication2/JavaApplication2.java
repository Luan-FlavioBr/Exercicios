package javaapplication2;

import javax.swing.JOptionPane;

public class JavaApplication2 {
    public static void main(String[] args) {
        ex02();
     }
    
    public static void ex01(){
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
        float n3 = n1+n2;
        
        JOptionPane.showMessageDialog(null, n3);
    }
    
    public static void ex02(){
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Informe seu salário: R$"));
        double desconto = 0;
        
        if(salario <= 1412){
            desconto = 0.075 * salario;
            JOptionPane.showMessageDialog(null, desconto);     
        } else if(salario > 1412 && salario <= 2666.68){
            desconto = 0.09 * salario;
            JOptionPane.showMessageDialog(null, desconto);     
        } else if(salario <= 4000.03){
            desconto = 0.12 * salario;
            JOptionPane.showMessageDialog(null, desconto);     
        } else if(salario <= 7786.02){
            desconto = 0.15 * salario;
            JOptionPane.showMessageDialog(null, desconto);     
        }
        
    }
}
