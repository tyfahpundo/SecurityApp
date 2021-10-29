package zw.co.afrosoft.service;

import org.springframework.stereotype.Service;
import zw.co.afrosoft.domain.Cards;
import zw.co.afrosoft.domain.Customer;
import zw.co.afrosoft.persistence.CardsRepository;

import java.util.List;

@Service
public class CardsServiceImpl implements CardsService {
    private CardsRepository cardsRepository;
    @Override
    public List<Cards> getCardsDetails(Customer customer) {
        return  cardsRepository.findByCustomerId(customer.getId());
    }
}
