package com.lianda.beginner.infowisata;

import java.util.ArrayList;

/**
 * Created by lenovo on 20/10/2017.
 */

public class WaterfallData {

    public static String [][] data = new String[][] {
            {"Curug Bidadari", "Sentul"},
            {"Curug Cilember", "Cisarua"},
            {"Curug Leuwi Hejo", "Babakan Madang"},
            {"Curug Cikoneng", "Sentul"},
            {"Curug Nangka", "Tamansari"},
    };

    public static int [][] detail = new int[][] {
            {R.drawable.bidadari,R.string.content_lokasi_bidadari,R.string.fasilitas_bidadari ,R.string.content_akseskendaraan_bidadari ,R.string.content_jamweekdays_bidadari , R.string.content_jamweekend_bidadari, R.string.content_hargaweekdays_bidadari, R.string.content_hargaweekend_bidadari, R.string.content_hargamobil_bidadari, R.string.content_hargamotor_bidadari },
            {R.drawable.cilember, R.string.content_lokasi_cilember,R.string.fasilitas_cilember,R.string.content_akseskendaraan_cilember,R.string.content_jamweekdays_cilember ,R.string.content_jamweekend_cilember,R.string.content_hargaweekdays_cilember,R.string.content_hargaweekend_cilember,R.string.content_hargamobil_cilember, R.string.content_hargamotor_cilember },
            {R.drawable.hejo, R.string.content_lokasi_leuwihejo , R.string.fasilitas_leuwihejo,R.string.content_akseskendaraan_leuwihejo, R.string.content_jamweekdays_leuwihejo,R.string.content_jamweekend_leuwihejo , R.string.content_hargaweekdays_leuwihejo,R.string.content_hargaweekend_leuwihejo, R.string.content_hargamobil_leuwihejo, R.string.content_hargamotor_leuwihejo },
            {R.drawable.koneng,R.string.content_lokasi_cikoneng , R.string.fasilitas_cikoneng , R.string.content_akseskendaraan_cikoneng, R.string.content_jamweekdays_cikoneng, R.string.content_jamweekend_cikoneng, R.string.content_hargaweekdays_cikoneng,R.string.content_hargaweekend_cikoneng, R.string.content_hargamobil_cikoneng,R.string.content_hargamotor_cikoneng },
            {R.drawable.nangka,R.string.content_lokasi_cinangka ,R.string.fasilitas_cinangka,R.string.content_akseskendaraan_cinangka, R.string.content_jamweekdays_cinangka, R.string.content_jamweekend_cinangka,R.string.content_hargaweekdays_cinangka, R.string.content_hargaweekend_cinangka,R.string.content_hargamobil_cinangka,R.string.content_hargamotor_cinangka },
    };

    public static ArrayList<Waterfall> getListData(){
        Waterfall waterfall = null;
        ArrayList<Waterfall> list = new ArrayList<>();

        for (int i = 0; i<data.length; i++){
            waterfall = new Waterfall();

            waterfall.setName(data[i][0]);
            waterfall.setPrice(data[i][1]);
            waterfall.setPhoto(detail[i][0]);
            waterfall.setLokasi(detail[i][1]);
            waterfall.setFasilitas(detail[i][2]);
            waterfall.setAkseskendaraan(detail[i][3]);
            waterfall.setJamweekdays(detail[i][4]);
            waterfall.setJamweekend(detail[i][5]);
            waterfall.setHargaweekdays(detail[i][6]);
            waterfall.setHargaweekend(detail[i][7]);
            waterfall.setHargamobil(detail[i][8]);
            waterfall.setHargamotor(detail[i][9]);

            list.add(waterfall);
        }
        return list;
    }
}
