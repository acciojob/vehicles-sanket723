package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name,4,4,6,isManual,"type",2);
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        newSpeed = getCurrentSpeed()+rate;

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            setCurrentGear(1);
        }
        //for all other cases, change the gear accordingly

        else if(newSpeed > 0 && newSpeed <= 50) {
            setCurrentSpeed(newSpeed);
            setCurrentGear(1);
           // changeGear(1);
        }

        else if(newSpeed > 50 && newSpeed <= 100){
             setCurrentSpeed(newSpeed);
             setCurrentGear(2);
             //changeGear(2);
        }
        else if(newSpeed > 100 && newSpeed <= 150){
             setCurrentSpeed(newSpeed);
             setCurrentGear(3);
             //changeGear(3);
        }
        else if(newSpeed > 150 && newSpeed <= 200){
            setCurrentSpeed(newSpeed);
            setCurrentGear(4);
            //changeGear(4);
        }
        else if(newSpeed > 200 && newSpeed <= 250){
            setCurrentSpeed(newSpeed);
            setCurrentGear(5);
            //changeGear(5);
        }
        else if(newSpeed>250){
            setCurrentSpeed(newSpeed);
            setCurrentGear(6);
            //changeGear(6);
        }

    }
}
