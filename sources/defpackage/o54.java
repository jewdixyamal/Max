package defpackage;

import java.nio.ByteBuffer;

/* renamed from: o54  reason: default package */
public class o54 extends oy {
    public boolean X;
    public long Y;
    public ByteBuffer Z;
    public final rz3 c = new rz3(0);
    public ByteBuffer o;
    public final int s0;
    public final int t0;

    static {
        h85.a("goog.exo.decoder");
    }

    public o54(int i) {
        super(2);
        this.s0 = i;
        this.t0 = 0;
    }

    public void v() {
        this.b = 0;
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.Z;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.X = false;
    }

    public final ByteBuffer w(int i) {
        int i2 = this.s0;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.o;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public final void x(int i) {
        int i2 = i + this.t0;
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer == null) {
            this.o = w(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.o = byteBuffer;
            return;
        }
        ByteBuffer w = w(i3);
        w.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            w.put(byteBuffer);
        }
        this.o = w;
    }

    public final void y() {
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.Z;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
