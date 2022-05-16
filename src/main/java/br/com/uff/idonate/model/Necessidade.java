package br.com.uff.idonate.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/** Classe modelo de necessidade que deve ser informada pelo voluntário. */
@Data
@Entity
@Table(name = "necessidades")
public class Necessidade {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @JoinColumn(name = "instituicoes")
  private Instituicao instituicao;

  @JoinColumn(name = "voluntarios")
  private Voluntario voluntario;

  @OneToMany
  private List<CategoriaNecessidade> categorias;
  private LocalDate dataLimite;
  private String descricao;
}
