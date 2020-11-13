package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstructorTest {
    private PhoneBook phoneBook;

    @Before
    public void setup() {
        this.phoneBook = new PhoneBook();
    }

    @Test
    public void testNullaryConstructor() {
        // given

        // when

        // then
        Assert.assertTrue(phoneBook.getMap() instanceof HashMap);
    }

    @Test
    public void testNonNullaryConstructor() {
        // given
        Map<String, List<String>> dependency = new HashMap<>();

        // when
        PhoneBook phoneBook = new PhoneBook(dependency);

        // then
        Assert.assertEquals(dependency, phoneBook.getMap());
    }
}
