package Ejer1;

import java.util.Date;

public class Visit {

    private Customer customer;
    private Date date;
    private double service;
    private double serviceExpence;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getProductExpense() {

        return productExpense - (productExpense * DiscoutRate.getProductDiscountRate(customer.getMembertype()));
    }
    public double getTotalExpense() {
        return getProductExpense() + getServiceExpence();
    }
    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getServiceExpence() {
        return serviceExpence - (serviceExpence * DiscoutRate.getServiceDiscountRate(customer.getMembertype()));
    }

    public void setServiceExpence(double serviceExpence) {
        this.serviceExpence = serviceExpence;
    }

    @Override
    public String toString() {
        return "Nombre del cliente: " + this.customer.getName()+ " Fecha: " + this.date+" \nPrecio Servicio: " +
                this.getServiceExpence()+ "\nPrecio Producto:"+this.getProductExpense() +"\nPrecio total: "
                + this.getTotalExpense();
    }
}
