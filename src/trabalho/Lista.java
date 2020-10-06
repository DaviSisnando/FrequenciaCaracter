package trabalho;

public class Lista {

    public String t;
    public String vetor[];
    public String aux;
    public int cont = 0;
    public int contaux = 0;
    No primeiro;

    public Lista(String t) {
        this.t = t;
        vetor = t.split("");
        primeiro = null;
        analisar();
    }

    public void adicionar(String nome) {
        No novo = new No(nome);

        if (primeiro != null) {
            novo.setProximo(primeiro);
        }
        novo.setFrequencia(novo.getFrequencia() + 1);
        primeiro = novo;

    }

    public void checar(String nome) {
        if (primeiro == null) {
            adicionar(nome);
        } else {
            No aux = primeiro;
            int j = 0;
            while (aux != null) {
                if (aux.getNome().equals(nome)) {
                    aux.setFrequencia(aux.getFrequencia() + 1);
                    j = 1;
                }
                aux = aux.getProximo();
            }
            if (j == 0) {
                adicionar(nome);
            }
        }
    }

    public void analisar() {
        for (int i = 0; i < t.length(); i++) {
            checar(vetor[i]);
        }
    }

    public void exibir() {
        No aux = primeiro;

        while (aux != null) {
            System.out.println("O símbolo: "  + aux.getNome() + " aparece " + aux.getFrequencia() + " vezes.");
            aux = aux.getProximo();
        }
    }
}
