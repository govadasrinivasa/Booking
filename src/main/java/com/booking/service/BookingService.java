package com.booking.service;

import com.booking.dto.BookingDTO;

public interface BookingService {

	void register(BookingDTO bookingDTO);
	BookingDTO updateAccount(BookingDTO bookingDTO);
}
