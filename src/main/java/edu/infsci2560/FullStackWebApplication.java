package edu.infsci2560;

import edu.infsci2560.models.Movie;
import edu.infsci2560.models.Movie.VideoType;
import edu.infsci2560.repositories.MovieRepository;
import edu.infsci2560.models.Player;
import edu.infsci2560.models.Player.PlayerLevel;
import edu.infsci2560.repositories.PlayerRepository;
import edu.infsci2560.models.Game;
import edu.infsci2560.repositories.GameRepository;
import edu.infsci2560.models.Comment;
import edu.infsci2560.models.Comment.CommentType;
import edu.infsci2560.repositories.CommentRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);
        
        // Movies Repo
        MovieRepository mRepository = ctx.getBean(MovieRepository.class);
        mRepository.save(new Movie(1L, "Top 10 Catches of OBJ", VideoType.Highlight));
        mRepository.save(new Movie(2L, "Super Bowl 49", VideoType.Replay));
        mRepository.save(new Movie(3L, "Do your job", VideoType.Documentary));
        
        // Player Repo
        PlayerRepository pRepository = ctx.getBean(PlayerRepository.class);
        pRepository.save(new Player(1L, "Carson Wentz","Philadelphia Eagles", PlayerLevel.NFL));
        pRepository.save(new Player(2L, "Mike Williams", "Clemson", PlayerLevel.College));

        // Game Repo
        GameRepository gRepository = ctx.getBean(GameRepository.class);
        gRepository.save(new Game(1L, "Philadelphia Eagles","Dallas Cowboys", 2016L, "Eagles finished the season strong"));
        
        // Comment Repo
        CommentRepository cRepository = ctx.getBean(CommentRepository.class);
        cRepository.save(new Comment(1L, "Fly Eagles Fly", CommentType.Team));
    }


//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
//    @Bean
//    public CommandLineRunner databaseDemo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Customer("Jack", "Bauer"));
//            repository.save(new Customer("Chloe", "O'Brian"));
//            repository.save(new Customer("Kim", "Bauer"));
//            repository.save(new Customer("David", "Palmer"));
//            repository.save(new Customer("Michelle", "Dessler"));
//            repository.save(new Customer("Billy", "Bean"));
//
//            // fetch all customers
//            log.info("[Database Demo] Customers found with findAll():");
//            log.info("[Database Demo] -------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info("[Database Demo] " + customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Customer customer = repository.findOne(1L);
//            log.info("[Database Demo] Customer found with findOne(1L):");
//            log.info("[Database Demo] --------------------------------");
//            log.info("[Database Demo] " + customer.toString());
//
//            // fetch customers by last name
//            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
//            log.info("[Database Demo] --------------------------------------------");
//            for (Customer bauer : repository.findByLastName("Bauer")) {
//                log.info("[Database Demo] " + bauer.toString());
//            }
//        };
//    }
}
