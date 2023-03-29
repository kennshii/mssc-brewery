package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Customer;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-29T20:30:12+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto toCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        CustomerDto.CustomerDtoBuilder customerDto1 = CustomerDto.builder();

        customerDto1.id( customerDto.getId() );
        customerDto1.name( customerDto.getName() );

        return customerDto1.build();
    }

    @Override
    public Customer toCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        Customer.CustomerBuilder customer1 = Customer.builder();

        customer1.id( customer.getId() );
        customer1.name( customer.getName() );

        return customer1.build();
    }
}
