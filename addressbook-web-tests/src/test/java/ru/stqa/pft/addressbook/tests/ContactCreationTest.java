package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTest extends TestBase {


  @Test()
  public void testUserCreation() {
    app.goTo().homePage();
    Contacts before = app.contact().all();
    File photo = new File("src/test/resources/thisIsFine.png");
    photo.exists();
    ContactData contact = new ContactData().withFirstName("J").withLastName("D").withAddress("BLABLABLA")
      .withEmail1("JD@mail.com").withEmail2("FF@mail.com").withEmail3("gg@mail.com")
      .withMobilePhone("+11234").withHomePhone("022").withWorkPhone("373").withPhoto(photo);
    app.contact().create(contact, true);
    assertThat(app.contact().count(), equalTo(before.size() + 1));
    Contacts after = app.contact().all();
    assertThat(after, equalTo(
      before.withAdded(contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt()))));
  }

}