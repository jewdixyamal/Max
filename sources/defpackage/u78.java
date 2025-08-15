package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioSink$ConfigurationException;
import com.google.android.exoplayer2.audio.AudioSink$InitializationException;
import com.google.android.exoplayer2.audio.AudioSink$WriteException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: u78  reason: default package */
public final class u78 extends f88 implements l78 {
    public final Context Q1;
    public final ph4 R1;
    public final d84 S1;
    public int T1;
    public boolean U1;
    public oy5 V1;
    public long W1;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;
    public v75 a2;

    public u78(Context context, p78 p78, xw0 xw0, Handler handler, n75 n75, d84 d84) {
        super(1, p78, xw0, 44100.0f);
        this.Q1 = context.getApplicationContext();
        this.S1 = d84;
        this.R1 = new ph4((Object) handler, (Object) n75);
        d84.r = new w4d(18, (Object) this);
    }

    public static zw6 s0(xw0 xw0, oy5 oy5, boolean z, d84 d84) {
        String str = oy5.w0;
        if (str == null) {
            ls5 ls5 = zw6.b;
            return ffc.X;
        }
        if (d84.g(oy5) != 0) {
            List e = o88.e("audio/raw", false, false);
            x78 x78 = e.isEmpty() ? null : (x78) e.get(0);
            if (x78 != null) {
                return zw6.n(x78);
            }
        }
        xw0.getClass();
        List e2 = o88.e(str, z, false);
        String b = o88.b(oy5);
        if (b == null) {
            return zw6.j(e2);
        }
        List e3 = o88.e(b, z, false);
        ww6 i = zw6.i();
        i.e(e2);
        i.e(e3);
        return i.j();
    }

    public final r54 D(x78 x78, oy5 oy5, oy5 oy52) {
        r54 b = x78.b(oy5, oy52);
        int r0 = r0(x78, oy52);
        int i = this.T1;
        int i2 = b.e;
        if (r0 > i) {
            i2 |= 64;
        }
        int i3 = i2;
        return new r54(x78.a, oy5, oy52, i3 != 0 ? 0 : b.d, i3);
    }

