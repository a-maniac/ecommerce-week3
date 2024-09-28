package com.amaniac.ecommerce.inventory_service.service;

import com.amaniac.ecommerce.inventory_service.dto.ProductDto;
import com.amaniac.ecommerce.inventory_service.entity.Product;
import com.amaniac.ecommerce.inventory_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;


    public List<ProductDto> getAllInventory(){
        List<Product> inventories= productRepository.findAll();
        return inventories.stream()
                .map(product -> modelMapper.map(product,ProductDto.class))
                .toList();
    }

    public ProductDto getProductById(Long id){
        Optional<Product> inventory=productRepository.findById(id);
        return inventory.map(item->modelMapper.map(inventory,ProductDto.class))
                .orElseThrow(()-> new RuntimeException("Product Not Found"));
    }
}
