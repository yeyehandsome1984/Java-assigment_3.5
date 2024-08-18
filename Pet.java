 // Make sure to use your own package name

public class Pet {
    // Attributes
    private String name;
    private String breed;
    private String gender;
    private Integer age;
    private Boolean isVaccinated;

    // Empty constructor
    public Pet() {
    }

    // Parameterized constructor
    public Pet(String name, String breed, String gender, Integer age, Boolean isVaccinated) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.isVaccinated = isVaccinated;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    // Methods
    public void call(String sound) {
        System.out.println(sound + " " + sound + " " + sound);
    }

    public void eat(String food) {
        System.out.println(name + " loves eating " + food);
    }

    public void sleep() {
        System.out.println(name + " is currently sleeping");
    }
}
