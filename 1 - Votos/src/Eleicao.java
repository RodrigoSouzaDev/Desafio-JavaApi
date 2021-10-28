public class Eleicao {

    private Contagem contagem;

    public void setContagem(Contagem contagem) {
        this.contagem = contagem;
    }

    public String totalVotos(){

        return "Total de votos da eleição = " + (int)contagem.getTotalEleitores();
    }

    public String pctVotosValidos() {
        double pctVotosValidos = (contagem.getVotosValidos() / contagem.getTotalEleitores()) * 100;
        return "Votos Válidos = " + pctVotosValidos + " %";
    }

    public String pctVotosBrancos() {
        double pctVotosBrancos = (contagem.getVotosBrancos() / contagem.getTotalEleitores()) * 100;
        return "Votos Brancos = " + pctVotosBrancos + " %";

    }

    public String pctVotosNulos() {
        double pctVotosNulos = (contagem.getVotosNulos() / contagem.getTotalEleitores()) * 100;
        return "Votos Nulos = " + pctVotosNulos + " %";
    }

}
