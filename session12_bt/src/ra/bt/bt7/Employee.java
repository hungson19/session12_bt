package ra.bt.bt7;

import java.util.Date;

public class Employee {
    private String name;
    private boolean sex;
    private Date birthday;

    public Employee() {
    }

    public Employee(String name, boolean sex, Date birthday) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                '}';
    }
}
