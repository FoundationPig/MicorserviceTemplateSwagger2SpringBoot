package com.kashik.swagger2springboot;

import com.kashik.swagger2springboot.model.Contact;
import org.openapitools.api.BookApi;
import org.openapitools.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Controller
@RequestMapping("/api")
public class AddressBookResource implements BookApi {

    ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    public Contact getContact(@PathVariable String id) {
        return contacts.get(0);
    }

    @GetMapping("/")
    public List<Contact> getAllContact() {
        return new ArrayList<Contact>(contacts.values());
    }

    @PostMapping("/")
    public Contact getContact(@RequestBody Contact contact) {
        contacts.put(contact.getId(), contact);
        return contact;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return BookApi.super.getRequest();
    }

    @Override
    public ResponseEntity<String> addBook(Book book) {
        return BookApi.super.addBook(book);
    }

    @Override
    public ResponseEntity<List<Book>> getBooks() {
        return BookApi.super.getBooks();
    }
}
