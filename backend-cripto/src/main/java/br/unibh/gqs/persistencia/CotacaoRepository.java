package br.unibh.gqs.persistencia;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import br.unibh.gqs.entidades.Cotacao;

/**
 * Esta classe estende o padrão CrudRepository 
 * @author jvsantos
 *
 */
@EnableScan()
public interface CotacaoRepository extends CrudRepository<Cotacao, String> {
	
	List<Cotacao> findByCodigo(String codigo);
	
}