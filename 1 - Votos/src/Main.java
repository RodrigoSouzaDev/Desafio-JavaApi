public class Main {

    public static void main(String[] args) {

        Eleicao eleicao = new Eleicao();
        eleicao.setContagem(new Contagem(1000,800,150,50));
        exibirContagem(eleicao);
    }

    private static void exibirContagem(Eleicao eleicao){
        System.out.println(eleicao.totalVotos());
        System.out.println(eleicao.pctVotosValidos());
        System.out.println(eleicao.pctVotosBrancos());
        System.out.println(eleicao.pctVotosNulos());
    }
}
