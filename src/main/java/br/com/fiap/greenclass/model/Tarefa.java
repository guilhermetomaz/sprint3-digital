package br.com.fiap.greenclass.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "T_GC_TAREFA")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_tarefa")
	private Long id;

	@JsonIgnore
	@OneToMany(mappedBy = "tarefa", cascade = CascadeType.REMOVE)
	private List<Tutorial> tutoriais = new ArrayList<>();

	@Column(name = "nm_titulo")
	private String titulo;

	@Column(name = "ds_tarefa")
	private String descricao;

	@Column(name = "dt_prazo")
	private LocalDate dataPrazo;

	public Tarefa() {}

	public Tarefa(String titulo, String descricao, LocalDate dataPrazo) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataPrazo = dataPrazo;
	}

	public void addTutorial(Tutorial tutorial) {
		tutorial.setTarefa(this);
		tutoriais.add(tutorial);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Tutorial> getTutoriais() {
		return tutoriais;
	}

	public void setTutoriais(List<Tutorial> tutoriais) {
		this.tutoriais = tutoriais;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataPrazo() {
		return dataPrazo;
	}

	public void setDataPrazo(LocalDate dataPrazo) {
		this.dataPrazo = dataPrazo;
	}

}
