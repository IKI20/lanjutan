package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Beruang;
import simple.example.hewanpedia.model.Beruang;
import simple.example.hewanpedia.model.Elang;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Ikan;
import simple.example.hewanpedia.model.Ikan;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Beruang> initDataBeruang(Context ctx) {
        List<Beruang> beruangs = new ArrayList<>();
        beruangs.add(new Beruang("Berkacamata", "Amerika Selatan.",
                "Spectacled bear, Andean bear, atau beruang berkacamata ini berasal dari daerah hutan lebat di Pegunungan Andes", R.drawable.beruang_berkacamata));
        beruangs.add(new Beruang("Hitam", "Amerika",
                "Beruang hitam amerika hidup di kawasan Amerika Utara hingga Alaska. Meski namanya beruang hitam, sebenarnya warna bulu mereka cukup bervariasi. Selain hitam, ada pula yang berwarna kecoklatan", R.drawable.beruang_hitam));
        beruangs.add(new Beruang("Beruang Sloth", "India",
                "salah satu spesies beruang arboreal, nokturnal dan insektivora yang berasal dari subbenua India.", R.drawable.beruang_sloth));
        beruangs.add(new Beruang("Persia", "Iran",
                "Beruang madu atau Sun Bear atau Helarctos malayanus ini merupakan jenis beruang terkecil diantara tujuh jenis beruang", R.drawable.beruang_madu));
        beruangs.add(new Beruang("coklat", "Amerika Utara",
                "Beruang coklat kerap disebut beruang grizzly oleh penduduk kawasan Amerika utara. Mereka juga omnivora, makanannya termasuk tumbuhan, ikan, dan mamalia kecil.", R.drawable.beruang_coklat));
        beruangs.add(new Beruang("Kutub", "Lebih tepatnya di kutub utara",
                "Sesuai dengan namanya, habitat mereka tentu adalah di kutub, tepatnya di Kutub Utara. Mereka adalah karnivora, dan buruan utama mereka adalah anjing laut. ", R.drawable.beruang_kutub));
        return beruangs;
    }

    private static List<Elang> initDataElang(Context ctx) {
        List<Elang> elangs = new ArrayList<>();
        elangs.add(new Elang("Pithecophaga jefferyi", "Filipina",
                "Burung elang Filipina sebagai pemakan monyet dan tinggal di hutan dan menjadi elang terbesar dari sisi ukuran badan.", R.drawable.elang_filipina));
        elangs.add(new Elang("Elanus caeruleus", "Asia,Aprika,Spanyol,Portugal,Eropa,Asia Barat ",
                "Elang Tikus merupakan spesies utama di dataran terbuka serta wilayah semi-gurun seperti sub-Sahara di Afrika dan beberapa wilayah tropis di Asia. Meski demikian, persebarannya juga berkembang di Eropa Selatan dan Asia Barat", R.drawable.elang_tikus));
        elangs.add(new Elang("Aviceda jerdoni", "Asia Tenggara",
                "adalah rajawali berukuran sedang dengan jambul hitam tipis berujung putih yang biasanya tegak berdiri. Ia biasa ditemui di Asia Tenggara", R.drawable.elang_bazajerdon));
        elangs.add(new Elang("Elanus caeruleus", "India, China selatan, Asia tenggara, Indonesia, Australia. Di Indonesia, penyebarannya ada di Sumatra, Kalimantan, Jawa, Bali, Sulawesi, Nusa Tenggara, Maluku, Papua",
                "Berukuran sedang (45 cm), berwarna putih dan coklat pirang. Dewasa: kepala, leher, dan dda putih; sayap, punggung, ekor, dan perut coklat terang, terlihat kontras dengan bulu primer yang hitam", R.drawable.elang_bondol));
        elangs.add(new Elang("Elang Jawa", "Indonesia",
                "Burung Elang Jawa merupakan spesies endemik yang hanya terdapat di Pulau Jawa.", R.drawable.elang_jawa));
        elangs.add(new Elang(" Haliaeetus leucogaster", "India, Asia Tenggara, Filipina, Australia, dan di daerah Indonesia",
                "Elang laut merupakan salah satu spesies elang terbesar dan terberat yang sanggup terbang dengan jarak yang jauh. Paruh dan cakarnya yang kuat membuat burung predator ini sangat ditakuti di lautan ", R.drawable.elang_laut));
        return elangs;
    }
    private static List<Ikan> initDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan("Betta", "Indonesia, Thailand, Malaysia, dan Vietnam",
                "Ikan yang satu ini mudah ditemui. Apalagi di masa pandemi ini, banyak yang memelihara ikan cupang.", R.drawable.ikan_cupang));
        ikans.add(new Ikan("Engraulidae", "samudera Atlantik, Hindia, dan Pasifik ",
                "Ikan teri adalah sekelompok ikan laut kecil anggota suku Engraulidae. Nama ini mencakup berbagai ikan dengan warna tubuh perak kehijauan atau kebiruan", R.drawable.ikan_teri));
        ikans.add(new Ikan("Thunnus albacares", "samudera hindia, laut arafuru, laut banda, laut sulawesi, laut seram, laut flores",
                "Ikan Madidihang atau tuna sirip kuning (Thunnus albacares) adalah sejenis ikan pelagis besar yang mengembara di lautan tropika dan ugahari di seluruh dunia", R.drawable.ikan_madidihang));
        ikans.add(new Ikan("superordo Selachimorpha", "Seluruh Dunia",
                "Ikan Hiu adalah sekelompok (superordo Selachimorpha) ikan dengan kerangka tulang rawan yang lengkap dan tubuh yang ramping. Mereka bernapas dengan menggunakan lima liang insang (kadang-kadang enam atau tujuh, tergantung pada spesiesnya) di samping, atau dimulai sedikit di belakang, kepalanya", R.drawable.ikan_hiu));
        ikans.add(new Ikan(" causpisillum atau Balistidae", "Indonesia",
                "Hidup di perairan dangkal terumbu karang, panjang ikan bisa mencapai 50 cm. Dipasarkan sebagai ikan hias dengan harga sangat mahal. Daerah penyebaran Trigger di perairan karang, perairan dangkal terutama sekitar Banyuwangi dan Nusa Penida (Bali)..", R.drawable.ikan_tiger));
        ikans.add(new Ikan("Exocoetidae", "samudera Atlantik, Pasifik dan Hindia",
                "ikan terbang adalah famili ikan laut yang terdiri atas sekitar 50 spesies yang dikelompokkan dalam 7 hingga 9 genera ", R.drawable.ikan_terbang));
        return ikans;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataBeruang(ctx));
        hewans.addAll(initDataElang(ctx));
        hewans.addAll(initDataIkan(ctx));
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
