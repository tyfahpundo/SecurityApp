package zw.co.afrosoft.service;

import zw.co.afrosoft.domain.Cards;
import zw.co.afrosoft.domain.Customer;

import java.util.List;

public interface CardsService {
    List<Cards> getCardsDetails(Customer customer);
}
