package br.com.uff.idonate.model;

import java.util.Date;
import javax.persistence.*;

import lombok.Data;

/** Classe modelo de necessidade que deve ser informada pelo voluntário. */
@Data
@Entity
@Table(name = "necessidades")
public class Necessidade {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @JoinColumn(name = "instituicoes")
  private Instituicao instituicao;

  @JoinColumn(name = "voluntarios")
  private Voluntario voluntario;

  private Categoria categoria;
  private Date dataLimite;
  private String descricao;
}
