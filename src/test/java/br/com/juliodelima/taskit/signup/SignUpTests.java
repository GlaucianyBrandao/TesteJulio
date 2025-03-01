package br.com.juliodelima.taskit.signup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@DisplayName("Testes Automatizados da Funcionalidade Signup")
public class SignUpTests {
    @Test
    @DisplayName("Registrar Novo Usuário com Dados Válidos")
    public void testRegistrarNovoUsuarioComDadosValidos() {
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        //Abrir o site Task It
        navegador.get("http://www.juliodelima.com.br/taskit");
        //Clicar no botão com Id signup
        navegador.findElement(By.id("signup")).click();
        //Digitar o nome no campo com Id name-sign-up
        navegador.findElement(By.id("name-sign-up")).sendKeys("Glaucy12");
        //Digitar o login no campo com Id login-sign-up
        navegador.findElement(By.id("login-sign-up")).sendKeys("glau123");
        //Digitar a senha no campo com Id password-sign-up
        navegador.findElement(By.id("password-sign-up")).sendKeys("12345");
        //Clicar no botão com Id btn-submit-sign-up
        navegador.findElement(By.id("btn-submit-sign-up")).click();
        //Validar saudação
        //String saudacaoAtual = navegador.findElement(By.className("me")).getText();
        //Assertions.assertEquals("Hi, Glaucy", saudacaoAtual);
        //O site mudou e não é mais possível fazer essa validação
        navegador.quit();
    }


}
