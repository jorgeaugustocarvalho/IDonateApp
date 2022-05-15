package br.com.uff.idonate.model;

import jakarta.persistence.ManyToMany;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/** Classe modelo da Entidade Voluntário do Idonate. */
@Data
@Entity
public class Voluntario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String nome;
  private String cpf;
  private String endereco;
  @ManyToMany private List<Instituicao> instituicoes;
}
