package br.com.uff.idonate.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import lombok.Data;

/** Classe modelo de necessidade que deve ser informada pelo voluntário. */
@Data
@Entity
public class Necessidade {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @JoinColumn(name = "instituicao")
  private Instituicao instituicao;

  @JoinColumn(name = "voluntario")
  private Voluntario voluntario;

  private Categoria categoria;
  private Date dataLimite;
  private String descricao;
}
