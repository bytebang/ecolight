# hardware

Welcome to the hardware section. This part of the repository holds the hardware configuration and firmware files which can be built with esphome.io. There is a build process which ensures that the checked in version of the hardware is currently working (or not). You can see the details in the [hardware workflow](https://github.com/bytebang/ecolight/actions/workflows/hardware.yml) of the repository.

However - we try to build the system as flexible as possible, and we try to have it portable to as many esp systems as popssible. Therefore we are using a clever mechanism which separates the configuration of the boards of the functionality needed for the system.
The core functionality is available in the `ecolight.yaml` file, and the hardware specific part in the files which are named like the hardare platform.

## hardware specific documentation

To keep our repository clean we keep the documentation in folders which are named exactly as the yaml file for the platform.

## base functionality

In order to make the whole system work, we have defined some common / core functionality which has to be provided by every platform which wants to participate. We describe the usecases and the implementation here in the next few paragraphs:

The hardware has no mogic to implement, because the target temperatures and so on are stored on the aggregator. One could also say, that the hardware can be relatively dumb, and just used as a 'display, and measurement device' for a single room.

The flow is always the same: The hardware is the one which establishes contact with the aggergator, sends the current temperature and the aggregator decides what should be signaled on the hardware.

The ecolight.base.yaml implements the (hardware-independent) core logic, and the other files have to implement 4 scripts which are called from the base logic.

`````yaml
# ------ Callback scripts from the ecolight core
script:
  # called when it is too warm
  - id: too_warm
    then:
      - light.turn_on
        id: signaling_light
        brightness: 100%
        red: 100%
        green: 0%
        blue: 0%

  # called when the temperature is just right
  - id: just_right
    then:
      - light.turn_on
        id: signaling_light
        brightness: 100%
        red: 0%
        green: 100%
        blue: 0%

  # called when it is too cold
  - id: too_cold
    then:
      - light.turn_on
        id: signaling_light
        brightness: 100%
        red: 0%
        green: 0%
        blue: 100%

  # called when the temperature needs to be updated
  - id: read_temperature
    then:
      - globals.set:
      id: temperature
      value: '25'
``````
