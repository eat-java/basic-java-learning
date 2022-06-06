package chapter6;


class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        if (isPowerOn) {
            this.isPowerOn = false;
        } else {
            this.isPowerOn = true;
        }
    }

    void volumeUp() {
        if (this.volume < MAX_VOLUME) {
            this.volume++;
        }
    }

    void volumeDown() {
        if (this.volume > MIN_VOLUME) {
            this.volume--;
        }
    }

    void channelUp() {
        if (this.channel < MAX_CHANNEL) {
            this.channel++;
        }
    }

    void channelDown() {
        if (this.channel > MIN_CHANNEL) {
            this.channel--;
        }
    }
}

public class Ex6_19 {

    public static void main(String[] args) {

        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("CH: " + t.channel + ", VOL: " + t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH: " + t.channel + ", VOL: " + t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();

        System.out.println("CH: " + t.channel + ", VOL: " + t.volume);
    }
}
