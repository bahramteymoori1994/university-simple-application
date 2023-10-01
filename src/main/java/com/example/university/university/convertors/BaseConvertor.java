package com.example.university.university.convertors;

import java.util.List;
import java.util.stream.Collectors;

public interface BaseConvertor<D, E>
{
    E convertDto(D dto);
    D convertEntity(E entity);

    default List<E> convertDto(List<D> dList)
    {
        if( dList != null )
        {
            return dList.stream()
                    .map(i -> convertDto(i))
                    .collect(Collectors.toList());
        }

        return null;
    }

    default List<D> convertEntity(List<E> eList)
    {
        if( eList != null )
        {
            return eList.stream()
                    .map(i -> convertEntity(i))
                    .collect(Collectors.toList());
        }

        return null;
    }
}