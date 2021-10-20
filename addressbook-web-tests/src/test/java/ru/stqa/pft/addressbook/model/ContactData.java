package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final String title;
  private final String company;
  private final String email;
  private final String phone2;

  public ContactData(String firstName, String middleName, String lastName, String title, String company, String email, String phone2) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.title = title;
    this.company = company;
    this.email = email;
    this.phone2 = phone2;
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
}
