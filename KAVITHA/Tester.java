// Base Applicant class
class Applicant {
    String name;
    String jobProfile;
    int age;

    public Applicant(String name, String jobProfile, int age) {
        this.name = name;
        this.jobProfile = jobProfile;
        this.age = age;
    }
}

// ValidatedApplicant class (inherits from Applicant)
class ValidatedApplicant extends Applicant {

    public ValidatedApplicant(String name, String jobProfile, int age) throws Exception {
        super(name, jobProfile, age);
        validate();
    }

    private void validate() throws Exception {
        if (name == null || name.isEmpty()) {
            throw new Exception("Invalid name") {};
        }
        System.out.println("Valid name");

        if (!(jobProfile.equalsIgnoreCase("Associate") ||
              jobProfile.equalsIgnoreCase("Clerk") ||
              jobProfile.equalsIgnoreCase("Executive") ||
              jobProfile.equalsIgnoreCase("Officer"))) {
            throw new Exception("Invalid job profile") {};
        }
        System.out.println("Valid job profile");

        if (age < 18 || age > 30) {
            throw new Exception("Invalid age") {};
        }
        System.out.println("Valid age");

        System.out.println("Application submitted successfully!");
    }
}

// Tester class
public class Tester {
    public static void main(String[] args) {
        try {
            // Create a validated applicant (validation occurs on object creation)
            ValidatedApplicant applicant = new ValidatedApplicant("june", "Officer", 25);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
