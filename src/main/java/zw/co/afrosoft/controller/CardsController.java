package zw.co.afrosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import zw.co.afrosoft.domain.Cards;
import zw.co.afrosoft.domain.Customer;
import zw.co.afrosoft.service.CardsService;

import java.util.List;

@RestController
public class CardsController {
    @Autowired
    private CardsService cardsService;

    @GetMapping("/myCards")
    public ResponseEntity<List<Cards>> getCardsDetails(@RequestBody Customer customer){
        List<Cards> cardsList = cardsService.getCardsDetails(customer);
        return new ResponseEntity<>(cardsList, HttpStatus.FOUND);
    }
}
