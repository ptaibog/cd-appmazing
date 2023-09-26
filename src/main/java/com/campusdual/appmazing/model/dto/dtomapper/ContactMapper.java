package com.campusdual.appmazing.model.dto.dtomapper;

import com.campusdual.appmazing.model.Contact;
import com.campusdual.appmazing.model.dto.ContactDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ContactMapper {

    // va a utilizar el solo un elemento instance
    ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);

    // pasado un producto lo convierte en un productoDTO
    ContactDTO toDTO(Contact contact);
    // pasarle una lista de productos y nos devuelve una lista de dto
    List<ContactDTO> toDTOList(List<Contact> contacts);
    // pasar producto dto a producto
    Contact toEntity(ContactDTO contactDTO);
}
