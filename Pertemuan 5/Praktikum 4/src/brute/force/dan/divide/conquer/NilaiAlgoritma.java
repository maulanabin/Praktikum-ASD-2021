package brute.force.dan.divide.conquer;
// TI 1H_Maulana Bintang Irfansyah_16_2041720132
public class NilaiAlgoritma {
    public String namaMahasiswa;
    public int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

    NilaiAlgoritma(String namaMahasiswa, int nilaiTugas, int nilaiKuis, int nilaiUTS, int nilaiUAS) {
        this.namaMahasiswa = namaMahasiswa;
        this.nilaiTugas = nilaiTugas;
        this.nilaiKuis = nilaiKuis;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    public double hitungTotalNilai() {
        return (nilaiTugas * 0.3) + (nilaiKuis * 0.2) + (nilaiUTS * 0.2) + (nilaiUAS * 0.3);
    }
}
