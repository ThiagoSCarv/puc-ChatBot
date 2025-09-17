import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Boolean continua = true;

        System.out.println("Bem vindo ao tutorial básico de comandos linux");

        while (continua) {

            System.out.println("1 - Gerenciamento de Pastas e Arquivos \n " +
                                "2 - Leitura e Edição de Arquivos \n " +
                                "3 - Busca e Filtragem \n " +
                                "4 - Permissões e usúarios \n " +
                                "5 - Pacotes e Serviços \n " +
                                "6 - Entrada e Saída \n " +
                                "7 - Rede \n " +
                                "8 - Para Sair ");

            System.out.print("Escolha uma opção: ");

            Scanner input = new Scanner(System.in);

            String opcao = input.next().toUpperCase().strip();

            if (opcao.equals("8")) {
                System.out.println("Até Mais!");
                break;
            } else if (opcao.equals("1")) {
                while (continua) {
                    System.out.println("Gerenciamento de Pastas e Arquivos");

                    System.out.println("1 - Como listar arquivos em uma pasta? \n " +
                                    "2 - Como mudar de pasta no terminal? \n " +
                                    "3 - Como descubro em qual pasta estou? \n " +
                                    "4 - Como criar uma nova pasta? \n " +
                                    "5 - Como apagar arquivos ou pastas? \n " +
                                    "6 - Como mover ou renomear arquivos? \n " +
                                    "7 - Como copiar arquivos e pastas? \n " +
                                    "8 - Como criar links simbólicos? \n " +
                                    "9 - Para Sair ");

                    System.out.print("Escolha uma opção: ");

                    opcao = input.next().toLowerCase().strip();

                    if (opcao.equals("9")) {
                        break;
                    }

                    switch (opcao) {
                        case "1": {
                            System.out.println("Use ls. Ex.: ls -la mostra arquivos ocultos e detalhes. \n");
                            break;
                        }
                        case "2": {
                            System.out.println("Use cd <diretório>. Ex.: cd .. volta uma pasta; cd ~ vai para a home. \n");
                            break;
                        }
                        case "3": {
                            System.out.println("O comando pwd mostra o caminho da pasta atual. \n");
                            break;
                        }
                        case "4": {
                            System.out.println("Use mkdir nome. Para hierarquias: mkdir -p a/b/c. \n");
                            break;
                        }
                        case "5": {
                            System.out.println("Arquivos: rm arquivo. Pastas: rm -r pasta. Muito cuidado com rm -rf. \n");
                            break;
                        }
                        case "6": {
                            System.out.println("Use mv origem destino. Ex.: mv a.txt b.txt renomeia. \n");
                            break;
                        }
                        case "7": {
                            System.out.println("Use cp origem destino. Para pastas: cp -r pasta destino. \n");
                            break;
                        }
                        case "8": {
                            System.out.println("Use ln -s alvo atalho. \n");
                            break;
                        }
                        default: {
                            System.out.println("Opção inválida! Tente Novamente");
                            break;
                        }
                    }
                }
            } else if (opcao.equals("2")) {
                while (continua) {
                    System.out.println("Leitura e Edição de Arquivos");

                    System.out.println("1 - Como ver rapidamente o conteúdo de um arquivo? \n " +
                            "2 - Como visualizar um arquivo de forma paginada? \n " +
                            "3 - Como editar arquivos no terminal? \n " +
                            "4 - Como substituir texto em arquivos? \n" +
                            "5 - Para Sair");


                    System.out.print("Escolha uma opção: ");

                    opcao = input.next().toLowerCase().strip();

                    if (opcao.equals("5")) {
                        break;
                    }

                    switch (opcao) {
                        case "1": {
                            System.out.println("Use cat arquivo. Para arquivos grandes, prefira less. \n");
                            break;
                        }
                        case "2": {
                            System.out.println("Use less arquivo. Navegue com setas, busque com /texto, saia com q. \n");
                            break;
                        }
                        case "3": {
                            System.out.println("Use nano arquivo (simples) ou vim arquivo (mais avançado). \n");
                            break;
                        }
                        case "4": {
                            System.out.println("Use sed. Ex.: sed 's/antigo/novo/g' arquivo. \n");
                            break;
                        }
                        default: {
                            System.out.println("Opção inválida! Tente Novamente");
                            break;
                        }
                    }
                }
            } else if (opcao.equals("3")) {
                while (continua) {
                    System.out.println("Busca e Filtragem");

                    System.out.println("1 - Como buscar texto dentro de arquivos? \n" +
                            "2 - Como procurar arquivos no sistema? \n" +
                            "3 - Para Sair");

                    System.out.print("Escolha uma opção: ");

                    opcao = input.next().toLowerCase().strip();

                    if (opcao.equals("3")) {
                        break;
                    }

                    switch (opcao) {
                        case "1": {
                            System.out.println("Use grep \"palavra\" arquivo.\n Útil: -i ignora maiúsculas/minúsculas, -r busca recursiva.");
                            break;
                        }
                        case "2": {
                            System.out.println("Use find . -name \"*.txt\". Pode filtrar por -type f (arquivo) ou -type d (pasta).");
                            break;
                        }
                        default: {
                            System.out.println("Opção inválida! Tente Novamente");
                            break;
                        }
                    }
                }
            } else if (opcao.equals("4")) {
                while (continua) {
                    System.out.println("Permissões e Usúarios");

                    System.out.println("1 - Como mudar permissões de arquivos? \n" +
                            "2 - Como entender permissões rwx? \n" +
                            "3 - Como aplicar permissões em pastas recursivamente? \n " +
                            "4 - Como mudar o dono de um arquivo? \n " +
                            "5 - Como criar um novo usuário? \n" +
                            "6 - O que é o sudo? \n" +
                            "7 - Para Sair");

                    System.out.print("Escolha uma opção: ");

                    opcao = input.next().toLowerCase().strip();

                    if (opcao.equals("7")) {
                        break;
                    }

                    switch (opcao) {
                        case "1": {
                            System.out.println("Use chmod. Ex.: chmod +x script.sh dá permissão de execução. \n");
                            break;
                        }
                        case "2": {
                            System.out.println("r = leitura, w = escrita, x = execução.\\n Ex.: 754 → dono rwx, grupo r-x, outros r--. \n");
                            break;
                        }
                        case "3": {
                            System.out.println("Use chmod -R 755 pasta/. \n");
                            break;
                        }
                        case "4": {
                            System.out.println("Use chown. Ex.: sudo chown usuario:grupo arquivo. \n");
                            break;
                        }
                        case "5": {
                            System.out.println("Use sudo adduser nome. Para trocar senha: passwd. \n");
                            break;
                        }
                        case "6": {
                            System.out.println("sudo executa comandos como administrador (root). \n");
                            break;
                        }
                        default: {
                            System.out.println("Opção inválida! Tente Novamente");
                            break;
                        }
                    }
                }
            } else if (opcao.equals("5")) {
                while (continua) {
                    System.out.println("Pacotes e Serviços");

                    System.out.println("1 - Como instalar pacotes no Linux? \n" +
                            "2 - Como iniciar, parar ou verificar serviços? \n" +
                            "3 - Como ver logs de serviços? \n" +
                            "4 - Para Sair");

                    System.out.print("Escolha uma opção: ");

                    opcao = input.next().toLowerCase().strip();

                    if (opcao.equals("4")) {
                        break;
                    }

                    switch (opcao) {
                        case "1": {
                            System.out.println("Debian/Ubuntu: sudo apt install pacote\\n Fedora: sudo dnf install pacote\\n Arch: sudo pacman -S pacote \n");
                            break;
                        }

                        case "2": {
                            System.out.println("Use systemctl. Ex.: systemctl status nginx. \n");
                            break;
                        }
                        case "3": {
                            System.out.println("Use journalctl -u nome.service. \n");
                            break;
                        }
                        default: {
                            System.out.println("Opção inválida! Tente Novamente");
                            break;
                        }
                    }
                }
            } else if (opcao.equals("6")) {
                while (continua) {
                    System.out.println("Entrada e Saída");

                    System.out.println("1 - Como redirecionar saída de comandos? \n" +
                            "2 - Como processar texto em colunas? \n" +
                            "3 - Para Sair");

                    System.out.print("Escolha uma opção: ");

                    opcao = input.next().toLowerCase().strip();

                    if (opcao.equals("3")) {
                        break;
                    }

                    switch (opcao) {
                        case "1": {
                            System.out.println("> sobrescreve\n" +
                                    "\n" +
                                    ">> acrescenta\n" +
                                    "\n" +
                                    "2>&1 une erros com saída\n" +
                                    "\n" +
                                    "| (pipe) encadeia comandos");
                            break;
                        }
                        case "2": {
                            System.out.println("Use awk. Ex.: awk '{print $1}' arquivo imprime a primeira coluna.");
                            break;
                        }
                        default: {
                            System.out.println("Opção inválida! Tente Novamente");
                            break;
                        }
                    }
                }
            } else if (opcao.equals("7")) {
                while (continua) {
                    System.out.println("Rede");

                    System.out.println("1 - Como acessar outro servidor Linux? \n" +
                            "2 - Como copiar arquivos entre máquinas? \n" +
                            "3 - Como baixar arquivos da internet? \n" +
                            "4 - Como ver meu IP e interfaces de rede? \n " +
                            "5 - Como descobrir rota até um servidor? \n" +
                            "6 - Para Sair");

                    System.out.print("Escolha uma opção: ");

                    opcao = input.next().toLowerCase().strip();

                    if (opcao.equals("6")) {
                        break;
                    }

                    switch (opcao) {
                        case "1": {
                            System.out.println("Use ssh usuario@ip. \n");
                            break;
                        }
                        case "2": {
                            System.out.println("Use scp arquivo usuario@ip:/destino.\n Ou rsync -avh origem destino. \n");
                            break;
                        }
                        case "3": {
                            System.out.println("Use wget URL ou curl -LO URL. \n");
                            break;
                        }
                        case "4": {
                            System.out.println("Use ip a. \n");
                            break;
                        }
                        case "5": {
                            System.out.println("Use traceroute site.com ou tracepath site.com. \n");
                            break;
                        }
                        default: {
                            System.out.println("Opção inválida! Tente Novamente");
                            break;
                        }
                    }
                }
            }
        }
     }
}