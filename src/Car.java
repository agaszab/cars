class Car {


    String model;
    double moc;
    int spid;

    Car(String md, int sp, double ci) {

        model = md;
        spid = sp;
        moc = ci;

    }

    void turbo() {
        moc = moc * 1.1; // moc*((moc*10)/100)

    }

    void increaseSpeed(int sp) {

        spid = spid + sp; // to samo spid+=sp;

    }

    void decreaseSpeed(int sp) {
        spid = spid - sp;
    }

    void show() {
        System.out.println(model + " " + spid + " " + moc);
    }

}


