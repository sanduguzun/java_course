package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void logout() {
    click(By.linkText("Logout"));
  }

  public void goToContactsPage() {
    click(By.linkText("home"));
  }

  public void submitNewContact() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData,boolean creation) {
    type(By.name("firstname"), contactData.getFirstName());
    type(By.name("middlename"), contactData.getMiddleName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("email"), contactData.getEmail());
    type(By.name("phone2"), contactData.getPhone2());

  }


  public void goToCreateNewContact() {
    click(By.linkText("add new"));
  }

  public void selectContact() {
    click(By.xpath("//*[@id='maintable']/tbody/tr[3]//input[@type='checkbox']"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//input[@value='Delete']"));
    wd.switchTo().alert().accept();
  }

  public void modifyContact() {
    click(By.xpath("//*[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void submitModifyContact() {
    click(By.xpath("//*[@id='content']/form[1]/input[22]"));
  }

  public boolean isThereAContact() {
    return isElementPresent(By.xpath("//*[@id='maintable']/tbody/tr[3]//input[@type='checkbox']"));
  }

  public void createContact(ContactData contact, boolean creation) {
   goToCreateNewContact();
   fillContactForm(contact);
   submitNewContact();
   goToContactsPage();
  }

  private void fillContactForm(ContactData contact) {
  }

}
