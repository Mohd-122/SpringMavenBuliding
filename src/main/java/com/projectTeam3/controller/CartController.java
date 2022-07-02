package com.projectTeam3.controller;
import com.projectTeam3.Service.CartService;
import com.projectTeam3.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


@RestController
@RequestMapping("cart")

public  class CartController {
    CartService cartService;
    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    @PostMapping
    public void saveCart(@RequestBody Cart c)
    {
        cartService.saveCart(c);

    }
    @GetMapping
    public List<Cart> getAllCarts()
    {
        return cartService.getAllCarts();
    }
    @GetMapping("user_id")
    public  Cart getCartById(@RequestBody Cart c, @PathVariable int user_id){
       return cartService.getCartById(c, user_id);
    }
   @GetMapping("{chekOut_Id}")
    public  Cart getCartByCheckOutById(@PathVariable int checkOut_Id){
         return cartService.getCartCheckoutId(checkOut_Id);

   }
}
