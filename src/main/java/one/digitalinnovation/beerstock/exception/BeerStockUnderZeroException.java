package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockUnderZeroException extends Exception {

    public BeerStockUnderZeroException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed results in stock under zero: %s", id, quantityToDecrement));
    }
}
