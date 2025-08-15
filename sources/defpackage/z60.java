package defpackage;

import android.media.MediaCodec;
import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: z60  reason: default package */
public final class z60 extends yqc {
    public final y84 e;
    public final j60 f;
    public final p54 g;
    public final p54 h;
    public final u40 i;
    public final w40 j;
    public final qy5 k;
    public boolean l;
    public long m;

    public z60(qy5 qy5, qy5 qy52, f1f f1f, lv4 lv4, zw6 zw6, yb9 yb9, v43 v43, hj9 hj9, x99 x99) {
        super(qy5, hj9);
        u40 u40 = new u40(yb9, zw6);
        this.i = u40;
        this.k = qy52;
        this.j = u40.i(lv4, qy52);
        j60 j60 = ((h60) u40.f).d;
        this.f = j60;
        fm9.k(!j60.equals(j60.e));
        ny5 ny5 = new ny5();
        String str = f1f.b;
        if (str == null) {
            str = qy5.n;
            str.getClass();
        }
        ny5.m = ia9.l(str);
        ny5.B = j60.a;
        ny5.A = j60.b;
        ny5.C = j60.c;
        ny5.i = qy52.j;
        qy5 qy53 = new qy5(ny5);
        ny5 a = qy53.a();
        a.m = ia9.l(yqc.i(qy53, hj9.b.w(1)));
        y84 b = v43.b(new qy5(a));
        this.e = b;
        this.g = new p54(0);
        this.h = new p54(0);
        qy5 qy54 = b.c;
        if (!oaf.a(qy53.n, qy54.n)) {
            ty a2 = f1f.a();
            a2.b(qy54.n);
            f1f = a2.a();
        }
        x99.m(f1f);
    }

    public final sf6 j(lv4 lv4, qy5 qy5, int i2) {
        if (this.l) {
            return this.i.i(lv4, qy5);
        }
        this.l = true;
        fm9.k(qy5.equals(this.k));
        return this.j;
    }

    public final p54 k() {
        p54 p54 = this.h;
        y84 y84 = this.e;
        ByteBuffer c = y84.c();
        p54.X = c;
        MediaCodec.BufferInfo bufferInfo = null;
        if (c == null) {
            return null;
        }
        if (y84.f(false)) {
            bufferInfo = y84.a;
        }
        bufferInfo.getClass();
        p54.Z = bufferInfo.presentationTimeUs;
        p54.b = 1;
        return p54;
    }

    public final qy5 l() {
        y84 y84 = this.e;
        y84.f(false);
        return y84.j;
    }

    public final boolean m() {
        return this.e.d();
    }

