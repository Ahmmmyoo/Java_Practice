public class Genz {
    public static void main(String[] args) {

    }
}

class GenA {
    private int aPri;
            int aPub;
    public void setaPri(int aPri) {
        this.aPri = aPri;
    }
    public void setaPub(int aPub) {
        this.aPub = aPub;
    }
    public int getaPri() {
        return aPri;
    }
    public int getaPub() {
        return aPub;
    }



}

class GenB extends GenA {
    private int bPri;
            int bPub;
    public void setbPri(int bPri) {
        this.bPri = bPri;
    }
    public void setbPub(int bPub) {
        this.bPub = bPub;
    }
    public int getbPri() {
        return bPri;
    }
    public int getbPub() {
        return bPub;
    }

    public int geta() {
        return super.getaPri();
    }

}

class GenC extends GenB {
    private int cPri;
            int cPub;
    public void setcPri(int cPri) {
        this.cPri = cPri;
    }
    public void setcPub(int cPub) {
        this.cPub = cPub;
    }
    public int getcPri() {
        return cPri;
    }
    public int getcPub() {
        return cPub;
    }

    public int geta() {
        return super.geta();
    }

}

class GenD extends GenC {
    private int dPri;
            int dPub;
    public void setdPri(int dPri) {
        this.dPri = dPri;
    }
    public void setdPub(int dPub) {
        this.dPub = dPub;
    }
    public int getdPri() {
        return dPri;
    }
    public int getdPub() {
        return dPub;
    }

    public int geta() {
        return super.geta();
    }

}
