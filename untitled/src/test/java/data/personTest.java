package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class personTest
{
    @Test
    void getName()
    {
        person p = new person("James");
        assertEquals("James", p.getName());
    }
}