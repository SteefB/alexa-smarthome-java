package uk.co.gdickinson.smarthome.lambda.models;

import java.util.List;

public class CapabilityConfiguration {

    private boolean supportsScheduling;
    List<ThermostatMode> supportedModes;

    public boolean isSupportsScheduling() {
        return supportsScheduling;
    }

    public void setSupportsScheduling(boolean supportsScheduling) {
        this.supportsScheduling = supportsScheduling;
    }

    public List<ThermostatMode> getSupportedModes() {
        return supportedModes;
    }

    public void setSupportedModes(List<ThermostatMode> supportedModes) {
        this.supportedModes = supportedModes;
    }

    @Override
    public String toString(){
        return "CapabilityConfiguration [supportsScheduling=" + supportsScheduling + "supportedModes=" + supportedModes + "]";
    }



}
