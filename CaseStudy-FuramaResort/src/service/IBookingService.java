package service;

import model.Book.Booking;

public interface IBookingService extends IService<Booking> {
    void del(String id);

}
