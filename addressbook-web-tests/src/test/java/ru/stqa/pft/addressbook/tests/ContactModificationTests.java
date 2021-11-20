package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class ContactModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions(){
    if (app.db().contacts().size() == 0) {
      app.goTo().homePage();
      app.contact().create(new ContactData().withFirstName("J").withLastName("D").withEmail1("JD@mail.com"),true);
    }
  }

  @Test()
  public void testContactModification() {
    Contacts before = app.db().contacts();
    ContactData editedContact = before.iterator().next();
    ContactData contact = new ContactData()
      .withId(editedContact.getId()).withFirstName("J").withLastName("D").withEmail1("JD@mail.com").withPhoto(new File("src/test/resources/thisIsFine.png"));
    app.contact().goToContactsPage();
    app.contact().edit(contact);
    app.contact().goToContactsPage();
    assertEquals(app.contact().count(), before.size());
    Contacts after = app.db().contacts();
    assertThat(after, equalTo(before.without(editedContact).withAdded(contact)));

  }

}
