package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: xpe  reason: default package */
public final class xpe extends vj0 implements Handler.Callback {
    public final ob6 C0;
    public final p54 D0;
    public a04 E0;
    public final ebe F0;
    public boolean G0;
    public int H0;
    public dbe I0;
    public ibe J0;
    public kbe K0;
    public kbe L0;
    public int M0;
    public final Handler N0;
    public final o75 O0;
    public final y7g P0;
    public boolean Q0;
    public boolean R0;
    public qy5 S0;
    public long T0;
    public long U0;
    public long V0;

    /* JADX WARNING: type inference failed for: r3v2, types: [ob6, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xpe(o75 o75, Looper looper) {
        super(3);
        Handler handler;
        qqd qqd = ebe.W;
        this.O0 = o75;
        if (looper == null) {
            handler = null;
        } else {
            int i = oaf.a;
            handler = new Handler(looper, this);
        }
        this.N0 = handler;
        this.F0 = qqd;
        this.C0 = new Object();
        this.D0 = new p54(1);
        this.P0 = new y7g(18);
        this.V0 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
    }

    public final int D(qy5 qy5) {
        if (!Objects.equals(qy5.n, "application/x-media3-cues")) {
            qqd qqd = (qqd) this.F0;
            qqd.getClass();
            if (!((b46) qqd.b).a(qy5)) {
                String str = qy5.n;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return ia9.j(str) ? vj0.b(1, 0, 0, 0) : vj0.b(0, 0, 0, 0);
                }
            }
        }
        return vj0.b(qy5.K == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void F() {
        boolean z = Objects.equals(this.S0.n, "application/cea-608") || Objects.equals(this.S0.n, "application/x-mp4-cea-608") || Objects.equals(this.S0.n, "application/cea-708");
        fm9.j("Legacy decoding is disabled, can't handle " + this.S0.n + " samples (expected application/x-media3-cues).", z);
    }

    public final long G() {
        if (this.M0 == -1) {
            return Long.MAX_VALUE;
        }
        this.K0.getClass();
        if (this.M0 >= this.K0.u()) {
            return Long.MAX_VALUE;
        }
        return this.K0.i(this.M0);
    }

    public final long H(long j) {
        boolean z = false;
        fm9.k(j != -9223372036854775807L);
        if (this.T0 != -9223372036854775807L) {
            z = true;
        }
        fm9.k(z);
        return j - this.T0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r3.equals("application/cea-608") == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J() {
        /*
            r7 = this;
            r0 = 1
            r7.G0 = r0
            qy5 r1 = r7.S0
            r1.getClass()
            ebe r2 = r7.F0
            qqd r2 = (defpackage.qqd) r2
            r2.getClass()
            java.lang.String r3 = r1.n
            if (r3 == 0) goto L_0x004f
            int r4 = r1.G
            r5 = -1
            int r6 = r3.hashCode()
            switch(r6) {
                case 930165504: goto L_0x0033;
                case 1566015601: goto L_0x002a;
                case 1566016562: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = r5
            goto L_0x003d
        L_0x001f:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0028
            goto L_0x001d
        L_0x0028:
            r0 = 2
            goto L_0x003d
        L_0x002a:
            java.lang.String r6 = "application/cea-608"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x003d
            goto L_0x001d
        L_0x0033:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x003c
            goto L_0x001d
        L_0x003c:
            r0 = 0
        L_0x003d:
            switch(r0) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0049;
                case 2: goto L_0x0041;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x004f
        L_0x0041:
            u02 r0 = new u02
            java.util.List r1 = r1.q
            r0.<init>(r4, r1)
            goto L_0x0070
        L_0x0049:
            n02 r0 = new n02
            r0.<init>(r3, r4)
            goto L_0x0070
        L_0x004f:
            java.lang.Object r0 = r2.b
            b46 r0 = (defpackage.b46) r0
            boolean r2 = r0.a(r1)
            if (r2 == 0) goto L_0x0078
            obe r0 = r0.e(r1)
            vn0 r1 = new vn0
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>((defpackage.obe) r0)
            r0 = r1
        L_0x0070:
            r7.I0 = r0
            long r1 = r7.w0
            r0.a(r1)
            return
        L_0x0078:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r0 = defpackage.wg0.i(r0, r3)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpe.J():void");
    }

    public final void K(zz3 zz3) {
        zw6 zw6 = zz3.a;
        o75 o75 = this.O0;
        o75.a.x0.f(27, new z72(5, zw6));
        u75 u75 = o75.a;
        u75.j1 = zz3;
        u75.x0.f(27, new q64(16, (Object) zz3));
    }

    public final void L() {
        this.J0 = null;
        this.M0 = -1;
        kbe kbe = this.K0;
        if (kbe != null) {
            kbe.w();
            this.K0 = null;
        }
        kbe kbe2 = this.L0;
        if (kbe2 != null) {
            kbe2.w();
            this.L0 = null;
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            K((zz3) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public final String k() {
        return "TextRenderer";
    }

    public final boolean m() {
        return this.R0;
    }

    public final boolean o() {
        return true;
    }

    public final void p() {
        this.S0 = null;
        this.V0 = -9223372036854775807L;
        zz3 zz3 = new zz3(H(this.U0), ffc.X);
        Handler handler = this.N0;
        if (handler != null) {
            handler.obtainMessage(1, zz3).sendToTarget();
        } else {
            K(zz3);
        }
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        if (this.I0 != null) {
            L();
            dbe dbe = this.I0;
            dbe.getClass();
            dbe.release();
            this.I0 = null;
            this.H0 = 0;
        }
    }

    public final void r(long j, boolean z) {
        this.U0 = j;
        a04 a04 = this.E0;
        if (a04 != null) {
            a04.clear();
        }
        zz3 zz3 = new zz3(H(this.U0), ffc.X);
        Handler handler = this.N0;
        if (handler != null) {
            handler.obtainMessage(1, zz3).sendToTarget();
        } else {
            K(zz3);
        }
        this.Q0 = false;
        this.R0 = false;
        this.V0 = -9223372036854775807L;
        qy5 qy5 = this.S0;
        if (qy5 != null && !Objects.equals(qy5.n, "application/x-media3-cues")) {
            if (this.H0 != 0) {
                L();
                dbe dbe = this.I0;
                dbe.getClass();
                dbe.release();
                this.I0 = null;
                this.H0 = 0;
                J();
                return;
            }
            L();
            dbe dbe2 = this.I0;
            dbe2.getClass();
            dbe2.flush();
            dbe2.a(this.w0);
        }
    }

    public final void x(qy5[] qy5Arr, long j, long j2) {
        this.T0 = j2;
        qy5 qy5 = qy5Arr[0];
        this.S0 = qy5;
        if (!Objects.equals(qy5.n, "application/x-media3-cues")) {
            F();
            if (this.I0 != null) {
                this.H0 = 1;
            } else {
                J();
            }
        } else {
            this.E0 = this.S0.H == 1 ? new ur8() : new y8(25);
        }
    }

    public final void z(long j, long j2) {
        boolean z;
        long j3;
        long j4 = j;
        if (this.y0) {
            long j5 = this.V0;
            if (j5 != -9223372036854775807L && j4 >= j5) {
                L();
                this.R0 = true;
            }
        }
        if (!this.R0) {
            qy5 qy5 = this.S0;
            qy5.getClass();
            boolean equals = Objects.equals(qy5.n, "application/x-media3-cues");
            Handler handler = this.N0;
            int i = 0;
            y7g y7g = this.P0;
            if (equals) {
                this.E0.getClass();
                if (!this.Q0) {
                    p54 p54 = this.D0;
                    if (y(y7g, p54, 0) == -4) {
                        if (p54.f(4)) {
                            this.Q0 = true;
                        } else {
                            p54.y();
                            ByteBuffer byteBuffer = p54.X;
                            byteBuffer.getClass();
                            long j6 = p54.Z;
                            byte[] array = byteBuffer.array();
                            int arrayOffset = byteBuffer.arrayOffset();
                            int limit = byteBuffer.limit();
                            this.C0.getClass();
                            Parcel obtain = Parcel.obtain();
                            obtain.unmarshall(array, arrayOffset, limit);
                            obtain.setDataPosition(0);
                            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                            obtain.recycle();
                            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
                            parcelableArrayList.getClass();
                            ww6 i2 = zw6.i();
                            while (i < parcelableArrayList.size()) {
                                Bundle bundle = (Bundle) parcelableArrayList.get(i);
                                bundle.getClass();
                                i2.a(yz3.a(bundle));
                                i++;
                            }
                            b04 b04 = new b04(j6, readBundle.getLong("d"), i2.j());
                            p54.v();
                            i = this.E0.d(b04, j4);
                        }
                    }
                }
                long c = this.E0.c(this.U0);
                int i3 = (c > Long.MIN_VALUE ? 1 : (c == Long.MIN_VALUE ? 0 : -1));
                if (i3 == 0 && this.Q0 && i == 0) {
                    this.R0 = true;
                }
                if (i3 != 0 && c <= j4) {
                    i = 1;
                }
                if (i != 0) {
                    zw6 i4 = this.E0.i(j4);
                    long n = this.E0.n(j4);
                    zz3 zz3 = new zz3(H(n), i4);
                    if (handler != null) {
                        handler.obtainMessage(1, zz3).sendToTarget();
                    } else {
                        K(zz3);
                    }
                    this.E0.u(n);
                }
                this.U0 = j4;
                return;
            }
            F();
            this.U0 = j4;
            if (this.L0 == null) {
                dbe dbe = this.I0;
                dbe.getClass();
                dbe.b(j4);
                try {
                    dbe dbe2 = this.I0;
                    dbe2.getClass();
                    this.L0 = (kbe) dbe2.c();
                } catch (SubtitleDecoderException e) {
                    z04.v("Subtitle decoding failed. streamFormat=" + this.S0, e);
                    zz3 zz32 = new zz3(H(this.U0), ffc.X);
                    if (handler != null) {
                        handler.obtainMessage(1, zz32).sendToTarget();
                    } else {
                        K(zz32);
                    }
                    L();
                    dbe dbe3 = this.I0;
                    dbe3.getClass();
                    dbe3.release();
                    this.I0 = null;
                    this.H0 = 0;
                    J();
                    return;
                }
            }
            if (this.s0 == 2) {
                if (this.K0 != null) {
                    long G = G();
                    z = false;
                    while (G <= j4) {
                        this.M0++;
                        G = G();
                        z = true;
                    }
                } else {
                    z = false;
                }
                kbe kbe = this.L0;
                if (kbe != null) {
                    if (kbe.f(4)) {
                        if (!z && G() == Long.MAX_VALUE) {
                            if (this.H0 == 2) {
                                L();
                                dbe dbe4 = this.I0;
                                dbe4.getClass();
                                dbe4.release();
                                this.I0 = null;
                                this.H0 = 0;
                                J();
                            } else {
                                L();
                                this.R0 = true;
                            }
                        }
                    } else if (kbe.c <= j4) {
                        kbe kbe2 = this.K0;
                        if (kbe2 != null) {
                            kbe2.w();
                        }
                        this.M0 = kbe.g(j4);
                        this.K0 = kbe;
                        this.L0 = null;
                        z = true;
                    }
                }
                if (z) {
                    this.K0.getClass();
                    int g = this.K0.g(j4);
                    if (g == 0 || this.K0.u() == 0) {
                        j3 = this.K0.c;
                    } else if (g == -1) {
                        kbe kbe3 = this.K0;
                        j3 = kbe3.i(kbe3.u() - 1);
                    } else {
                        j3 = this.K0.i(g - 1);
                    }
                    zz3 zz33 = new zz3(H(j3), this.K0.p(j4));
                    if (handler != null) {
                        handler.obtainMessage(1, zz33).sendToTarget();
                    } else {
                        K(zz33);
                    }
                }
                if (this.H0 != 2) {
                    while (!this.Q0) {
                        try {
                            ibe ibe = this.J0;
                            if (ibe == null) {
                                dbe dbe5 = this.I0;
                                dbe5.getClass();
                                ibe = (ibe) dbe5.f();
                                if (ibe != null) {
                                    this.J0 = ibe;
                                } else {
                                    return;
                                }
                            }
                            if (this.H0 == 1) {
                                ibe.b = 4;
                                dbe dbe6 = this.I0;
                                dbe6.getClass();
                                dbe6.d(ibe);
                                this.J0 = null;
                                this.H0 = 2;
                                return;
                            }
                            int y = y(y7g, ibe, 0);
                            if (y == -4) {
                                if (ibe.f(4)) {
                                    this.Q0 = true;
                                    this.G0 = false;
                                } else {
                                    qy5 qy52 = (qy5) y7g.c;
                                    if (qy52 != null) {
                                        ibe.v0 = qy52.s;
                                        ibe.y();
                                        this.G0 &= !ibe.f(1);
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.G0) {
                                    dbe dbe7 = this.I0;
                                    dbe7.getClass();
                                    dbe7.d(ibe);
                                    this.J0 = null;
                                }
                            } else if (y == -3) {
                                return;
                            }
                        } catch (SubtitleDecoderException e2) {
                            z04.v("Subtitle decoding failed. streamFormat=" + this.S0, e2);
                            zz3 zz34 = new zz3(H(this.U0), ffc.X);
                            if (handler != null) {
                                handler.obtainMessage(1, zz34).sendToTarget();
                            } else {
                                K(zz34);
                            }
                            L();
                            dbe dbe8 = this.I0;
                            dbe8.getClass();
                            dbe8.release();
                            this.I0 = null;
                            this.H0 = 0;
                            J();
                            return;
                        }
                    }
                }
            }
        }
    }
}
