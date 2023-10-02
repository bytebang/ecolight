# ecolight

The objective of _ecolight_ is to reduce energy consumption of buildings by creating an engaging contest-like setup that encourages individuals to maintain room temperatures within a specified range. Beside this, it is possible to use the sensors in a [home-automation system](https://www.home-assistant.io/) to visualize the temperatures in your building 

## usage

We provide information for the end user how to set up such a system and how to operate it in our [wiki](https://github.com/bytebang/ecolight/wiki)


## system architecture
Ecolight consists of 3 software lavers which interact with another.

1. The [![Dashboard](https://github.com/bytebang/ecolight/actions/workflows/dashboard.yml/badge.svg)](./dashboard) which is responsible to vizualize multiple aggregator values for a quick overview
2. the [![Aggregator](https://github.com/bytebang/ecolight/actions/workflows/aggregator.yml/badge.svg)](./aggregator) which is responsible to collect data from and supply setpoints for the sensors and finally
3. the [![Hardware](https://github.com/bytebang/ecolight/actions/workflows/hardware.yml/badge.svg)](./hardware), which is built with an [ttgo lora32 v1](./hardware/ttgo-lora32-v1/README.md) and [esp.home](https://esphome.io/index.html), 


````mermaid
graph BT;

    subgraph Example setup
        direction BT
        s1("Sensor 1") --> a1("Block A");

        s2("Sensor 2") --> a2("Division B");
        s3("Sensor 3") --> a2;
	    s4("Sensor 4") --> a2;
        s5("Sensor 5") --> a2;

        s6("Sensor 6") --> an("Building C");
        s7("Sensor 7") --> an;
        sx("Sensor ...") --> an;

        a1 --> b1("Company X");
        a2 --> b1;
        an --> b1;
    end

    subgraph Design
        direction BT
        room("[Hardware]<br>Room level") -- http --> department
        department("[Aggregator]<br>Department level") -- http --> organisation("[Dashboard]<br>Organisation level")
    end
````

Every layer 'lives' in its own ecosystem (docker container) and exchanges data via HTTP Requests. The communication is always from bottom to top - which minimizes network issues. Beside this the hardware can also be [integrated in the _Home Assistant_](https://www.home-assistant.io/integrations/esphome/) home automation system. 


# license 

This software is dual licensed:

AGPLv3 for private use:
- You may use, copy, modify, and distribute this software under the terms of the Affero General Public License Version 3 (AGPLv3). The AGPLv3 requires that modified code, when provided over a network, be released under the AGPLv3 as well. For more information, see the [AGPLv3 license file](./LICENSE-AGPLv3.txt).

Proprietary license for commercial use:
- A separate proprietary license is available for commercial use of this software. The proprietary license grants you additional rights and restrictions beyond the provisions of the AGPLv3. Please contact us for information on commercial licensing.

If you use, copy, modify, or distribute this software, you must comply with the respective license terms. Please refer to the specific license files for more information.
