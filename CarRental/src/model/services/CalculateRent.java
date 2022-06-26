package model.services;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalculateRent {

    private double valuePerHour;
    private double valuePerDay;
    private Date initialInstant;
    private Date finalMoment;

    public CalculateRent(double valuePerHour, double valuePerDay, Date initialInstant, Date finalMoment) {
        this.valuePerHour = valuePerHour;
        this.valuePerDay = valuePerDay;
        this.initialInstant = initialInstant;
        this.finalMoment = finalMoment;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public double getValuePerDay() {
        return valuePerDay;
    }

    public Date getInitialInstant() {
        return initialInstant;
    }

    public void setInitialInstant(Date initialInstant) {
        this.initialInstant = initialInstant;
    }

    public Date getFinalMoment() {
        return finalMoment;
    }

    public void setFinalMoment(Date finalMoment) {
        this.finalMoment = finalMoment;
    }

    public double dailyRent(){
        Long time = finalMoment.getTime() - initialInstant.getTime();
        return Math.ceil(TimeUnit.MILLISECONDS.toHours(time));
    }

    public double calculatePaymentBasic(){
        if(dailyRent() <= 12) {
            return dailyRent() * valuePerHour;
        } else {
            return Math.ceil(dailyRent()/24) * valuePerDay;
        }
    }

    public double totalPayment(){
        return calculatePaymentBasic() + Tax.calculateTax(calculatePaymentBasic());
    }

    public String resumeTime(){
        if(dailyRent() <= 12){
            return "hours: " + Math.ceil(dailyRent());
        } else {
            return "Days: " + Math.ceil(dailyRent()/24);
        }
    }

    @Override
    public String toString() {
        return "duration " + resumeTime()
                + " - Basic payment: $" + calculatePaymentBasic()
                + " - Tax paid: $" + Tax.calculateTax(calculatePaymentBasic())
                + " - Total payment: $" + totalPayment();
    }
}
