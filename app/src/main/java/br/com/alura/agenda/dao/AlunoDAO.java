package br.com.alura.agenda.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.agenda.model.Aluno;

public class AlunoDAO {

    private final static List<Aluno> alunos = new ArrayList<>();
//    Collections.sort(alunos, new Comparator<Aluno>){
//        @Override
//        public int compare (Aluno aluno1, Aluno aluno2)
//        {
//
//        }
//    }
    public void salva(Aluno aluno) {
        alunos.add(aluno);
//        Collections.sort(alunos);
    }

    public List<Aluno> todos() {
        return new ArrayList<>(alunos);
    }
}