    public final boolean n() {
        boolean z;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        boolean z2 = true;
        u40 u40 = this.i;
        long j2 = -9223372036854775807L;
        if (u40.b) {
            z = true;
        } else {
            boolean z3 = u40.a;
            k74 k74 = (k74) u40.e;
            if (!z3) {
                try {
                    k74.d((j60) u40.g);
                    u40.a = true;
                } catch (AudioProcessor$UnhandledAudioFormatException e2) {
                    throw ExportException.b(e2, "Error while configuring mixer");
                }
            }
            u40.b = true;
            int i2 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) u40.d;
                if (i2 >= arrayList.size()) {
                    break;
                }
                t40 t40 = (t40) arrayList.get(i2);
                if (t40.b == -1) {
                    w40 w40 = t40.a;
                    try {
                        w40.l();
                        long j3 = w40.e.get();
                        if (j3 == -9223372036854775807L) {
                            u40.b = false;
                        } else if (j3 != Long.MIN_VALUE) {
                            t40.b = k74.a(w40.a, j3);
                        }
                    } catch (AudioProcessor$UnhandledAudioFormatException e3) {
                        throw ExportException.b(e3, "Unhandled format while adding source " + t40.b);
                    }
                }
                i2++;
            }
            z = u40.b;
        }
        if (!z) {
            byteBuffer = m60.a;
        } else {
            if (!((k74) u40.e).e()) {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList2 = (ArrayList) u40.d;
                    if (i3 >= arrayList2.size()) {
                        break;
                    }
                    t40 t402 = (t40) arrayList2.get(i3);
                    int i4 = t402.b;
                    k74 k742 = (k74) u40.e;
                    k742.c();
                    SparseArray sparseArray = k742.c;
                    if (oaf.l(sparseArray, i4)) {
                        w40 w402 = t402.a;
                        if (!w402.m() && w402.d.isEmpty() && (w402.l == j2 ? w402.j || w402.k : w402.o && (w402.j || w402.k))) {
                            k742.c();
                            long j4 = k742.l;
                            SparseArray sparseArray2 = k742.c;
                            fm9.j("Source not found.", oaf.l(sparseArray2, i4));
                            k742.l = Math.max(j4, ((j74) sparseArray2.get(i4)).a);
                            sparseArray.delete(i4);
                            t402.b = -1;
                            u40.c++;
                        } else {
                            try {
                                k742.f(i4, w402.l());
                            } catch (AudioProcessor$UnhandledAudioFormatException e4) {
                                throw ExportException.b(e4, "AudioGraphInput (sourceId=" + i4 + ") reconfiguration");
                            }
                        }
                    }
                    i3++;
                    j2 = -9223372036854775807L;
                }
            }
            if (!((ByteBuffer) u40.h).hasRemaining()) {
                k74 k743 = (k74) u40.e;
                k743.c();
                if (k743.e()) {
                    byteBuffer2 = m60.a;
                } else {
                    long j5 = k743.k;
                    if (k743.c.size() == 0) {
                        j5 = Math.min(j5, k743.l);
                    }
                    for (int i5 = 0; i5 < k743.c.size(); i5++) {
                        j5 = Math.min(j5, ((j74) k743.c.valueAt(i5)).a);
                    }
                    if (j5 <= k743.j) {
                        byteBuffer2 = m60.a;
                    } else {
                        bu1 bu1 = k743.g[0];
                        long min = Math.min(j5, bu1.b);
                        ByteBuffer duplicate = ((ByteBuffer) bu1.c).duplicate();
                        duplicate.position(((int) (k743.j - bu1.a)) * k743.e.d).limit(((int) (min - bu1.a)) * k743.e.d);
                        ByteBuffer order = duplicate.slice().order(ByteOrder.nativeOrder());
                        if (min == bu1.b) {
                            bu1[] bu1Arr = k743.g;
                            bu1 bu12 = bu1Arr[1];
                            bu1Arr[0] = bu12;
                            bu1Arr[1] = k743.b(bu12.b);
                        }
                        k743.j = min;
                        k743.i = Math.min(k743.k, min + ((long) k743.f));
                        order.remaining();
                        LinkedHashMap linkedHashMap = d54.a;
                        synchronized (d54.class) {
                        }
                        byteBuffer2 = order;
                    }
                }
                u40.h = byteBuffer2;
            }
            if (((h60) u40.f).f()) {
                boolean h2 = u40.h();
                h60 h60 = (h60) u40.f;
                if (h2) {
                    h60.h();
                } else {
                    h60.i((ByteBuffer) u40.h);
                }
                byteBuffer = ((h60) u40.f).d();
            } else {
                byteBuffer = (ByteBuffer) u40.h;
            }
        }
        if (!this.e.e(this.g)) {
            return false;
        }
        u40 u402 = this.i;
        h60 h602 = (h60) u402.f;
        if (h602.f() ? h602.e() : u402.h()) {
            d54.a();
            p54 p54 = this.g;
            ByteBuffer byteBuffer3 = p54.X;
            byteBuffer3.getClass();
            if (byteBuffer3.position() != 0) {
                z2 = false;
            }
            fm9.k(z2);
            long j6 = this.m;
            j60 j60 = this.f;
            p54.Z = ((j6 / ((long) j60.d)) * 1000000) / ((long) j60.a);
            p54.a(4);
            p54.y();
            this.e.g(p54);
            return false;
        } else if (!byteBuffer.hasRemaining()) {
            return false;
        } else {
            p54 p542 = this.g;
            ByteBuffer byteBuffer4 = p542.X;
            byteBuffer4.getClass();
            int limit = byteBuffer.limit();
            byteBuffer.limit(Math.min(limit, byteBuffer4.capacity() + byteBuffer.position()));
            byteBuffer4.put(byteBuffer);
            long j7 = this.m;
            j60 j602 = this.f;
            p542.Z = ((j7 / ((long) j602.d)) * 1000000) / ((long) j602.a);
            this.m = j7 + ((long) byteBuffer4.position());
            p542.b = 0;
            p542.y();
            byteBuffer.limit(limit);
            this.e.g(p542);
            return true;
        }
    }

    public final void o() {
        u40 u40;
        ArrayList arrayList;
        int i2 = 0;
        while (true) {
            u40 = this.i;
            arrayList = (ArrayList) u40.d;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((t40) arrayList.get(i2)).a.h.j();
            i2++;
        }
        arrayList.clear();
        k74 k74 = (k74) u40.e;
        k74.c.clear();
        k74.d = 0;
        j60 j60 = j60.e;
        k74.e = j60;
        k74.f = -1;
        k74.g = new bu1[0];
        k74.h = -9223372036854775807L;
        k74.i = -1;
        long j2 = 0;
        k74.j = 0;
        k74.k = Long.MAX_VALUE;
        if (k74.a) {
            j2 = Long.MAX_VALUE;
        }
        k74.l = j2;
        ((h60) u40.f).j();
        u40.c = 0;
        u40.h = m60.a;
        u40.g = j60;
        this.e.h();
    }

    public final void p() {
        this.e.i();
    }
}
