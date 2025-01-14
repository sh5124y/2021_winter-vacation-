package test.class1;

public class TV {
	private String color, producer;
	private int size, channel, volume;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
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
		System.out.println(producer+"TV���� ����.");
	}
	
	public void powerOff() {
		System.out.println(producer+"TV���� ����.");
	}
	
	public void upChannel() {
		channel++;
		System.out.println("���� ü��"+channel+"��");
		
	}
	
	public void downChannel() {
		channel--;
		System.out.println("���� ü��"+channel+"��");
		
	}
	
	public void upVolume() {
		volume++;
		System.out.println("���纼�� : "+volume);
	}
	
	public void downVolume() {
		volume--;
		System.out.println("���纼�� : "+volume);
	}
	
	@Override
	public String toString() {
		return "TV [color=" + color + ", producer=" + producer + ", size=" + size + ", channel=" + channel + ", volume="
				+ volume + "]";
	}
	
	
}
