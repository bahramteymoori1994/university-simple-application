package com.example.university.university.controller;

import com.example.university.university.convertors.BaseConvertor;
import com.example.university.university.exceptions.IdNotFoundException;
import com.example.university.university.exceptions.ServiceException;
import com.example.university.university.services.AbstractBaseService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
public abstract class AbstractBaseController<D, E>
{
    protected static final Logger LOGGER = LoggerFactory.getLogger(AbstractBaseController.class);
    @Autowired
    private BaseConvertor<D, E> convertor;

    @Autowired
    private AbstractBaseService<? extends JpaRepository<E, Long>, E> service;

    @PostMapping()
    public void add(@Valid @RequestBody D dto) throws ServiceException
    {
        this.service.add(convertor.convertDto(dto));
    }

    @PutMapping()
    public void update(@Valid @RequestBody D dto) throws ServiceException
    {
        this.service.update(convertor.convertDto(dto));
    }

    @DeleteMapping("/{id}")
    public void deleteById(Long id) throws ServiceException
    {
        this.service.deleteById(id);
    }

    @GetMapping("/{id}")
    public D findById(@PathVariable("id") Long id) throws ServiceException
    {
        return convertor.convertEntity(this.service.findById(id).orElseThrow(() -> new IdNotFoundException("Id Not Found")));
    }

    @GetMapping()
    public List<D> findAll() throws ServiceException
    {
        return convertor.convertEntity(this.service.findAll());
    }

    @PostMapping("/search")
    public List<D> findByExample(@Valid @RequestBody D dto) throws ServiceException
    {
        return convertor.convertEntity(this.service.findByExample(convertor.convertDto(dto)));
    }
}