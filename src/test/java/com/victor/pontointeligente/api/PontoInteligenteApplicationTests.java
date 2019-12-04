package com.victor.pontointeligente.api;

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test") //Ativa o profile 'test' criado em /PontoInteligente/src/main/resources/application-test.properties
class PontoInteligenteApplicationTests {

	@Test
	void contextLoads() {
	}
}
