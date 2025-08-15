package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: y78  reason: default package */
public final class y78 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public y78(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = ia9.k(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(oaf.g(i, widthAlignment) * widthAlignment, oaf.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        return (d2 == -1.0d || d2 < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ("Nexus 10".equals(r1) == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.y78 h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            y78 r13 = new y78
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L_0x0039
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r11.isFeatureSupported(r1)
            if (r1 == 0) goto L_0x0039
            int r1 = defpackage.oaf.a
            r2 = 22
            if (r1 > r2) goto L_0x0037
            java.lang.String r1 = defpackage.oaf.d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0026
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0037
        L_0x0026:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x0039
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r6 = r0
            goto L_0x003a
        L_0x0039:
            r6 = r14
        L_0x003a:
            r1 = 21
            if (r11 == 0) goto L_0x0048
            int r2 = defpackage.oaf.a
            if (r2 < r1) goto L_0x0048
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L_0x0048:
            if (r15 != 0) goto L_0x005b
            if (r11 == 0) goto L_0x0059
            int r15 = defpackage.oaf.a
            if (r15 < r1) goto L_0x0059
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r7 = r14
            goto L_0x005c
        L_0x005b:
            r7 = r0
        L_0x005c:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y78.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):y78");
    }

    public final s54 b(qy5 qy5, qy5 qy52) {
        int i = !oaf.a(qy5.n, qy52.n) ? 8 : 0;
        if (this.h) {
            if (qy5.w != qy52.w) {
                i |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if (!this.e && !(qy5.t == qy52.t && qy5.u == qy52.u)) {
                i |= 512;
            }
            i63 i63 = qy5.A;
            boolean f2 = i63.f(i63);
            i63 i632 = qy52.A;
            if ((!f2 || !i63.f(i632)) && !oaf.a(i63, i632)) {
                i |= 2048;
            }
            if (oaf.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !qy5.c(qy52)) {
                i |= 2;
            }
            if (i == 0) {
                return new s54(this.a, qy5, qy52, qy5.c(qy52) ? 3 : 2, 0);
            }
        } else {
            if (qy5.B != qy52.B) {
                i |= 4096;
            }
            if (qy5.C != qy52.C) {
                i |= 8192;
            }
            if (qy5.D != qy52.D) {
                i |= 16384;
            }
            String str = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d2 = p88.d(qy5);
                Pair d3 = p88.d(qy52);
                if (!(d2 == null || d3 == null)) {
                    int intValue = ((Integer) d2.first).intValue();
                    int intValue2 = ((Integer) d3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new s54(this.a, qy5, qy52, 3, 0);
                    }
                }
            }
            if (!qy5.c(qy52)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new s54(this.a, qy5, qy52, 1, 0);
            }
        }
        return new s54(this.a, qy5, qy52, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        r3 = r3.getVideoCapabilities();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(defpackage.qy5 r13, boolean r14) {
        /*
            r12 = this;
            android.util.Pair r0 = defpackage.p88.d(r13)
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r3 = "video/dolby-vision"
            java.lang.String r4 = r13.n
            boolean r3 = r3.equals(r4)
            r4 = 0
            java.lang.String r5 = "video/hevc"
            r6 = 8
            r7 = 2
            java.lang.String r8 = r12.b
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = "video/avc"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x0035
            r0 = r4
            r2 = r6
            goto L_0x003d
        L_0x0035:
            boolean r3 = r5.equals(r8)
            if (r3 == 0) goto L_0x003d
            r0 = r4
            r2 = r7
        L_0x003d:
            boolean r3 = r12.h
            if (r3 != 0) goto L_0x0046
            r3 = 42
            if (r2 == r3) goto L_0x0046
            return r1
        L_0x0046:
            android.media.MediaCodecInfo$CodecCapabilities r3 = r12.d
            if (r3 == 0) goto L_0x004e
            android.media.MediaCodecInfo$CodecProfileLevel[] r9 = r3.profileLevels
            if (r9 != 0) goto L_0x0050
        L_0x004e:
            android.media.MediaCodecInfo$CodecProfileLevel[] r9 = new android.media.MediaCodecInfo.CodecProfileLevel[r4]
        L_0x0050:
            int r10 = defpackage.oaf.a
            r11 = 23
            if (r10 > r11) goto L_0x00d3
            java.lang.String r10 = "video/x-vnd.on2.vp9"
            boolean r10 = r10.equals(r8)
            if (r10 == 0) goto L_0x00d3
            int r10 = r9.length
            if (r10 != 0) goto L_0x00d3
            if (r3 == 0) goto L_0x0078
            android.media.MediaCodecInfo$VideoCapabilities r3 = r3.getVideoCapabilities()
            if (r3 == 0) goto L_0x0078
            android.util.Range r3 = r3.getBitrateRange()
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x0079
        L_0x0078:
            r3 = r4
        L_0x0079:
            r9 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r3 < r9) goto L_0x0081
            r6 = 1024(0x400, float:1.435E-42)
            goto L_0x00c6
        L_0x0081:
            r9 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r3 < r9) goto L_0x0089
            r6 = 512(0x200, float:7.175E-43)
            goto L_0x00c6
        L_0x0089:
            r9 = 60000000(0x3938700, float:8.670878E-37)
            if (r3 < r9) goto L_0x0091
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x00c6
        L_0x0091:
            r9 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r3 < r9) goto L_0x0099
            r6 = 128(0x80, float:1.794E-43)
            goto L_0x00c6
        L_0x0099:
            r9 = 18000000(0x112a880, float:2.6936858E-38)
            if (r3 < r9) goto L_0x00a1
            r6 = 64
            goto L_0x00c6
        L_0x00a1:
            r9 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r3 < r9) goto L_0x00a9
            r6 = 32
            goto L_0x00c6
        L_0x00a9:
            r9 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r3 < r9) goto L_0x00b1
            r6 = 16
            goto L_0x00c6
        L_0x00b1:
            r9 = 3600000(0x36ee80, float:5.044674E-39)
            if (r3 < r9) goto L_0x00b7
            goto L_0x00c6
        L_0x00b7:
            r6 = 1800000(0x1b7740, float:2.522337E-39)
            if (r3 < r6) goto L_0x00be
            r6 = 4
            goto L_0x00c6
        L_0x00be:
            r6 = 800000(0xc3500, float:1.121039E-39)
            if (r3 < r6) goto L_0x00c5
            r6 = r7
            goto L_0x00c6
        L_0x00c5:
            r6 = r1
        L_0x00c6:
            android.media.MediaCodecInfo$CodecProfileLevel r3 = new android.media.MediaCodecInfo$CodecProfileLevel
            r3.<init>()
            r3.profile = r1
            r3.level = r6
            android.media.MediaCodecInfo$CodecProfileLevel[] r9 = new android.media.MediaCodecInfo.CodecProfileLevel[]{r3}
        L_0x00d3:
            int r3 = r9.length
            r6 = r4
        L_0x00d5:
            if (r6 >= r3) goto L_0x0102
            r10 = r9[r6]
            int r11 = r10.profile
            if (r11 != r2) goto L_0x00ff
            int r10 = r10.level
            if (r10 >= r0) goto L_0x00e3
            if (r14 != 0) goto L_0x00ff
        L_0x00e3:
            boolean r10 = r5.equals(r8)
            if (r10 == 0) goto L_0x00fe
            if (r7 != r2) goto L_0x00fe
            java.lang.String r10 = defpackage.oaf.b
            java.lang.String r11 = "sailfish"
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x00ff
            java.lang.String r11 = "marlin"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            return r1
        L_0x00ff:
            int r6 = r6 + 1
            goto L_0x00d5
        L_0x0102:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "codec.profileLevel, "
            r14.<init>(r0)
            java.lang.String r13 = r13.j
            r14.append(r13)
            java.lang.String r13 = ", "
            r14.append(r13)
            java.lang.String r13 = r12.c
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.g(r13)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y78.c(qy5, boolean):boolean");
    }

    public final boolean d(qy5 qy5) {
        int i;
        String str = qy5.n;
        String str2 = this.b;
        boolean z = true;
        if (!(str2.equals(str) || str2.equals(p88.b(qy5))) || !c(qy5, true)) {
            return false;
        }
        if (this.h) {
            int i2 = qy5.t;
            if (i2 > 0 && (i = qy5.u) > 0) {
                if (oaf.a >= 21) {
                    return f(i2, i, (double) qy5.v);
                }
                if (i2 * i > p88.k()) {
                    z = false;
                }
                if (!z) {
                    g("legacyFrameSize, " + i2 + "x" + i);
                }
            }
            return z;
        }
        int i3 = oaf.a;
        if (i3 < 21) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        int i4 = qy5.C;
        if (i4 != -1) {
            if (codecCapabilities == null) {
                g("sampleRate.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i4)) {
                    g("sampleRate.support, " + i4);
                }
            }
            return false;
        }
        int i5 = qy5.B;
        if (i5 == -1) {
            return true;
        }
        if (codecCapabilities == null) {
            g("channelCount.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                g("channelCount.aCaps");
            } else {
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i3 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i6 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    z04.c0("AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i6 + "]");
                    maxInputChannelCount = i6;
                }
                if (maxInputChannelCount >= i5) {
                    return true;
                }
                g("channelCount.support, " + i5);
            }
        }
        return false;
    }

    public final boolean e(qy5 qy5) {
        if (this.h) {
            return this.e;
        }
        Pair d2 = p88.d(qy5);
        return d2 != null && ((Integer) d2.first).intValue() == 42;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r2 = defpackage.s36.g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(int r9, int r10, double r11) {
        /*
            r8 = this;
            r0 = 0
            android.media.MediaCodecInfo$CodecCapabilities r1 = r8.d
            if (r1 != 0) goto L_0x000b
            java.lang.String r9 = "sizeAndRate.caps"
            r8.g(r9)
            return r0
        L_0x000b:
            android.media.MediaCodecInfo$VideoCapabilities r1 = r1.getVideoCapabilities()
            if (r1 != 0) goto L_0x0017
            java.lang.String r9 = "sizeAndRate.vCaps"
            r8.g(r9)
            return r0
        L_0x0017:
            int r2 = defpackage.oaf.a
            r3 = 29
            java.lang.String r4 = "@"
            java.lang.String r5 = "x"
            r6 = 1
            if (r2 < r3) goto L_0x004c
            if (r2 < r3) goto L_0x0034
            java.lang.Boolean r2 = defpackage.s36.g
            if (r2 == 0) goto L_0x002f
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            int r2 = defpackage.z78.a(r1, r9, r10, r11)
            goto L_0x0035
        L_0x0034:
            r2 = r0
        L_0x0035:
            r3 = 2
            if (r2 != r3) goto L_0x0039
            return r6
        L_0x0039:
            if (r2 != r6) goto L_0x004c
            java.lang.String r1 = "sizeAndRate.cover, "
            java.lang.StringBuilder r9 = defpackage.wg0.j(r1, r9, r5, r10, r4)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.g(r9)
            return r0
        L_0x004c:
            boolean r2 = a(r1, r9, r10, r11)
            if (r2 != 0) goto L_0x00b2
            if (r9 >= r10) goto L_0x00a1
            java.lang.String r2 = "OMX.MTK.VIDEO.DECODER.HEVC"
            java.lang.String r3 = r8.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0069
            java.lang.String r2 = "mcv5a"
            java.lang.String r7 = defpackage.oaf.b
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0069
            goto L_0x00a1
        L_0x0069:
            boolean r1 = a(r1, r10, r9, r11)
            if (r1 != 0) goto L_0x0070
            goto L_0x00a1
        L_0x0070:
            java.lang.String r0 = "sizeAndRate.rotated, "
            java.lang.StringBuilder r9 = defpackage.wg0.j(r0, r9, r5, r10, r4)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "AssumedSupport ["
            java.lang.String r11 = "] ["
            java.lang.String r12 = ", "
            java.lang.StringBuilder r9 = defpackage.k7d.k(r10, r9, r11, r3, r12)
            java.lang.String r8 = r8.b
            r9.append(r8)
            r9.append(r11)
            java.lang.String r8 = defpackage.oaf.e
            r9.append(r8)
            java.lang.String r8 = "]"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            defpackage.z04.t(r8)
            goto L_0x00b2
        L_0x00a1:
            java.lang.String r1 = "sizeAndRate.support, "
            java.lang.StringBuilder r9 = defpackage.wg0.j(r1, r9, r5, r10, r4)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.g(r9)
            return r0
        L_0x00b2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y78.f(int, int, double):boolean");
    }

    public final void g(String str) {
        StringBuilder m = au1.m("NoSupport [", str, "] [");
        m.append(this.a);
        m.append(", ");
        m.append(this.b);
        m.append("] [");
        m.append(oaf.e);
        m.append("]");
        z04.t(m.toString());
    }

    public final String toString() {
        return this.a;
    }
}
