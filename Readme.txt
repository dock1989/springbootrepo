1. What is spring boot --- Spring boot is the framework of frameworks,
It gives you robust development environment

MVC --- model view controller

Controller --- which controls your application. --- @RestController,@Controller
Model --- the file which contains data structure.
View --- the file which contain user interface --- Html, jsp pages

@SpringBootApplication -- your application is a spring boot project.
It is a combination of 3 annotation(@EnableAutoConfiguration, @Configuration, @ComponentScan)

@Service, @Repository, @Entity, @Component


Controller(end point) ----> service(logic) ---> dao(native/custom query) ---> repository(connection to entity) ---> entity(ORM/ replica of table in java)

Input in Api:
1. @PathVariable --- only 1 input
2. @RequestParam --- 1-3/4 input
3. @RequestBody --- for json
