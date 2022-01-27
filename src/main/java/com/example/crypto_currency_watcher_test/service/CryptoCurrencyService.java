package com.example.crypto_currency_watcher_test.service;

import com.example.crypto_currency_watcher_test.entity.CryptoCurrency;
import com.example.crypto_currency_watcher_test.repository.CryptoCurrencyRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

//@Service
//public class CryptoCurrencyService {
//
//    @Autowired
//    private CryptoCurrencyRepository cryptoRepository;
//
//    public boolean save(CryptoCurrency cryptoCurrency) throws ObjectNotFoundException {
//        if (findById(cryptoCurrency.getId()) == null) {
//            return false;
//        }
//        cryptoRepository.save(cryptoRepository);
//        return true;
//    }
//
//    public CryptoCurrencyRepository findById(Long id) throws ObjectNotFoundException {
//        CryptoCurrencyRepository cryptoCurrency;
//        Optional<CryptoCurrencyRepository> cryptoCurrencyOptional = cryptoRepository.findById(id);
//        if (cryptoCurrencyOptional.isPresent()) {
//            cryptoCurrency = cryptoCurrencyOptional.get();
//        } else {
//            throw new RuntimeException("Not found the cryptocurrency with id=" + id);
//        }
//        return cryptoCurrency;
//    }
//
//    public List<CryptoCurrencyRepository> findAll() {
//        return cryptoRepository.findAll();
//
//    }
//@Transactional
//    public boolean update(CryptoCurrency cryptoCurrency) {
//        CryptoCurrency updateCrypto = (CryptoCurrency) cryptoRepository.getById(cryptoCurrency.getId());
//        if (updateCrypto == null) {
//            save(cryptoCurrency);
//        }
//        updateCrypto.setId(cryptoCurrency.getId());
//        updateCrypto.setSymbol(cryptoCurrency.getSymbol());
//        updateCrypto.setCost(cryptoCurrency.getCost());
//        return true;
//    }
//
//}
