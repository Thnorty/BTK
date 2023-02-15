import java.util.ArrayList;
import java.util.Random;

public class Tahta {
    public ArrayList<Hayvan> hayvanlar = new ArrayList<>();
    public ArrayList<Yemek> yemekler = new ArrayList<>();
    public Random random = new Random();
    public int x, y;
    public Nesne[][] tahta;

    public Tahta(int x, int y) {
        this.x = x;
        this.y = y;
        this.tahta = new Nesne[x][y];
        for (int i = 0; i < tahta.length; i++) {
            for (int j = 0; j < tahta[i].length; j++) {
                tahta[i][j] = new Nesne(i, j);
            }
        }
    }

    public void hayvanEkle() {
        int xCoords, yCoords;
        while (true) {
            xCoords = random.nextInt(x);
            yCoords = random.nextInt(y);
            if (tahta[xCoords][yCoords].getKaraker() == 'X')
                break;
        }
        Hayvan hayvan = new Hayvan(xCoords, yCoords);
        hayvanlar.add(hayvan);
        tahta[xCoords][yCoords].setNesne(hayvan);
    }

    public void yemekEkle() {
        int xCoords, yCoords;
        while (true) {
            xCoords = random.nextInt(x);
            yCoords = random.nextInt(y);
            if (tahta[xCoords][yCoords].getKaraker() == 'X')
                break;
        }
        Yemek yemek = new Yemek(xCoords, yCoords);
        yemekler.add(yemek);
        tahta[xCoords][yCoords].setNesne(yemek);
    }

    public void tahtayiBastir() {
        for (int i = 0; i < tahta.length; i++) {
            for (int j = 0; j < tahta[i].length; j++) {
                System.out.print(tahta[i][j].getKaraker() + " ");
            }
            System.out.println();
        }
    }

    public void tick() {
        for (int i = 0; i < hayvanlar.size(); i++) {
            int minUzaklik = Integer.MAX_VALUE;
            Yemek yemek = null;
            for (int j = 0; j < yemekler.size(); j++) {
                if (yemekler.get(j).getX()*yemekler.get(j).getX() + yemekler.get(j).getY()*yemekler.get(j).getY() < minUzaklik); {
                    minUzaklik = yemekler.get(j).getX()*yemekler.get(j).getX() + yemekler.get(j).getY()*yemekler.get(j).getY();
                    yemek = yemekler.get(j);
                }
            }
            if (Math.abs(yemek.getX() - hayvanlar.get(i).getX()) < Math.abs(yemek.getY() - hayvanlar.get(i).getY())) {
                if (yemek.getX() < hayvanlar.get(i).getX()) {
                    tahta[hayvanlar.get(i).getX()-1][hayvanlar.get(i).getY()].hayvan = tahta[hayvanlar.get(i).getX()][hayvanlar.get(i).getY()].hayvan;
                } else {
                    tahta[hayvanlar.get(i).getX()+1][hayvanlar.get(i).getY()].hayvan = tahta[hayvanlar.get(i).getX()][hayvanlar.get(i).getY()].hayvan;
                }
            } else {
                if (yemek.getY() < hayvanlar.get(i).getY()) {
                    tahta[hayvanlar.get(i).getX()][hayvanlar.get(i).getY()-1].hayvan = tahta[hayvanlar.get(i).getX()][hayvanlar.get(i).getY()].hayvan;
                } else {
                    tahta[hayvanlar.get(i).getX()][hayvanlar.get(i).getY()+1].hayvan = tahta[hayvanlar.get(i).getX()][hayvanlar.get(i).getY()].hayvan;
                }
            }
            tahta[hayvanlar.get(i).getX()][hayvanlar.get(i).getY()].hayvan = null;
            hayvanlar.add(tahta[hayvanlar.get(i).getX()][hayvanlar.get(i).getY()].hayvan);
            hayvanlar.remove(i);
        }
    }
}
