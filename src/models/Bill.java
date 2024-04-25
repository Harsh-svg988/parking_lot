package models;

import java.util.Date;
import java.util.List;

public class Bill {
    private Long id;
    private Ticket ticket;
    private Date exitTime;
    private double payableAmount;
    private List<Payment> paymentList;
    private BillStatus billStatus;

}
