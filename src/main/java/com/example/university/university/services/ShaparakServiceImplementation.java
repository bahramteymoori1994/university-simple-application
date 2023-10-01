package com.example.university.university.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!dev")
public class ShaparakServiceImplementation implements ShaparakService
{
    @Override
    public void settle() {
        // connect to shaparak

    }
}