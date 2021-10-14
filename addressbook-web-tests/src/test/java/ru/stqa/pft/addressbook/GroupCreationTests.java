package ru.stqa.pft.addressbook;

import org.testng.annotations.*;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("TestGroup", "Header data", "Footer data"));
    submitGroupCreation();
    returnToGroupPage();
    logOutAddressBook();
  }


}
