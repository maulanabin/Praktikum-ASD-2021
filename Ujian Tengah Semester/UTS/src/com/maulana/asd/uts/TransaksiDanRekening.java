package com.maulana.asd.uts;

public class TransaksiDanRekening {
    Rekening[] account = new Rekening[14];
    Transaksi[] transaction = new Transaksi[14];
    int rekIdx, traIdx;

    public void tambahRekening(Rekening m){
        if(rekIdx < account.length){
            account[rekIdx] = m;
            rekIdx++;
        }else{
            System.out.println("Data penuh!");
        }
    }
    public void tambahTransaksi(Transaksi m){
        if(traIdx < transaction.length){
            transaction[traIdx] = m;
            traIdx++;
        }else{
            System.out.println("Data penuh!");
        }
    }
    public void tunjukkanRekening(){
        System.out.println("No Rek\t\t  Nama \t\t\t  Phone\t\t Email");
        System.out.println("🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺");
        for(Rekening m : account){
            System.out.println(m.noRekening + "\t  " + m.namaDepan + " " + m.namaBelakang + "\t  " + m.phone + "\t " + m.email);
        }
        System.out.println("🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺");
    }
    public void tunjukkanTransaksi(){
        System.out.println("No Rek\t\t Saldo\t\t SaldoAwal\t SaldoAkhir\t Type\t\t Tanggal");
        System.out.println("🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺");
        for(int i = 0; i< transaction.length; i++){
            System.out.println(account[i].noRekening + "\t " + transaction[i].saldo + "\t " + transaction[i].saldoAwal + "\t "
                    + transaction[i].saldoAkhir + "\t " + transaction[i].type + "\t " + transaction[i].tanggalTransaksi);
        }
        System.out.println("🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺");
    }
    public void FindSeqSearch(int cari){
        System.out.println("🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺");
        for(int i = 0; i< transaction.length; i++){
            if(transaction[i].saldo > cari){
                System.out.println(account[i].noRekening + "\t " + transaction[i].saldo + "\t " + transaction[i].saldoAwal + "\t "
                        + transaction[i].saldoAkhir + "\t " + transaction[i].type + "\t " + transaction[i].tanggalTransaksi);
            }
        }
        System.out.println("🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺");
    }
    public void check(String cari){
        System.out.println("🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺");
        for(int i = 0; i< account.length; i++){
            if(account[i].noRekening.equals(cari)){
                System.out.println("No Rekening   : " + account[i].noRekening);
                System.out.println("Nama Pemilik  : " + account[i].namaDepan + " " + account[i].namaBelakang);
                System.out.println("Saldo\t\t SaldoAwal\t SaldoAkhir\t Type\t\t Tanggal");
                System.out.println("🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺");
                System.out.println(transaction[i].saldo + "\t " + transaction[i].saldoAwal + "\t "
                        + transaction[i].saldoAkhir + "\t " + transaction[i].type + "\t " + transaction[i].tanggalTransaksi);
            }
        }
        System.out.println("🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺 🌺");
    }
    public void sorting(boolean bool){
        int size = account.length;
        for(int i = 0; i<size-1; i++) {
            for (int j = i+1; j< account.length; j++) {
                if(!bool){
                    if(account[i].namaDepan.compareToIgnoreCase(account[j].namaDepan)>0) {
                        String temp = account[i].namaDepan;
                        account[i].namaDepan = account[j].namaDepan;
                        account[j].namaDepan = temp;
                    }
                }else{
                    if(account[i].namaDepan.compareToIgnoreCase(account[j].namaDepan)<0) {
                        String temp = account[i].namaDepan;
                        account[i].namaDepan = account[j].namaDepan;
                        account[j].namaDepan = temp;
                    }
                }
            }
        }
    }
}