package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;


    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this(new LinkedHashMap<>());
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add(phoneNumber);

        if (phonebook.get(name) == null) {
            phonebook.put(name, numbers);
        }
        else {
            phonebook.get(name).add(phoneNumber);
        }
    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> entries = Arrays.asList(phoneNumbers);

        if (phonebook.get(name) == null) {
            phonebook.put(name, entries);
        }
        else {
            phonebook.get(name).addAll(entries);
        }
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);
    }

    public Boolean hasEntry(String name, String phoneNumber) {
       return phonebook.containsKey(name) && phonebook.get(name).contains(phoneNumber);

    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for (String name : phonebook.keySet()) {
            if (phonebook.get(name).contains(phoneNumber)) {
                return name;
            }
        }
        
        return null;
    }

    public List<String> getAllContactNames() {
        return new ArrayList<>(phonebook.keySet());

    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }


}
