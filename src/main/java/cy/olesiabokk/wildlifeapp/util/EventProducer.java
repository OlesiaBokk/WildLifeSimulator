package cy.olesiabokk.wildlifeapp.util;

import cy.olesiabokk.wildlifeapp.entity.Manul;

public class EventProducer {
    public void startGame(Manul manul) throws InterruptedException {
        while (isAlive(manul)) {
            switch (getResult()) {
                case 1:
                    sleep(manul);
                    break;
                case 2:
                    eatMouse(manul);
                    break;
                case 3:
                    eatHare(manul);
                    break;
                case 4:
                    eatMarmot(manul);
                    break;
                case 5:
                    run(manul);
                    break;
                case 6:
                    playNewFriend(manul);
                    break;
                case 7:
                    attackedByFox(manul);
                    break;
                case 8:
                    attackedByDog(manul);
                    break;
                case 9:
                    defendTerritory(manul);
                    break;
                case 10:
                    findShelter(manul);
                    break;
                case 11:
                    groomFur(manul);
                    break;
            }
            Thread.sleep(200);
        }
        System.out.println("Manul had a good and interesting life. Now he's going to Manuls' Heaven");
    }

    private int getResult() {
        int a = (int) (Math.random() * 100);
        if (a >= 0 && a <= 7) {
            return 1;
        } else if (a >= 8 && a <= 16) {
            return 2;
        } else if (a >= 17 && a <= 25) {
            return 3;
        } else if (a >= 26 && a <= 34) {
            return 4;
        } else if (a >= 35 && a <= 43) {
            return 5;
        } else if (a >= 44 && a <= 50) {
            return 6;
        } else if (a >= 51 && a <= 62) {
            return 7;
        } else if (a >= 63 && a <= 74) {
            return 8;
        } else if (a >= 75 && a <= 81) {
            return 9;
        } else if (a >= 82 && a <= 89) {
            return 10;
        } else {
            return 11;
        }
    }

    private void sleep(Manul manul) {
        int energy = manul.getEnergy();
        int health = manul.getHealthLevel();
        energy = energy + 20;
        manul.setEnergy(energy);
        checkEnergy(manul);
        manul.setHealthLevel(health);
        checkHealth(manul);
        System.out.println("Manul slept and feels better. Current energy = " + manul.getEnergy() + " Current health = " + manul.getHealthLevel());
    }

    private void run(Manul manul) {
        int energy = manul.getEnergy();
        int health = manul.getHealthLevel();
        energy = energy - 5;
        manul.setEnergy(energy);
        checkEnergy(manul);
        manul.setHealthLevel(health);
        checkHealth(manul);
        System.out.println("Manul run and lost 5 energy points. Current energy = " + manul.getEnergy() + " Current health = " + manul.getHealthLevel());
    }

    private void eatMouse(Manul manul) {
        int energy = manul.getEnergy();
        int health = manul.getHealthLevel();
        energy = energy - 7;
        manul.setEnergy(energy);
        checkEnergy(manul);
        manul.setHealthLevel(manul.getHealthLevel() + (int) (manul.getJawCoeff() * 3));
        checkHealth(manul);
        System.out.println("Congrats! Manul caught a mouse and recovered health. Current energy = " + manul.getEnergy() + " Current health = " + manul.getHealthLevel());
    }

    private void eatHare(Manul manul) {
        int energy = manul.getEnergy();
        int health = manul.getHealthLevel();
        energy = energy - 10;
        manul.setEnergy(energy);
        checkEnergy(manul);
        health = health + (int) (manul.getJawCoeff() * 5);
        manul.setHealthLevel(health);
        checkHealth(manul);
        System.out.println("Wow! Manul caught a hare and recovered health. Current energy = " + manul.getEnergy() + " Current health = " + manul.getHealthLevel());
    }

    private void eatMarmot(Manul manul) {
        int energy = manul.getEnergy();
        int health = manul.getHealthLevel();
        energy = energy - 13;
        manul.setEnergy(energy);
        checkEnergy(manul);
        health = health + (int) (manul.getJawCoeff() * 8);
        manul.setHealthLevel(health);
        checkHealth(manul);
        System.out.println("Fantastic! Manul caught a marmot and recovered health. Current energy = " + manul.getEnergy() + " Current health = " + manul.getHealthLevel());
    }

