package refactor.tank;


import refactor.tank.objectbattlefield.*;
import refactor.tank.tanks.*;


import java.awt.*;
import javax.swing.*;

public class ActionField extends JPanel {
    private boolean COLORDED_MODE = false;

    private BattleField battleField;
    private AbstractTank defender;
    private AbstractTank agressor;
    private Bullet bullet;

    public void runTheGame() throws Exception {

    }

//    private boolean legalMove (AbstractTank abstractTank) {
//        this.defender = abstractTank;
//        if ((abstractTank.getDirection() == Direction.UP && abstractTank.getY() == 0)
//                || (abstractTank.getDirection() == Direction.DOWN && abstractTank.getY() >= battleField.getBfHeight() - battleField.getQuadratPx())
//                || (abstractTank.getDirection() == Direction.LEFT && abstractTank.getX() == 0)
//                || (abstractTank.getDirection() == Direction.RIGHT && abstractTank.getX() >= battleField.getBfWidth() - battleField.getQuadratPx())) {
//            System.out.println("[illegal move] direction: " + abstractTank.getDirection()
//                    + " tankX: " + abstractTank.getX() + ", tankY: " + abstractTank.getY());
//            return true;
//        }
//        return false;
//    }

//    private void cleanQuadrant(AbstractTank abstractTank) throws Exception {
//        this.defender = abstractTank;
//        String quadrant = getQuadrant(abstractTank.getX(), abstractTank.getY());
//        int y = Integer.valueOf(quadrant.substring(0, quadrant.indexOf("_")));
//        int x = Integer.valueOf(quadrant.substring(quadrant.indexOf("_") + 1));
//        if (abstractTank.getDirection() == Direction.UP) {
//            y -= 1;
//        } else if (abstractTank.getDirection() == Direction.DOWN) {
//            y += 1;
//        } else if (abstractTank.getDirection() == Direction.LEFT) {
//            x -= 1;
//        } else {
//            x += 1;
//        }
//        if (battleField.scanQuadrant(y, x) instanceof Brink){
////            abstractTank.fire();
//        }
//    }


//    public void processMove(AbstractTank abstractTank) throws Exception {
//        this.defender = abstractTank;
//        int step = 1;
//        int covered = 0;
//
//        if (legalMove(abstractTank)) {
//            return;
//        }
////        abstractTank.turn(abstractTank.getDirection());
//
//        cleanQuadrant(abstractTank);
//
//        while (covered < battleField.getQuadratPx()) {
//            if (abstractTank.getDirection() == Direction.UP) {
//                abstractTank.updateY(-step);
////                System.out.println("[move up] direction: " + defender.getDirection()
////                        + " tankX: " + defender.getX() + ", tankY: " + defender.getY());
//            } else if (abstractTank.getDirection() == Direction.DOWN) {
//                abstractTank.updateY(step);
////                System.out.println("[move down] direction: " + defender.getDirection()
////                        + " tankX: " + defender.getX() + ", tankY: " + defender.getY());
//            } else if (abstractTank.getDirection() == Direction.LEFT) {
//                abstractTank.updateX(-step);
////                System.out.println("[move left] direction: " + defender.getDirection()
////                        + " tankX: " + defender.getX() + ", tankY: " + defender.getY());
//            } else {
//                abstractTank.updateX(step);
////                System.out.println("[move right] direction: " + defender.getDirection()
////                        + " tankX: " + defender.getX() + ", tankY: " + defender.getY());
//            }
//            covered += step;
//
//            repaint();
//            Thread.sleep(abstractTank.getSpeed());
//        }
//    }

//    public void processTurn(AbstractTank abstractTank) throws Exception {
//        repaint();
//    }

//    public void processFire(Bullet bullet) throws Exception {
//        this.bullet = bullet;
//        int step = 1;
//        while ((bullet.getX() > -14 && bullet.getX() < battleField.getBfWidth()) && (bullet.getY() > -14
//                && bullet.getY() < battleField.getBfHeight()))  {
//            if (bullet.getDirection() == Direction.UP) {
//                bullet.updateY(-step);
////                System.out.println("[move bullet up] direction: " + bullet.getDirection() + " bulletX: " + bullet.getX() + ", bulletY: " + bullet.getY());
//            } else if (bullet.getDirection() == Direction.DOWN) {
//                bullet.updateY(step);
////                System.out.println("[move bullet down] direction: " + bullet.getDirection() + " bulletX: " + bullet.getX() + ", bulletY: " + bullet.getY());
//            } else if (bullet.getDirection() == Direction.LEFT) {
//                bullet.updateX(-step);
////                System.out.println("[move bullet left] direction: " + bullet.getDirection() + " bulletX: " + bullet.getX() + ", bulletY: " + bullet.getY());
//            } else {
//                bullet.updateX(step);
////                System.out.println("[move bullet right] direction: " + bullet.getDirection() + " bulletX: " + bullet.getX() + ", bulletY: " + bullet.getY());
//            }
//            if (processInterception()) {
//                repaint();
//                break;
//            }
//            repaint();
//            Thread.sleep(bullet.getSpeed());
//        }
//    }



//    public String getQuadrantXY(int v, int h) {
//        return (v - 1) * battleField.getQuadratPx() + "_" + (h - 1) * battleField.getQuadratPx();
//    }
//
//    public String getQuadrant(int x, int y) {
//        return (y / battleField.getQuadratPx()) + "_" + (x / battleField.getQuadratPx());
//    }

//    private boolean processInterception() throws Exception {
//        String quadrant = getQuadrant(bullet.getX(), bullet.getY());
//        int v = Integer.valueOf(quadrant.substring(0, quadrant.indexOf("_")));
//        int h = Integer.valueOf(quadrant.substring(quadrant.indexOf("_") + 1));
//        if (h >= 0 && h < battleField.getH() && v >= 0 && v < battleField.getV()) {
//            if (battleField.scanQuadrant(v, h) instanceof Brink) {
//                battleField.updateQuadrant(v, h, new Emply(v,h));
//                bullet.destroy();
//                return true;
//            }
//            if (checkInterception(getQuadrant(agressor.getX(), agressor.getY()), quadrant )) {
//                    agressor.destroy();
//                    bullet.destroy();
//                    repaint();
//                    Thread.sleep(3000);
//                    String location = battleField.getRandomLacationAgressor();
////                    agressor = new Tiger(this, battleField, Integer.valueOf(location.substring(0, location.indexOf("_"))),
////                            Integer.valueOf(location.substring(location.indexOf("_") + 1)), Direction.NONE);
//                    repaint();
//                return true;
//                    }
////            if (checkInterception(getQuadrant(defender.getX(), defender.getY()), quadrant )) {
////                defender.destroy();
////                return true;
////            }
//        }
//        return false;
//    }

//    private boolean checkInterception(String object, String quadrant) {
//        int oy = Integer.valueOf(object.substring(0, object.indexOf("_")));
//        int ox = Integer.valueOf(object.substring(object.indexOf("_") + 1));
//
//        int qy = Integer.valueOf(quadrant.substring(0, quadrant.indexOf("_")));
//        int qx = Integer.valueOf(quadrant.substring(quadrant.indexOf("_") + 1));
//
//        if (oy >= 0 && oy < 9 && ox >= 0 && ox < 9) {
//            if (oy == qy && ox == qx) {
//                return true;
//            }
//        }
//        return false;
//    }


