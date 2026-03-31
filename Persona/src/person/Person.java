
package person;

/*Fields*/
public class Person {
    private String name;
    private String surname;
    private int id;
    private int birthYear;
    private String birthCountry;
    private char gender;
    
    /*Methods*/
    
        /*Constructor*/
    public Person(String name, String surname, int id, int birthYear, String birthCountry, char gender){
        this.name=name;
        this.surname=surname;
        this.id=id;
        this.birthYear=birthYear;
        this.birthCountry=birthCountry;
        this.gender=gender;
    }
    
        /*Fields access*/
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setBirthYear(int birthYear){
        this.birthYear=birthYear;
    }
    public int getBirthYear(){
        return birthYear;
    }
    public void setBirthCountry(String birthCountry){
        this.birthCountry=birthCountry;
    }
    public String getBirthCountry(){
        return birthCountry;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }
    
    
    /*---*/
    
    public void showObjectFields(){
        String genderSeen;
        if(gender=='f'){
            genderSeen="Female";
        }else{
            genderSeen="Male";
        }
        System.out.println("User fields---");
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
        System.out.println("Year of Birth: "+birthYear);
        System.out.println("Country of birth: "+birthCountry);
        System.out.println("Gender: "+genderSeen);
        System.out.println("--------------");
    }
    
}



