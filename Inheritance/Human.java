package Inheritance;

/**
 * Created by mahadev on 8/2/18.
 */
public class Human {
   protected   String name;
   protected String add;
   protected String  phone;
   protected String email;

    Human(String name,String add,String phone,String email)
    {
        this.name=name;
        this.add=add;
        this.phone=phone;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public  void print()
    {
        System.out.println ("Name="+getName ());
        System.out.println ("Address="+getAdd ());
        System.out.println ("Phone No:="+getPhone ());
        System.out.println ("Email Id:="+getEmail ());
    }
}

