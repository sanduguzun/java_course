package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactDeletion(){
    app.getContactHelper().modifyContact();
    app.getContactHelper().fillContactForm(new ContactData("NOTJohn", "NOTPaul", "NOTDOE", "DEV", "SPACE", "Change@mail.com", "Numbr"));
    app.getContactHelper().submitModifyContact();
    app.getContactHelper().logout();
  }

}