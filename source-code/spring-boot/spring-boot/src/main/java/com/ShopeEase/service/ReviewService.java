package com.ShopeEase.service;

import java.util.List;

import com.ShopeEase.exception.ProductException;
import com.ShopeEase.modal.Review;
import com.ShopeEase.modal.User;
import com.ShopeEase.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
