package com.eomcs.io.ex07;

import java.io.ByteArrayInputStream;

public class ByteArrayDataInputStream extends ByteArrayInputStream {

  public ByteArrayDataInputStream(byte[] buf) {
    super(buf);
  }

  public String readUTF() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 문자열 출력
    // 문자열 개수(바이트)
    int size = this.read();
    // 그 문자열 데이터를 저장할 바이트 배열 생성
    byte[] bytes = new byte[size];
    // 바이트 배열에 문자열 저장
    this.read(bytes); // 이름 배열 개수 만큼 바이트를 읽어 배열에 저장한다.
    // 바이트 배열에 저장되있는 문자열 배열을 String객체에 만든다
    return new String(bytes, "UTF-8");
  }

  public int readInt() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 int 값 출력
    int value = 0;

    value = this.read() << 24;
    value += this.read() << 16;
    value += this.read() << 8;
    value += this.read();
    return value;
  }

  public long readLong() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 long 값 출력
    long value = 0;
    value += (long) this.read() << 56;
    value += (long) this.read() << 48;
    value += (long) this.read() << 40;
    value += (long) this.read() << 32;
    value += (long) this.read() << 24;
    value += (long) this.read() << 16;
    value += (long) this.read() << 8;
    value += this.read();
    return value;
  }

  public boolean readBoolean() throws Exception {
    // 상속 받은 read() 메서드를 사용하여 boolean 값 출력
    if (this.read() == 1)
      return true;
    else
      return false;
  }

}
