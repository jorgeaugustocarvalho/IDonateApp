package br.com.uff.idonate.model;

import java.util.List;
import javax.persistence.ManyToMany;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Data;

/** Classe modelo de Instituição do Idonate. */
@Data
@Entity
@Table(name = "instituicoes")
public class Instituicao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String nome;
  private String cnpj;
  private String endereco;

  @ManyToMany(mappedBy = "instituicoes")
  private List<Voluntario> voluntarios;
}
