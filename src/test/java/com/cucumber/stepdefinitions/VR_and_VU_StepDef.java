package com.cucumber.stepdefinitions;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import com.cucumber.pages.VR_VUPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class VR_and_VU_StepDef extends Genericfunction {
    VR_VUPage vr_vupage=new VR_VUPage();
    @Given("User is able login sftp application")
    public void user_is_able_login_sftp_application() throws IOException, InterruptedException {
        driver=sftpdriverintilization();
        sftpLaunchAndLogin(driver);

    }


    @Then("User is able click on from hdx icon")
    public void user_is_able_click_on_from_hdx_icon() {
        clickOnElement(WebElements.from_HDX);
    }

    @Then("User is able to click om wms icon")
    public void user_is_able_to_click_om_wms_icon() {
        clickOnElement(WebElements.WMS);
    }

    @Then("User is able to validate the file using {string}")
    public void user_is_able_to_validate_the_file_using(String string) throws IOException, InterruptedException {
        vr_vupage.vr_file_traversal(string);
    }

    @Then("User is able to validate the file using {string} for VU")
    public void user_is_able_to_validate_the_file_using_for_vu(String string) throws IOException, InterruptedException {
        vr_vupage.vu_file_traversal(string);
    }


}
