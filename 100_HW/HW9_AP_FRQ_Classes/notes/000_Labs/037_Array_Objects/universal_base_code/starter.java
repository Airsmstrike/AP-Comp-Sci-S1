/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
    public static void main(String args[]) {
        Wizard[] wizards = new Wizard[100];  
        Warrior[] warriors = new Warrior[100];  


        for (int i = 0; i < 100; i++) {
            wizards[i] = new Wizard(); 
        }

    
        for (int i = 0; i < 100; i++) {
            warriors[i] = new Warrior();  
        }

        int warriorcounter = 0;
        int wizardcounter = 0;

   
        while (warriorcounter < warriors.length && wizardcounter < wizards.length) {
            Wizard currentWizard = wizards[wizardcounter];
            Warrior currentWarrior = warriors[warriorcounter];

 
            if (!currentWizard.isDead()) {
                currentWizard.attack(currentWarrior);
            }


            if (!currentWarrior.isDead()) {
                currentWarrior.attack(currentWizard);
            }

   
            if (currentWarrior.isDead()) {
                warriorcounter++;
            }
            if (currentWizard.isDead()) {
                wizardcounter++;
            }
        }
        if (warriorcounter < warriors.length) {
            System.out.println("The Wizards are all dead. The Warriors win!");
            System.out.println("Warriors left: " + (warriors.length - warriorcounter));
        } else {
            System.out.println("The Warriors are all dead. The Wizards win!");
            System.out.println("Wizards left: " + (wizards.length - wizardcounter));
        }
    }
}