public class PersegiPanjang {
    int panjang;
    int lebar;

    PersegiPanjang(){
        panjang = 1;
        lebar = 1;
    }

    PersegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
    }

    int getLuas(){
        return panjang * lebar;
    }

    int getKeliling(){
        return 2 * (panjang + lebar);
    }

    void setPanjang(int newPanjang){
        panjang = newPanjang;
    }

    void setLebar(int newLebar){
        lebar = newLebar;
    }
}
