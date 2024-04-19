package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompteBancaire {
    @Test
    void testDebitSolde() {
		CompteBancaire cb = new CompteBancaire(150);
		assertEquals(100,cb.debiterSolde(50));
	}
    @Test
    void testNegDebitSolde() {
		CompteBancaire cb = new CompteBancaire(150);
		assertEquals(-50,cb.debiterSolde(200));
	}

	@Test
	void testCreditSolde() {
		CompteBancaire cb = new CompteBancaire(150);
		assertEquals(200,cb.crediterSolde(50));
	}

	@Test
	void testFailCreditSolde() {
		CompteBancaire cb = new CompteBancaire(150);
		assertEquals(fail(),cb.crediterSolde(-50));
	}
}
