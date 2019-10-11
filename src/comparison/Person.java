package comparison;

public class Person implements Comparable<Person>{

    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString(){
        String person =
                "{"+
                    "Name="+name+" , "+
                    "Age="+age+" , "+
                    "Job="+job+
                "}";
        return person;
    }

    @Override
    public int compareTo(Person p) {
        return this.getName().compareTo(p.getName());
    }
}
