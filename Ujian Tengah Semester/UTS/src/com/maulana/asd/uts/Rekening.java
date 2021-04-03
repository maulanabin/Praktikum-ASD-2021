package com.maulana.asd.uts;

public class Rekening {
    public String noRekening;
    public String namaDepan;
    public String namaBelakang;
    public String phone;
    public String email;

    public Rekening(String noRekening, String namaIbu, String nama, String phone, String email) {
        this.noRekening = noRekening;
        this.namaBelakang = namaIbu;
        this.namaDepan = nama;
        this.phone = phone;
        this.email = email;
    }

}
