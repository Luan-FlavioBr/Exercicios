package javaapplication2;

import javax.swing.JOptionPane;

public class JavaApplication2 {
    public static void main(String[] args) {
        //JOptionPane.show
        ex04();
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
    
    public static void ex03(){
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Informe seu salário: R$"));
        double desconto = 0;
        String mensagem;
        
        if(salario <= 2259.20){
            desconto = 0;
            mensagem = String.format("O desconto do INSS do funcionário %s\n"
                    + "foi de R$%.2f", nome, desconto);
            JOptionPane.showMessageDialog(null, mensagem);     
        } else if(salario > 2259.20 && salario <= 2826.65){
            desconto = 0.075 * salario;
            mensagem = String.format("O desconto do INSS do funcionário %s\n"
                    + "foi de R$%.2f", nome, desconto);
            JOptionPane.showMessageDialog(null, mensagem);     
        } else if(salario <= 3751.05){
            desconto = 0.15 * salario;
            mensagem = String.format("O desconto do INSS do funcionário %s\n"
                    + "foi de R$%.2f", nome, desconto);
            JOptionPane.showMessageDialog(null, mensagem);     
        } else if(salario <= 4664.68){
            desconto = 0.2255 * salario;
            mensagem = String.format("O desconto do INSS do funcionário %s\n"
                    + "foi de R$%.2f", nome, desconto);
            JOptionPane.showMessageDialog(null, mensagem);     
        } else {
            desconto = 0.275 * salario;
            mensagem = String.format("O desconto do INSS do funcionário %s\n"
                    + "foi de R$%.2f", nome, desconto);
            JOptionPane.showMessageDialog(null, mensagem);     
        }     
    }
    
    public static void ex04(){
        int diasInformados = Integer.parseInt(JOptionPane.showInputDialog("Informe seu salário: R$")); 
        int anos, meses, dias;
        
        System.out.println(diasInformados / 365.0);
    }
}
