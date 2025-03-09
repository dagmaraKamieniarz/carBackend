package pl.edu.agh.carbackend.model;

@Geter
public class CarDto {

    private String regNumber;
    private String model;

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
