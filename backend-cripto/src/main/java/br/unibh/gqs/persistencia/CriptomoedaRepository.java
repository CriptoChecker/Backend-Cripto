package br.unibh.gqs.persistencia;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import br.unibh.gqs.entidades.Criptomoeda;

/**
 * Esta classe estende o padrão CrudRepository 
 * @author jvsantos
 *
 */
@EnableScan()
public interface CriptomoedaRepository extends CrudRepository<Criptomoeda, String> {
	
	List<Criptomoeda> findByNome(String nome);
	
}