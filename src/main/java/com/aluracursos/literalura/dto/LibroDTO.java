package com.aluracursos.literalura.dto;

public record LibroDTO(
        Long Id,
        String titulo,
        String autor,
        String idioma,
        Double numeroDeDescargas )
{

}