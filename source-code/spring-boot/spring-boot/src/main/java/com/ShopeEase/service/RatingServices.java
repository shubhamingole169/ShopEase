package com.ShopeEase.service;

import java.util.List;

import com.ShopeEase.exception.ProductException;
import com.ShopeEase.modal.Rating;
import com.ShopeEase.modal.User;
import com.ShopeEase.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
