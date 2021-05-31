package com.learn.portfolioservice.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.portfolioservice.model.GetHoldingsResponse;
import com.learn.portfolioservice.model.Holding;

@RestController
@RequestMapping("/holdings")
public class HoldingsController {
	
	@GetMapping("/getallforuser/{userId}")
	public GetHoldingsResponse getHoldingsForUser(@PathVariable("userId") String userId)
	{
		GetHoldingsResponse response = new GetHoldingsResponse();
		response.setUserId(userId);
		response.setHodings(getHoldings(userId));
		return response;
	}
	
	private List<Holding> getHoldings(String userId) {
		List<Holding> holdings = new ArrayList<>();
		
		Holding h1 = new Holding();
		h1.setUesrId
		("gaurav.rehan@gmail.com");
		h1.setTicker("RELIANCE");
		h1.setNumberOfShares(100);
		
		holdings.add(h1);
		
		Holding h2 = new Holding();
		h2.setUesrId("gaurav.rehan@gmail.com");
		h2.setTicker("STATEBANKOFINDIA");
		h2.setNumberOfShares(200);
		
		holdings.add(h2);
		
		return holdings.stream().filter(h -> h.getUesrId().equalsIgnoreCase(userId)).collect(Collectors.toList());

	}

}
