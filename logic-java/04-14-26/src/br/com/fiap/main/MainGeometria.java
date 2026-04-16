package br.com.fiap.main;

import br.com.fiap.bean.Geometria;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Geometria geo = new Geometria();
        
        float lado, altura;
        double raio;
        int area;
        String escolha = "sim";

        while(escolha.equalsIgnoreCase("sim")) {
            try {
                area = Integer.parseInt(JOptionPane.showInputDialog("Qual área você deseja calcular?\n1. Quadrado\n2. Retângulo\n3. Cículo"));
                switch(area) {
                    case 1:
                        lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado:"));
                        geo.calcularArea(lado);
                        break;
                    case 2:
                        lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado:"));
                        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura:"));
                        geo.calcularArea(lado, altura);
                        break;
                    case 3:
                        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio:"));
                        geo.calcularArea(raio);
                        break;
                    default:
                        throw new Exception("Escolha inválida!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado!");
    }
}
