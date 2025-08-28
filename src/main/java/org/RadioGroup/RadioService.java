package org.RadioGroup;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RadioService {

    private int currentStation;
    private int maxQuantityStation = 10;
    private int maxStation = maxQuantityStation - 1;
    private int minStation = 0;

    private int currentVolume = 50;
    private int maxVolume = 100;
    private int minVolume = 0;


}
