# Spring Boot學習筆記
## lesson1-hello-world
[Create a simple spring boot application using gradle](https://jenciso.github.io/blog/create-a-simple-spring-boot-application-with-gradle/)

## [Spring Boot 中的 @Transactional：輕鬆駕馭資料庫交易](https://blog.cashwu.com/blog/2024/spring-boot-transactional-usage-and-best-practices)
使用 @Transactional 非常簡單，只需要在方法或類上加上這個註解 (annotation) 即可。例如：
```

import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Transactional
    public void createUser(User user) {
        userRepository.save(user);
        emailService.sendWelcomeEmail(user.getEmail());
    }
}
```