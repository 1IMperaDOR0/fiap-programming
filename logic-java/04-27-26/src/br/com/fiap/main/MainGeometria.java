package br.com.fiap.main;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

import javax.swing.*;

public class MainGeometria {

    public static void main(String[] args) {
        String aux,escolha ="sim";
        float lado, altura, areaCalculada;
        int opcao;

        while (escolha.equalsIgnoreCase("sim")){
            try {
                aux = JOptionPane.showInputDialog("Qual poligono você deseja calcula a area?\nn1 Quadrado\nn2 Retangulo\nn3 Traingulo");
                opcao = Integer.parseInt(aux);
                switch (opcao){
                    case 1:
                        aux = JOptionPane.showInputDialog("digite o valor para o lado de seu poligono");
                        lado = Float.parseFloat(aux);
                        Quadrado quad = new Quadrado(lado);
                        areaCalculada = quad.calcularArea();
                        JOptionPane.showMessageDialog(null,"Area do QUadrado: " + areaCalculada);
                        break;
                    case 2:
                        aux = JOptionPane.showInputDialog("digite o valor para o lado de seu poligono");
                        lado = Float.parseFloat(aux);
                        aux = JOptionPane.showInputDialog("digite o valor para a altura de seu poligono");
                        altura = Float.parseFloat(aux);
                        Retangulo ret = new Retangulo(lado, altura);
                        areaCalculada = ret.calcularArea();
                        JOptionPane.showMessageDialog(null,"Area do Retangulo: " + areaCalculada);
                        break;
                    case 3:
                        aux = JOptionPane.showInputDialog("digite o valor para o lado de seu poligono");
                        lado = Float.parseFloat(aux);
                        aux = JOptionPane.showInputDialog("digite o valor para a altura de seu poligono");
                        altura = Float.parseFloat(aux);
                        Triangulo triang = new Triangulo(lado, altura);
                        areaCalculada = triang.calcularArea();
                        JOptionPane.showMessageDialog(null,"Area do Triangulo: " + areaCalculada);
                        break;
                    default:

                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null,"fim do programa");
    }
}

