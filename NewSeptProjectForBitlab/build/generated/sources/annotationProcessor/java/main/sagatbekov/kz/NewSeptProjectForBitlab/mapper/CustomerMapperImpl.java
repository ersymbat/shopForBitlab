package sagatbekov.kz.NewSeptProjectForBitlab.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import sagatbekov.kz.NewSeptProjectForBitlab.DTO.CustomerDTO;
import sagatbekov.kz.NewSeptProjectForBitlab.entities.Customer;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-07T14:45:17+0500",
    comments = "version: 1.6.2, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.10.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO mapToDTO(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setId( customer.getId() );
        customerDTO.setName( customer.getName() );
        customerDTO.setEmail( customer.getEmail() );
        customerDTO.setPassword( customer.getPassword() );
        customerDTO.setAddress( customer.getAddress() );

        return customerDTO;
    }

    @Override
    public Customer mapToEntity(CustomerDTO customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( customerDTO.getId() );
        customer.setName( customerDTO.getName() );
        customer.setEmail( customerDTO.getEmail() );
        customer.setPassword( customerDTO.getPassword() );
        customer.setAddress( customerDTO.getAddress() );

        return customer;
    }

    @Override
    public List<CustomerDTO> mapToDTOList(List<Customer> customers) {
        if ( customers == null ) {
            return null;
        }

        List<CustomerDTO> list = new ArrayList<CustomerDTO>( customers.size() );
        for ( Customer customer : customers ) {
            list.add( mapToDTO( customer ) );
        }

        return list;
    }

    @Override
    public List<Customer> mapToEntityList(List<CustomerDTO> customerDTOS) {
        if ( customerDTOS == null ) {
            return null;
        }

        List<Customer> list = new ArrayList<Customer>( customerDTOS.size() );
        for ( CustomerDTO customerDTO : customerDTOS ) {
            list.add( mapToEntity( customerDTO ) );
        }

        return list;
    }
}
