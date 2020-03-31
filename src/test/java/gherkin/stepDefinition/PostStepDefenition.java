package gherkin.stepDefinition;

import com.automation.test.services.PostRequest;
import com.automation.test.util.request.ResquestPost;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.response.Response;
import org.testng.Assert;


public class PostStepDefenition {

    private Response response;
    private PostRequest post;

    @Dado("que eu tenha os dados da postagem")
    public void que_eu_tenha_os_dados_da_postagem() {
        post = new PostRequest()
                .setBody("tetes33")
                .setId(6664)
                .setTitle("teste");

    }

    @Quando("eu criar um postagem")
    public void eu_criar_um_postagem() {

        response = new ResquestPost().postWitoutHeader(post);


        //Adicionar Allure Report

    }

    @Entao("a postagem deve ser criada com sucesso")
    public void a_postagem_deve_ser_criada_com_sucesso() {

        Assert.assertEquals(response.getStatusCode(), 201);
    }

}
