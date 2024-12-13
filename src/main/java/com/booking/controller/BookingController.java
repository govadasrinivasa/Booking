package com.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.dto.BookingDTO;
import com.booking.service.impl.BookingServiceImpl;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	BookingServiceImpl bookingService;
	
	@PostMapping("/booktickets")
	public void booktickets(@RequestBody BookingDTO bookingDTO) {
		bookingService.register(bookingDTO);
		System.out.println();
	}
	
	@GetMapping("login/{id}")
	public BookingDTO removemoviefromtheatre(@PathVariable("username") String username, @PathVariable("password") String password) {
		//TicketBookingDTO ticketBookingDTO = ticketBookingService.getAccount(id);
		return null;
	}
}
