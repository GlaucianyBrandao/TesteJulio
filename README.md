📘 Project Name: Selenium Tests with JUnit in IntelliJ 
📋 Overview This project is a test automation framework built using Selenium WebDriver and JUnit 5, developed in IntelliJ with Maven as the build tool. The framework is designed to automate web application testing, ensuring functionality, compatibility, and overall quality.

📦 Technologies Used Java (JDK 11 or higher) Selenium WebDriver JUnit 5 Maven (Dependency management and build automation) WebDriverManager (Automatically manages browser drivers) IntelliJ IDEA (IDE for development and execution) 🚀 Features Automated browser actions (navigation, form filling, validations). Cross-browser testing using WebDriverManager. Test assertions using JUnit 5. Easy-to-maintain Page Object Model (POM) structure. Maven-based configuration for dependency management and build automation. 🔧 Prerequisites Ensure the following are installed on your system:

Java JDK 11 or higher Maven IntelliJ IDEA (recommended for ease of use and integration) ⚙️ Installation and Setup

Clone the Repository git clone https://github.com/your-username/selenium-junit-tests.git cd selenium-junit-tests
Import the Project in IntelliJ Open IntelliJ IDEA. Go to File > Open and select the project directory. IntelliJ will automatically detect the Maven project and import dependencies. If prompted, select "Auto-import" for Maven dependencies.
Sync Maven Dependencies In IntelliJ:
Navigate to View > Tool Windows > Maven. Click on the Refresh icon to download all required dependencies.

🛠 Dependencies (pom.xml) The project uses the following dependencies in pom.xml:

Selenium WebDriver: Automates browser interactions. JUnit 5: Framework for writing and running tests. WebDriverManager: Handles browser driver management. Example from pom.xml:

org.seleniumhq.selenium selenium-java 4.17.0
<!-- JUnit 5 -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.9.3</version>
    <scope>test</scope>
</dependency>

<!-- WebDriverManager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.8.0</version>
</dependency>
✅ Running Tests From IntelliJ Right-click on the test class or method and select "Run". Alternatively, use the shortcut: Ctrl+Shift+F10. Using Maven
mvn clean test 🔍 Example Test Case Example of a test class that performs a Google search:

package com.exemplo.selenium;

import org.junit.jupiter.api.AfterEach; import org.junit.jupiter.api.BeforeEach; import org.junit.jupiter.api.Test; import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import org.openqa.selenium.chrome.ChromeDriver; import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.*;

public class GoogleSearchTest {

private WebDriver driver;

@BeforeEach
public void setUp() {
    // Configura o WebDriver para o Chrome
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}

@Test
public void testGoogleSearch() {
    // Acessa o Google
    driver.get("https://www.google.com");

    // Pesquisa por "JUnit 5"
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("JUnit 5");
    searchBox.submit();

    // Verifica se o título contém "JUnit 5"
    String pageTitle = driver.getTitle();
    assertTrue(pageTitle.contains("JUnit 5"), "Título não contém 'JUnit 5'");
}

@AfterEach
public void tearDown() {
    // Fecha o navegador
    if (driver != null) {
        driver.quit();
    }
}
} 🌐 Cross-Browser Testing This project supports cross-browser testing using WebDriverManager. You can easily switch between browsers by modifying the setup:

java Copiar Editar // For Chrome WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();

// For Firefox WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();

// For Edge WebDriverManager.edgedriver().setup(); driver = new EdgeDriver(); 📊 Reports The framework can be extended to generate test reports using plugins like Surefire Report Plugin or Extent Reports.

💡 Tips and Best Practices Use Page Object Model (POM): Organize locators and actions in dedicated classes. Keep Test Data Separate: Store test data in external files (e.g., JSON, XML). Assertion Library: Leverage JUnit’s assertions for better validation. CI/CD Integration: Integrate with Jenkins or GitHub Actions for automated test execution. 🤝 Contributing Feel free to open issues or submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

📄 License This project is licensed under the MIT License.

📧 Contact For questions or support, please contact:

Your Name - glaucianybrandao03@google.com GitHub - https://github.com/GlaucianyBrandao
