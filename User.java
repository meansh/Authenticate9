// User entity class
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false, unique = true)
    private String phoneNumber;
    
    @Column(unique = true)
    private String email;
    
    @Column(nullable = false)
    private String password;
    
    // Getters and setters
}
