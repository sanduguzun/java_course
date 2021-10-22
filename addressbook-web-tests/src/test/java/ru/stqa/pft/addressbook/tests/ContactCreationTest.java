package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {


  @Test
  public void testUserCreation() throws Exception {

    app.getContactHelper().goToCreateNewContact();
    app.getContactHelper().fillContactForm(new ContactData("John", "Paul", "DOE", "QA", "WORLD", "JSD@mail.com", "Somewhere"));
    app.getContactHelper().submitNewContact();
    app.getContactHelper().goToContactsPage();
    app.getContactHelper().logout();
  }

}
