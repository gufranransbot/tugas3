package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.jerapah;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.kupukupu;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<kupukupu> initDatakupukupu(Context ctx) {
        List<kupukupu> kupukupus = new ArrayList<>();
        kupukupus.add(new kupukupu("kupukupu_Antheraea_Mylitta", "Brasil",
                "Antheraea Mylitta adalah salah satu kupukupu tercantik di dunia", R.drawable.kupukupu_antheraea_mylitta));
        kupukupus.add(new kupukupu("kupukupu_Silvery_Blue", "Canada",
                "Spesies asli Kanada ini suka mengambil mineral dari tanah yang basah", R.drawable.kupukupu_silvery_blue));
        kupukupus.add(new kupukupu("Kupukupu_Sayap_Peri", "Indonesia",
                "bisa ditemukan di beberapa wilayah di Papua", R.drawable.kupukupu_sapho_longwing));
        kupukupus.add(new kupukupu("Banded_Orange", "sulawesi",
                "adalah spesies kupu-kupu langka asal Brasil yang bisa menyerap nutrisi dari lumpur", R.drawable.kupukupu_banded_orange));
        return kupukupus;
    }

    private static List<jerapah> initDatajerapah(Context ctx) {
        List<jerapah> jerapahs = new ArrayList<>();
        jerapahs.add(new jerapah("Giraffa camelopardalis", "Afrika utara",
                "mamalia berkuku genap endemik afrika dan merupakan spesies hewan tertinggi yang hidup di darat", R.drawable.jerapah_giraffa_camelopardalis));
        jerapahs.add(new jerapah("Reticulated giraffe", "Ethopia selatan",
                "dapat kita kenali dari warna kulitnya yang berwarna coklat muda kemerah-merahan,serta garis putih terang membentuk pola seperti jala yang besar mengelilingi tubuhnya", R.drawable.jerapah_reticulated_giraffe));
        jerapahs.add(new jerapah("Southern giraffe", "Afrika Selatan",
                "Jerapah selatan memiliki bintik bintik bulat atau bercat, beberapa dengan ekstensi seperti bintang di latar belakang cokelat muda, mengalir ke kuku", R.drawable.jerapah_southern_giraffe));
        jerapahs.add(new jerapah("Masai giraffe", "afrika Timur",
                "Jerapah Masai dapat ditemukan di Kenya tengah dan selatan dan di Tanzania. Ini memiliki bercak khas, tidak teratur, bergerigi, seperti bintang yang memanjang kuku.", R.drawable.jerapah_masai_giraffe));
        return jerapahs;
    }
    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci("netherland_dwarf", "belanda",
                "kelinci yang berasal dari belanda dengan berat 1,1-2,5 pon,Dwarf belanda adalah satu ras kelinci terkecil ", R.drawable.kelinci_netherland_dwarf));
        kelincis.add(new Kelinci("orictolagus_cuniculus", "eropa",
                "kelinci orictolagus cuniculus juga disebut kelinci eropa atau kelinci domestik adalah satu satunya spesies dalam genusnya", R.drawable.kelinci_orictolagus_cuniculus));
        kelincis.add(new Kelinci("holland_lop", "belanda",
                "kelinci jenis holland lop adalah kelinci yang independent dan playfull", R.drawable.kelinci_holland_lop));
        kelincis.add(new Kelinci("mini_lop", "jerman",
                "Adalah jenis kelinci domestik yang di akui oleh american rabbit association ", R.drawable.kelinci_mini_lop));
        kelincis.add(new Kelinci("raksasa", "belgia",
                "jenis kelinci domestik yang sangat besar,biasanya dianggap sebagai jenis terbesar dari spesiesnya ", R.drawable.kelinci_raksasa));
        kelincis.add(new Kelinci("rex", "prancis",
                "kelinci ini mempunyai tubuh yang besar,telinga yang tegak,dan ciri khas yang menjadikan kelinci rex ini di sukai adalah bulunya yang seperti karpet ", R.drawable.kelinci_rex));
        return kelincis;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDatakupukupu(ctx));
        hewans.addAll(initDatajerapah(ctx));
        hewans.addAll(initDataKelinci(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
