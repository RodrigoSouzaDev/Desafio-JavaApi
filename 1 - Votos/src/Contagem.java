public class Contagem {

    private double totalEleitores;
    private double votosValidos;
    private double votosBrancos;
    private double votosNulos;

    public Contagem(int totalEleitores, int votosValidos, int votosBrancos, int votosNulos) {
        this.setTotalEleitores(totalEleitores);
        this.setVotosValidos(votosValidos);
        this.setVotosBrancos(votosBrancos);
        this.setVotosNulos(votosNulos);
    }

    public double getTotalEleitores() {
        return totalEleitores;
    }

    public void setTotalEleitores(double totalEleitores) {
        this.totalEleitores = totalEleitores;
    }

    public double getVotosValidos() {
        return votosValidos;
    }

    public void setVotosValidos(double votosValidos) {
        this.votosValidos = votosValidos;
    }

    public double getVotosBrancos() {
        return votosBrancos;
    }

    public void setVotosBrancos(double votosBrancos) {
        this.votosBrancos = votosBrancos;
    }

    public double getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(double votosNulos) {
        this.votosNulos = votosNulos;
    }
}
