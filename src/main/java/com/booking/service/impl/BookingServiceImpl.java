package com.booking.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.booking.dto.BookingDTO;
import com.booking.repository.BookingRepository;
import com.booking.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	private final BookingRepository bookingRepo;
	
    private ModelMapper mapper;
	
	public BookingServiceImpl(BookingRepository bookingRepo, ModelMapper mapper) {
		this.bookingRepo = bookingRepo;
		this.mapper = mapper;
	}

	@Override
	public void register(BookingDTO bookingDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookingDTO updateAccount(BookingDTO bookingDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
