package banh.along.recyclerview;

public class ItemPhanTu {
    String stepp;
    String nameOfStep;

    public ItemPhanTu(String stepp, String nameOfStep) {
        this.stepp = stepp;
        this.nameOfStep = nameOfStep;
    }

    public String getStepp() {
        return stepp;
    }

    public void setStepp(String stepp) {
        this.stepp = stepp;
    }

    public String getNameOfStep() {
        return nameOfStep;
    }

    public void setNameOfStep(String nameOfStep) {
        this.nameOfStep = nameOfStep;
    }
}
