public class Student {
    private Integer id;
    private String name;
    private String group;
    private Double score;
    private Boolean active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


    public Student(Integer id, String name, String group, Double score, Boolean active) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.score = score;
        this.active = active;
    }

    public Student() {
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", score=" + score +
                ", active=" + active +
                '}';
    }


    public void deactivate(){
        this.active = false;
    }





}