    public ActionField() throws Exception {

        String[][] bf = {
                {"B", "B", "B", "B", "B", "B", "B", "B", "B"},
                {"B", " ", " ", " ", " ", " ", " ", " ", "B"},
                {"B", "B", "B", " ", "B", " ", "B", "B", "B"},
                {"B", "B", "B", " ", "W", " ", "B", "B", "B"},
                {"B", "B", "B", " ", "W", " ", "B", "B", "B"},
                {"B", "B", " ", "R", "R", "R", " ", "B", "B"},
                {"B", "B", " ", " ", " ", " ", " ", "B", "B"},
                {"B", " ", " ", "B", "B", "B", " ", " ", "B"},
                {"B", " ", " ", "B", "E", "B", " ", " ", "B"}
        };
        battleField = new BattleField(bf);


        JFrame frame = new JFrame("BATTLE FIELD - CLASS");
        frame.setLocation(750, 150);
        frame.setMinimumSize(new Dimension(battleField.getBfWidth() + 14, battleField.getBfHeight() + 14 + 22));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int i = 0;
        Color cc;


        for (int j = 0; j < battleField.getDimentionY(); j++) {
            for (int k = 0; k < battleField.getDimentionX(); k++) {
                   battleField.scanQuadrant(j,k).draw(g);
            }
        }
//            defender.draw( g);
//            agressor.draw( g);
//            bullet.draw(g);

    }


}

