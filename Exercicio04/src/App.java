public class App {
    public static void main(String[] args) throws Exception {
        /* Adicionando livros */
        /* Utilizando metodo empilhar */
        Pilha<Livros> pilha = new Pilha<>(1);
        pilha.empilhar(new Livros("Ladrao de Raios", "0000 - 1111 - 2222 - 3333", "01/02/2003", "Zeus de Olynpus"));

        pilha.empilhar(new Livros("Senhor dos Aneis", "1111 - 2222 - 3333 - 4444", "Uzam Bolt", "02/03/2004"));

        pilha.empilhar(new Livros("Herry Pottter", "3333 - 4444 - 5555 - 6666", "03/04/2004", "Carlinhos Beow"));

        pilha.empilhar(new Livros("Dungeons and Dragon", "4444 - 5555 - 6666 - 7777", "04/05/2005", "Elon Musk"));

        pilha.empilhar(new Livros("Valorant", "5555 - 6666 - 7777 - 8888", "05/06/2006", "Popo Luva de Ouro"));

        pilha.empilhar(new Livros("Super Xandão", "6666 - 7777 - 8888 - 9999", "06/07/2007", "Michael Jakson"));

       /*  Metodo topo */
        System.out.println("Livro do topo é: " + pilha.topo());
        System.out.println("==================================");
        /* Metodo desempilhar */
        System.out.println(pilha.toString());
        System.out.println("==================================");
        System.out.println("Valor a ser desempilhado: " + pilha.desempilhar());
        System.out.println("Pilha após o metodo desempilhar: " + pilha.toString());
        System.out.println(pilha.tamanho());




    }
}
