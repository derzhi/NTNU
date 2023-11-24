import static javax.swing.JOptionPane.*;

public class oppg2 {
    public static void main(String[] args) {
        int exit = 0;
        do {
            program();

            int inputCheckContinue = showConfirmDialog(null, "Fortsette?");

            if (inputCheckContinue == 1 || inputCheckContinue == 2 || inputCheckContinue == -1) {
                exit = 1;
            }

            System.out.println(inputCheckContinue);

        } while (exit < 1);

    }

    public static void program() {
        String inputCheckPrime = showInputDialog("Tast inn ett tall");

        try {
            int checkPrime = Integer.parseInt(inputCheckPrime);
            boolean isPrime = checkForPrime(checkPrime);

            if (isPrime) {
                showMessageDialog(null, checkPrime + " er et primtall");
                return;
            }
            showMessageDialog(null, checkPrime + " er ikke et primtall");

        } catch (NumberFormatException e) {
            System.out.println("Feil inndata");
        }
        return;
    }

    public static boolean checkForPrime(int num) {
        if (num <= 5) {
            if (num == 1 || num == 2 || num == 3 || num == 5) {
                return true;
            }
        }
        if ((num + 1) % 6 == 0 || (num - 1) % 6 == 0) {
            return true;
        }

        return false;
        
    }
}
