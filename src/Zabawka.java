public class Zabawka {
    private String _nazwa;
    private Number _cena;

    public Zabawka(String _nazwa, Number _cena) {
        this._nazwa = _nazwa;
        this._cena = _cena;
    }

    public String get_nazwa() {
        return _nazwa;
    }

    public void set_nazwa(String _nazwa) {
        this._nazwa = _nazwa;
    }

    public Number get_cena() {
        return _cena;
    }

    public void set_cena(Number _cena) {
        this._cena = _cena;
    }

    @Override
    public String toString() {
        return "Zabawka{" +
                "_nazwa='" + _nazwa + '\'' +
                ", _cena=" + _cena +
                '}';
    }
}
