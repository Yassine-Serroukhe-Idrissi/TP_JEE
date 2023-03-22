package presentation;

import dao.DaoImp;
import dao.DaoNSQL;
import metier.MetierImp;

public class Presentation {
    public static void main(String[] args){
        MetierImp metier = new MetierImp();
        DaoImp sql = new DaoImp();
        metier.setDao(sql);
        double resultat = metier.calcul();
        System.out.println("Resultat est : "+resultat);

        MetierImp metier2 = new MetierImp();
        DaoNSQL nosql = new DaoNSQL();
        metier2.setDao(nosql);
        double resultat2 = metier2.calcul();
        System.out.println("Resultat est : "+resultat2);


    }
}
