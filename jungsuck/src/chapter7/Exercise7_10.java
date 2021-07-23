package chapter7;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	private int tmp;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void gotoPrevChannel() {
		tmp = channel;
		channel = prevChannel;
		prevChannel = tmp;
	}

	/**
	 * @return the isPowerOn
	 */
	public boolean isPowerOn() {
		return isPowerOn;
	}

	/**
	 * @param isPowerOn the isPowerOn to set
	 */
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	/**
	 * @return the channel
	 */
	public int getChannel() {
		return channel;
	}

	/**
	 * @param channel the channel to set
	 */
	public void setChannel(int channel) {
		prevChannel = this.channel;
		this.channel = channel;
	}

	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}

	/**
	 * @return the prevChannel
	 */
	public int getPrevChannel() {
		return prevChannel;
	}

	/**
	 * @param prevChannel the prevChannel to set
	 */
	public void setPrevChannel(int prevChannel) {
		this.prevChannel = prevChannel;
	}
}

class Exercise7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}
}
