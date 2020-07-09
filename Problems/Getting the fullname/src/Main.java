class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        if (isNullOrEmpty(this.firstName) && isNullOrEmpty(this.lastName)) return "Unknown";
        if (isNullOrEmpty(this.firstName)) return this.lastName;
        if (isNullOrEmpty(this.lastName)) return this.firstName;
        return this.firstName + " " + this.lastName;
    }

    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }
}