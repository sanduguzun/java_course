package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTests extends TestBase {

  @Test(enabled = false)
  public void testContactDeletion() {
    app.goTo().goToHomePage();
    app.getContactHelper().goToContactsPage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("J", null, "D", null, null, "jd@mail.com", null, null), true);
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().modifyContact();
    ContactData contact = new ContactData(before.get(before.size() - 1).getId(), "J", null, "D", null, null, "jd@mail.com", null, null);
    app.getContactHelper().fillContactForm((contact), false);
    app.getContactHelper().submitModifyContact();
    app.getContactHelper().goToContactsPage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() - 1);
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }

}
