package io.samples.spring.integration.serviceactivator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Long id;

    private String name;
}
