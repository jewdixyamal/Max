package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: v78  reason: default package */
public final class v78 extends g88 implements m78 {
    public final Context Q1;
    public final qz7 R1;
    public final b70 S1;
    public int T1;
    public boolean U1;
    public boolean V1;
    public qy5 W1;
    public qy5 X1;
    public long Y1;
    public boolean Z1;
    public boolean a2;
    public boolean b2;
    public int c2 = -1000;

    public v78(Context context, q78 q78, Handler handler, o75 o75, e84 e84) {
        super(1, q78, 44100.0f);
        this.Q1 = context.getApplicationContext();
        this.S1 = e84;
        this.R1 = new qz7((Object) handler, 5, (Object) o75);
        e84.s = new qqd(18, (Object) this);
    }

    public final int A0(y78 y78, qy5 qy5) {
        int i;
        if (!"OMX.google.raw.decoder".equals(y78.a) || (i = oaf.a) >= 24 || (i == 23 && oaf.P(this.Q1))) {
            return qy5.o;
        }
        return -1;
    }

    public final void B0() {
        long j;
        ArrayDeque arrayDeque;
        long j2;
        long j3;
        boolean m = m();
        e84 e84 = (e84) this.S1;
        if (!e84.l() || e84.N) {
            j = Long.MIN_VALUE;
        } else {
            long min = Math.min(e84.i.a(m), oaf.Y(e84.u.e, e84.h()));
            while (true) {
                arrayDeque = e84.j;
                if (arrayDeque.isEmpty() || min < ((w74) arrayDeque.getFirst()).c) {
                    long j4 = min - e84.C.c;
                    boolean isEmpty = arrayDeque.isEmpty();
                    jo7 jo7 = e84.b;
                } else {
                    e84.C = (w74) arrayDeque.remove();
                }
            }
            long j42 = min - e84.C.c;
            boolean isEmpty2 = arrayDeque.isEmpty();
            jo7 jo72 = e84.b;
            if (isEmpty2) {
                vud vud = (vud) jo72.c;
                if (vud.isActive()) {
                    if (vud.o >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                        long j5 = vud.n;
                        tud tud = vud.j;
                        tud.getClass();
                        long j6 = j5 - ((long) ((tud.l * tud.c) * 2));
                        int i = vud.h.a;
                        int i2 = vud.g.a;
                        j3 = i == i2 ? oaf.a0(j42, j6, vud.o, RoundingMode.FLOOR) : oaf.a0(j42, j6 * ((long) i), vud.o * ((long) i2), RoundingMode.FLOOR);
                    } else {
                        j3 = (long) (((double) vud.c) * ((double) j42));
                    }
                    j42 = j3;
                }
                j2 = e84.C.b + j42;
            } else {
                w74 w74 = (w74) arrayDeque.getFirst();
                j2 = w74.b - oaf.A(e84.C.a.a, w74.c - min);
            }
            long j7 = ((lpd) jo72.b).q;
            j = oaf.Y(e84.u.e, j7) + j2;
            long j8 = e84.j0;
            if (j7 > j8) {
                long Y = oaf.Y(e84.u.e, j7 - j8);
                e84.j0 = j7;
                e84.k0 += Y;
                if (e84.l0 == null) {
                    e84.l0 = new Handler(Looper.myLooper());
                }
                e84.l0.removeCallbacksAndMessages((Object) null);
                e84.l0.postDelayed(new cu1(25, e84), 100);
            }
        }
        if (j != Long.MIN_VALUE) {
            if (!this.Z1) {
                j = Math.max(this.Y1, j);
            }
            this.Y1 = j;
            this.Z1 = false;
        }
    }

    public final s54 G(y78 y78, qy5 qy5, qy5 qy52) {
        s54 b = y78.b(qy5, qy52);
        int i = 0;
        boolean z = this.Q0 == null && u0(qy52);
        int i2 = b.e;
        if (z) {
            i2 |= 32768;
        }
        if (A0(y78, qy52) > this.T1) {
            i2 |= 64;
        }
        int i3 = i2;
        if (i3 == 0) {
            i = b.d;
        }
        return new s54(y78.a, qy5, qy52, i, i3);
    }

