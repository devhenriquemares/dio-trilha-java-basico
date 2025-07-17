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

    interface AparelhoTelefonico {
        +ligar(numero String)
        +atender()
        +iniciarCorreioVoz()
    }

    interface NavegadorInternet {
        +exibirPagina(url String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    interface ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica String)
    }

    IPhone ..|> AparelhoTelefonico
    IPhone ..|> NavegadorInternet
    IPhone ..|> ReprodutorMusical
