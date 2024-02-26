public class SpamNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String phoneNumber;
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
