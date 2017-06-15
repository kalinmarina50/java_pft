package ru.stqa.pft.addressbookWork;

public class ContactFormData {
    private final String firstname;
    private final String lastname;
    private final String title;
    private final String company;
    private final String address;
    private final String homephone;
    private final String mobilephone;
    private final String email;
    private final String birthday;
    private final String birthmonth;
    private final String birthyear;
    private String group;

    public ContactFormData(String firstname, String lastname, String title, String company, String address, String homephone, String mobilephone, String email, String birthday, String birthmonth, String birthyear, String group) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homephone = homephone;
        this.mobilephone = mobilephone;
        this.email = email;
        this.birthday = birthday;
        this.birthmonth = birthmonth;
        this.birthyear = birthyear;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomephone() {
        return homephone;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBirthmonth() {
        return birthmonth;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public String getGroup() {
        return group;
    }
}
