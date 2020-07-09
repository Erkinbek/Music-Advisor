class Cat {

    public String name;
    public int age;
    public static int counter = 0;

    public Cat(String name, int age) {
        counter++;
        if (getNumberOfCats() > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return counter;
    }
}