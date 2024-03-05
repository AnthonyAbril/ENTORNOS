
package com.mycompany.junit1;

class Lamp {
  
  // stores the value for light
  // true if light is on
  // false if light is off
  private boolean isOn=false;

  // method to turn on the light
  String turnOn() {
    isOn = true;
    return ("Light on? " + isOn);

  }

  // method to turnoff the light
  String turnOff() {
    isOn = false;
    return "Light on? " + isOn;
  }
  
  boolean getState(){
      return isOn;
  }
}




