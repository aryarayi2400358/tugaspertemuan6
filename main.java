public class main {
    public static void main(String[] args) {
        
        PersegiPanjang objectPersegiPanjang = new PersegiPanjang();
        System.out.println("Luas segitiga dengan panjang = " +objectPersegiPanjang.panjang+ " dan lebar = " +objectPersegiPanjang.lebar+ " adalah " + objectPersegiPanjang.getLuas() + ", sedangkan kelilingnya adalah  " +objectPersegiPanjang.getKeliling());

        PersegiPanjang objectPersegiPanjang2 = new PersegiPanjang();
        objectPersegiPanjang2.setPanjang(30);
        objectPersegiPanjang2.setLebar(40);
        System.out.println("Luas segitiga dengan panjang = " +objectPersegiPanjang2.panjang+ " dan lebar = " +objectPersegiPanjang2.lebar+ " adalah " + objectPersegiPanjang2.getLuas() + ", sedangkan kelilingnya adalah  " +objectPersegiPanjang2.getKeliling());

        PersegiPanjang objectPersegiPanjang3 = new PersegiPanjang(25, 35);
        System.out.println("Luas segitiga dengan panjang = " +objectPersegiPanjang3.panjang+ " dan lebar = " +objectPersegiPanjang3.lebar+ " adalah " + objectPersegiPanjang3.getLuas() + ", sedangkan kelilingnya adalah  " +objectPersegiPanjang3.getKeliling());
        
    }
}
