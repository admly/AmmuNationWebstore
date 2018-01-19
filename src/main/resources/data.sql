SET collation_connection = utf8_general_ci;
SET NAMES utf8;

insert into product(`product_id`, `category`, `name`, `description`, `product_image`, `unit_price`, `units_in_order`, `units_in_stock`)
values ('1', 'Krotka', 'AF STRIKE ONE 9X19 MM DESERT TAN', 'Pistolet centralnego zaplonu STRIKE ONE, kal. 9x19mm PARA  DUAL TONE','af-strike-one-9x19-mm-olive-drab.jpg', '3200.00', '2','97'),
('2', 'Krotka', 'AF STRIKE ONE 9X19 MM DUAL TONE', 'Pistolet centralnego zaplonu STRIKE ONE, kal. 9x19mm PARA  DUAL TONE', 'af-strike-one-9x19-mm-dual-tone.jpg', '3700.00', '5','197'),
('3', 'Krotka', 'AF 2011-A1 KAL. 45 ACP ARSENAL FIREARMS', 'Pistolet dwulufowy  Af2011-A1 kal. 45 ACP','xdm-38-compact-kal-45acp.jpg', '16900.00', '52','957'),
('4', 'Krotka',  'AF LRC-2 ADAPTER + STRIKE ONE 9X19 MM', 'Zestaw konwersyjny LRC-2 (Long Range Conversion 2)', 'af-lrc-2-9x19-mm.jpg', '8900.00', '28','851'),
('5', 'Krotka', 'CZ 75 TS CZECHMATE 9X19 MM', 'Najnowszy czlonek rodziny pistoletow Tactical Sport zaprojektowanych specjalnie do sportow strzeleckich, zgodnie z zasadami IPSC OPEN Division','-cz-75-ts-czechmate-9x19-mm.jpg', '16300.00', '0','7'),
('6','Dluga', 'CZ 527 SYNTHETIC .223REM', 'CZ 527 SYNTHETIC .223REM', '-cz-527-synthetic-223rem.jpg', '2750.00', '21','87'),
('7', 'Dluga',  'ADC BASIC L/E .223 REM 12,5"', 'Karabin ADC BASIC L/E kal.223REM', 'adc-basic-le-223-rem-125.jpg', '6900.00', '23','96'),
('8', 'Dluga', 'ADC COMPETITION ENTRY LEVEL 16"','Karabin ADC COMPETITION ENTERY LEVEL kal.223REM', 'adc-competition-entery-level-16.jpg', '11900.00', '2','97'),
('9', 'Dluga',  'BRNO COMBO KAL. 12X76 / .30-06', 'Kniejowka Brno Combo','brno-combo-kal-12x76-30-06.jpg', '5900.00', '2','97'),
('10', 'Dluga', 'CZ 750 S1M1 .308WIN','Karabin snajperski / do strzelan dlugodystansowych', 'cz-750-s1m1-sniper-308win.jpg', '9400.00', '2','90'),
('11', 'Mysliwska', 'BRNO COMBO KAL. 12X76 / 9,3X74R', 'Kniejowka Brno Combo', 'brno combo.jpg', '5900.00', '10','47'),
('12', 'Mysliwska', 'CZ 557 VARMINT .308WIN', 'Kaliber: .308 Win', 'cz-557-varmint-308win.jpg', '3700.00', '20','67'),
('13', 'Mysliwska', 'CZ-58 KAL. 7,62X39, KOLBA SKlADANA', 'Karabinek samopowtarzalny Cz-58 kal. 7,62x39', 'cz-58-kal-762x39-kolba-skladana.jpg', '9400.00', '1','53'),
('14', 'Mysliwska', 'MOSSBERG 500/50579', 'Strzelba gladkolufowa MOSSBERG 500/50579', 'MOSSBERG.jpg', '2850.00', '1','36'),
('15', 'Mysliwska', 'MOSSBERG 835/62238', 'Strzelba gladkolufowa MOSSBERG 835/62238', 'MOSSBERG 835.jpg', '3800.00', '26','65');