    public final float N(float f, oy5[] oy5Arr) {
        int i = -1;
        for (oy5 oy5 : oy5Arr) {
            int i2 = oy5.K0;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    public final ArrayList O(xw0 xw0, oy5 oy5, boolean z) {
        zw6 s0 = s0(xw0, oy5, z, this.S1);
        Pattern pattern = o88.a;
        ArrayList arrayList = new ArrayList(s0);
        Collections.sort(arrayList, new ca3(4, new z16(19, oy5)));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if ("AXON 7 mini".equals(r2) == false) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.n78 Q(defpackage.x78 r12, defpackage.oy5 r13, android.media.MediaCrypto r14, float r15) {
        /*
            r11 = this;
            oy5[] r0 = r11.s0
            r0.getClass()
            int r1 = r11.r0(r12, r13)
            int r2 = r0.length
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            int r2 = r0.length
            r5 = r4
        L_0x0011:
            if (r5 >= r2) goto L_0x0028
            r6 = r0[r5]
            r54 r7 = r12.b(r13, r6)
            int r7 = r7.d
            if (r7 == 0) goto L_0x0025
            int r6 = r11.r0(r12, r6)
            int r1 = java.lang.Math.max(r1, r6)
        L_0x0025:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0028:
            r11.T1 = r1
            int r0 = defpackage.maf.a
            r1 = 24
            if (r0 >= r1) goto L_0x0060
            java.lang.String r2 = "OMX.SEC.aac.dec"
            java.lang.String r5 = r12.a
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0060
            java.lang.String r2 = "samsung"
            java.lang.String r5 = defpackage.maf.c
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0060
            java.lang.String r2 = defpackage.maf.b
            java.lang.String r5 = "zeroflte"
            boolean r5 = r2.startsWith(r5)
            if (r5 != 0) goto L_0x005e
            java.lang.String r5 = "herolte"
            boolean r5 = r2.startsWith(r5)
            if (r5 != 0) goto L_0x005e
            java.lang.String r5 = "heroqlte"
            boolean r2 = r2.startsWith(r5)
            if (r2 == 0) goto L_0x0060
        L_0x005e:
            r2 = r3
            goto L_0x0061
        L_0x0060:
            r2 = r4
        L_0x0061:
            r11.U1 = r2
            int r2 = r11.T1
            android.media.MediaFormat r7 = new android.media.MediaFormat
            r7.<init>()
            java.lang.String r5 = "mime"
            java.lang.String r6 = r12.c
            r7.setString(r5, r6)
            int r5 = r13.J0
            java.lang.String r6 = "channel-count"
            r7.setInteger(r6, r5)
            java.lang.String r5 = "sample-rate"
            int r6 = r13.K0
            r7.setInteger(r5, r6)
            java.util.List r5 = r13.y0
            defpackage.c37.y(r7, r5)
            java.lang.String r5 = "max-input-size"
            defpackage.c37.t(r7, r5, r2)
            r2 = 23
            if (r0 < r2) goto L_0x00b2
            java.lang.String r5 = "priority"
            r7.setInteger(r5, r4)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00b2
            if (r0 != r2) goto L_0x00ad
            java.lang.String r2 = defpackage.maf.d
            java.lang.String r4 = "ZTE B2017G"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x00b2
            java.lang.String r4 = "AXON 7 mini"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00ad
            goto L_0x00b2
        L_0x00ad:
            java.lang.String r2 = "operating-rate"
            r7.setFloat(r2, r15)
        L_0x00b2:
            r15 = 28
            java.lang.String r2 = r13.w0
            if (r0 > r15) goto L_0x00c5
            java.lang.String r15 = "audio/ac4"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x00c5
            java.lang.String r15 = "ac4-is-sync"
            r7.setInteger(r15, r3)
        L_0x00c5:
            java.lang.String r15 = "audio/raw"
            if (r0 < r1) goto L_0x00ec
            my5 r1 = new my5
            r1.<init>()
            r1.k = r15
            int r3 = r13.J0
            r1.x = r3
            r1.y = r6
            r3 = 4
            r1.z = r3
            oy5 r4 = new oy5
            r4.<init>(r1)
            d84 r1 = r11.S1
            int r1 = r1.g(r4)
            r4 = 2
            if (r1 != r4) goto L_0x00ec
            java.lang.String r1 = "pcm-encoding"
            r7.setInteger(r1, r3)
        L_0x00ec:
            r1 = 32
            if (r0 < r1) goto L_0x00f7
            java.lang.String r0 = "max-output-channel-count"
            r1 = 99
            r7.setInteger(r0, r1)
        L_0x00f7:
            java.lang.String r0 = r12.b
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0107
            boolean r15 = r15.equals(r2)
            if (r15 != 0) goto L_0x0107
            r15 = r13
            goto L_0x0108
        L_0x0107:
            r15 = 0
        L_0x0108:
            r11.V1 = r15
            n78 r11 = new n78
            r9 = 0
            r5 = r11
            r6 = r12
            r8 = r13
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u78.Q(x78, oy5, android.media.MediaCrypto, float):n78");
    }

    public final void V(Exception exc) {
        fm9.c("Audio codec error", exc);
        ph4 ph4 = this.R1;
        Handler handler = (Handler) ph4.a;
        if (handler != null) {
            handler.post(new x60(ph4, exc, 0));
        }
    }

    public final void W(long j, String str, long j2) {
        ph4 ph4 = this.R1;
        Handler handler = (Handler) ph4.a;
        if (handler != null) {
            handler.post(new v60(ph4, str, j, j2, 0));
        }
    }

    public final void X(String str) {
        ph4 ph4 = this.R1;
        Handler handler = (Handler) ph4.a;
        if (handler != null) {
            handler.post(new c(ph4, 6, str));
        }
    }

    public final r54 Y(imc imc) {
        r54 Y = super.Y(imc);
        oy5 oy5 = (oy5) imc.c;
        ph4 ph4 = this.R1;
        Handler handler = (Handler) ph4.a;
        if (handler != null) {
            handler.post(new f5((Object) ph4, (Object) oy5, (Object) Y, 2));
        }
        return Y;
    }

    public final void Z(oy5 oy5, MediaFormat mediaFormat) {
        int i;
        oy5 oy52 = this.V1;
        int[] iArr = null;
        if (oy52 != null) {
            oy5 = oy52;
        } else if (this.U0 != null) {
            int u = "audio/raw".equals(oy5.w0) ? oy5.L0 : (maf.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? maf.u(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            my5 my5 = new my5();
            my5.k = "audio/raw";
            my5.z = u;
            my5.A = oy5.M0;
            my5.B = oy5.N0;
            my5.x = mediaFormat.getInteger("channel-count");
            my5.y = mediaFormat.getInteger("sample-rate");
            oy5 oy53 = new oy5(my5);
            if (this.U1 && oy53.J0 == 6 && (i = oy5.J0) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = i2;
                }
            }
            oy5 = oy53;
        }
        try {
            this.S1.b(oy5, iArr);
        } catch (AudioSink$ConfigurationException e) {
            throw e(e, e.a, false, 5001);
        }
    }

    public final void a(int i, Object obj) {
        d84 d84 = this.S1;
        if (i == 2) {
            float floatValue = ((Float) obj).floatValue();
            if (d84.J != floatValue) {
                d84.J = floatValue;
                if (d84.n()) {
                    if (maf.a >= 21) {
                        d84.u.setVolume(d84.J);
                        return;
                    }
                    AudioTrack audioTrack = d84.u;
                    float f = d84.J;
                    audioTrack.setStereoVolume(f, f);
                }
            }
        } else if (i == 3) {
            g30 g30 = (g30) obj;
            if (!d84.v.equals(g30)) {
                d84.v = g30;
                if (!d84.Y) {
                    d84.d();
                }
            }
        } else if (i != 6) {
            switch (i) {
                case 9:
                    d84.s(d84.h().a, ((Boolean) obj).booleanValue());
                    return;
                case 10:
                    int intValue = ((Integer) obj).intValue();
                    if (d84.W != intValue) {
                        d84.W = intValue;
                        d84.V = intValue != 0;
                        d84.d();
                        return;
                    }
                    return;
                case 11:
                    this.a2 = (v75) obj;
                    return;
                default:
                    return;
            }
        } else {
            pc0 pc0 = (pc0) obj;
            if (!d84.X.equals(pc0)) {
                pc0.getClass();
                if (d84.u != null) {
                    d84.X.getClass();
                }
                d84.X = pc0;
            }
        }
    }

    public final void b0() {
        this.S1.G = true;
    }

    public final void c0(o54 o54) {
        if (this.X1 && !o54.f(Integer.MIN_VALUE)) {
            if (Math.abs(o54.Y - this.W1) > 500000) {
                this.W1 = o54.Y;
            }
            this.X1 = false;
        }
    }

    public final b3b d() {
        d84 d84 = this.S1;
        return d84.k ? d84.y : d84.h().a;
    }

    public final boolean e0(long j, long j2, r78 r78, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, oy5 oy5) {
        byteBuffer.getClass();
        if (this.V1 == null || (i2 & 2) == 0) {
            d84 d84 = this.S1;
            if (z) {
                if (r78 != null) {
                    r78.releaseOutputBuffer(i, false);
                }
                this.L1.g += i3;
                d84.G = true;
                return true;
            }
            try {
                if (!d84.k(byteBuffer, j3, i3)) {
                    return false;
                }
                if (r78 != null) {
                    r78.releaseOutputBuffer(i, false);
                }
                this.L1.f += i3;
                return true;
            } catch (AudioSink$InitializationException e) {
                throw e(e, e.b, e.a, 5001);
            } catch (AudioSink$WriteException e2) {
                throw e(e2, oy5, e2.a, 5002);
            }
        } else {
            r78.getClass();
            r78.releaseOutputBuffer(i, false);
            return true;
        }
    }

    public final l78 h() {
        return this;
    }

    public final void h0() {
        try {
            d84 d84 = this.S1;
            if (!d84.S && d84.n() && d84.c()) {
                d84.p();
                d84.S = true;
            }
        } catch (AudioSink$WriteException e) {
            throw e(e, e.b, e.a, 5002);
        }
    }

    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean k() {
        if (this.H1) {
            d84 d84 = this.S1;
            if (!d84.n() || (d84.S && !d84.l())) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        return this.S1.l() || super.l();
    }

    public final void m() {
        ph4 ph4 = this.R1;
        this.Z1 = true;
        try {
            this.S1.d();
            try {
                this.L0 = null;
                this.M1 = -9223372036854775807L;
                this.N1 = -9223372036854775807L;
                this.O1 = 0;
                K();
            } finally {
                ph4.i(this.L1);
            }
        } catch (Throwable th) {
            this.L0 = null;
            this.M1 = -9223372036854775807L;
            this.N1 = -9223372036854775807L;
            this.O1 = 0;
            K();
            throw th;
        } finally {
            ph4.i(this.L1);
        }
    }

    public final boolean m0(oy5 oy5) {
        return this.S1.g(oy5) != 0;
    }

    public final void n(boolean z, boolean z2) {
        n54 n54 = new n54(0);
        this.L1 = n54;
        ph4 ph4 = this.R1;
        Handler handler = (Handler) ph4.a;
        if (handler != null) {
            handler.post(new y60(ph4, n54, 0));
        }
        kgc kgc = this.c;
        kgc.getClass();
        boolean z3 = kgc.a;
        boolean z4 = false;
        d84 d84 = this.S1;
        if (z3) {
            d84.getClass();
            if (maf.a >= 21) {
                z4 = true;
            }
            np8.f(z4);
            np8.f(d84.V);
            if (!d84.Y) {
                d84.Y = true;
                d84.d();
            }
        } else if (d84.Y) {
            d84.Y = false;
            d84.d();
        }
        i4b i4b = this.X;
        i4b.getClass();
        d84.q = i4b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        if ((r4.isEmpty() ? null : (defpackage.x78) r4.get(0)) != null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int n0(defpackage.xw0 r11, defpackage.oy5 r12) {
        /*
            r10 = this;
            java.lang.String r0 = r12.w0
            boolean r0 = defpackage.ha9.h(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            int r10 = defpackage.uj0.b(r1, r1, r1)
            return r10
        L_0x000e:
            int r0 = defpackage.maf.a
            r2 = 21
            if (r0 < r2) goto L_0x0017
            r0 = 32
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            r2 = 1
            int r3 = r12.P0
            if (r3 == 0) goto L_0x001f
            r4 = r2
            goto L_0x0020
        L_0x001f:
            r4 = r1
        L_0x0020:
            r5 = 2
            if (r3 == 0) goto L_0x0028
            if (r3 != r5) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r3 = r1
            goto L_0x0029
        L_0x0028:
            r3 = r2
        L_0x0029:
            java.lang.String r6 = "audio/raw"
            r7 = 8
            r8 = 4
            d84 r10 = r10.S1
            if (r3 == 0) goto L_0x0053
            int r9 = r10.g(r12)
            if (r9 == 0) goto L_0x0053
            if (r4 == 0) goto L_0x004e
            java.util.List r4 = defpackage.o88.e(r6, r1, r1)
            boolean r9 = r4.isEmpty()
            if (r9 == 0) goto L_0x0046
            r4 = 0
            goto L_0x004c
        L_0x0046:
            java.lang.Object r4 = r4.get(r1)
            x78 r4 = (defpackage.x78) r4
        L_0x004c:
            if (r4 == 0) goto L_0x0053
        L_0x004e:
            int r10 = defpackage.uj0.b(r8, r7, r0)
            return r10
        L_0x0053:
            java.lang.String r4 = r12.w0
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0067
            int r4 = r10.g(r12)
            if (r4 == 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            int r10 = defpackage.uj0.b(r2, r1, r1)
            return r10
        L_0x0067:
            my5 r4 = new my5
            r4.<init>()
            r4.k = r6
            int r6 = r12.J0
            r4.x = r6
            int r6 = r12.K0
            r4.y = r6
            r4.z = r5
            oy5 r6 = new oy5
            r6.<init>(r4)
            int r4 = r10.g(r6)
            if (r4 == 0) goto L_0x00e0
            zw6 r10 = s0(r11, r12, r1, r10)
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0092
            int r10 = defpackage.uj0.b(r2, r1, r1)
            return r10
        L_0x0092:
            if (r3 != 0) goto L_0x0099
            int r10 = defpackage.uj0.b(r5, r1, r1)
            return r10
        L_0x0099:
            java.lang.Object r11 = r10.get(r1)
            x78 r11 = (defpackage.x78) r11
            boolean r3 = r11.c(r12)
            if (r3 != 0) goto L_0x00be
            r4 = r2
        L_0x00a6:
            int r5 = r10.size()
            if (r4 >= r5) goto L_0x00be
            java.lang.Object r5 = r10.get(r4)
            x78 r5 = (defpackage.x78) r5
            boolean r6 = r5.c(r12)
            if (r6 == 0) goto L_0x00bb
            r10 = r1
            r11 = r5
            goto L_0x00c0
        L_0x00bb:
            int r4 = r4 + 1
            goto L_0x00a6
        L_0x00be:
            r10 = r2
            r2 = r3
        L_0x00c0:
            if (r2 == 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r8 = 3
        L_0x00c4:
            if (r2 == 0) goto L_0x00ce
            boolean r12 = r11.d(r12)
            if (r12 == 0) goto L_0x00ce
            r7 = 16
        L_0x00ce:
            boolean r11 = r11.g
            if (r11 == 0) goto L_0x00d5
            r11 = 64
            goto L_0x00d6
        L_0x00d5:
            r11 = r1
        L_0x00d6:
            if (r10 == 0) goto L_0x00da
            r1 = 128(0x80, float:1.794E-43)
        L_0x00da:
            r10 = r8 | r7
            r10 = r10 | r0
            r10 = r10 | r11
            r10 = r10 | r1
            return r10
        L_0x00e0:
            int r10 = defpackage.uj0.b(r2, r1, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u78.n0(xw0, oy5):int");
    }

    public final void o(long j, boolean z) {
        super.o(j, z);
        this.S1.d();
        this.W1 = j;
        this.X1 = true;
        this.Y1 = true;
    }

    public final void p() {
        d84 d84 = this.S1;
        try {
            F();
            g0();
            er4 er4 = this.O0;
            if (er4 != null) {
                er4.f((kr4) null);
            }
            this.O0 = null;
            if (this.Z1) {
                this.Z1 = false;
                d84.r();
            }
        } catch (Throwable th) {
            if (this.Z1) {
                this.Z1 = false;
                d84.r();
            }
            throw th;
        }
    }

    public final void q() {
        d84 d84 = this.S1;
        d84.U = true;
        if (d84.n()) {
            m70 m70 = d84.i.f;
            m70.getClass();
            m70.a();
            d84.u.play();
        }
    }

    public final void r() {
        t0();
        d84 d84 = this.S1;
        d84.U = false;
        if (d84.n()) {
            n70 n70 = d84.i;
            n70.l = 0;
            n70.w = 0;
            n70.v = 0;
            n70.m = 0;
            n70.C = 0;
            n70.F = 0;
            n70.k = false;
            if (n70.x == -9223372036854775807L) {
                m70 m70 = n70.f;
                m70.getClass();
                m70.a();
                d84.u.pause();
            }
        }
    }

    public final int r0(x78 x78, oy5 oy5) {
        int i;
        if (!"OMX.google.raw.decoder".equals(x78.a) || (i = maf.a) >= 24 || (i == 23 && maf.C(this.Q1))) {
            return oy5.x0;
        }
        return -1;
    }

    public final long t() {
        if (this.Y == 2) {
            t0();
        }
        return this.W1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02d0 A[LOOP:1: B:130:0x02bc->B:134:0x02d0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02d9 A[EDGE_INSN: B:158:0x02d9->B:135:0x02d9 ?: BREAK  
    EDGE_INSN: B:159:0x02d9->B:135:0x02d9 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c3 A[Catch:{ Exception -> 0x01c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t0() {
        /*
            r32 = this;
            r0 = r32
            r1 = 1
            boolean r2 = r32.k()
            d84 r3 = r0.S1
            boolean r4 = r3.n()
            if (r4 == 0) goto L_0x0368
            boolean r4 = r3.H
            if (r4 == 0) goto L_0x0015
            goto L_0x0368
        L_0x0015:
            n70 r4 = r3.i
            android.media.AudioTrack r8 = r4.c
            r8.getClass()
            int r8 = r8.getPlayState()
            r13 = 1000(0x3e8, double:4.94E-321)
            r15 = 1000000(0xf4240, double:4.940656E-318)
            y8 r10 = r4.a
            r11 = 0
            r7 = 3
            if (r8 != r7) goto L_0x01ce
            long r21 = r4.a()
            long r21 = r21 * r15
            int r8 = r4.g
            long r5 = (long) r8
            long r21 = r21 / r5
            int r5 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            goto L_0x01ce
        L_0x003d:
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 / r13
            long r13 = r4.m
            long r13 = r5 - r13
            r25 = 30000(0x7530, double:1.4822E-319)
            int r8 = (r13 > r25 ? 1 : (r13 == r25 ? 0 : -1))
            if (r8 < 0) goto L_0x0079
            int r8 = r4.v
            long r13 = r21 - r5
            long[] r15 = r4.b
            r15[r8] = r13
            int r8 = r8 + r1
            r13 = 10
            int r8 = r8 % r13
            r4.v = r8
            int r8 = r4.w
            if (r8 >= r13) goto L_0x0061
            int r8 = r8 + r1
            r4.w = r8
        L_0x0061:
            r4.m = r5
            r4.l = r11
            r8 = 0
        L_0x0066:
            int r13 = r4.w
            if (r8 >= r13) goto L_0x0079
            long r11 = r4.l
            r27 = r15[r8]
            long r13 = (long) r13
            long r27 = r27 / r13
            long r11 = r27 + r11
            r4.l = r11
            int r8 = r8 + r1
            r11 = 0
            goto L_0x0066
        L_0x0079:
            boolean r8 = r4.h
            if (r8 == 0) goto L_0x007f
            goto L_0x01ce
        L_0x007f:
            m70 r8 = r4.f
            r8.getClass()
            java.lang.Object r11 = r8.g
            k70 r11 = (defpackage.k70) r11
            if (r11 == 0) goto L_0x0094
            long r12 = r8.e
            long r12 = r5 - r12
            long r14 = r8.d
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x0098
        L_0x0094:
            r29 = r10
            goto L_0x0120
        L_0x0098:
            r8.e = r5
            java.lang.Object r12 = r11.o
            android.media.AudioTrack r12 = (android.media.AudioTrack) r12
            java.lang.Object r13 = r11.X
            android.media.AudioTimestamp r13 = (android.media.AudioTimestamp) r13
            boolean r12 = r12.getTimestamp(r13)
            if (r12 == 0) goto L_0x00c6
            long r14 = r13.framePosition
            r29 = r10
            long r9 = r11.b
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ba
            long r9 = r11.a
            r30 = 1
            long r9 = r9 + r30
            r11.a = r9
        L_0x00ba:
            r11.b = r14
            long r9 = r11.a
            r16 = 32
            long r9 = r9 << r16
            long r14 = r14 + r9
            r11.c = r14
            goto L_0x00c8
        L_0x00c6:
            r29 = r10
        L_0x00c8:
            int r9 = r8.b
            if (r9 == 0) goto L_0x00fc
            if (r9 == r1) goto L_0x00e9
            r10 = 2
            if (r9 == r10) goto L_0x00e3
            if (r9 == r7) goto L_0x00dd
            r7 = 4
            if (r9 != r7) goto L_0x00d7
            goto L_0x0121
        L_0x00d7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00dd:
            if (r12 == 0) goto L_0x0121
            r8.a()
            goto L_0x0121
        L_0x00e3:
            if (r12 != 0) goto L_0x0121
            r8.a()
            goto L_0x0121
        L_0x00e9:
            if (r12 == 0) goto L_0x00f8
            long r9 = r11.c
            long r13 = r8.f
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x0121
            r7 = 2
            r8.b(r7)
            goto L_0x0121
        L_0x00f8:
            r8.a()
            goto L_0x0121
        L_0x00fc:
            if (r12 == 0) goto L_0x0111
            long r9 = r13.nanoTime
            r13 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r13
            long r13 = r8.c
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 < 0) goto L_0x0120
            long r9 = r11.c
            r8.f = r9
            r8.b(r1)
            goto L_0x0121
        L_0x0111:
            long r9 = r8.c
            long r9 = r5 - r9
            r13 = 500000(0x7a120, double:2.47033E-318)
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x0121
            r8.b(r7)
            goto L_0x0121
        L_0x0120:
            r12 = 0
        L_0x0121:
            r9 = 5000000(0x4c4b40, double:2.470328E-317)
            if (r12 != 0) goto L_0x012a
            r14 = r2
            r11 = r29
            goto L_0x0189
        L_0x012a:
            if (r11 == 0) goto L_0x0137
            java.lang.Object r7 = r11.X
            android.media.AudioTimestamp r7 = (android.media.AudioTimestamp) r7
            long r12 = r7.nanoTime
            r23 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r23
            goto L_0x013c
        L_0x0137:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x013c:
            r14 = r2
            if (r11 == 0) goto L_0x0142
            long r1 = r11.c
            goto L_0x0144
        L_0x0142:
            r1 = -1
        L_0x0144:
            long r12 = r12 - r5
            long r11 = java.lang.Math.abs(r12)
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x015e
            r11 = r29
            java.lang.Object r1 = r11.a
            d84 r1 = (defpackage.d84) r1
            r1.i()
            r1.j()
            r1 = 4
            r8.b(r1)
            goto L_0x0189
        L_0x015e:
            r11 = r29
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r12
            int r12 = r4.g
            long r12 = (long) r12
            long r1 = r1 / r12
            long r1 = r1 - r21
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0181
            java.lang.Object r1 = r11.a
            d84 r1 = (defpackage.d84) r1
            r1.i()
            r1.j()
            r1 = 4
            r8.b(r1)
            goto L_0x0189
        L_0x0181:
            r1 = 4
            int r2 = r8.b
            if (r2 != r1) goto L_0x0189
            r8.a()
        L_0x0189:
            boolean r1 = r4.q
            if (r1 == 0) goto L_0x01d0
            java.lang.reflect.Method r1 = r4.n
            if (r1 == 0) goto L_0x01d0
            long r12 = r4.r
            long r12 = r5 - r12
            r15 = 500000(0x7a120, double:2.47033E-318)
            int r2 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r2 < 0) goto L_0x01d0
            r2 = 0
            android.media.AudioTrack r8 = r4.c     // Catch:{ Exception -> 0x01c9 }
            r8.getClass()     // Catch:{ Exception -> 0x01c9 }
            java.lang.Object r1 = r1.invoke(r8, r2)     // Catch:{ Exception -> 0x01c9 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01c9 }
            int r8 = defpackage.maf.a     // Catch:{ Exception -> 0x01c9 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01c9 }
            long r12 = (long) r1     // Catch:{ Exception -> 0x01c9 }
            r15 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r15
            long r7 = r4.i     // Catch:{ Exception -> 0x01c9 }
            long r12 = r12 - r7
            r4.o = r12     // Catch:{ Exception -> 0x01c9 }
            r7 = 0
            long r12 = java.lang.Math.max(r12, r7)     // Catch:{ Exception -> 0x01c9 }
            r4.o = r12     // Catch:{ Exception -> 0x01c9 }
            int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x01cb
            r11.getClass()     // Catch:{ Exception -> 0x01c9 }
            r4.o = r7     // Catch:{ Exception -> 0x01c9 }
            goto L_0x01cb
        L_0x01c9:
            r4.n = r2
        L_0x01cb:
            r4.r = r5
            goto L_0x01d0
        L_0x01ce:
            r14 = r2
            r11 = r10
        L_0x01d0:
            long r5 = java.lang.System.nanoTime()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            m70 r2 = r4.f
            r2.getClass()
            int r7 = r2.b
            r8 = 2
            if (r7 != r8) goto L_0x01e3
            r8 = 1
            goto L_0x01e4
        L_0x01e3:
            r8 = 0
        L_0x01e4:
            if (r8 == 0) goto L_0x0217
            java.lang.Object r2 = r2.g
            k70 r2 = (defpackage.k70) r2
            if (r2 == 0) goto L_0x01f2
            long r9 = r2.c
        L_0x01ee:
            r12 = 1000000(0xf4240, double:4.940656E-318)
            goto L_0x01f5
        L_0x01f2:
            r9 = -1
            goto L_0x01ee
        L_0x01f5:
            long r9 = r9 * r12
            int r7 = r4.g
            long r12 = (long) r7
            long r9 = r9 / r12
            if (r2 == 0) goto L_0x0208
            java.lang.Object r2 = r2.X
            android.media.AudioTimestamp r2 = (android.media.AudioTimestamp) r2
            long r12 = r2.nanoTime
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r14
            r19 = r12
            goto L_0x020d
        L_0x0208:
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x020d:
            long r12 = r5 - r19
            float r2 = r4.j
            long r12 = defpackage.maf.s(r2, r12)
            long r12 = r12 + r9
            goto L_0x0238
        L_0x0217:
            int r2 = r4.w
            if (r2 != 0) goto L_0x0229
            long r9 = r4.a()
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 * r12
            int r2 = r4.g
            long r12 = (long) r2
            long r9 = r9 / r12
        L_0x0227:
            r12 = r9
            goto L_0x022d
        L_0x0229:
            long r9 = r4.l
            long r9 = r9 + r5
            goto L_0x0227
        L_0x022d:
            if (r14 != 0) goto L_0x0238
            long r9 = r4.o
            long r12 = r12 - r9
            r9 = 0
            long r12 = java.lang.Math.max(r9, r12)
        L_0x0238:
            boolean r2 = r4.D
            if (r2 == r8) goto L_0x0244
            long r9 = r4.C
            r4.F = r9
            long r9 = r4.B
            r4.E = r9
        L_0x0244:
            long r9 = r4.F
            long r9 = r5 - r9
            r14 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x0265
            long r1 = r4.E
            float r7 = r4.j
            long r17 = defpackage.maf.s(r7, r9)
            long r17 = r17 + r1
            r1 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r1
            long r9 = r9 / r14
            long r12 = r12 * r9
            long r9 = r1 - r9
            long r9 = r9 * r17
            long r9 = r9 + r12
            long r12 = r9 / r1
        L_0x0265:
            boolean r1 = r4.k
            if (r1 != 0) goto L_0x02a4
            long r1 = r4.B
            int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x02a4
            r7 = 1
            r4.k = r7
            long r1 = r12 - r1
            long r1 = defpackage.maf.M(r1)
            float r9 = r4.j
            long r1 = defpackage.maf.w(r9, r1)
            long r9 = java.lang.System.currentTimeMillis()
            long r1 = defpackage.maf.M(r1)
            long r9 = r9 - r1
            java.lang.Object r1 = r11.a
            d84 r1 = (defpackage.d84) r1
            w4d r1 = r1.r
            if (r1 == 0) goto L_0x02a4
            java.lang.Object r1 = r1.b
            u78 r1 = (defpackage.u78) r1
            ph4 r1 = r1.R1
            java.lang.Object r2 = r1.a
            android.os.Handler r2 = (android.os.Handler) r2
            if (r2 == 0) goto L_0x02a4
            r60 r11 = new r60
            r7 = 1
            r11.<init>(r1, r9, r7)
            r2.post(r11)
        L_0x02a4:
            r4.C = r5
            r4.B = r12
            r4.D = r8
            t74 r1 = r3.t
            long r4 = r3.j()
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            int r1 = r1.e
            long r1 = (long) r1
            long r4 = r4 / r1
            long r1 = java.lang.Math.min(r12, r4)
        L_0x02bc:
            java.util.ArrayDeque r4 = r3.j
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x02d9
            java.lang.Object r5 = r4.getFirst()
            v74 r5 = (defpackage.v74) r5
            long r5 = r5.d
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x02d9
            java.lang.Object r4 = r4.remove()
            v74 r4 = (defpackage.v74) r4
            r3.x = r4
            goto L_0x02bc
        L_0x02d9:
            v74 r5 = r3.x
            long r6 = r5.d
            long r8 = r1 - r6
            b3b r5 = r5.a
            b3b r6 = defpackage.b3b.o
            boolean r5 = r5.equals(r6)
            cjg r6 = r3.b
            if (r5 == 0) goto L_0x02f1
            v74 r1 = r3.x
            long r1 = r1.c
            long r1 = r1 + r8
            goto L_0x0354
        L_0x02f1:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x033d
            java.lang.Object r1 = r6.c
            uud r1 = (defpackage.uud) r1
            long r4 = r1.o
            r10 = 1024(0x400, double:5.06E-321)
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x0331
            long r4 = r1.n
            tud r2 = r1.j
            r2.getClass()
            int r7 = r2.l
            int r2 = r2.c
            int r7 = r7 * r2
            r2 = 2
            int r7 = r7 * r2
            long r10 = (long) r7
            long r10 = r4 - r10
            i60 r2 = r1.h
            int r2 = r2.a
            i60 r4 = r1.g
            int r4 = r4.a
            if (r2 != r4) goto L_0x0325
            long r12 = r1.o
            long r1 = defpackage.maf.J(r8, r10, r12)
            goto L_0x0337
        L_0x0325:
            long r12 = (long) r2
            long r10 = r10 * r12
            long r1 = r1.o
            long r4 = (long) r4
            long r12 = r1 * r4
            long r1 = defpackage.maf.J(r8, r10, r12)
            goto L_0x0337
        L_0x0331:
            float r1 = r1.c
            double r1 = (double) r1
            double r4 = (double) r8
            double r1 = r1 * r4
            long r1 = (long) r1
        L_0x0337:
            v74 r4 = r3.x
            long r4 = r4.c
            long r1 = r1 + r4
            goto L_0x0354
        L_0x033d:
            java.lang.Object r4 = r4.getFirst()
            v74 r4 = (defpackage.v74) r4
            long r7 = r4.d
            long r7 = r7 - r1
            v74 r1 = r3.x
            b3b r1 = r1.a
            float r1 = r1.a
            long r1 = defpackage.maf.s(r1, r7)
            long r4 = r4.c
            long r1 = r4 - r1
        L_0x0354:
            t74 r3 = r3.t
            java.lang.Object r4 = r6.b
            kpd r4 = (defpackage.kpd) r4
            long r4 = r4.t
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            int r3 = r3.e
            long r6 = (long) r3
            long r4 = r4 / r6
            long r4 = r4 + r1
            r1 = -9223372036854775808
            goto L_0x036c
        L_0x0368:
            r1 = -9223372036854775808
            r4 = -9223372036854775808
        L_0x036c:
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0380
            boolean r1 = r0.Y1
            if (r1 == 0) goto L_0x0375
            goto L_0x037b
        L_0x0375:
            long r1 = r0.W1
            long r4 = java.lang.Math.max(r1, r4)
        L_0x037b:
            r0.W1 = r4
            r1 = 0
            r0.Y1 = r1
        L_0x0380:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u78.t0():void");
    }

    public final void u(b3b b3b) {
        d84 d84 = this.S1;
        d84.getClass();
        b3b b3b2 = new b3b(maf.i(b3b.a, 0.1f, 8.0f), maf.i(b3b.b, 0.1f, 8.0f));
        if (!d84.k || maf.a < 23) {
            d84.s(b3b2, d84.h().b);
        } else {
            d84.t(b3b2);
        }
    }
}
