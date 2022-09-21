public class Klocki extends Zabawka {

    private String _liczbaKlockow;

    public Klocki(String _nazwa, Number _cena, String _liczbaKlockow) {
        super(_nazwa, _cena);
        this._liczbaKlockow = _liczbaKlockow;
    }

    public String get_liczbaKlockow() {
        return _liczbaKlockow;
    }

    public void set_liczbaKlockow(String _liczbaKlockow) {
        this._liczbaKlockow = _liczbaKlockow;
    }

    @Override
    public String toString() {
        return "Klocki{" +
                "_liczbaKlockow='" + _liczbaKlockow + '\'' +
                '}';
    }
}
