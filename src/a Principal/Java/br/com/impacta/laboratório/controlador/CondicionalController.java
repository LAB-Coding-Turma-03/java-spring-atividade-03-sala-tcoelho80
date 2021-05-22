package br.com.impacta.lab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividades")
public class CondicionalController {

	@GetMapping("/condicional")
	public ResponseEntity<String> simularValores(@RequestParam(name="idade") int idade) {
		int idadeCorte = 18;
		
		var retorno = new String();

		if (idade > idadeCorte){
			retorno = "Possui mais de 18 anos";
		}else if (idade < idadeCorte){
			retorno = "Possui menos de 18 anos";
		}
		
		
		return ResponseEntity.ok(retorno);
	}
	
}
