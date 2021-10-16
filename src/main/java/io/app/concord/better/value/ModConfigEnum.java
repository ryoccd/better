package io.app.concord.better.value;

import net.minecraftforge.fml.common.Mod;

public enum ModConfigEnum {

  MOD_ID("ryoccd");

  private String value;

  ModConfigEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public ModConfigEnum convertValToEnum(String value) {
    for(ModConfigEnum m: ModConfigEnum.values()) {
      if(m.getValue().equals(value)) {
        return m;
      }
    }
    throw new IllegalArgumentException(
        "Unexpected argument error:" +
        "Argument[" + value + "]"
    );
  }
}
