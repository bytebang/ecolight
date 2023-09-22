# ecolight

The objective of _ecolight_ is to reduce energy consumption of buildings by creating an engaging contest-like setup that encourages individuals to maintain room temperatures within a specified range.Beside this, it is possible to use the sensors in a home-automation system to visualize the temperatures in your building 

## example

## system architecture
Ecolight consists of 3 software modules which interact with another.

* The [![Hardware](https://img.shields.io/badge/Hardware-esphome-blue)](./hardware) sensors, which are built with an esp32 and [esp.home](https://esphome.io/index.html), 
* the [![Aggregator](https://github.com/bytebang/ecolight/actions/workflows/aggregator.yml/badge.svg)](./aggregator) which is responsible to colllect data from the sensors and finally
* the [![Dashboard](https://github.com/bytebang/ecolight/actions/workflows/dashboard.yml/badge.svg)](./dashboard) which is responsible to vizualize multiple aggregator values


# license 

This software is dual licensed:

AGPLv3 for private use:
- You may use, copy, modify, and distribute this software under the terms of the Affero General Public License Version 3 (AGPLv3). The AGPLv3 requires that modified code, when provided over a network, be released under the AGPLv3 as well. For more information, see the [AGPLv3 license file](./LICENSE-AGPLv3.txt).

Proprietary license for commercial use:
- A separate proprietary license is available for commercial use of this software. The proprietary license grants you additional rights and restrictions beyond the provisions of the AGPLv3. Please contact us for information on commercial licensing.

If you use, copy, modify, or distribute this software, you must comply with the respective license terms. Please refer to the specific license files for more information.
