package br.com.uff.idonate.model;

import jakarta.persistence.ManyToMany;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/** Classe modelo de Instituição do Idonate. */
@Data
@Entity
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
