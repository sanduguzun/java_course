package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion() {
    app.getContactHelper().goToContactsPage();
    if (! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("John", "Paul", "DOE", "QA", "WORLD", "JSD@mail.com", "Somewhere", "TestGroup"), true);
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().logout();
  }

}
