package ��������ҵ;

public class _9_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		_9_3 tv1 = new _9_3();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolumelevel(3);
		
		_9_3 tv2 = new _9_3();
		tv2.turnOn();
		tv2.channelUP();
		tv2.channelUP();
		tv2.volumeUp();
		
		System.out.println("tv1's channel is " + tv1.channel
		+ " and volumn level is " + tv1.volumelevel);
		System.out.println("tv2's channel is " + tv2.channel
		+ " and volumn level is " + tv2.volumelevel);		
	}

}