    public final boolean I() {
        boolean z = this.b2;
        this.b2 = false;
        return z;
    }

    public final float S(float f, qy5[] qy5Arr) {
        int i = -1;
        for (qy5 qy5 : qy5Arr) {
            int i2 = qy5.C;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    public final ArrayList T(xw0 xw0, qy5 qy5, boolean z) {
        ffc ffc;
        if (qy5.n == null) {
            ffc = ffc.X;
        } else {
            if (((e84) this.S1).f(qy5) != 0) {
                List e = p88.e("audio/raw", false, false);
                y78 y78 = e.isEmpty() ? null : (y78) e.get(0);
                if (y78 != null) {
                    ffc = zw6.n(y78);
                }
            }
            ffc = p88.g(xw0, qy5, z, false);
        }
        return p88.h(qy5, ffc);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d0, code lost:
        if ("AXON 7 mini".equals(r2) == false) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.o78 U(defpackage.y78 r12, defpackage.qy5 r13, android.media.MediaCrypto r14, float r15) {
        /*
            r11 = this;
            qy5[] r0 = r11.u0
            r0.getClass()
            int r1 = r11.A0(r12, r13)
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
            s54 r7 = r12.b(r13, r6)
            int r7 = r7.d
            if (r7 == 0) goto L_0x0025
            int r6 = r11.A0(r12, r6)
            int r1 = java.lang.Math.max(r1, r6)
        L_0x0025:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0028:
            r11.T1 = r1
            int r0 = defpackage.oaf.a
            r1 = 24
            java.lang.String r2 = r12.a
            if (r0 >= r1) goto L_0x0060
            java.lang.String r5 = "OMX.SEC.aac.dec"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0060
            java.lang.String r5 = "samsung"
            java.lang.String r6 = defpackage.oaf.c
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0060
            java.lang.String r5 = defpackage.oaf.b
            java.lang.String r6 = "zeroflte"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x005e
            java.lang.String r6 = "herolte"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x005e
            java.lang.String r6 = "heroqlte"
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L_0x0060
        L_0x005e:
            r5 = r3
            goto L_0x0061
        L_0x0060:
            r5 = r4
        L_0x0061:
            r11.U1 = r5
            java.lang.String r5 = "OMX.google.opus.decoder"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0086
            java.lang.String r5 = "c2.android.opus.decoder"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0086
            java.lang.String r5 = "OMX.google.vorbis.decoder"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0086
            java.lang.String r5 = "c2.android.vorbis.decoder"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r2 = r4
            goto L_0x0087
        L_0x0086:
            r2 = r3
        L_0x0087:
            r11.V1 = r2
            int r2 = r11.T1
            android.media.MediaFormat r7 = new android.media.MediaFormat
            r7.<init>()
            java.lang.String r5 = "mime"
            java.lang.String r6 = r12.c
            r7.setString(r5, r6)
            int r5 = r13.B
            java.lang.String r6 = "channel-count"
            r7.setInteger(r6, r5)
            java.lang.String r5 = "sample-rate"
            int r6 = r13.C
            r7.setInteger(r5, r6)
            java.util.List r5 = r13.q
            defpackage.j47.k0(r7, r5)
            java.lang.String r5 = "max-input-size"
            defpackage.j47.X(r7, r5, r2)
            r2 = 23
            if (r0 < r2) goto L_0x00d8
            java.lang.String r5 = "priority"
            r7.setInteger(r5, r4)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00d8
            if (r0 != r2) goto L_0x00d3
            java.lang.String r2 = defpackage.oaf.d
            java.lang.String r5 = "ZTE B2017G"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x00d8
            java.lang.String r5 = "AXON 7 mini"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x00d3
            goto L_0x00d8
        L_0x00d3:
            java.lang.String r2 = "operating-rate"
            r7.setFloat(r2, r15)
        L_0x00d8:
            r15 = 28
            java.lang.String r2 = r13.n
            if (r0 > r15) goto L_0x00eb
            java.lang.String r15 = "audio/ac4"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x00eb
            java.lang.String r15 = "ac4-is-sync"
            r7.setInteger(r15, r3)
        L_0x00eb:
            java.lang.String r15 = "audio/raw"
            if (r0 < r1) goto L_0x0118
            ny5 r1 = new ny5
            r1.<init>()
            java.lang.String r3 = defpackage.ia9.l(r15)
            r1.m = r3
            int r3 = r13.B
            r1.A = r3
            r1.B = r6
            r3 = 4
            r1.C = r3
            qy5 r5 = new qy5
            r5.<init>(r1)
            b70 r1 = r11.S1
            e84 r1 = (defpackage.e84) r1
            int r1 = r1.f(r5)
            r5 = 2
            if (r1 != r5) goto L_0x0118
            java.lang.String r1 = "pcm-encoding"
            r7.setInteger(r1, r3)
        L_0x0118:
            r1 = 32
            if (r0 < r1) goto L_0x0123
            java.lang.String r1 = "max-output-channel-count"
            r3 = 99
            r7.setInteger(r1, r3)
        L_0x0123:
            r1 = 35
            if (r0 < r1) goto L_0x0133
            int r0 = r11.c2
            int r0 = -r0
            int r0 = java.lang.Math.max(r4, r0)
            java.lang.String r1 = "importance"
            r7.setInteger(r1, r0)
        L_0x0133:
            java.lang.String r0 = r12.b
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0143
            boolean r15 = r15.equals(r2)
            if (r15 != 0) goto L_0x0143
            r15 = r13
            goto L_0x0144
        L_0x0143:
            r15 = 0
        L_0x0144:
            r11.X1 = r15
            o78 r11 = new o78
            r9 = 0
            r5 = r11
            r6 = r12
            r8 = r13
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v78.U(y78, qy5, android.media.MediaCrypto, float):o78");
    }

    public final void V(p54 p54) {
        qy5 qy5;
        u74 u74;
        if (oaf.a >= 29 && (qy5 = p54.c) != null && Objects.equals(qy5.n, "audio/opus") && this.u1) {
            ByteBuffer byteBuffer = p54.s0;
            byteBuffer.getClass();
            qy5 qy52 = p54.c;
            qy52.getClass();
            if (byteBuffer.remaining() == 8) {
                int i = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                e84 e84 = (e84) this.S1;
                AudioTrack audioTrack = e84.w;
                if (audioTrack != null && e84.m(audioTrack) && (u74 = e84.u) != null && u74.k) {
                    e84.w.setOffloadDelayPadding(qy52.E, i);
                }
            }
        }
    }

    public final void a(int i, Object obj) {
        b70 b70 = this.S1;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            e84 e84 = (e84) b70;
            if (e84.P != floatValue) {
                e84.P = floatValue;
                if (e84.l()) {
                    if (oaf.a >= 21) {
                        e84.w.setVolume(e84.P);
                        return;
                    }
                    AudioTrack audioTrack = e84.w;
                    float f = e84.P;
                    audioTrack.setStereoVolume(f, f);
                }
            }
        } else if (i == 3) {
            h30 h30 = (h30) obj;
            h30.getClass();
            e84 e842 = (e84) b70;
            if (!e842.A.equals(h30)) {
                e842.A = h30;
                if (!e842.d0) {
                    x30 x30 = e842.y;
                    if (x30 != null) {
                        x30.u0 = h30;
                        x30.d(t30.b((Context) x30.b, h30, (g40) x30.t0));
                    }
                    e842.d();
                }
            }
        } else if (i == 6) {
            qc0 qc0 = (qc0) obj;
            qc0.getClass();
            e84 e843 = (e84) b70;
            if (!e843.b0.equals(qc0)) {
                if (e843.w != null) {
                    e843.b0.getClass();
                }
                e843.b0 = qc0;
            }
        } else if (i != 12) {
            boolean z = false;
            if (i == 16) {
                obj.getClass();
                this.c2 = ((Integer) obj).intValue();
                s78 s78 = this.W0;
                if (s78 != null && oaf.a >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.c2));
                    s78.setParameters(bundle);
                }
            } else if (i == 9) {
                obj.getClass();
                e84 e844 = (e84) b70;
                e844.E = ((Boolean) obj).booleanValue();
                w74 w74 = new w74(e844.t() ? c3b.d : e844.D, -9223372036854775807L, -9223372036854775807L);
                if (e844.l()) {
                    e844.B = w74;
                } else {
                    e844.C = w74;
                }
            } else if (i == 10) {
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                e84 e845 = (e84) b70;
                if (e845.a0 != intValue) {
                    e845.a0 = intValue;
                    if (intValue != 0) {
                        z = true;
                    }
                    e845.Z = z;
                    e845.d();
                }
            } else if (i == 11) {
                this.R0 = (w75) obj;
            }
        } else if (oaf.a >= 23) {
            t78.a(b70, obj);
        }
    }

    public final void a0(Exception exc) {
        z04.v("Audio codec error", exc);
        qz7 qz7 = this.R1;
        Handler handler = (Handler) qz7.b;
        if (handler != null) {
            handler.post(new w60(qz7, exc, 0));
        }
    }

    public final void b0(long j, String str, long j2) {
        qz7 qz7 = this.R1;
        Handler handler = (Handler) qz7.b;
        if (handler != null) {
            handler.post(new v60(qz7, str, j, j2, 1));
        }
    }

    public final void c0(String str) {
        qz7 qz7 = this.R1;
        Handler handler = (Handler) qz7.b;
        if (handler != null) {
            handler.post(new c(qz7, 7, str));
        }
    }

    public final c3b d() {
        return ((e84) this.S1).D;
    }

    public final s54 d0(y7g y7g) {
        qy5 qy5 = (qy5) y7g.c;
        qy5.getClass();
        this.W1 = qy5;
        s54 d0 = super.d0(y7g);
        qz7 qz7 = this.R1;
        Handler handler = (Handler) qz7.b;
        if (handler != null) {
            handler.post(new f5((Object) qz7, (Object) qy5, (Object) d0, 1));
        }
        return d0;
    }

    public final void e0(qy5 qy5, MediaFormat mediaFormat) {
        int i;
        qy5 qy52 = this.X1;
        boolean z = true;
        int[] iArr = null;
        if (qy52 != null) {
            qy5 = qy52;
        } else if (this.W0 != null) {
            mediaFormat.getClass();
            int C = "audio/raw".equals(qy5.n) ? qy5.D : (oaf.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? oaf.C(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            ny5 ny5 = new ny5();
            ny5.m = ia9.l("audio/raw");
            ny5.C = C;
            ny5.D = qy5.E;
            ny5.E = qy5.F;
            ny5.j = qy5.k;
            ny5.k = qy5.l;
            ny5.a = qy5.a;
            ny5.b = qy5.b;
            ny5.c = zw6.j(qy5.c);
            ny5.d = qy5.d;
            ny5.e = qy5.e;
            ny5.f = qy5.f;
            ny5.A = mediaFormat.getInteger("channel-count");
            ny5.B = mediaFormat.getInteger("sample-rate");
            qy5 qy53 = new qy5(ny5);
            boolean z2 = this.U1;
            int i2 = qy53.B;
            if (z2 && i2 == 6 && (i = qy5.B) < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.V1) {
                if (i2 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i2 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i2 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i2 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i2 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            qy5 = qy53;
        }
        try {
            int i4 = oaf.a;
            b70 b70 = this.S1;
            if (i4 >= 29) {
                if (this.u1) {
                    lgc lgc = this.o;
                    lgc.getClass();
                    if (lgc.a != 0) {
                        lgc lgc2 = this.o;
                        lgc2.getClass();
                        int i5 = lgc2.a;
                        e84 e84 = (e84) b70;
                        e84.getClass();
                        if (i4 < 29) {
                            z = false;
                        }
                        fm9.k(z);
                        e84.l = i5;
                    }
                }
                e84 e842 = (e84) b70;
                e842.getClass();
                if (i4 < 29) {
                    z = false;
                }
                fm9.k(z);
                e842.l = 0;
            }
            ((e84) b70).b(qy5, iArr);
        } catch (AudioSink$ConfigurationException e) {
            throw e(e, e.a, false, 5001);
        }
    }

    public final void f(c3b c3b) {
        e84 e84 = (e84) this.S1;
        e84.getClass();
        e84.D = new c3b(oaf.i(c3b.a, 0.1f, 8.0f), oaf.i(c3b.b, 0.1f, 8.0f));
        if (e84.t()) {
            e84.s();
            return;
        }
        w74 w74 = new w74(c3b, -9223372036854775807L, -9223372036854775807L);
        if (e84.l()) {
            e84.B = w74;
        } else {
            e84.C = w74;
        }
    }

    public final void f0() {
        this.S1.getClass();
    }

    public final void h0() {
        ((e84) this.S1).M = true;
    }

    public final m78 j() {
        return this;
    }

    public final String k() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean l0(long j, long j2, s78 s78, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, qy5 qy5) {
        int i4;
        int i5;
        byteBuffer.getClass();
        if (this.X1 == null || (i2 & 2) == 0) {
            b70 b70 = this.S1;
            if (z) {
                if (s78 != null) {
                    s78.releaseOutputBuffer(i, false);
                }
                this.L1.g += i3;
                ((e84) b70).M = true;
                return true;
            }
            try {
                if (!((e84) b70).i(byteBuffer, j3, i3)) {
                    return false;
                }
                if (s78 != null) {
                    s78.releaseOutputBuffer(i, false);
                }
                this.L1.f += i3;
                return true;
            } catch (AudioSink$InitializationException e) {
                qy5 qy52 = this.W1;
                if (this.u1) {
                    lgc lgc = this.o;
                    lgc.getClass();
                    if (lgc.a != 0) {
                        i4 = 5004;
                        throw e(e, qy52, e.b, i4);
                    }
                }
                i4 = 5001;
                throw e(e, qy52, e.b, i4);
            } catch (AudioSink$WriteException e2) {
                if (this.u1) {
                    lgc lgc2 = this.o;
                    lgc2.getClass();
                    if (lgc2.a != 0) {
                        i5 = 5003;
                        throw e(e2, qy5, e2.b, i5);
                    }
                }
                i5 = 5002;
                throw e(e2, qy5, e2.b, i5);
            }
        } else {
            s78.getClass();
            s78.releaseOutputBuffer(i, false);
            return true;
        }
    }

    public final boolean m() {
        if (this.H1) {
            e84 e84 = (e84) this.S1;
            if (!e84.l() || (e84.V && !e84.j())) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        return ((e84) this.S1).j() || super.o();
    }

    public final void o0() {
        try {
            e84 e84 = (e84) this.S1;
            if (!e84.V && e84.l() && e84.c()) {
                e84.p();
                e84.V = true;
            }
        } catch (AudioSink$WriteException e) {
            throw e(e, e.c, e.b, this.u1 ? 5003 : 5002);
        }
    }

    public final void p() {
        qz7 qz7 = this.R1;
        this.a2 = true;
        this.W1 = null;
        try {
            ((e84) this.S1).d();
            try {
                super.p();
            } finally {
                qz7.q(this.L1);
            }
        } catch (Throwable th) {
            super.p();
            throw th;
        } finally {
            qz7.q(this.L1);
        }
    }

    public final void q(boolean z, boolean z2) {
        n54 n54 = new n54(1);
        this.L1 = n54;
        qz7 qz7 = this.R1;
        Handler handler = (Handler) qz7.b;
        if (handler != null) {
            handler.post(new q60(qz7, n54, 0));
        }
        lgc lgc = this.o;
        lgc.getClass();
        boolean z3 = lgc.b;
        boolean z4 = false;
        b70 b70 = this.S1;
        if (z3) {
            e84 e84 = (e84) b70;
            e84.getClass();
            if (oaf.a >= 21) {
                z4 = true;
            }
            fm9.k(z4);
            fm9.k(e84.Z);
            if (!e84.d0) {
                e84.d0 = true;
                e84.d();
            }
        } else {
            e84 e842 = (e84) b70;
            if (e842.d0) {
                e842.d0 = false;
                e842.d();
            }
        }
        j4b j4b = this.Y;
        j4b.getClass();
        e84 e843 = (e84) b70;
        e843.r = j4b;
        she she = this.Z;
        she.getClass();
        e843.i.J = she;
    }

    public final void r(long j, boolean z) {
        super.r(j, z);
        ((e84) this.S1).d();
        this.Y1 = j;
        this.b2 = false;
        this.Z1 = true;
    }

    public final void s() {
        v30 v30;
        x30 x30 = ((e84) this.S1).y;
        if (x30 != null && x30.a) {
            x30.s0 = null;
            int i = oaf.a;
            Context context = (Context) x30.b;
            if (i >= 23 && (v30 = (v30) x30.X) != null) {
                u30.b(context, v30);
            }
            an anVar = (an) x30.Y;
            if (anVar != null) {
                context.unregisterReceiver(anVar);
            }
            w30 w30 = (w30) x30.Z;
            if (w30 != null) {
                w30.a.unregisterContentObserver(w30);
            }
            x30.a = false;
        }
    }

    public final long t() {
        if (this.s0 == 2) {
            B0();
        }
        return this.Y1;
    }

    public final void u() {
        b70 b70 = this.S1;
        this.b2 = false;
        try {
            J();
            n0();
            fr4 fr4 = this.Q0;
            if (fr4 != null) {
                fr4.f((lr4) null);
            }
            this.Q0 = null;
            if (this.a2) {
                this.a2 = false;
                ((e84) b70).r();
            }
        } catch (Throwable th) {
            if (this.a2) {
                this.a2 = false;
                ((e84) b70).r();
            }
            throw th;
        }
    }

    public final boolean u0(qy5 qy5) {
        lgc lgc = this.o;
        lgc.getClass();
        if (lgc.a != 0) {
            int z0 = z0(qy5);
            if ((z0 & 512) != 0) {
                lgc lgc2 = this.o;
                lgc2.getClass();
                if (lgc2.a == 2 || (z0 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 || (qy5.E == 0 && qy5.F == 0)) {
                    return true;
                }
            }
        }
        return ((e84) this.S1).f(qy5) != 0;
    }

    public final void v() {
        ((e84) this.S1).o();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: y78} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        if ((r4.isEmpty() ? null : (defpackage.y78) r4.get(0)) != null) goto L_0x0049;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v0(defpackage.xw0 r14, defpackage.qy5 r15) {
        /*
            r13 = this;
            java.lang.String r0 = r15.n
            boolean r0 = defpackage.ia9.h(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            int r13 = defpackage.vj0.b(r1, r1, r1, r1)
            return r13
        L_0x000e:
            int r0 = defpackage.oaf.a
            r2 = 21
            if (r0 < r2) goto L_0x0017
            r0 = 32
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            r2 = 1
            int r3 = r15.K
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
            r6 = 0
            java.lang.String r7 = "audio/raw"
            r8 = 8
            r9 = 4
            b70 r10 = r13.S1
            if (r3 == 0) goto L_0x005b
            if (r4 == 0) goto L_0x0049
            java.util.List r4 = defpackage.p88.e(r7, r1, r1)
            boolean r11 = r4.isEmpty()
            if (r11 == 0) goto L_0x0041
            r4 = r6
            goto L_0x0047
        L_0x0041:
            java.lang.Object r4 = r4.get(r1)
            y78 r4 = (defpackage.y78) r4
        L_0x0047:
            if (r4 == 0) goto L_0x005b
        L_0x0049:
            int r13 = r13.z0(r15)
            r4 = r10
            e84 r4 = (defpackage.e84) r4
            int r4 = r4.f(r15)
            if (r4 == 0) goto L_0x005c
            int r13 = defpackage.vj0.b(r9, r8, r0, r13)
            return r13
        L_0x005b:
            r13 = r1
        L_0x005c:
            java.lang.String r4 = r15.n
            boolean r11 = r7.equals(r4)
            if (r11 == 0) goto L_0x0073
            r11 = r10
            e84 r11 = (defpackage.e84) r11
            int r11 = r11.f(r15)
            if (r11 == 0) goto L_0x006e
            goto L_0x0073
        L_0x006e:
            int r13 = defpackage.vj0.b(r2, r1, r1, r1)
            return r13
        L_0x0073:
            ny5 r11 = new ny5
            r11.<init>()
            java.lang.String r12 = defpackage.ia9.l(r7)
            r11.m = r12
            int r12 = r15.B
            r11.A = r12
            int r12 = r15.C
            r11.B = r12
            r11.C = r5
            qy5 r12 = new qy5
            r12.<init>(r11)
            e84 r10 = (defpackage.e84) r10
            int r11 = r10.f(r12)
            if (r11 == 0) goto L_0x0115
            if (r4 != 0) goto L_0x009a
            ffc r14 = defpackage.ffc.X
            goto L_0x00bd
        L_0x009a:
            int r4 = r10.f(r15)
            if (r4 == 0) goto L_0x00b9
            java.util.List r4 = defpackage.p88.e(r7, r1, r1)
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x00ab
            goto L_0x00b2
        L_0x00ab:
            java.lang.Object r4 = r4.get(r1)
            r6 = r4
            y78 r6 = (defpackage.y78) r6
        L_0x00b2:
            if (r6 == 0) goto L_0x00b9
            ffc r14 = defpackage.zw6.n(r6)
            goto L_0x00bd
        L_0x00b9:
            ffc r14 = defpackage.p88.g(r14, r15, r1, r1)
        L_0x00bd:
            boolean r4 = r14.isEmpty()
            if (r4 == 0) goto L_0x00c8
            int r13 = defpackage.vj0.b(r2, r1, r1, r1)
            return r13
        L_0x00c8:
            if (r3 != 0) goto L_0x00cf
            int r13 = defpackage.vj0.b(r5, r1, r1, r1)
            return r13
        L_0x00cf:
            java.lang.Object r3 = r14.get(r1)
            y78 r3 = (defpackage.y78) r3
            boolean r4 = r3.d(r15)
            if (r4 != 0) goto L_0x00f2
            r5 = r2
        L_0x00dc:
            int r6 = r14.o
            if (r5 >= r6) goto L_0x00f2
            java.lang.Object r6 = r14.get(r5)
            y78 r6 = (defpackage.y78) r6
            boolean r7 = r6.d(r15)
            if (r7 == 0) goto L_0x00ef
            r14 = r1
            r3 = r6
            goto L_0x00f4
        L_0x00ef:
            int r5 = r5 + 1
            goto L_0x00dc
        L_0x00f2:
            r14 = r2
            r2 = r4
        L_0x00f4:
            if (r2 == 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r9 = 3
        L_0x00f8:
            if (r2 == 0) goto L_0x0102
            boolean r15 = r3.e(r15)
            if (r15 == 0) goto L_0x0102
            r8 = 16
        L_0x0102:
            boolean r15 = r3.g
            if (r15 == 0) goto L_0x0109
            r15 = 64
            goto L_0x010a
        L_0x0109:
            r15 = r1
        L_0x010a:
            if (r14 == 0) goto L_0x010e
            r1 = 128(0x80, float:1.794E-43)
        L_0x010e:
            r14 = r9 | r8
            r14 = r14 | r0
            r14 = r14 | r15
            r14 = r14 | r1
            r13 = r13 | r14
            return r13
        L_0x0115:
            int r13 = defpackage.vj0.b(r2, r1, r1, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v78.v0(xw0, qy5):int");
    }

    public final void w() {
        B0();
        e84 e84 = (e84) this.S1;
        e84.Y = false;
        if (e84.l()) {
            o70 o70 = e84.i;
            o70.d();
            if (o70.y == -9223372036854775807L) {
                m70 m70 = o70.f;
                m70.getClass();
                m70.a();
            } else {
                o70.A = o70.b();
                if (!e84.m(e84.w)) {
                    return;
                }
            }
            e84.w.pause();
        }
    }

    public final int z0(qy5 qy5) {
        y50 e = ((e84) this.S1).e(qy5);
        if (!e.a) {
            return 0;
        }
        int i = e.b ? 1536 : 512;
        return e.c ? i | 2048 : i;
    }
}
