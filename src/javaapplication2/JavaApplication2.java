package javaapplication2;

import javax.swing.JOptionPane;

public class JavaApplication2 {
    public static void main(String[] args) {
        // Opções do menu dropdown
        String[] options = {"Ex01", "Ex02", "Ex03", "Ex04"};

        // Exibe o menu dropdown e obtém a opção selecionada pelo usuário
        String selectedOption = (String) JOptionPane.showInputDialog(null, 
                                    "Selecione uma opção:", "Menu Dropdown", 
                                    JOptionPane.QUESTION_MESSAGE, null, 
                                    options, options[0]);

        // Verifica a opção selecionada e executa a ação correspondente
        if (selectedOption != null) {
            switch (selectedOption) {
                case "Ex01":
                    ex01();
                    break;
                case "Ex02":
                    ex02();
                    break;
                case "Ex03":
                    ex03();
                    break;
                case "Ex04":
                    ex04();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } else {
            // Caso o usuário tenha cancelado a seleção
            JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada");
        }
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
        int diasInformados = Integer.parseInt(JOptionPane.showInputDialog("Informe os dias: ")); 
        int anos, meses, dias;
        
        anos = diasInformados / 365;
        
        diasInformados %= 365;
        meses = diasInformados / 30;
        
        diasInformados %= 30;
        dias = diasInformados;
        
        String mensagem = String.format("Anos: %d \nMeses: %d"
                + "\nDias: %d", anos, meses, dias);
        JOptionPane.showMessageDialog(null, mensagem);
             
    }
}
