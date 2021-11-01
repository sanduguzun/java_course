package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactDeletion(){
    app.getContactHelper().goToContactsPage();
    if (! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("John", "Paul", "DOE", "QA", "WORLD", "JSD@mail.com", "Somewhere", "TestGroup"), true);
    }
    app.getContactHelper().modifyContact();
    app.getContactHelper().fillContactForm(new ContactData("NOTJohn", "NOTPaul", "NOTDOE", "DEV", "SPACE", "Change@mail.com", "Numbr", null), false);
    app.getContactHelper().submitModifyContact();
    app.getContactHelper().logout();
  }

}
