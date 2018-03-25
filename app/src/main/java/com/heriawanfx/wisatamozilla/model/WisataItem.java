package com.heriawanfx.wisatamozilla.model;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "wisataTabel",
        indexes = {
                @Index(value = "idWisata", unique = true)
        }
)

public class WisataItem {

    @SerializedName("longitude_wisata")
    private String longitudeWisata;


    @Id(autoincrement = true)
    @SerializedName("id_wisata")
    private long idWisata;

    @SerializedName("latitude_wisata")
    private String latitudeWisata;

    @SerializedName("nama_wisata")
    private String namaWisata;

    @SerializedName("gambar_wisata")
    private String gambarWisata;

    @SerializedName("deksripsi_wisata")
    private String deksripsiWisata;

    @SerializedName("alamat_wisata")
    private String alamatWisata;

    @SerializedName("event_wisata")
    private String eventWisata;

    @Generated(hash = 2051134853)
    public WisataItem(String longitudeWisata, long idWisata, String latitudeWisata,
            String namaWisata, String gambarWisata, String deksripsiWisata,
            String alamatWisata, String eventWisata) {
        this.longitudeWisata = longitudeWisata;
        this.idWisata = idWisata;
        this.latitudeWisata = latitudeWisata;
        this.namaWisata = namaWisata;
        this.gambarWisata = gambarWisata;
        this.deksripsiWisata = deksripsiWisata;
        this.alamatWisata = alamatWisata;
        this.eventWisata = eventWisata;
    }

    @Generated(hash = 1059265718)
    public WisataItem() {
    }

    public String getLongitudeWisata() {
        return longitudeWisata;
    }

    public void setLongitudeWisata(String longitudeWisata) {
        this.longitudeWisata = longitudeWisata;
    }

    public long getIdWisata() {
        return idWisata;
    }

    public void setIdWisata(long idWisata) {
        this.idWisata = idWisata;
    }

    public String getLatitudeWisata() {
        return latitudeWisata;
    }

    public void setLatitudeWisata(String latitudeWisata) {
        this.latitudeWisata = latitudeWisata;
    }

    public String getNamaWisata() {
        return namaWisata;
    }

    public void setNamaWisata(String namaWisata) {
        this.namaWisata = namaWisata;
    }

    public String getGambarWisata() {
        return gambarWisata;
    }

    public void setGambarWisata(String gambarWisata) {
        this.gambarWisata = gambarWisata;
    }

    public String getDeksripsiWisata() {
        return deksripsiWisata;
    }

    public void setDeksripsiWisata(String deksripsiWisata) {
        this.deksripsiWisata = deksripsiWisata;
    }

    public String getAlamatWisata() {
        return alamatWisata;
    }

    public void setAlamatWisata(String alamatWisata) {
        this.alamatWisata = alamatWisata;
    }

    public String getEventWisata() {
        return eventWisata;
    }

    public void setEventWisata(String eventWisata) {
        this.eventWisata = eventWisata;
    }

    @Override
    public String toString() {
        return
                "WisataItem{" +
                        "longitude_wisata = '" + longitudeWisata + '\'' +
                        ",id_wisata = '" + idWisata + '\'' +
                        ",latitude_wisata = '" + latitudeWisata + '\'' +
                        ",nama_wisata = '" + namaWisata + '\'' +
                        ",gambar_wisata = '" + gambarWisata + '\'' +
                        ",deksripsi_wisata = '" + deksripsiWisata + '\'' +
                        ",alamat_wisata = '" + alamatWisata + '\'' +
                        ",event_wisata = '" + eventWisata + '\'' +
                        "}";
    }
}