package uk.co.gdickinson.smarthome.lambda.models;

import com.google.gson.annotations.SerializedName;

public enum ThermostatMode {
  @SerializedName("AUTO")
  AUTO,

  @SerializedName("COOL")
  COOL,

  @SerializedName("HEAT")
  HEAT,

  @SerializedName("ECO")
  ECO,

  @SerializedName("OFF")
  OFF,

  @SerializedName("CUSTOM")
  CUSTOM
}
