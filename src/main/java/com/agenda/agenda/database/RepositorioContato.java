package com.agenda.agenda.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.agenda.entidade.Contato;

public interface RepositorioContato extends JpaRepository<Contato,Long>{

}
