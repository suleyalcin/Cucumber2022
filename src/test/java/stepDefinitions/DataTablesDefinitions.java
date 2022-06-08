package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablesPage;

public class DataTablesDefinitions {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButonunaBasar.click();
    }

    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String firstname) {dataTablesPage.firstName.sendKeys(firstname);}

    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String lastname) {
        dataTablesPage.lastName.sendKeys(lastname);
    }

    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
        dataTablesPage.position.sendKeys(position);

    }

    @And("ofis bolumune {string} yazar")
    public void ofisBolumuneYazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
        dataTablesPage.extn.sendKeys(extension);
    }

    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);
    }

    @And("salary bolumune {string} yazar")
    public void salaryBolumuneYazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.create.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataTablesPage.search.sendKeys(firstname);

    }

    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstname) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstname));
    }
}