    private void playNewFriend(Manul manul) {
        int energy = manul.getEnergy();
        int health = manul.getHealthLevel();
        energy = energy - 8;
        manul.setEnergy(energy);
        checkEnergy(manul);
        manul.setHealthLevel(health);
        checkHealth(manul);
        System.out.println("Manul met new friend and they played together. Current energy = " + manul.getEnergy() + " Current health = " + manul.getHealthLevel());
    }

    private void defendTerritory(Manul manul) {
        int energy = manul.getEnergy();
        int health = manul.getHealthLevel();
        energy = energy - 13;
        manul.setEnergy(energy);
        checkEnergy(manul);
        health = health - 3;
        manul.setHealthLevel(health);
        checkHealth(manul);
        System.out.println("Someone wanted to kick manul away from its home, but our hero won. Manul was a bit bitten and tired.\n" +
                "Current energy = " + manul.getEnergy() + " Current health = " + manul.getHealthLevel());
    }

    private void attackedByFox(Manul manul) {
        int energy = manul.getEnergy();
        int health = manul.getHealthLevel();
        energy = energy - 7;
        manul.setEnergy(energy);
        checkEnergy(manul);
        manul.setHealthLevel(manul.getHealthLevel() - 10);
        checkHealth(manul);
        System.out.println("Manul was attacked by fox. Manul lost some energy and was hit. Current energy = " + manul.getEnergy() + " Current health = " + manul.getHealthLevel());
    }

    private void attackedByDog(Manul manul) {
        int energy = manul.getEnergy();
        int health = manul.getHealthLevel();
        energy = energy - 10;
        manul.setEnergy(energy);
        checkEnergy(manul);
        manul.setHealthLevel(manul.getHealthLevel() - 15);
        checkHealth(manul);
        System.out.println("Oh no! Dog attacked manul. Manul lost some energy and was seriously bitten. Current energy = " + manul.getEnergy() + " Current health = " + manul.getHealthLevel());
    }

    private void findShelter(Manul manul) {
        int energy = manul.getEnergy();
        int health = manul.getHealthLevel();
        energy = energy - 2;
        manul.setEnergy(energy);
        checkEnergy(manul);
        manul.setHealthLevel(health);
        checkHealth(manul);
        System.out.println("Manul found s shelter, now it's safe. Current energy = " + manul.getEnergy() + " Current health = " + manul.getHealthLevel());
    }

    private void groomFur(Manul manul) {
        int energy = manul.getEnergy();
        int health = manul.getHealthLevel();
        energy = energy - 1;
        manul.setEnergy(energy);
        checkEnergy(manul);
        health = health + 1;
        manul.setHealthLevel(health);
        checkHealth(manul);
        System.out.println("Manul groomed itself and recovered some energy and health. Current energy = " + manul.getEnergy() + " Current health = " + manul.getHealthLevel());
    }

    public void checkEnergy(Manul manul) {
        if (manul.getEnergy() <= 0) {
            getHitPoint(manul);
            manul.setEnergy(0);
        } else if (manul.getEnergy() > 100) {
            manul.setEnergy(100);
        } else {
            manul.setEnergy(manul.getEnergy());
        }
    }

    public void checkHealth(Manul manul) {
        if (manul.getHealthLevel() > 100) {
            manul.setHealthLevel(100);
        } else if (manul.getHealthLevel() < 100 && manul.getHealthLevel() > 0) {
            manul.setHealthLevel(manul.getHealthLevel());
        } else if (manul.getHealthLevel() <= 0) {
            manul.setHealthLevel(0);
        }
    }

    public void getHitPoint(Manul manul) {
        if (manul.getEnergy() <= 0) {
            manul.setHealthLevel(manul.getHealthLevel() - 3);
        }
    }

    public boolean isAlive(Manul manul) {
        if (manul.getHealthLevel() <= 0) {
            return false;
        } else {
            return true;
        }
    }
}
