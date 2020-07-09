package br.com.alura.agenda.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.agenda.model.Aluno;

public class AlunoDAO {

    private final static List<Aluno> alunos = new ArrayList<>();

    public void salva(Aluno aluno) { alunos.add(aluno); }

    public List<Aluno> todos() {
        List<Aluno> listaOrdenada = new ArrayList<>(alunos);
        ordenaLista(listaOrdenada);
        return listaOrdenada;

    }

    private void ordenaLista(List<Aluno> lista) {
        Collections.sort(lista, new Comparator<Aluno>() {
            @Override
            public int compare(Aluno o1, Aluno o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
    }
}
