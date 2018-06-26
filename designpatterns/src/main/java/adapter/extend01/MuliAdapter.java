package adapter.extend01;

import adapter.AC220Adaptee;

/**
 * Created by misu on 2018/1/23.
 */
public class MuliAdapter implements AC220Adaptee{
    private IIPhoneTarget iPhoneTarget;
    private IAndroidTarget androidTarget;


    public void output(String type, int size) {

    }

    public void inputIPhone(String type, int size){


    }

    public void inputAndroid(String type, int size){

    }
}
