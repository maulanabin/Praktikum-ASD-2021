package ASD.ProgramTanah;
// Maulana Bintang Irfansyah_TI-1H_2041720132
public class Tanah {
    public double panjangTanah, lebarTanah;

    public Tanah(double panjangTanah, double lebarTanah) {
        this.panjangTanah = panjangTanah;
        this.lebarTanah = lebarTanah;
    }
    public double hitungLuasTanah() {
        return panjangTanah * lebarTanah;
    }
    public static void mencariTanahTerluas(Tanah[] arrTanah) {
        double terluas = arrTanah[0].hitungLuasTanah(), tanah = 1;
        for (int z = 0; z < arrTanah.length; z++) {
            if (arrTanah[z].hitungLuasTanah() > terluas) {
                terluas = arrTanah[z].hitungLuasTanah();
                tanah = z + 1;
            }
        }
        System.out.println("Tanah terluas\t: Tanah " + (int) tanah);
    }
}
