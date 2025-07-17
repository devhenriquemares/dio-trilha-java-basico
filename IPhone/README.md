```mermaid
classDiagram
    class IPhone {
        +tocar()
        +pausar()
        +selecionarMusica(musica String)
        +ligar(numero String)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(url String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class AparelhoTelefonico {
        +ligar(numero String)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(url String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica String)
    }

    IPhone ..|> AparelhoTelefonico
    IPhone ..|> NavegadorInternet
    IPhone ..|> ReprodutorMusical
