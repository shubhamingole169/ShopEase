package com.ShopeEase.service;

import com.ShopeEase.exception.ProductException;
import com.ShopeEase.modal.Cart;
import com.ShopeEase.modal.CartItem;
import com.ShopeEase.modal.User;
import com.ShopeEase.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
