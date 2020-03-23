package gherkin.stepDefinition;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PostStepDefenition {

    @Dado("que eu tenha os dados da postagem")
    public void que_eu_tenha_os_dados_da_postagem() {
        System.out.println("STEP 1");
    }

    @Quando("eu criar um postagem")
    public void eu_criar_um_postagem() {
        System.out.println("STEP 2");
    }

    @Entao("a postagem deve ser criada com sucesso")
    public void a_postagem_deve_ser_criada_com_sucesso() {
        System.out.println("STEP 3");
    }

}
