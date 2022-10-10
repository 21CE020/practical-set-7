class P7_3 {
    int age;
    double netincome;
    int exp;
    String citizenship;

    P7_3(int age, double netincome, int exp, String citizenship) {
        this.age = age;
        this.netincome = netincome;
        this.exp = exp;
        this.citizenship = citizenship;
    }

    public String eligibility() {
        if (age >= 21 && age <= 60 && netincome >= 15000 && exp >= 1 && citizenship.equals("Indian")) {
            return "Eligible";
        } else {
            return "Not Eligible";
        }
    }
}
