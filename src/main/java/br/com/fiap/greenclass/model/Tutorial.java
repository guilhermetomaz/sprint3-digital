package br.com.fiap.greenclass.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "T_GC_TUTORIAL")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_tutorial")
	private Long id;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "cd_tarefa")
	private Tarefa tarefa;

	@Column(name = "nm_titulo")
	private String titulo;

	@Column(name = "ds_link")
	private String link;

	@Column(name = "dt_postagem")
	private LocalDate dataPostagem;

	public Tutorial() {}

	public Tutorial(String titulo, String link, LocalDate dataPostagem) {
		this.titulo = titulo;
		this.link = link;
		this.dataPostagem = dataPostagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public LocalDate getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(LocalDate dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

}
