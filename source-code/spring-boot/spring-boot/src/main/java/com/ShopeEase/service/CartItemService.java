package com.ShopeEase.service;

import com.ShopeEase.exception.CartItemException;
import com.ShopeEase.exception.UserException;
import com.ShopeEase.modal.Cart;
import com.ShopeEase.modal.CartItem;
import com.ShopeEase.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
