# Beschreibung

![Pinout des Boards](pinout.png)

* ESP32 mit  2.4 GHz WiFi, BT, Dual Core, 240MHz Taktfrequenz und 4MB Flash Speicher
* Datenraten: 150 Mbps @ 11n HT40., 72 Mbps @ 11n HT20, 54 Mbps @ 11g, 11 Mbps @ 11b
	* Sendeleistung: 19,5 dBm bei 11b, 16,5 dBm bei 11 g, 15,5 dBm bei 11 n
	* 	Empfängerempfindlichkeit bis zu -98 dBm
	* 	UDP-Durchsatz von 135 Mbps

*	LoRa Modem, basierend auf dem SX1276 Chip, (868-915 MHz, RX: -148 dbM, TX: +20dbM). Antenne muss angeschlossen sein weil sonst durch schlechtes SWR der Chip beschädigt wird.
* 128x64 Pixel OLED Display in blau
* CP2102 USB → Serial converter
* Lade & Entladeschaltung für Lithium Batterien. Wenn die Batterie voll ist, hört der blaue LED auf zu arbeiten. Achten Sie bei der Verwendung auf Plus und Minus der Batterie, da sie sonst beschädigt wird

# Weitere Informationen

Key | Value
-------- | -------- 
Betriebsspannung | 3,3V bis 7V (am besten einfach per USB versorgen)
Betriebstemperaturbereich | -40 °C bis + 90 °C
Gehäuse (3d Druck) | https://www.thingiverse.com/thing:3443245
Kosten | ~ € 15.00 / Stück
Quelle | https://de.banggood.com/2Pcs-LILYGO-TTGO-LORA32-915Mhz-ESP32-LoRa-OLED-0_96-Inch-Blue-Display-p-1239769.html

# Schaltplan

![Pinout des Boards](schematic.png)