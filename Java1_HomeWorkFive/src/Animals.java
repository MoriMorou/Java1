public abstract class Animals extends Object {
    protected String name;
    protected double max_length; //длина по суши
    protected double max_length_swim; //длина по воде
    protected double max_height; //высота препятствия

    public Animals(String name, double max_length, double max_length_swim, double max_height) {
        this.name = name;
        this.max_length = max_length;
        this.max_length_swim = max_length_swim;
        this.max_height = max_height;
    }

    protected void running(double distance_run) {

        if (max_length >= distance_run)
            System.out.println(name + " is running " + distance_run + ".");
        else
            System.out.println(name + " cannot run. The distance " + distance_run + " is very long.");
    }


    protected void swimming(double distance_sw) {

        if (max_length_swim >= distance_sw)
            System.out.println(name + " is swimming " + distance_sw + ".");
        else
            System.out.println(name + " cannot swim.");
    }

    protected void jumping(double distance_jump) {

        if (max_height >= distance_jump)
            System.out.println(name + " is jumping " + distance_jump + ".\n");
        else
            System.out.println(name + " cannot jump.\n");
    }

}
