package ru.stqa.pft.addressbook.model;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;

public class ContactData {
  private int id;
  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final String title;
  private final String company;
  private final String email;
  private final String phone2;
  private String group;

  public ContactData(int id, String firstName, String middleName, String lastName, String title, String company, String email, String phone2, String group) {
    this.id = id;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.title = title;
    this.company = company;
    this.email = email;
    this.phone2 = phone2;
    this.group = group;
  }
  public ContactData(String firstName, String middleName, String lastName, String title, String company, String email, String phone2, String group) {
    this.id = Integer.MAX_VALUE;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.title = title;
    this.company = company;
    this.email = email;
    this.phone2 = phone2;
    this.group = group;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }

  @Override
  public String toString() {
    return "ContactData{" +
      "id='" + id + '\'' +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      '}';
  }
}
