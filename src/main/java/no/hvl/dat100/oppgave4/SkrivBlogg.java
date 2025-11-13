package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

        PrintWriter file = null;

        try{
            file = new PrintWriter(mappe+filnavn);
            file.print(samling.toString());
        } catch (FileNotFoundException error) {
            System.err.println("Error: Fil ikke funnet! " + error.getMessage());
        } finally {
            if (file != null){
                file.close();
            }
        }
        return true;
	}
}
