package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.Contact;
import com.campusdual.appmazing.model.dto.ContactDTO;
import com.campusdual.appmazing.model.dto.ProductDTO;

import java.util.List;

public interface IContactService {
    ContactDTO queryContact (ContactDTO contact);
    List<ContactDTO> queryAllContacts();

    int insertContact(ContactDTO contactDTO);
    int updateContact(ContactDTO contactDTO);
    int deleteContact(ContactDTO contactDTO);



}
