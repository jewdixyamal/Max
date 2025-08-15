package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;

/* renamed from: wpe  reason: default package */
public final class wpe extends uj0 implements Handler.Callback {
    public final imc A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public oy5 F0;
    public cbe G0;
    public hbe H0;
    public jbe I0;
    public jbe J0;
    public int K0;
    public long L0;
    public final Handler x0;
    public final n75 y0;
    public final vu4 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wpe(n75 n75, Looper looper) {
        super(3);
        Handler handler;
        vu4 vu4 = vu4.X;
        this.y0 = n75;
        if (looper == null) {
            handler = null;
        } else {
            int i = maf.a;
            handler = new Handler(looper, this);
        }
        this.x0 = handler;
        this.z0 = vu4;
        this.A0 = new imc(19);
        this.L0 = -9223372036854775807L;
    }

    public final int A(oy5 oy5) {
        this.z0.getClass();
        String str = oy5.w0;
        if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
            return ha9.i(oy5.w0) ? uj0.b(1, 0, 0) : uj0.b(0, 0, 0);
        }
        return uj0.b(oy5.P0 == 0 ? 4 : 2, 0, 0);
    }

    public final long C() {
        if (this.K0 == -1) {
            return Long.MAX_VALUE;
        }
        this.I0.getClass();
        if (this.K0 >= this.I0.u()) {
            return Long.MAX_VALUE;
        }
        return this.I0.i(this.K0);
    }

    public final void D(SubtitleDecoderException subtitleDecoderException) {
        String valueOf = String.valueOf(this.F0);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(valueOf);
        fm9.c(sb.toString(), subtitleDecoderException);
        List emptyList = Collections.emptyList();
        Handler handler = this.x0;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            t75 t75 = this.y0.a;
            t75.getClass();
            t75.x0.i(27, new z72(4, emptyList));
        }
        F();
        cbe cbe = this.G0;
        cbe.getClass();
        cbe.release();
        this.G0 = null;
        this.E0 = 0;
        E();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        if (r2.equals("application/pgs") == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        r6.G0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E() {
        /*
            r6 = this;
            r0 = 1
            r6.D0 = r0
            oy5 r1 = r6.F0
            r1.getClass()
            vu4 r2 = r6.z0
            r2.getClass()
            java.lang.String r2 = r1.w0
            if (r2 == 0) goto L_0x00f2
            int r3 = r1.O0
            java.util.List r1 = r1.y0
            r4 = -1
            int r5 = r2.hashCode()
            switch(r5) {
                case -1351681404: goto L_0x009f;
                case -1248334819: goto L_0x0095;
                case -1026075066: goto L_0x008a;
                case -1004728940: goto L_0x007f;
                case 691401887: goto L_0x0074;
                case 822864842: goto L_0x0069;
                case 930165504: goto L_0x005e;
                case 1201784583: goto L_0x0053;
                case 1566015601: goto L_0x0047;
                case 1566016562: goto L_0x003a;
                case 1668750253: goto L_0x002d;
                case 1693976202: goto L_0x0020;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = r4
            goto L_0x00aa
        L_0x0020:
            java.lang.String r0 = "application/ttml+xml"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0029
            goto L_0x001d
        L_0x0029:
            r0 = 11
            goto L_0x00aa
        L_0x002d:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0036
            goto L_0x001d
        L_0x0036:
            r0 = 10
            goto L_0x00aa
        L_0x003a:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0043
            goto L_0x001d
        L_0x0043:
            r0 = 9
            goto L_0x00aa
        L_0x0047:
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0050
            goto L_0x001d
        L_0x0050:
            r0 = 8
            goto L_0x00aa
        L_0x0053:
            java.lang.String r0 = "text/x-exoplayer-cues"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x005c
            goto L_0x001d
        L_0x005c:
            r0 = 7
            goto L_0x00aa
        L_0x005e:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x001d
        L_0x0067:
            r0 = 6
            goto L_0x00aa
        L_0x0069:
            java.lang.String r0 = "text/x-ssa"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0072
            goto L_0x001d
        L_0x0072:
            r0 = 5
            goto L_0x00aa
        L_0x0074:
            java.lang.String r0 = "application/x-quicktime-tx3g"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x007d
            goto L_0x001d
        L_0x007d:
            r0 = 4
            goto L_0x00aa
        L_0x007f:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0088
            goto L_0x001d
        L_0x0088:
            r0 = 3
            goto L_0x00aa
        L_0x008a:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0093
            goto L_0x001d
        L_0x0093:
            r0 = 2
            goto L_0x00aa
        L_0x0095:
            java.lang.String r5 = "application/pgs"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x00aa
            goto L_0x001d
        L_0x009f:
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a9
            goto L_0x001d
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            switch(r0) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x00e4;
                case 2: goto L_0x00de;
                case 3: goto L_0x00d8;
                case 4: goto L_0x00d2;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00c0;
                case 8: goto L_0x00c6;
                case 9: goto L_0x00ba;
                case 10: goto L_0x00b4;
                case 11: goto L_0x00ae;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            goto L_0x00f2
        L_0x00ae:
            o3f r0 = new o3f
            r0.<init>()
            goto L_0x00ef
        L_0x00b4:
            sae r0 = new sae
            r0.<init>()
            goto L_0x00ef
        L_0x00ba:
            t02 r0 = new t02
            r0.<init>(r3, r1)
            goto L_0x00ef
        L_0x00c0:
            ay r0 = new ay
            r0.<init>()
            goto L_0x00ef
        L_0x00c6:
            m02 r0 = new m02
            r0.<init>(r2, r3)
            goto L_0x00ef
        L_0x00cc:
            rwd r0 = new rwd
            r0.<init>(r1)
            goto L_0x00ef
        L_0x00d2:
            w3f r0 = new w3f
            r0.<init>(r1)
            goto L_0x00ef
        L_0x00d8:
            r4g r0 = new r4g
            r0.<init>()
            goto L_0x00ef
        L_0x00de:
            lt4 r0 = new lt4
            r0.<init>()
            goto L_0x00ef
        L_0x00e4:
            oua r0 = new oua
            r0.<init>()
            goto L_0x00ef
        L_0x00ea:
            lt4 r0 = new lt4
            r0.<init>(r1)
        L_0x00ef:
            r6.G0 = r0
            return
        L_0x00f2:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r1 = r0.length()
            java.lang.String r2 = "Attempted to create decoder for unsupported MIME type: "
            if (r1 == 0) goto L_0x0105
            java.lang.String r0 = r2.concat(r0)
            goto L_0x010a
        L_0x0105:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x010a:
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpe.E():void");
    }

    public final void F() {
        this.H0 = null;
        this.K0 = -1;
        jbe jbe = this.I0;
        if (jbe != null) {
            jbe.v();
            this.I0 = null;
        }
        jbe jbe2 = this.J0;
        if (jbe2 != null) {
            jbe2.v();
            this.J0 = null;
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            t75 t75 = this.y0.a;
            t75.getClass();
            t75.x0.i(27, new z72(4, (List) message.obj));
            return true;
        }
        throw new IllegalStateException();
    }

    public final String i() {
        return "TextRenderer";
    }

    public final boolean k() {
        return this.C0;
    }

    public final boolean l() {
        return true;
    }

    public final void m() {
        this.F0 = null;
        this.L0 = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        Handler handler = this.x0;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            t75 t75 = this.y0.a;
            t75.getClass();
            t75.x0.i(27, new z72(4, emptyList));
        }
        F();
        cbe cbe = this.G0;
        cbe.getClass();
        cbe.release();
        this.G0 = null;
        this.E0 = 0;
    }

    public final void o(long j, boolean z) {
        List emptyList = Collections.emptyList();
        Handler handler = this.x0;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            t75 t75 = this.y0.a;
            t75.getClass();
            t75.x0.i(27, new z72(4, emptyList));
        }
        this.B0 = false;
        this.C0 = false;
        this.L0 = -9223372036854775807L;
        if (this.E0 != 0) {
            F();
            cbe cbe = this.G0;
            cbe.getClass();
            cbe.release();
            this.G0 = null;
            this.E0 = 0;
            E();
            return;
        }
        F();
        cbe cbe2 = this.G0;
        cbe2.getClass();
        cbe2.flush();
    }

    public final void s(oy5[] oy5Arr, long j, long j2) {
        this.F0 = oy5Arr[0];
        if (this.G0 != null) {
            this.E0 = 1;
        } else {
            E();
        }
    }

    public final void w(long j, long j2) {
        boolean z;
        imc imc = this.A0;
        if (this.v0) {
            long j3 = this.L0;
            if (j3 != -9223372036854775807L && j >= j3) {
                F();
                this.C0 = true;
            }
        }
        if (!this.C0) {
            if (this.J0 == null) {
                cbe cbe = this.G0;
                cbe.getClass();
                cbe.b(j);
                try {
                    cbe cbe2 = this.G0;
                    cbe2.getClass();
                    this.J0 = cbe2.c();
                } catch (SubtitleDecoderException e) {
                    D(e);
                    return;
                }
            }
            if (this.Y == 2) {
                if (this.I0 != null) {
                    long C = C();
                    z = false;
                    while (C <= j) {
                        this.K0++;
                        C = C();
                        z = true;
                    }
                } else {
                    z = false;
                }
                jbe jbe = this.J0;
                if (jbe != null) {
                    if (jbe.f(4)) {
                        if (!z && C() == Long.MAX_VALUE) {
                            if (this.E0 == 2) {
                                F();
                                cbe cbe3 = this.G0;
                                cbe3.getClass();
                                cbe3.release();
                                this.G0 = null;
                                this.E0 = 0;
                                E();
                            } else {
                                F();
                                this.C0 = true;
                            }
                        }
                    } else if (jbe.c <= j) {
                        jbe jbe2 = this.I0;
                        if (jbe2 != null) {
                            jbe2.v();
                        }
                        this.K0 = jbe.g(j);
                        this.I0 = jbe;
                        this.J0 = null;
                        z = true;
                    }
                }
                if (z) {
                    this.I0.getClass();
                    List p = this.I0.p(j);
                    Handler handler = this.x0;
                    if (handler != null) {
                        handler.obtainMessage(0, p).sendToTarget();
                    } else {
                        t75 t75 = this.y0.a;
                        t75.getClass();
                        t75.x0.i(27, new z72(4, p));
                    }
                }
                if (this.E0 != 2) {
                    while (!this.B0) {
                        try {
                            hbe hbe = this.H0;
                            if (hbe == null) {
                                cbe cbe4 = this.G0;
                                cbe4.getClass();
                                hbe = (hbe) cbe4.f();
                                if (hbe != null) {
                                    this.H0 = hbe;
                                } else {
                                    return;
                                }
                            }
                            if (this.E0 == 1) {
                                hbe.b = 4;
                                cbe cbe5 = this.G0;
                                cbe5.getClass();
                                cbe5.l(hbe);
                                this.H0 = null;
                                this.E0 = 2;
                                return;
                            }
                            int v = v(imc, hbe, 0);
                            if (v == -4) {
                                if (hbe.f(4)) {
                                    this.B0 = true;
                                    this.D0 = false;
                                } else {
                                    oy5 oy5 = (oy5) imc.c;
                                    if (oy5 != null) {
                                        hbe.u0 = oy5.A0;
                                        hbe.y();
                                        this.D0 &= !hbe.f(1);
                                    } else {
                                        return;
                                    }
                                }
                                if (!this.D0) {
                                    cbe cbe6 = this.G0;
                                    cbe6.getClass();
                                    cbe6.l(hbe);
                                    this.H0 = null;
                                }
                            } else if (v == -3) {
                                return;
                            }
                        } catch (SubtitleDecoderException e2) {
                            D(e2);
                            return;
                        }
                    }
                }
            }
        }
    }
}
