package br.com.fiap.greenclass.config;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.greenclass.model.PrevisaoClima;
import br.com.fiap.greenclass.model.Tarefa;
import br.com.fiap.greenclass.model.Tutorial;
import br.com.fiap.greenclass.repository.PrevisaoClimaRepository;
import br.com.fiap.greenclass.repository.TarefaRepository;
import br.com.fiap.greenclass.repository.TutorialRepository;

@Configuration
public class DatabaseSeed implements CommandLineRunner {

	@Autowired
	TarefaRepository tarefaRepository;
	
	@Autowired
	TutorialRepository tutorialRepository;
	
	@Autowired
	PrevisaoClimaRepository previsaoClimaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Tarefa tarefa1 = new Tarefa("Tirar leite de vaca", "Preciso tirar leite da vaca, antes do leite perder a proteina", LocalDate.of(2022, 11, 1));
		Tarefa tarefa2 = new Tarefa("Pegar os ovos da galinha", "Pegar os ovos da galinha antes que eles choquem", LocalDate.of(2022, 10, 1));
		Tarefa tarefa3 = new Tarefa("Alimentar os porcos", "Alimentar os porcos sem gastar tanto dinheiro", LocalDate.of(2022, 10, 5));
		Tarefa tarefa4 = new Tarefa("Plantar milho", "Preciso aprender a plantar milho", LocalDate.of(2022, 12, 1));
		Tarefa tarefa5 = new Tarefa("Olhar a plantacao", "Verificar se a plantacao esta morta", LocalDate.of(2022, 12, 25));
		Tarefa tarefa6 = new Tarefa("Andar a cavalo", "Andar com os cavalos para eles nao ficarem com as pernas atrofiadas", LocalDate.of(2023, 1, 1));
		
		Tutorial tutorial1 = new Tutorial("Como tirar leite de vaca", "https://www.youtube.com/watch?v=sDfqfc3bEUU", LocalDate.of(2015, 11, 7));
		Tutorial tutorial2 = new Tutorial("Como fazer a galinha botar ovo", "https://www.youtube.com/watch?v=PMsJZEK1DjA", LocalDate.of(2019, 9, 22));
		Tutorial tutorial3 = new Tutorial("Como alimentar os porcos", "https://www.youtube.com/watch?v=r1rlEwMXQRU", LocalDate.of(2020, 5, 13));
		Tutorial tutorial4 = new Tutorial("Como plantar milho", "https://www.youtube.com/watch?v=x-dY-si_99o", LocalDate.of(2022, 1, 27));
		Tutorial tutorial5 = new Tutorial("Sua planta morreu", "https://www.youtube.com/watch?v=2BHXqvSlqIQ", LocalDate.of(2022, 11, 8));
		Tutorial tutorial6 = new Tutorial("Como andar a cavalo", "https://www.youtube.com/watch?v=qfzCHUGtQTw", LocalDate.of(2021, 8, 30));
		
		PrevisaoClima previsaoClima1 = new PrevisaoClima("SP", "Inverno", "atual: 20, max: 24, min: 16", "86%", "2km/h", "SSE");
		PrevisaoClima previsaoClima2 = new PrevisaoClima("RJ", "Inverno", "atual: 30, max: 31, min: 28", "50%", "1km/h", "NE");
		PrevisaoClima previsaoClima3 = new PrevisaoClima("MG", "Inverno", "atual: 26, max: 28, min: 22", "60%", "1km/h", "NE");
		
		tarefa1.addTutorial(tutorial1);
		tarefa2.addTutorial(tutorial2);
		tarefa3.addTutorial(tutorial3);
		tarefa4.addTutorial(tutorial4);
		tarefa5.addTutorial(tutorial5);
		tarefa6.addTutorial(tutorial6);
		
		tarefaRepository.save(tarefa1);
		tarefaRepository.save(tarefa2);
		tarefaRepository.save(tarefa3);
		tarefaRepository.save(tarefa4);
		tarefaRepository.save(tarefa5);
		tarefaRepository.save(tarefa6);
		
		tutorialRepository.save(tutorial1);
		tutorialRepository.save(tutorial2);
		tutorialRepository.save(tutorial3);
		tutorialRepository.save(tutorial4);
		tutorialRepository.save(tutorial5);
		tutorialRepository.save(tutorial6);
		
		previsaoClimaRepository.save(previsaoClima1);
		previsaoClimaRepository.save(previsaoClima2);
		previsaoClimaRepository.save(previsaoClima3);
	}

}
