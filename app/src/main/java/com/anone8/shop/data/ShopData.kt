package com.anone8.shop.data

import com.anone8.shop.R

class ShopData {
    companion object {
        val shops = listOf(
            Shop(
                id = 1,
                title = "Shopee",
                overview = "Marketplace populer dengan banyak promo dan gratis ongkir",
                description = "Shopee adalah platform e-commerce terbesar di Asia Tenggara yang diluncurkan pada 2015 oleh Sea Group, didirikan oleh Forrest Li. Shopee menawarkan berbagai produk mulai dari fashion, elektronik, hingga kebutuhan harian dengan sistem pembayaran fleksibel dan gratis ongkir. Platform ini terkenal dengan fitur flash sale, live shopping, dan voucher belanja yang rutin diadakan. Shopee beroperasi di Indonesia, Malaysia, Thailand, Vietnam, Filipina, dan Singapura.",
                imageResId = R.drawable.logo_shopee,
                category = "Marketplace",
                company = "Sea Group",
                date = "2015",
                region = "Indonesia, Asia Tenggara",
                url = "https://shopee.co.id/"
            ),
            Shop(
                id = 2,
                title = "Tokopedia",
                overview = "Marketplace lokal Indonesia dengan jutaan penjual",
                description = "Tokopedia didirikan pada tahun 2009 oleh William Tanuwijaya dan Leontinus Alpha Edison. Platform ini memungkinkan individu dan UMKM membuka toko online dengan mudah dan mendukung berbagai metode pembayaran serta pengiriman ke seluruh Indonesia. Tokopedia menawarkan layanan digital seperti pulsa, tagihan, dan fintech untuk mendukung ekosistem UMKM. Platform ini merupakan bagian dari GoTo Group sejak 2021.",
                imageResId = R.drawable.logo_tokped,
                category = "Marketplace",
                company = "GoTo Group",
                date = "2009",
                region = "Indonesia",
                url = "https://shopee.co.id/"
            ),
            Shop(
                id = 3,
                title = "Bukalapak",
                overview = "Marketplace yang fokus pada UMKM dan warung",
                description = "Bukalapak, didirikan pada tahun 2010 oleh Achmad Zaky, Nugroho Herucahyono, dan Fajrin Rasyid, berfokus membantu digitalisasi warung tradisional melalui program Mitra Bukalapak. Platform ini menyediakan berbagai kategori produk, dari kebutuhan sehari-hari hingga elektronik, dan memiliki sistem promo dan cashback untuk mendukung pengalaman belanja yang lebih interaktif.",
                imageResId = R.drawable.logo_bukalapak,
                category = "Marketplace",
                company = "Bukalapak",
                date = "2010",
                region = "Indonesia",
                url = "https://www.tokopedia.com/"
            ),
            Shop(
                id = 4,
                title = "Lazada",
                overview = "E-commerce regional dengan dukungan Alibaba",
                description = "Lazada diluncurkan pada tahun 2012 oleh Rocket Internet dan kini dimiliki oleh Alibaba Group. Platform ini menyediakan berbagai produk dari brand internasional dan lokal, dengan sistem logistik terintegrasi dan promo rutin. Lazada beroperasi di Indonesia, Malaysia, Filipina, Singapura, Thailand, dan Vietnam, dengan fitur flash sale dan voucher untuk meningkatkan pengalaman belanja.",
                imageResId = R.drawable.logo_lazada,
                category = "Marketplace",
                company = "Alibaba Group",
                date = "2012",
                region = "Asia Tenggara",
                url = "https://www.lazada.co.id/"
            ),
            Shop(
                id = 5,
                title = "Blibli",
                overview = "Online shop dengan fokus produk original",
                description = "Blibli, bagian dari Djarum Group, didirikan pada tahun 2011 dan menekankan pada produk resmi dengan layanan pelanggan berkualitas. Platform ini menawarkan berbagai kategori produk, mulai dari elektronik, fashion, hingga kebutuhan rumah tangga, serta menyediakan Blibli Rewards, voucher, dan program cicilan untuk memudahkan belanja online.",
                imageResId = R.drawable.logo_blibli,
                category = "E-Commerce",
                company = "Djarum Group",
                date = "2011",
                region = "Indonesia",
                url = "https://www.blibli.com/"
            ),
            Shop(
                id = 6,
                title = "Zalora",
                overview = "Online shop khusus fashion dan lifestyle",
                description = "Zalora didirikan pada tahun 2012 oleh Rocket Internet dan berfokus pada fashion pria dan wanita dengan koleksi brand internasional dan lokal. Platform ini menawarkan pengiriman cepat, kebijakan pengembalian mudah, promo harian, dan tips fashion melalui aplikasinya. Zalora beroperasi di Indonesia, Singapura, Malaysia, Filipina, Hong Kong, dan Taiwan.",
                imageResId = R.drawable.logo_zalora,
                category = "Fashion",
                company = "Global Fashion Group",
                date = "2012",
                region = "Asia Tenggara",
                url = "https://www.zalora.co.id/"
            ),
            Shop(
                id = 7,
                title = "JD.ID",
                overview = "Marketplace dengan standar logistik tinggi",
                description = "JD.ID adalah cabang dari JD.com yang berdiri sejak 2015 di Indonesia. Platform ini terkenal dengan pengiriman cepat, produk asli, dan layanan pelanggan berkualitas. JD.ID fokus pada kategori elektronik, gadget, dan kebutuhan rumah tangga, dengan sistem pembayaran aman dan promo reguler.",
                imageResId = R.drawable.logo_jdid,
                category = "Marketplace",
                company = "JD.com",
                date = "2015",
                region = "Indonesia",
                url = "https://www.jd.id/"
            ),
            Shop(
                id = 8,
                title = "Amazon",
                overview = "Marketplace global terbesar di dunia",
                description = "Amazon, didirikan pada tahun 1994 oleh Jeff Bezos, adalah marketplace global yang menyediakan jutaan produk mulai dari buku, elektronik, hingga layanan cloud. Amazon terkenal dengan program Prime, pengiriman cepat, layanan pelanggan profesional, dan berbagai inovasi e-commerce di seluruh dunia.",
                imageResId = R.drawable.logo_amazon,
                category = "Global Marketplace",
                company = "Amazon Inc.",
                date = "1994",
                region = "Global",
                url = "https://www.amazon.com/"
            ),
            Shop(
                id = 9,
                title = "eBay",
                overview = "Marketplace internasional berbasis lelang",
                description = "eBay, didirikan pada tahun 1995 oleh Pierre Omidyar, memungkinkan pengguna membeli dan menjual barang baru maupun bekas, termasuk sistem lelang yang khas. Platform ini mendukung proteksi pembeli, berbagai metode pembayaran, dan komunitas global yang aktif.",
                imageResId = R.drawable.logo_ebay,
                category = "Marketplace",
                company = "eBay Inc.",
                date = "1995",
                region = "Global",
                url = "https://www.ebay.com/"
            ),
            Shop(
                id = 10,
                title = "AliExpress",
                overview = "Belanja internasional langsung dari China",
                description = "AliExpress, bagian dari Alibaba Group sejak 2010, menawarkan harga murah dengan variasi produk yang sangat luas. Meskipun waktu pengiriman lebih lama, platform ini diminati karena promo, kupon, dan jutaan pilihan produk dari penjual internasional.",
                imageResId = R.drawable.logo_aliex,
                category = "Cross-border",
                company = "Alibaba Group",
                date = "2010",
                region = "Global",
                url = "https://www.aliexpress.com/"
            ),
            Shop(
                id = 11,
                title = "Sociolla",
                overview = "Online shop khusus produk kecantikan",
                description = "Sociolla didirikan pada tahun 2015 oleh Helena Sulistyo dan Tim Social Bella. Platform ini menyediakan produk kecantikan original dengan izin BPOM dan pengalaman belanja aman. Tersedia tips kecantikan, review produk, promo menarik, dan program loyalty bagi pengguna setia.",
                imageResId = R.drawable.logo_sociolla,
                category = "Beauty",
                company = "Social Bella",
                date = "2015",
                region = "Indonesia",
                url = "https://www.sociolla.com/"
            ),
            Shop(
                id = 12,
                title = "Orami",
                overview = "E-commerce untuk ibu dan anak",
                description = "Orami, didirikan pada 2013, menyediakan produk kebutuhan ibu, bayi, dan keluarga, lengkap dengan komunitas parenting aktif. Platform ini menawarkan perlengkapan bayi, mainan edukatif, dan tips parenting, serta berbagai promo menarik untuk memudahkan belanja online.",
                imageResId = R.drawable.logo_orami,
                category = "Parenting",
                company = "Orami",
                date = "2013",
                region = "Indonesia",
                url = "https://www.orami.co.id/"
            ),
            Shop(
                id = 13,
                title = "LotteMart",
                overview = "Supermarket online dan offline",
                description = "LotteMart adalah bagian dari Lotte Group yang berdiri sejak 2008. Platform ini menyediakan berbagai kebutuhan rumah tangga, makanan, dan elektronik. Layanan belanja online terintegrasi dengan toko fisik memungkinkan pengguna memilih delivery atau pickup di store.",
                imageResId = R.drawable.logo_lottemart,
                category = "Supermarket",
                company = "Lotte Group",
                date = "2008",
                region = "Indonesia",
                url = "https://www.lottemart.co.id/"
            ),
            Shop(
                id = 14,
                title = "MatahariMall",
                overview = "Mall online dengan berbagai brand ternama",
                description = "MatahariMall, bagian dari Matahari Group, menampilkan ribuan produk fashion, elektronik, dan perlengkapan rumah. Platform ini menawarkan promo menarik, cashback, voucher, dan sistem pembayaran fleksibel sejak 2013.",
                imageResId = R.drawable.logo_matahari,
                category = "Marketplace",
                company = "Matahari Group",
                date = "2013",
                region = "Indonesia",
                url = "https://www.matahari.com/"
            ),
            Shop(
                id = 15,
                title = "Berrybenka",
                overview = "Fashion online khusus wanita",
                description = "Berrybenka, didirikan pada 2012, menawarkan koleksi fashion modern untuk wanita, mulai dari pakaian, sepatu, tas, hingga aksesoris. Platform ini fokus pada tren fashion terkini dengan layanan pengembalian mudah, promo diskon, dan pengalaman belanja yang nyaman.",
                imageResId = R.drawable.logo_berrybenka,
                category = "Fashion",
                company = "Berrybenka",
                date = "2012",
                region = "Indonesia",
                url = "https://www.berrybenka.com/"
            )
        )
    }
}
