package com.cucumber.pages;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.List;

public class VR_VUPage extends Genericfunction {
    public void vr_file_traversal(String wmscode) throws IOException, InterruptedException {
        String date= String.valueOf(java.time.LocalDate.now());
        String[] parts = date.split("-");
        System.out.println(parts);
        String filefilter="//a[contains(text(),'-VR-"+parts[0]+parts[1]+parts[2]+"')]";
        List<WebElement> file_elements=findElements(By.xpath(filefilter));

        for(int i=0;i<file_elements.size();i++){
            //file clicking part
            Actions act = new Actions(driver);
            WebElement element =file_elements.get(i) ;
            act.doubleClick(element).perform();
            System.out.println(file_elements.get(i).getText());

            //local file path location
            String download_file_path= "C://Users//2174112//Downloads//"+file_elements.get(i).getText();

            //extraction of data from the file
            Boolean flag=csv_value_checker(wmscode,download_file_path);
            if(flag){
                break;
            }

        }
        System.out.println(gettext(WebElements.WMS2));
    }

    public void vu_file_traversal(String wmscode) throws IOException, InterruptedException {
        String date= String.valueOf(java.time.LocalDate.now());
        String[] parts = date.split("-");
        System.out.println(parts);
        String filefilter="//a[contains(text(),'-VU-"+parts[0]+parts[1]+parts[2]+"')]";
        List<WebElement> file_elements=findElements(By.xpath(filefilter));

        for(int i=0;i<file_elements.size();i++){
            //file clicking part
            Actions act = new Actions(driver);
            WebElement element =file_elements.get(i) ;
            act.doubleClick(element).perform();
            System.out.println(file_elements.get(i).getText());

            //local file path location
            String download_file_path= "C://Users//2174112//Downloads//"+file_elements.get(i).getText();

            //extraction of data from the file
            Boolean flag=csv_value_checker(wmscode,download_file_path);
            if(flag){
                break;
            }

        }
        System.out.println(gettext(WebElements.WMS2));
    }
}
