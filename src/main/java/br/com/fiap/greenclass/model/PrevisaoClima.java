package br.com.fiap.greenclass.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_GC_PREVISAO_CLIMA")
public class PrevisaoClima {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_previsao_clima")
	private Long id;

	@Column(name = "nm_local")
	private String local;

	@Column(name = "nm_estacao")
	private String estacao;

	@Column(name = "ds_temperatura")
	private String temperatura;

	@Column(name = "ds_umidade_ar")
	private String umidadeAr;

	@Column(name = "ds_velocidade_vento")
	private String velocidadeVento;

	@Column(name = "ds_direcao_vento")
	private String direcaoVento;

	public PrevisaoClima() {}

	public PrevisaoClima(String local, String estacao, String temperatura, String umidadeAr,String velocidadeVento, String direcaoVento) {
		this.local = local;
		this.estacao = estacao;
		this.temperatura = temperatura;
		this.umidadeAr = umidadeAr;
		this.velocidadeVento = velocidadeVento;
		this.direcaoVento = direcaoVento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getEstacao() {
		return estacao;
	}

	public void setEstacao(String estacao) {
		this.estacao = estacao;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getUmidadeAr() {
		return umidadeAr;
	}

	public void setUmidadeAr(String umidadeAr) {
		this.umidadeAr = umidadeAr;
	}

	public String getVelocidadeVento() {
		return velocidadeVento;
	}

	public void setVelocidadeVento(String velocidadeVento) {
		this.velocidadeVento = velocidadeVento;
	}

	public String getDirecaoVento() {
		return direcaoVento;
	}

	public void setDirecaoVento(String direcaoVento) {
		this.direcaoVento = direcaoVento;
	}

}
