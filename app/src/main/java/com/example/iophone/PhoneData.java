package com.example.iophone;

import java.util.ArrayList;

public class PhoneData {

    private static String[][] data = new String[][]{
                {"IphoneX","iPhone X merupakan lini yang benar-benar spesial dan beda dari sebelumnya, menandai satu dekade kiprah sang raksasa di industri smartphone. CEO Apple, Tim Cook, mengatakan iPhone X sebagai lompatan terbesar dalam sejarah iPhone. iPhone X dijual dengan dengan dua varian memori internal, yaitu 64 GB dan 256 GB. Harga iPhone X versi 64 GB adalah 999 dollar AS. Sedangkan harga iPhone X versi 256 dibanderol 1149 dollar AS atau sekitar Rp 15,1 juta", "Super Retina OLED capacitive touchscreen\n 1125 x 2436 pixels, 19.5:9 ratio (~458 ppi density)", "5.8 inches, 84.4 cm2 (~82.9% screen-to-body ratio)" , "Apple A11 Bionic (10 nm)", "64GB 3GB RAM, 256GB 3GB RAM", "Face ID, accelerometer, gyro, proximity, compass, barometer\nSiri natural language commands and dictation", "Non-removable Li-Ion 2716 mAh battery (10.35 Wh)\n Fast battery charging 15W: 50% in 30 min","https://ibb.co/68s6fjS"},
                {"Samsung S10", "Samsung Galaxy S10 adalah ponsel peringatan 10 tahun yang pas untuk Samsung dan seri S-nya. Ini memberikan perubahan dengan layar Infinity-O yang tampak baru yang begitu besar sehingga menggantikan kamera depan, dan kamera belakang tiga lensa yang mengambil foto ultra lebar.", "Dynamic AMOLED capacitive touchscreen, 16M colors\n 1440 x 3040 pixels, 19:9 ratio (~550 ppi density)", "6.1 inches, 93.2 cm2 (~88.3% screen-to-body ratio)", "Exynos 9820 (8 nm) - EMEA/LATAM", "128GB 8GB RAM, 512GB 8GB RAM", "Fingerprint (under display, ultrasonic), accelerometer, gyro, proximity, compass, barometer, heart rate, SpO2\n Samsung DeX (desktop experience support)", "Non-removable Li-Ion 3400 mAh battery\n Fast battery charging 15W","https://ibb.co/2F4D62V"},
                {"Oppo F11 Pro", "Oppo...", "LTPS IPS LCD capacitive touchscreen, 16M colors\n 1080 x 2340 pixels, 19.5:9 ratio (~397 ppi density)", "6.53 inches, 103.6 cm2 (~84.4% screen-to-body ratio)", "Mediatek Helio P70 (12nm)", "64GB 4GB RAM, 64GB 6GB RAM, 128GB 6GB RAM", "Fingerprint (rear-mounted), accelerometer, proximity, compass", "Non-removable Li-Po 4000 mAh battery\n Fast battery charging 20W (VOOC 3.0)","https://ibb.co/mqz5gzw"},
                {"Huawei Mate 20 Pro", "Huawei...", "OLED capacitive touchscreen, 16M colors\n 1440 x 3120 pixels, 19.5:9 ratio (~538 ppi density)", "6.39 inches, 100.2 cm2 (~87.9% screen-to-body ratio)", "HiSilicon Kirin 980 (7 nm)", "128GB 6GB RAM, 128GB 8GB RAM, 256GB 8GB RAM", "Face ID, fingerprint (under display, optical), accelerometer, gyro, proximity, barometer, compass", "Non-removable Li-Po 4200 mAh battery\n Fast battery charging 40W (70% in 30 min)","https://ibb.co/KG8DQQX"},
                {"Samsung Note 9", "Samsung...", "Super AMOLED capacitive touchscreen, 16M colors\n 1440 x 2960 pixels, 18.5:9 ratio (~516 ppi density)", "6.4 inches, 103.2 cm2 (~83.4% screen-to-body ratio)", "Exynos 9810 (10 nm) - EMEA", "128GB 6GB RAM, 512GB 8GB RAM", "Iris scanner, fingerprint (rear-mounted), accelerometer, gyro, proximity, compass, barometer, heart rate, SpO2\n Bixby natural language commands and dictation", "Non-removable Li-Ion 4000 mAh battery\n Fast battery charging 15W","https://ibb.co/Dzw5Bph"},
                {"Xiaomi Redmi Note 7", "Xiaomi...", "IPS LCD capacitive touchscreen, 16M colors\n 1080 x 2340 pixels, 19.5:9 ratio (~409 ppi density)", "6.3 inches, 97.4 cm2 (~81.4% screen-to-body ratio)", "Qualcomm SDM660 Snapdragon 660 (14 nm)", "32GB 3GB RAM, 64GB 4GB RAM, 64GB 6GB RAM, 128GB 4GB RAM", "Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass", "Non-removable Li-Po 4000 mAh battery\n Fast battery charging 18W (Quick Charge 4)","https://ibb.co/LSFwQPt"},
                {"Realme C2", "Realme...", "IPS LCD capacitive touchscreen, 16M colors\n 720 x 1560 pixels, 19.5:9 ratio (~282 ppi density)", "6.1 inches, 91.3 cm2 (~80.3% screen-to-body ratio)", "Mediatek MT6762 Helio P22 (12 nm)", "16GB 2GB RAM, 32GB 3GB RAM", "Accelerometer, proximity, compass", "Non-removable Li-Po 4000 mAh battery","https://ibb.co/fSB7yqg"},
                {"Realme 5 Pro", "Realme...", "IPS LCD capacitive touchscreen, 16M colors\n 1080 x 2340 pixels, 19.5:9 ratio (~409 ppi density)", "6.3 inches, 97.4 cm2 (~83.6% screen-to-body ratio)", "Qualcomm SDM712 Snapdragon 712 (10 nm)", "64GB 4GB RAM, 64GB 6GB RAM, 128GB 8GB RAM", "Fingerprint (rear-mounted), accelerometer, gyro, proximity, compass", "Non-removable Li-Po 4035 mAh battery\n Fast battery charging 20W: 50% in 30 min (VOOC 3.0)","https://ibb.co/Fxv9my2"},
                {"Vivo V15 Pro", "Vivo...", "Super AMOLED capacitive touchscreen, 16M colors\n 1080 x 2340 pixels, 19.5:9 ratio (~404 ppi density)", "6.39 inches, 99.7 cm2 (~84.9% screen-to-body ratio)", "Qualcomm SDM675 Snapdragon 675 (11 nm)", "128GB 6GB RAM, 128GB 8GB RAM", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass", "Non-removable Li-Po 3700 mAh battery\n Fast battery charging 18W (24% in 15 min)","https://ibb.co/C6rwXtS"},
                {"Samsung A70", "Samsung...", "Super AMOLED capacitive touchscreen, 16M colors\n 1080 x 2400 pixels, 20:9 ratio (~393 ppi density)", "6.7 inches, 108.4 cm2 (~86.0% screen-to-body ratio)", "Qualcomm SDM675 Snapdragon 675 (11 nm)", "128GB 6GB RAM, 128GB 8GB RAM", "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass\n ANT+", "Non-removable Li-Po 4500 mAh battery\n Fast battery charging 25W","https://ibb.co/HntMV1s"}
        };


         static ArrayList<Phone> getListData() {
            ArrayList<Phone> list = new ArrayList<>();
            for (String[] aData : data) {
                Phone phone = new Phone();
                    phone.setName(aData[0]);
                    phone.setDetail(aData[1]);
                    phone.setDisplay(aData[2]);
                    phone.setSize(aData[3]);
                    phone.setChipset(aData[4]);
                    phone.setRAM(aData[5]);
                    phone.setFitur(aData[6]);
                    phone.setBattery(aData[7]);
                    phone.setPhoto(aData[7]);

                    list.add(phone);
              }
                return list;
            }
        }


