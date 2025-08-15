package defpackage;

import android.graphics.Color;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ni  reason: default package */
public final class ni implements uoc {
    public final bg4 a;
    public final kad b;
    public e24 c;

    public ni(bg4 bg4, kad kad) {
        this.a = bg4;
        this.b = kad;
    }

    public final void a(e24 e24, byte[] bArr, int i) {
        SystemClock.elapsedRealtime();
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte b2 = wrap.get();
        wrap.getShort();
        wrap.getInt();
        if (b2 == 1) {
            wrap.getShort();
        } else {
            wrap.getInt();
        }
        byte b3 = wrap.get();
        ByteBuffer slice = wrap.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        int i2 = 0;
        if (b2 == 1) {
            int remaining = slice.remaining() / 4;
            float[] fArr = new float[remaining];
            while (i2 < remaining) {
                fArr[i2] = slice.getFloat();
                i2++;
            }
        } else if (b3 == 0) {
            int remaining2 = slice.remaining();
            float[] fArr2 = new float[remaining2];
            while (i2 < remaining2) {
                fArr2[i2] = ((float) (slice.get() & 255)) * 0.003921569f;
                i2++;
            }
        } else if (b3 != 1 && b3 == 2) {
            Color.rgb(slice.get() & 255, slice.get() & 255, slice.get() & 255);
        }
        kad kad = this.b;
        ((AtomicInteger) kad.Y).incrementAndGet();
        ((AtomicInteger) kad.X).addAndGet(bArr.length);
        this.a.getClass();
    }
}
