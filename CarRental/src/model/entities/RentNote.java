package model.entities;

import model.enums.CarModel;
import model.services.CalculateRent;

public class RentNote {

    private Client client;
    private CarModel carModel;
    private CalculateRent calc;

    public RentNote(Client client, CarModel carModel, CalculateRent calc) {
        this.client = client;
        this.carModel = carModel;
        this.calc = calc;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public CalculateRent getCalc() {
        return calc;
    }

    public void setCalc(CalculateRent calc) {
        this.calc = calc;
    }

    @Override
    public String toString() {
        return "Client: " + client + " - Model: " + carModel.toString()
                + "\nCalculate: \n" + calc;
    }
}
