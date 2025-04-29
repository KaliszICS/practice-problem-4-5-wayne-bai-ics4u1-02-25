/*
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=19367237)
# Instructions  

  1. Create a Student class

It should have _name_, _age_ and _studentNumber_ as instance variables.</br>
Create a constructor that takes in 3 parameters and assigns them to each instance variable.</br>
Create getters all instance variables.</br>
Override the toString method to output "_name_, _age_ - _student number_" in that order and format (include the comma and dash between them)</br>
Override the equals method to output true when the _student number_ of the two students match are the same.</br>

  2. Create a Cow class

It should have _name_, _age_ and _weight_ as instance variables.</br>
Create a constructor that takes in 3 parameters and assigns them to each instance variable.</br>
Create getters all instance variables.</br>
Override the toString method to output "_name_, _age_ - _weight_" in that order and format (include the comma and dash between them)</br>
Override the equals method to output true when the _name_, _age_ and _weight_ of the two cows match are the same.</br>
*/
public class Cow {
  private String name;
  private int age;
  private double weight;

/**
 * creates a cow object
 * 
 * @param name of the cow
 * @param age of the cow
 * @param weight of the cow
 */
  public Cow(String name, int age, double weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  /**
   * 
   * @return the name of the cow
   */
  public String getName() {
    return this.name;
  }
  
  /**
   * 
   * @return the age of cow
   */
  public int getAge() {
    return this.age;
  }
  
  /**
   * 
   * @return the weight of cow
   */

  public double getWeight() {
    return this.weight;
  }

  /**
   * Override for toString method
   * 
   * @return the object converted into a more desired string format
   */
  public String toString() {
    return this.name + ", " + this.age + " - " + this.weight;
  }

  /**
   * Override for the equality method
   * 
   * @param object to be compared to
   * @return whether they are equivalent
   */
  @Override
  public boolean equals(Object object) {
    try {
      Cow otherCow = (Cow) object;
      return 
        this.name.equals(otherCow.getName()) &&
        this.age == otherCow.getAge() &&
        this.weight == otherCow.getWeight();
    } catch (Exception e) {
      return false;
    }
  }
}

