package com.projectTeam3.Service;

import com.projectTeam3.DAO.CartDAO;
import com.projectTeam3.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CartService {
 CartDAO cartDAO;
 @Autowired
  public CartService(CartDAO cartDAO) {
   this.cartDAO = cartDAO;
 }
   public void saveCart(Cart c){
     cartDAO.save(c);
   }
  public List<Cart> getAllCarts(){
   return cartDAO.FindAllCart();
  }
  public  Cart getCartById(Cart c, int user_id){
   return cartDAO.FindCartById(user_id);

  }
  public Cart getCartCheckoutId(int checkOut_Id){
   return cartDAO.findAllCartCheckOutId(checkOut_Id);
  }
}
