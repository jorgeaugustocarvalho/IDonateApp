package br.com.uff.idonate.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/** Classe modelo de Instituição do Idonate. */
@Data
@Entity
@Table(name = "instituicoes")
public class Instituicao extends Usuario{

  private String nome;
  private String cnpj;
  
  @ManyToMany
  private List<CategoriaInstituicao> categorias; 
  
  @OneToMany
  private List<Endereco> enderecos;

  @ManyToMany(mappedBy = "instituicoes")
  private List<Voluntario> voluntarios;
}
