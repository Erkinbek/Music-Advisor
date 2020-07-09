class Phone {

    String ownerName;
    String countryCode;
    String cityCode;
    String number;

    Phone(String ownerName, String number) {
        this.ownerName = ownerName;
        this.number = number;
    }

    Phone(String ownerName, String countryCode, String cityCode, String number) {
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        new Phone(ownerName, number);
    }
}