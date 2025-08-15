package defpackage;

import java.nio.ByteBuffer;

/* renamed from: pt0  reason: default package */
public final class pt0 {
    public final int a;
    public final int b;
    public final ByteBuffer c;
    public long d;

    public pt0(ByteBuffer byteBuffer, q90 q90, int i, int i2) {
        byteBuffer.rewind();
        int limit = byteBuffer.limit() - byteBuffer.position();
        if (limit == q90.a) {
            this.a = i;
            this.b = i2;
            this.c = byteBuffer;
            this.d = q90.b;
            return;
        }
        StringBuilder n = rh4.n(limit, "Byte buffer size is not match with packet info: ", " != ");
        n.append(q90.a);
        throw new IllegalStateException(n.toString());
    }

    public final q90 a(ByteBuffer byteBuffer) {
        int i;
        long j = this.d;
        ByteBuffer byteBuffer2 = this.c;
        int position = byteBuffer2.position();
        int position2 = byteBuffer.position();
        if (byteBuffer2.remaining() > byteBuffer.remaining()) {
            i = byteBuffer.remaining();
            this.d += ote.k(this.b, ote.V(this.a, (long) i));
            ByteBuffer duplicate = byteBuffer2.duplicate();
            duplicate.position(position).limit(position + i);
            byteBuffer.put(duplicate).limit(position2 + i).position(position2);
        } else {
            i = byteBuffer2.remaining();
            byteBuffer.put(byteBuffer2).limit(position2 + i).position(position2);
        }
        byteBuffer2.position(position + i);
        return new q90(i, j);
    }
}
