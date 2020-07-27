package retour.projet;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestretourMessage {
	Affichage A= new Affichage();

	@Test
	public void test() {
		Affichage A= new Affichage();

assertEquals(10,A.somme(8, 2));
	}
	public void test2() {
		Affichage A= new Affichage();

assertEquals(13,A.somme(8, 5));
	}

}
