package ru.stqa.pft.addressbook.model;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactData {
  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final String title;
  private final String company;
  private final String email;
  private final String phone2;
  private String group;

  public ContactData(String firstName, String middleName, String lastName, String title, String company, String email, String phone2, String group) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.title = title;
    this.company = company;
    this.email = email;
    this.phone2 = phone2;
    this.group = group;
  }


  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getEmail() {
    return email;
  }

  public String getPhone2() {
    return phone2;
  }

  public String getGroup() {
    return group;
  }

}
