package br.upf.appaula.domain;

public class ArCondicionado {

    private Integer serialId;
    private Boolean ligado;
    private String modo;
    private Integer temperatura;
    
    public ArCondicionado(){
        ligado = false;
        temperatura = 26;
        modo = "auto";
    }
    public void ligar() throws Exception {
        if (ligado){
            throw new Exception("O aparelho já está ligado");
        }    
        ligado = true;
    }
    public void desligar() throws Exception {
        ligado = false;
    }
    public void alterarModo(String modo) throws UnsupportedOperationException {
        if (modo.equals("Aquecer")){
            this.modo = "Aquecer";
        }
        else if (modo.equals("Auto")){
            this.modo = "Auto";
        }
        else if (modo.equals("Resfriar")){
            this.modo = "Resfriar";
        }
        else if (modo.equals("Desumidificar")){
            this.modo = "Desumidificar";
        }
        else {
            throw new UnsupportedOperationException("Operação não permitida");
        }
    }
    public void aumentarTemperatura() throws Exception {
        if (temperatura == 30) {
            throw new Exception ("Temperatura está no máximo");
        }
        this.temperatura++;
        
    }

    public Integer getSerialId() {
        return serialId;
    }

    public void setSerialId(Integer serialId) {
        this.serialId = serialId;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }
   
}
    

