/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.fon.ac.silab.BookingApi.exceptions;

/**
 *
 * @author Vladimir
 */
public class TicketAlreadyBookedException extends RuntimeException {

    public TicketAlreadyBookedException(String message) {
        super(message);
    }
    
    
}
