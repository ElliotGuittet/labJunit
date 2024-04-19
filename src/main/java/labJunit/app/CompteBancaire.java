package labJunit.app;

import static org.junit.jupiter.api.Assertions.fail;

public class CompteBancaire {
    public double soldeCompte;

    public CompteBancaire(double solde) {
        soldeCompte = solde;
    }

    public double debiterSolde(double montant) {
        if (montant < 0) {
            return fail();
        } else {
            double newSolde = soldeCompte - montant;

            return newSolde;
        }
    }

    public double crediterSolde(double montant) {
        if (montant < 0) {
            return fail();
        } else {
            double newSolde = soldeCompte + montant;

            return newSolde;
        }
    }
}
