package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: ca3  reason: default package */
public final /* synthetic */ class ca3 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ca3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                for (m56 m56 : (m56[]) this.b) {
                    int f = xfg.f((Comparable) m56.invoke(obj), (Comparable) m56.invoke(obj2));
                    if (f != 0) {
                        return f;
                    }
                }
                return 0;
            case 1:
                uj3 uj3 = (uj3) obj2;
                long n = ((uj3) obj).n();
                ei9 ei9 = (ei9) this.b;
                int b2 = ei9.b(n);
                long j = 0;
                long j2 = b2 >= 0 ? ei9.c[b2] : 0;
                int b3 = ei9.b(uj3.n());
                if (b3 >= 0) {
                    j = ei9.c[b3];
                }
                return np8.j(j2, j);
            case 2:
                return oq3.a((uj3) obj, (uj3) obj2, (Collator) ((oq3) this.b).a.e());
            case 3:
                kzc kzc = (kzc) obj;
                kzc kzc2 = (kzc) obj2;
                vx7 vx7 = (vx7) this.b;
                vx7.getClass();
                if (kzc2 == null) {
                    return 0;
                }
                e52 e52 = kzc.o;
                e52 e522 = kzc2.o;
                if (e52 == null || e522 == null) {
                    return (e52 == null || e522 != null) ? 0 : -1;
                }
                long m = e522.m();
                e52 e523 = kzc.o;
                long m2 = e523.m();
                k92 k92 = e522.b;
                long j3 = vx7.b;
                if (k92.f(j3)) {
                    m = Long.MAX_VALUE;
                }
                if (e523.b.f(j3)) {
                    m2 = Long.MAX_VALUE;
                }
                return Long.compare(m, m2);
            case 4:
                m88 m88 = (m88) this.b;
                return m88.a(obj2) - m88.a(obj);
            case 5:
                n88 n88 = (n88) this.b;
                return n88.a(obj2) - n88.a(obj);
            case 6:
                rb0 rb0 = (rb0) obj2;
                ((ae3) this.b).getClass();
                Class<MediaCodec> cls = ((rb0) obj).a.j;
                int i = 1;
                Class<h8b> cls2 = h8b.class;
                Class<MediaCodec> cls3 = MediaCodec.class;
                int i2 = cls == cls3 ? 2 : cls == cls2 ? 0 : 1;
                Class<MediaCodec> cls4 = rb0.a.j;
                if (cls4 == cls3) {
                    i = 2;
                } else if (cls4 == cls2) {
                    i = 0;
                }
                return i2 - i;
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                int width = size.getWidth();
                Rect rect = (Rect) this.b;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(width - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
    }
}
