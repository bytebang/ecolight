# ecolight

The objective of _ecolight_ is to reduce energy consumption of buildings by creating an engaging contest-like setup that encourages individuals to maintain room temperatures within a specified range.Beside this, it is possible to use the sensors in a [home-automation system](https://www.home-assistant.io/) to visualize the temperatures in your building 

## usage

We provide information for the end user how to set up such a system and how to operate it in our [wiki](https://github.com/bytebang/ecolight/wiki)


## system architecture
Ecolight consists of 3 software lavers which interact with another.

1. The [![Hardware](https://img.shields.io/badge/Hardware-esphome-blue)](./hardware) sensors, which are built with an esp32 and [esp.home](https://esphome.io/index.html), 
2. the [![Aggregator](https://github.com/bytebang/ecolight/actions/workflows/aggregator.yml/badge.svg)](./aggregator) which is responsible to collect data from the sensors and finally
3. the [![Dashboard](https://github.com/bytebang/ecolight/actions/workflows/dashboard.yml/badge.svg)](./dashboard) which is responsible to vizualize multiple aggregator values and to create a dashboard for the contest

# license 

This software is dual licensed:

AGPLv3 for private use:
- You may use, copy, modify, and distribute this software under the terms of the Affero General Public License Version 3 (AGPLv3). The AGPLv3 requires that modified code, when provided over a network, be released under the AGPLv3 as well. For more information, see the [AGPLv3 license file](./LICENSE-AGPLv3.txt).

Proprietary license for commercial use:
- A separate proprietary license is available for commercial use of this software. The proprietary license grants you additional rights and restrictions beyond the provisions of the AGPLv3. Please contact us for information on commercial licensing.

If you use, copy, modify, or distribute this software, you must comply with the respective license terms. Please refer to the specific license files for more information.
