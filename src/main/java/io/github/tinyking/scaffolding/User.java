package io.github.tinyking.scaffolding;

import lombok.Data;

/**
 * User
 *
 * @author Wang Jianchao(tinyking)
 * @date 2021/10/20 20:33.
 * @since 1.0
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
