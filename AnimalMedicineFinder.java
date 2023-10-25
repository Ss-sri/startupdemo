import java.util.Scanner;

    public class AnimalMedicineFinder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Gather information about the animal and its symptoms.
            System.out.println("Animal Medicine Finder");
            System.out.print("Enter the type of animal (e.g., cat, dog, etc.): ");
            String animalType = scanner.nextLine();

            System.out.print("Enter the symptoms the animal is experiencing: ");
            String symptoms = scanner.nextLine();

            // Call a method to suggest medicine based on the information provided.
            String medicine = suggestMedicine(animalType, symptoms);

            // Display the suggested medicine or treatment.
            if (medicine != null && !medicine.isEmpty()) {
                System.out.println("Suggested medicine or treatment: " + medicine);
            } else {
                System.out.println("Sorry, we couldn't find a suggestion for your animal's condition.");
            }

            scanner.close();
        }

        // Method to suggest medicine based on animal type and symptoms (simplified).
        public static String suggestMedicine(String animalType, String symptoms) {
            // Add your logic here to suggest medicine based on the animal type and symptoms.
            // This is a simplified example and should not be used for real medical advice.
            // In a real-world scenario, consult a veterinarian.

            if (animalType.equalsIgnoreCase("cat") && symptoms.contains("fever")) {
                return "Antipyretic medicine for cats";
            } else if (animalType.equalsIgnoreCase("dog") && symptoms.contains("cough")) {
                return "Cough syrup for dogs";
            } else {
                return "Consult a veterinarian for proper diagnosis and treatment.";
            }
        }
    }


