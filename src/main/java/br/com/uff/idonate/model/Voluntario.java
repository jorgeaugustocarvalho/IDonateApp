package br.com.uff.idonate.model;

import java.util.List;
import javax.persistence.ManyToMany;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Data;

/** Classe modelo da Entidade Voluntário do Idonate. */
@Data
@Entity
@Table(name = "voluntarios")
public class Voluntario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String nome;
  private String cpf;
  private String endereco;
  @ManyToMany private List<Instituicao> instituicoes;
}
