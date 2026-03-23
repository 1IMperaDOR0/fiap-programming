package br.com.fiap.bean;

public class ArCondicionado {
    private int temperatura;
    private String modo;

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        try {
            if (temperatura >= 15 && temperatura <= 26) {
                this.temperatura = temperatura;
            } else {
                this.temperatura = 15;
                throw new RuntimeException("Temperatura fora do range! (min = 15 e max = 26)");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        try {
            if(modo.equals("Ventilar") || modo.equals("Aquecer") || modo.equals("Resfriar")) {
                this.modo = modo;
            } else {
                this.modo = "Ventilar";
                throw new RuntimeException("Modo inexistente! Os modos disponíveis são: Ventilar, Aquecer e Resfriar.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void aumentarTemperatura() {
        try {
            if (temperatura >= 15 && temperatura < 26) {
                temperatura++;
            } else {
                throw new RuntimeException("Temperatura fora do range! (min = 15 e max = 26)");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void diminuirTemperatura() {
        try {
            if (temperatura > 15 && temperatura <= 26) {
                temperatura--;
            } else {
                throw new RuntimeException("Temperatura fora do range! (min = 15 e max = 26)");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
