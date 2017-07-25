package dtos;

/**
 * Created by pablo on 12/06/2016.
 */
public class UserDto {

    private String name;

    private String email;

    private String password;

    private String telephone;

    public UserDto(String name, String mail, String pass, String telephone){
        this.name = name;
        this.email = mail;
        this.password = pass;
        this.telephone = telephone;
    }



    public UserDto(){}

    public String getName() {
        return name;
    }

    public String getTelephone() { return telephone;    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
