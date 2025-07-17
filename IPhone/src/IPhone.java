public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void tocar() {
        System.out.println("Música tocando");
    }
    public void pausar() {
        System.out.println("Música pausada");
    }
    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada");
    }

    public void ligar(String numero) {
        System.out.println("IPhone está ligando para o número " + numero);
    }
    public void atender() {
        System.out.println("Atendendo");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
}
