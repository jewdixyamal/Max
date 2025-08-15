package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* renamed from: e42  reason: default package */
public final class e42 extends vh0 {
    public final SparseArray i = new SparseArray();

    public final void b(ByteBuffer byteBuffer) {
        f42 f42 = (f42) this.i.get(this.b.b);
        fm9.l(f42);
        int remaining = byteBuffer.remaining() / this.b.d;
        ByteBuffer k = k(this.c.d * remaining);
        j1e.B(byteBuffer, this.b, k, this.c, f42, remaining, false, true);
        k.flip();
    }

    public final j60 g(j60 j60) {
        if (j60.c == 2) {
            f42 f42 = (f42) this.i.get(j60.b);
            if (f42 != null) {
                return f42.e ? j60.e : new j60(j60.a, f42.b, 2);
            }
            throw new AudioProcessor$UnhandledAudioFormatException("No mixing matrix for input channel count", j60);
        }
        throw new AudioProcessor$UnhandledAudioFormatException(j60);
    }
}
