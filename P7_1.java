class P7_1 implements Comparable<P7_1> {
    String Name;
    int age;
    int javaMarks;

    P7_1() {
        Name = null;
        age = 0;
        javaMarks = 0;
    }

    P7_1(String name, int age, int javaMarks) {
        this.Name = name;
        this.age = age;
        this.javaMarks = javaMarks;
    }

    public int compareTo(P7_1 s) {
        return this.javaMarks - s.javaMarks;
    }

    public String toString() {
        return String.format("[%s, %d]", Name, javaMarks);
    }
}
