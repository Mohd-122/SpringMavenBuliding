package com.projectTeam3.DAO;
import com.projectTeam3.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface CartDAO extends JpaRepository<Cart, Integer> {
    @Query("FROM Cart")
   public List<Cart> FindAllCart();
    @Query("From Cart where User_Id  = :user_Id ")
   public  Cart FindCartById(@Param("user_Id") int id);
    @Query(" From Cart where checkOut_Id =  :checkOut_Id ")
   public  Cart findAllCartCheckOutId(@Param("checkOut_Id") int id);
}