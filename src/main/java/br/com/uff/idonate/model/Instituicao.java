package br.com.uff.idonate.model;

import jakarta.persistence.ManyToMany;
import java.util.List;
import javax.persistence.*;

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
