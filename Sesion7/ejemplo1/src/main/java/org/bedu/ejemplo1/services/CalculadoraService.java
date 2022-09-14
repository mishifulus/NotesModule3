package org.bedu.ejemplo1.services;

import org.bedu.ejemplo1.persistance.CalculadoraDao;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CalculadoraService {

    private final CalculadoraDao calculadoraDao;
    
    /*public int suma(int a, int b) {
        return a + b + calculadoraDao.findValorConstante();
    }
    public int resta(int a, int b) {
        return a - b + calculadoraDao.findValorConstante();
    }
    public int multiplica(int a, int b) {
        return a * b + calculadoraDao.findValorConstante();
    }*/

    public int suma(int a, int b, int c) {
        return a + b + calculadoraDao.findValorConstanteDos(c);
    }
    public int resta(int a, int b, int c) {
        return a - b + calculadoraDao.findValorConstanteDos(c);
    }
    public int multiplica(int a, int b, int c) {
        return a * b + calculadoraDao.findValorConstanteDos(c);
    }
}
