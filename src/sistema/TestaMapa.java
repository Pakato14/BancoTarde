package sistema;

import java.util.HashMap;
import java.util.Map;

import contas.Conta;
import contas.ContaCorrente;

public class TestaMapa {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.deposita(10000);
		Conta c2 = new ContaCorrente();
		c2.deposita(3000);
		Conta c3 = new ContaCorrente();
		c3.deposita(2500);
		// cria o mapa
		Map mapaDeContas = new HashMap();
		// adiciona duas chaves e seus valores
		mapaDeContas.put("diretor1", c1);
		mapaDeContas.put("gerente", c2);
		mapaDeContas.put("diretor2", c3);
		// qual a conta do diretor?
		Conta contaDoDiretor1 = (Conta) mapaDeContas.get("diretor1");
		Conta contaDoDiretor2 = (Conta) mapaDeContas.get("diretor2");
		Conta contaDoGerente = (Conta) mapaDeContas.get("gerente");
		System.out.println("A conta do Diretor possui um saldo de: R$ "+contaDoDiretor1.getSaldo());
		System.out.println("A conta do Diretor possui um saldo de: R$ "+contaDoDiretor2.getSaldo());
		System.out.println("A conta do Gerente possui um saldo de: R$ "+contaDoGerente.getSaldo());


	}

}
