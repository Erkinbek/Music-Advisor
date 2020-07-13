import java.util.Arrays;

class AsciiCharSequence implements CharSequence {

	byte[] aByte;

	AsciiCharSequence(byte[] bytes) {
		this.aByte = bytes;
	}

	@Override
	public int length() {
		return aByte.length;
	}

	@Override
	public char charAt(int i) {
		return (char) aByte[i];
	}

	@Override
	public CharSequence subSequence(int i, int i1) {
		return new AsciiCharSequence(Arrays.copyOfRange(aByte , i, i1));
	}

	@Override
	public String toString() {
		return new String(this.aByte);
	}
}