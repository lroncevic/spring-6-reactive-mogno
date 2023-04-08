package com.lukaroncevic.reactivemongo.mappers;

import com.lukaroncevic.reactivemongo.domain.Beer;
import com.lukaroncevic.reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
