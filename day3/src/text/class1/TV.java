package text.class1;

public class TV {	   //Override
	private String color,producer;
	private int size, channel, volume;
	   
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
	    return color;
	}
	public void setProducer() {
		this.producer = producer;
    }
	public int getSize() {
		return size;
    }
	public void setSize(int size) {
		this.size = size;
    }
	public int getChannel() {
		return channel;
    }
	public void setChannel(int channel) {
		this.channel = channel;
    }
	public int getVolume() {
		return volume;
    }
	public void setVolume(int volume) {
		this.volume = volume;
		}
	public void powerOn() {
		System.out.println(producer + " TV 전원 켜짐. ");
		}
	public void powerOff() {
		System.out.println(producer + " TV 전원 꺼짐. ");
		}   
	public void upchannel() {
		channel++;
		System.out.println("현재 채널 " + channel + "번");
		}
	public void downchannel() {
		channel--;
		System.out.println("현재 채널 " + channel + "번");
		}   
	public void upVolume() {
		volume++;
		System.out.println("현재 볼륨 : " + volume);
		}   
	public void downVolume() {
		volume--;
		System.out.println("현재 볼륨 : " + volume);
		}   
	}
