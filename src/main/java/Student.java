public class Student {
  private String name;
  private int age;
  private String studentNumber;

/**
 * creates a Student object
 * 
 * @param name of the Student
 * @param age of the Student
 * @param studentNumber of the Student
 */
  public Student(String name, int age, String studentNumber) {
    this.name = name;
    this.age = age;
    this.studentNumber = studentNumber;
  }

  /**
   * 
   * @return name of student
   */
  public String getName() {
    return this.name;
  }
  
  /**
   * 
   * @return age of student
   */
  public int getAge() {
    return this.age;
  }
  
  /**
   * 
   * @return student's student number
   */
  public String getStudentNumber() {
    return this.studentNumber;
  }

  /**
   * override for toString method
   * 
   * @return a more desirable string to represent the object
   */
  @Override
  public String toString() {
    return this.name + ", " + this.age + " - " + this.studentNumber;
  }

  /**
   * Override for equality
   * 
   * @param object to be compared to
   * @return whether the two students are equal
   */
  @Override
  public boolean equals(Object object) {
    try {  
      Student otherStudent = (Student) object;
      return this.studentNumber == otherStudent.getStudentNumber();
    } catch (Exception e) {
      return false;
    }
  }
}
  
