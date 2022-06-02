package entities;

import entities.Enum.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItens> orderItens = new ArrayList<>();

    public Order(){
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItens> getOrderItens() {
        return orderItens;
    }

    public void addOrderItens(OrderItens product){
        orderItens.add(product);
    }
    public void removeOrderItens(OrderItens product){
        orderItens.remove(product);
    }

    public double totalValue(){
        double sum=0;
        for(OrderItens x: orderItens){
            sum += x.valueTotalOrderItens();
        }
        return sum;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Data about client. \n");
        sb.append("Name: " + client.getName() +" - ");
        sb.append("Email: " + client.getEmail() +" - ");
        sb.append("Birthday: " + sdf.format(client.getBirthday()) +"\n");
        sb.append("Total value: $" + String.format("%.2f", totalValue()) +"\n \n");
        sb.append("Itens: \n");
        for(OrderItens x: orderItens){
            sb.append("Name: " + x.getName() + " - Quantity: "+x.getQuantity()+" - Price: $"+x.getPrice() +"\n");
        }
        return sb.toString();
    }

}
