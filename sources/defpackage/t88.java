package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: t88  reason: default package */
public final class t88 extends g88 {
    public static final int[] w2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean x2;
    public static boolean y2;
    public final Context Q1;
    public final boolean R1;
    public final aab S1;
    public final int T1 = 50;
    public final boolean U1;
    public final cgf V1;
    public final l7 W1;
    public w3 X1;
    public boolean Y1;
    public boolean Z1;
    public bd3 a2;
    public boolean b2;
    public List c2;
    public Surface d2;
    public o2b e2;
    public lsd f2;
    public boolean g2;
    public int h2;
    public long i2;
    public int j2;
    public int k2;
    public int l2;
    public long m2;
    public int n2;
    public long o2;
    public jlf p2;
    public jlf q2;
    public int r2;
    public boolean s2;
    public int t2;
    public r88 u2;
    public q75 v2;

    public t88(Context context, q78 q78, Handler handler, o75 o75) {
        super(2, q78, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.Q1 = applicationContext;
        this.S1 = new aab(handler, o75);
        this.R1 = true;
        this.V1 = new cgf(applicationContext, this);
        this.W1 = new l7(10);
        this.U1 = "NVIDIA".equals(oaf.c);
        this.f2 = lsd.c;
        this.h2 = 1;
        this.p2 = jlf.e;
        this.t2 = 0;
        this.q2 = null;
        this.r2 = -1000;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        if (r9.equals("video/hevc") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r12 = ((java.lang.Integer) r12.first).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A0(defpackage.y78 r11, defpackage.qy5 r12) {
        /*
            r0 = 3
            r1 = 4
            java.lang.String r2 = "video/hevc"
            java.lang.String r3 = "video/avc"
            r4 = 2
            r5 = 1
            int r6 = r12.t
            r7 = -1
            if (r6 == r7) goto L_0x00d8
            int r8 = r12.u
            if (r8 != r7) goto L_0x0013
            goto L_0x00d8
        L_0x0013:
            java.lang.String r9 = r12.n
            r9.getClass()
            java.lang.String r10 = "video/dolby-vision"
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L_0x0039
            android.util.Pair r12 = defpackage.p88.d(r12)
            if (r12 == 0) goto L_0x0038
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r9 = 512(0x200, float:7.175E-43)
            if (r12 == r9) goto L_0x0036
            if (r12 == r5) goto L_0x0036
            if (r12 != r4) goto L_0x0038
        L_0x0036:
            r9 = r3
            goto L_0x0039
        L_0x0038:
            r9 = r2
        L_0x0039:
            int r12 = r9.hashCode()
            switch(r12) {
                case -1664118616: goto L_0x007e;
                case -1662735862: goto L_0x0073;
                case -1662541442: goto L_0x006c;
                case 1187890754: goto L_0x0061;
                case 1331836730: goto L_0x0058;
                case 1599127256: goto L_0x004d;
                case 1599127257: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r4 = r7
            goto L_0x0088
        L_0x0042:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x004b
            goto L_0x0040
        L_0x004b:
            r4 = 6
            goto L_0x0088
        L_0x004d:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x0056
            goto L_0x0040
        L_0x0056:
            r4 = 5
            goto L_0x0088
        L_0x0058:
            boolean r12 = r9.equals(r3)
            if (r12 != 0) goto L_0x005f
            goto L_0x0040
        L_0x005f:
            r4 = r1
            goto L_0x0088
        L_0x0061:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x006a
            goto L_0x0040
        L_0x006a:
            r4 = r0
            goto L_0x0088
        L_0x006c:
            boolean r12 = r9.equals(r2)
            if (r12 != 0) goto L_0x0088
            goto L_0x0040
        L_0x0073:
            java.lang.String r12 = "video/av01"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x007c
            goto L_0x0040
        L_0x007c:
            r4 = r5
            goto L_0x0088
        L_0x007e:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x0087
            goto L_0x0040
        L_0x0087:
            r4 = 0
        L_0x0088:
            switch(r4) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00d4;
                case 2: goto L_0x00ca;
                case 3: goto L_0x00d4;
                case 4: goto L_0x0091;
                case 5: goto L_0x00d4;
                case 6: goto L_0x008c;
                default: goto L_0x008b;
            }
        L_0x008b:
            return r7
        L_0x008c:
            int r6 = r6 * r8
            int r6 = r6 * r0
            int r6 = r6 / 8
            return r6
        L_0x0091:
            java.lang.String r12 = defpackage.oaf.d
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00c9
            java.lang.String r0 = "Amazon"
            java.lang.String r2 = defpackage.oaf.c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "KFSOWI"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00c9
            java.lang.String r0 = "AFTS"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x00ba
            boolean r11 = r11.f
            if (r11 == 0) goto L_0x00ba
            goto L_0x00c9
        L_0x00ba:
            r11 = 16
            int r12 = defpackage.oaf.g(r6, r11)
            int r11 = defpackage.oaf.g(r8, r11)
            int r11 = r11 * r12
            int r11 = r11 * 768
            int r11 = r11 / r1
            return r11
        L_0x00c9:
            return r7
        L_0x00ca:
            int r6 = r6 * r8
            int r6 = r6 * r0
            int r6 = r6 / r1
            r11 = 2097152(0x200000, float:2.938736E-39)
            int r11 = java.lang.Math.max(r11, r6)
            return r11
        L_0x00d4:
            int r6 = r6 * r8
            int r6 = r6 * r0
            int r6 = r6 / r1
            return r6
        L_0x00d8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.A0(y78, qy5):int");
    }

    public static List B0(Context context, xw0 xw0, qy5 qy5, boolean z, boolean z2) {
        List list;
        String str = qy5.n;
        if (str == null) {
            return ffc.X;
        }
        if (oaf.a >= 26 && "video/dolby-vision".equals(str) && !q88.a(context)) {
            String b = p88.b(qy5);
            if (b == null) {
                list = ffc.X;
            } else {
                xw0.getClass();
                list = p88.e(b, z, z2);
            }
            if (!list.isEmpty()) {
                return list;
            }
        }
        return p88.g(xw0, qy5, z, z2);
    }

    public static int C0(y78 y78, qy5 qy5) {
        if (qy5.o == -1) {
            return A0(y78, qy5);
        }
        List list = qy5.q;
        int size = list.size();
        int i = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i += ((byte[]) list.get(i3)).length;
        }
        return qy5.o + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x074f, code lost:
        if (r14.equals("A10-70L") == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x08b7, code lost:
        if (r1.equals("JSN-L21") == false) goto L_0x08b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean z0(java.lang.String r17) {
        /*
            r0 = 26
            r2 = 27
            r3 = 28
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = -1
            r11 = 1
            java.lang.String r12 = "OMX.google"
            r13 = r17
            boolean r12 = r13.startsWith(r12)
            r13 = 0
            if (r12 == 0) goto L_0x001a
            return r13
        L_0x001a:
            java.lang.Class<t88> r12 = defpackage.t88.class
            monitor-enter(r12)
            boolean r14 = x2     // Catch:{ all -> 0x08be }
            if (r14 != 0) goto L_0x08c0
            int r14 = defpackage.oaf.a     // Catch:{ all -> 0x08be }
            if (r14 > r3) goto L_0x0092
            java.lang.String r15 = defpackage.oaf.b     // Catch:{ all -> 0x08be }
            r15.getClass()     // Catch:{ all -> 0x08be }
            int r16 = r15.hashCode()
            switch(r16) {
                case -1339091551: goto L_0x0081;
                case -1220081023: goto L_0x0076;
                case -1220066608: goto L_0x006b;
                case -1012436106: goto L_0x0060;
                case -760312546: goto L_0x0055;
                case -64886864: goto L_0x004a;
                case 3415681: goto L_0x003f;
                case 825323514: goto L_0x0034;
                default: goto L_0x0031;
            }
        L_0x0031:
            r1 = r10
            goto L_0x008b
        L_0x0034:
            java.lang.String r1 = "machuca"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x003d
            goto L_0x0031
        L_0x003d:
            r1 = r4
            goto L_0x008b
        L_0x003f:
            java.lang.String r1 = "once"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x0048
            goto L_0x0031
        L_0x0048:
            r1 = r5
            goto L_0x008b
        L_0x004a:
            java.lang.String r1 = "magnolia"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x0053
            goto L_0x0031
        L_0x0053:
            r1 = r6
            goto L_0x008b
        L_0x0055:
            java.lang.String r1 = "aquaman"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x005e
            goto L_0x0031
        L_0x005e:
            r1 = r7
            goto L_0x008b
        L_0x0060:
            java.lang.String r1 = "oneday"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x0069
            goto L_0x0031
        L_0x0069:
            r1 = r8
            goto L_0x008b
        L_0x006b:
            java.lang.String r1 = "dangalUHD"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x0074
            goto L_0x0031
        L_0x0074:
            r1 = r9
            goto L_0x008b
        L_0x0076:
            java.lang.String r1 = "dangalFHD"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x007f
            goto L_0x0031
        L_0x007f:
            r1 = r11
            goto L_0x008b
        L_0x0081:
            java.lang.String r1 = "dangal"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x008a
            goto L_0x0031
        L_0x008a:
            r1 = r13
        L_0x008b:
            switch(r1) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008f;
                case 2: goto L_0x008f;
                case 3: goto L_0x008f;
                case 4: goto L_0x008f;
                case 5: goto L_0x008f;
                case 6: goto L_0x008f;
                case 7: goto L_0x008f;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x0092
        L_0x008f:
            r13 = r11
            goto L_0x08b9
        L_0x0092:
            if (r14 > r2) goto L_0x009f
            java.lang.String r1 = "HWEML"
            java.lang.String r15 = defpackage.oaf.b     // Catch:{ all -> 0x08be }
            boolean r1 = r1.equals(r15)     // Catch:{ all -> 0x08be }
            if (r1 == 0) goto L_0x009f
            goto L_0x008f
        L_0x009f:
            java.lang.String r1 = defpackage.oaf.d     // Catch:{ all -> 0x08be }
            r1.getClass()     // Catch:{ all -> 0x08be }
            int r15 = r1.hashCode()
            switch(r15) {
                case -349662828: goto L_0x0108;
                case -321033677: goto L_0x00fd;
                case 2006354: goto L_0x00f2;
                case 2006367: goto L_0x00e7;
                case 2006371: goto L_0x00dc;
                case 1785421873: goto L_0x00d1;
                case 1785421876: goto L_0x00c6;
                case 1798172390: goto L_0x00bb;
                case 2119412532: goto L_0x00ae;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r15 = r10
            goto L_0x0112
        L_0x00ae:
            java.lang.String r15 = "AFTEUFF014"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00b7
            goto L_0x00ab
        L_0x00b7:
            r15 = 8
            goto L_0x0112
        L_0x00bb:
            java.lang.String r15 = "AFTSO001"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00c4
            goto L_0x00ab
        L_0x00c4:
            r15 = r4
            goto L_0x0112
        L_0x00c6:
            java.lang.String r15 = "AFTEU014"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00cf
            goto L_0x00ab
        L_0x00cf:
            r15 = r5
            goto L_0x0112
        L_0x00d1:
            java.lang.String r15 = "AFTEU011"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00da
            goto L_0x00ab
        L_0x00da:
            r15 = r6
            goto L_0x0112
        L_0x00dc:
            java.lang.String r15 = "AFTR"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00e5
            goto L_0x00ab
        L_0x00e5:
            r15 = r7
            goto L_0x0112
        L_0x00e7:
            java.lang.String r15 = "AFTN"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00f0
            goto L_0x00ab
        L_0x00f0:
            r15 = r8
            goto L_0x0112
        L_0x00f2:
            java.lang.String r15 = "AFTA"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x00fb
            goto L_0x00ab
        L_0x00fb:
            r15 = r9
            goto L_0x0112
        L_0x00fd:
            java.lang.String r15 = "AFTKMST12"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x0106
            goto L_0x00ab
        L_0x0106:
            r15 = r11
            goto L_0x0112
        L_0x0108:
            java.lang.String r15 = "AFTJMST12"
            boolean r15 = r1.equals(r15)
            if (r15 != 0) goto L_0x0111
            goto L_0x00ab
        L_0x0111:
            r15 = r13
        L_0x0112:
            switch(r15) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008f;
                case 2: goto L_0x008f;
                case 3: goto L_0x008f;
                case 4: goto L_0x008f;
                case 5: goto L_0x008f;
                case 6: goto L_0x008f;
                case 7: goto L_0x008f;
                case 8: goto L_0x008f;
                default: goto L_0x0115;
            }
        L_0x0115:
            if (r14 > r0) goto L_0x08b9
            java.lang.String r14 = defpackage.oaf.b     // Catch:{ all -> 0x08be }
            r14.getClass()     // Catch:{ all -> 0x08be }
            int r15 = r14.hashCode()
            switch(r15) {
                case -2144781245: goto L_0x08a3;
                case -2144781185: goto L_0x0897;
                case -2144781160: goto L_0x088b;
                case -2097309513: goto L_0x087f;
                case -2022874474: goto L_0x0873;
                case -1978993182: goto L_0x0867;
                case -1978990237: goto L_0x085b;
                case -1936688988: goto L_0x084f;
                case -1936688066: goto L_0x0841;
                case -1936688065: goto L_0x0833;
                case -1931988508: goto L_0x0825;
                case -1885099851: goto L_0x0817;
                case -1696512866: goto L_0x0809;
                case -1680025915: goto L_0x07fb;
                case -1615810839: goto L_0x07ed;
                case -1600724499: goto L_0x07df;
                case -1554255044: goto L_0x07d1;
                case -1481772737: goto L_0x07c3;
                case -1481772730: goto L_0x07b5;
                case -1481772729: goto L_0x07a7;
                case -1320080169: goto L_0x0799;
                case -1217592143: goto L_0x078b;
                case -1180384755: goto L_0x077d;
                case -1139198265: goto L_0x076f;
                case -1052835013: goto L_0x0761;
                case -993250464: goto L_0x0753;
                case -993250458: goto L_0x0749;
                case -965403638: goto L_0x073c;
                case -958336948: goto L_0x072f;
                case -879245230: goto L_0x0721;
                case -842500323: goto L_0x0713;
                case -821392978: goto L_0x0705;
                case -797483286: goto L_0x06f7;
                case -794946968: goto L_0x06e9;
                case -788334647: goto L_0x06db;
                case -782144577: goto L_0x06cd;
                case -575125681: goto L_0x06bf;
                case -521118391: goto L_0x06b1;
                case -430914369: goto L_0x06a3;
                case -290434366: goto L_0x0695;
                case -282781963: goto L_0x0687;
                case -277133239: goto L_0x0679;
                case -173639913: goto L_0x066b;
                case -56598463: goto L_0x065d;
                case 2126: goto L_0x064f;
                case 2564: goto L_0x0641;
                case 2715: goto L_0x0633;
                case 2719: goto L_0x0625;
                case 3091: goto L_0x0617;
                case 3483: goto L_0x0609;
                case 73405: goto L_0x05fb;
                case 75537: goto L_0x05ed;
                case 75739: goto L_0x05df;
                case 76779: goto L_0x05d1;
                case 78669: goto L_0x05c3;
                case 79305: goto L_0x05b5;
                case 80618: goto L_0x05a7;
                case 88274: goto L_0x0599;
                case 98846: goto L_0x058b;
                case 98848: goto L_0x057d;
                case 99329: goto L_0x056f;
                case 101481: goto L_0x0561;
                case 1513190: goto L_0x0553;
                case 1514184: goto L_0x0545;
                case 1514185: goto L_0x0537;
                case 2133089: goto L_0x0529;
                case 2133091: goto L_0x051b;
                case 2133120: goto L_0x050d;
                case 2133151: goto L_0x04ff;
                case 2133182: goto L_0x04f1;
                case 2133184: goto L_0x04e3;
                case 2436959: goto L_0x04d5;
                case 2463773: goto L_0x04c7;
                case 2464648: goto L_0x04b9;
                case 2689555: goto L_0x04ab;
                case 3154429: goto L_0x049d;
                case 3284551: goto L_0x048f;
                case 3351335: goto L_0x0481;
                case 3386211: goto L_0x0473;
                case 41325051: goto L_0x0465;
                case 51349633: goto L_0x0457;
                case 51350594: goto L_0x0449;
                case 55178625: goto L_0x043b;
                case 61542055: goto L_0x042d;
                case 65355429: goto L_0x041f;
                case 66214468: goto L_0x0411;
                case 66214470: goto L_0x0403;
                case 66214473: goto L_0x03f5;
                case 66215429: goto L_0x03e7;
                case 66215431: goto L_0x03d9;
                case 66215433: goto L_0x03cb;
                case 66216390: goto L_0x03bd;
                case 76402249: goto L_0x03af;
                case 76404105: goto L_0x03a1;
                case 76404911: goto L_0x0393;
                case 80963634: goto L_0x0385;
                case 82882791: goto L_0x0377;
                case 98715550: goto L_0x0369;
                case 101370885: goto L_0x035b;
                case 102844228: goto L_0x034d;
                case 165221241: goto L_0x033f;
                case 182191441: goto L_0x0331;
                case 245388979: goto L_0x0323;
                case 287431619: goto L_0x0315;
                case 307593612: goto L_0x0307;
                case 308517133: goto L_0x02f9;
                case 316215098: goto L_0x02eb;
                case 316215116: goto L_0x02dd;
                case 316246811: goto L_0x02cf;
                case 316246818: goto L_0x02c1;
                case 407160593: goto L_0x02b3;
                case 507412548: goto L_0x02a5;
                case 793982701: goto L_0x0297;
                case 794038622: goto L_0x0289;
                case 794040393: goto L_0x027b;
                case 835649806: goto L_0x026d;
                case 917340916: goto L_0x025f;
                case 958008161: goto L_0x0251;
                case 1060579533: goto L_0x0243;
                case 1150207623: goto L_0x0235;
                case 1176899427: goto L_0x0227;
                case 1280332038: goto L_0x0219;
                case 1306947716: goto L_0x020b;
                case 1349174697: goto L_0x01fd;
                case 1522194893: goto L_0x01ef;
                case 1691543273: goto L_0x01e1;
                case 1691544261: goto L_0x01d3;
                case 1709443163: goto L_0x01c5;
                case 1865889110: goto L_0x01b7;
                case 1906253259: goto L_0x01a9;
                case 1977196784: goto L_0x019b;
                case 2006372676: goto L_0x018e;
                case 2019281702: goto L_0x0181;
                case 2029784656: goto L_0x0174;
                case 2030379515: goto L_0x0167;
                case 2033393791: goto L_0x015a;
                case 2047190025: goto L_0x014d;
                case 2047252157: goto L_0x0140;
                case 2048319463: goto L_0x0133;
                case 2048855701: goto L_0x0126;
                default: goto L_0x0123;
            }
        L_0x0123:
            r0 = r10
            goto L_0x08ae
        L_0x0126:
            java.lang.String r0 = "HWWAS-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x012f
            goto L_0x0123
        L_0x012f:
            r0 = 139(0x8b, float:1.95E-43)
            goto L_0x08ae
        L_0x0133:
            java.lang.String r0 = "HWVNS-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x0123
        L_0x013c:
            r0 = 138(0x8a, float:1.93E-43)
            goto L_0x08ae
        L_0x0140:
            java.lang.String r0 = "ELUGA_Prim"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0149
            goto L_0x0123
        L_0x0149:
            r0 = 137(0x89, float:1.92E-43)
            goto L_0x08ae
        L_0x014d:
            java.lang.String r0 = "ELUGA_Note"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0156
            goto L_0x0123
        L_0x0156:
            r0 = 136(0x88, float:1.9E-43)
            goto L_0x08ae
        L_0x015a:
            java.lang.String r0 = "ASUS_X00AD_2"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0163
            goto L_0x0123
        L_0x0163:
            r0 = 135(0x87, float:1.89E-43)
            goto L_0x08ae
        L_0x0167:
            java.lang.String r0 = "HWCAM-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0170
            goto L_0x0123
        L_0x0170:
            r0 = 134(0x86, float:1.88E-43)
            goto L_0x08ae
        L_0x0174:
            java.lang.String r0 = "HWBLN-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x017d
            goto L_0x0123
        L_0x017d:
            r0 = 133(0x85, float:1.86E-43)
            goto L_0x08ae
        L_0x0181:
            java.lang.String r0 = "DM-01K"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x018a
            goto L_0x0123
        L_0x018a:
            r0 = 132(0x84, float:1.85E-43)
            goto L_0x08ae
        L_0x018e:
            java.lang.String r0 = "BRAVIA_ATV3_4K"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0197
            goto L_0x0123
        L_0x0197:
            r0 = 131(0x83, float:1.84E-43)
            goto L_0x08ae
        L_0x019b:
            java.lang.String r0 = "Infinix-X572"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01a5
            goto L_0x0123
        L_0x01a5:
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x08ae
        L_0x01a9:
            java.lang.String r0 = "PB2-670M"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01b3
            goto L_0x0123
        L_0x01b3:
            r0 = 129(0x81, float:1.81E-43)
            goto L_0x08ae
        L_0x01b7:
            java.lang.String r0 = "santoni"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01c1
            goto L_0x0123
        L_0x01c1:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x08ae
        L_0x01c5:
            java.lang.String r0 = "iball8735_9806"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01cf
            goto L_0x0123
        L_0x01cf:
            r0 = 127(0x7f, float:1.78E-43)
            goto L_0x08ae
        L_0x01d3:
            java.lang.String r0 = "CPH1715"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01dd
            goto L_0x0123
        L_0x01dd:
            r0 = 126(0x7e, float:1.77E-43)
            goto L_0x08ae
        L_0x01e1:
            java.lang.String r0 = "CPH1609"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01eb
            goto L_0x0123
        L_0x01eb:
            r0 = 125(0x7d, float:1.75E-43)
            goto L_0x08ae
        L_0x01ef:
            java.lang.String r0 = "woods_f"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x01f9
            goto L_0x0123
        L_0x01f9:
            r0 = 124(0x7c, float:1.74E-43)
            goto L_0x08ae
        L_0x01fd:
            java.lang.String r0 = "htc_e56ml_dtul"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0207
            goto L_0x0123
        L_0x0207:
            r0 = 123(0x7b, float:1.72E-43)
            goto L_0x08ae
        L_0x020b:
            java.lang.String r0 = "EverStar_S"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0215
            goto L_0x0123
        L_0x0215:
            r0 = 122(0x7a, float:1.71E-43)
            goto L_0x08ae
        L_0x0219:
            java.lang.String r0 = "hwALE-H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0223
            goto L_0x0123
        L_0x0223:
            r0 = 121(0x79, float:1.7E-43)
            goto L_0x08ae
        L_0x0227:
            java.lang.String r0 = "itel_S41"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0231
            goto L_0x0123
        L_0x0231:
            r0 = 120(0x78, float:1.68E-43)
            goto L_0x08ae
        L_0x0235:
            java.lang.String r0 = "LS-5017"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x023f
            goto L_0x0123
        L_0x023f:
            r0 = 119(0x77, float:1.67E-43)
            goto L_0x08ae
        L_0x0243:
            java.lang.String r0 = "panell_d"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x024d
            goto L_0x0123
        L_0x024d:
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x08ae
        L_0x0251:
            java.lang.String r0 = "j2xlteins"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x025b
            goto L_0x0123
        L_0x025b:
            r0 = 117(0x75, float:1.64E-43)
            goto L_0x08ae
        L_0x025f:
            java.lang.String r0 = "A7000plus"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0269
            goto L_0x0123
        L_0x0269:
            r0 = 116(0x74, float:1.63E-43)
            goto L_0x08ae
        L_0x026d:
            java.lang.String r0 = "manning"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0277
            goto L_0x0123
        L_0x0277:
            r0 = 115(0x73, float:1.61E-43)
            goto L_0x08ae
        L_0x027b:
            java.lang.String r0 = "GIONEE_WBL7519"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0285
            goto L_0x0123
        L_0x0285:
            r0 = 114(0x72, float:1.6E-43)
            goto L_0x08ae
        L_0x0289:
            java.lang.String r0 = "GIONEE_WBL7365"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0293
            goto L_0x0123
        L_0x0293:
            r0 = 113(0x71, float:1.58E-43)
            goto L_0x08ae
        L_0x0297:
            java.lang.String r0 = "GIONEE_WBL5708"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02a1
            goto L_0x0123
        L_0x02a1:
            r0 = 112(0x70, float:1.57E-43)
            goto L_0x08ae
        L_0x02a5:
            java.lang.String r0 = "QM16XE_U"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02af
            goto L_0x0123
        L_0x02af:
            r0 = 111(0x6f, float:1.56E-43)
            goto L_0x08ae
        L_0x02b3:
            java.lang.String r0 = "Pixi5-10_4G"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02bd
            goto L_0x0123
        L_0x02bd:
            r0 = 110(0x6e, float:1.54E-43)
            goto L_0x08ae
        L_0x02c1:
            java.lang.String r0 = "TB3-850M"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02cb
            goto L_0x0123
        L_0x02cb:
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x08ae
        L_0x02cf:
            java.lang.String r0 = "TB3-850F"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02d9
            goto L_0x0123
        L_0x02d9:
            r0 = 108(0x6c, float:1.51E-43)
            goto L_0x08ae
        L_0x02dd:
            java.lang.String r0 = "TB3-730X"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02e7
            goto L_0x0123
        L_0x02e7:
            r0 = 107(0x6b, float:1.5E-43)
            goto L_0x08ae
        L_0x02eb:
            java.lang.String r0 = "TB3-730F"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02f5
            goto L_0x0123
        L_0x02f5:
            r0 = 106(0x6a, float:1.49E-43)
            goto L_0x08ae
        L_0x02f9:
            java.lang.String r0 = "A7020a48"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0303
            goto L_0x0123
        L_0x0303:
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x08ae
        L_0x0307:
            java.lang.String r0 = "A7010a48"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0311
            goto L_0x0123
        L_0x0311:
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x08ae
        L_0x0315:
            java.lang.String r0 = "griffin"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x031f
            goto L_0x0123
        L_0x031f:
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x08ae
        L_0x0323:
            java.lang.String r0 = "marino_f"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x032d
            goto L_0x0123
        L_0x032d:
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x08ae
        L_0x0331:
            java.lang.String r0 = "CPY83_I00"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x033b
            goto L_0x0123
        L_0x033b:
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x08ae
        L_0x033f:
            java.lang.String r0 = "A2016a40"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0349
            goto L_0x0123
        L_0x0349:
            r0 = 100
            goto L_0x08ae
        L_0x034d:
            java.lang.String r0 = "le_x6"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0357
            goto L_0x0123
        L_0x0357:
            r0 = 99
            goto L_0x08ae
        L_0x035b:
            java.lang.String r0 = "l5460"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0365
            goto L_0x0123
        L_0x0365:
            r0 = 98
            goto L_0x08ae
        L_0x0369:
            java.lang.String r0 = "i9031"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0373
            goto L_0x0123
        L_0x0373:
            r0 = 97
            goto L_0x08ae
        L_0x0377:
            java.lang.String r0 = "X3_HK"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0381
            goto L_0x0123
        L_0x0381:
            r0 = 96
            goto L_0x08ae
        L_0x0385:
            java.lang.String r0 = "V23GB"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x038f
            goto L_0x0123
        L_0x038f:
            r0 = 95
            goto L_0x08ae
        L_0x0393:
            java.lang.String r0 = "Q4310"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x039d
            goto L_0x0123
        L_0x039d:
            r0 = 94
            goto L_0x08ae
        L_0x03a1:
            java.lang.String r0 = "Q4260"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03ab
            goto L_0x0123
        L_0x03ab:
            r0 = 93
            goto L_0x08ae
        L_0x03af:
            java.lang.String r0 = "PRO7S"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03b9
            goto L_0x0123
        L_0x03b9:
            r0 = 92
            goto L_0x08ae
        L_0x03bd:
            java.lang.String r0 = "F3311"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03c7
            goto L_0x0123
        L_0x03c7:
            r0 = 91
            goto L_0x08ae
        L_0x03cb:
            java.lang.String r0 = "F3215"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03d5
            goto L_0x0123
        L_0x03d5:
            r0 = 90
            goto L_0x08ae
        L_0x03d9:
            java.lang.String r0 = "F3213"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03e3
            goto L_0x0123
        L_0x03e3:
            r0 = 89
            goto L_0x08ae
        L_0x03e7:
            java.lang.String r0 = "F3211"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03f1
            goto L_0x0123
        L_0x03f1:
            r0 = 88
            goto L_0x08ae
        L_0x03f5:
            java.lang.String r0 = "F3116"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03ff
            goto L_0x0123
        L_0x03ff:
            r0 = 87
            goto L_0x08ae
        L_0x0403:
            java.lang.String r0 = "F3113"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x040d
            goto L_0x0123
        L_0x040d:
            r0 = 86
            goto L_0x08ae
        L_0x0411:
            java.lang.String r0 = "F3111"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x041b
            goto L_0x0123
        L_0x041b:
            r0 = 85
            goto L_0x08ae
        L_0x041f:
            java.lang.String r0 = "E5643"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0429
            goto L_0x0123
        L_0x0429:
            r0 = 84
            goto L_0x08ae
        L_0x042d:
            java.lang.String r0 = "A1601"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0437
            goto L_0x0123
        L_0x0437:
            r0 = 83
            goto L_0x08ae
        L_0x043b:
            java.lang.String r0 = "Aura_Note_2"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0445
            goto L_0x0123
        L_0x0445:
            r0 = 82
            goto L_0x08ae
        L_0x0449:
            java.lang.String r0 = "602LV"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0453
            goto L_0x0123
        L_0x0453:
            r0 = 81
            goto L_0x08ae
        L_0x0457:
            java.lang.String r0 = "601LV"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0461
            goto L_0x0123
        L_0x0461:
            r0 = 80
            goto L_0x08ae
        L_0x0465:
            java.lang.String r0 = "MEIZU_M5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x046f
            goto L_0x0123
        L_0x046f:
            r0 = 79
            goto L_0x08ae
        L_0x0473:
            java.lang.String r0 = "p212"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x047d
            goto L_0x0123
        L_0x047d:
            r0 = 78
            goto L_0x08ae
        L_0x0481:
            java.lang.String r0 = "mido"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x048b
            goto L_0x0123
        L_0x048b:
            r0 = 77
            goto L_0x08ae
        L_0x048f:
            java.lang.String r0 = "kate"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0499
            goto L_0x0123
        L_0x0499:
            r0 = 76
            goto L_0x08ae
        L_0x049d:
            java.lang.String r0 = "fugu"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04a7
            goto L_0x0123
        L_0x04a7:
            r0 = 75
            goto L_0x08ae
        L_0x04ab:
            java.lang.String r0 = "XE2X"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04b5
            goto L_0x0123
        L_0x04b5:
            r0 = 74
            goto L_0x08ae
        L_0x04b9:
            java.lang.String r0 = "Q427"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04c3
            goto L_0x0123
        L_0x04c3:
            r0 = 73
            goto L_0x08ae
        L_0x04c7:
            java.lang.String r0 = "Q350"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04d1
            goto L_0x0123
        L_0x04d1:
            r0 = 72
            goto L_0x08ae
        L_0x04d5:
            java.lang.String r0 = "P681"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04df
            goto L_0x0123
        L_0x04df:
            r0 = 71
            goto L_0x08ae
        L_0x04e3:
            java.lang.String r0 = "F04J"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04ed
            goto L_0x0123
        L_0x04ed:
            r0 = 70
            goto L_0x08ae
        L_0x04f1:
            java.lang.String r0 = "F04H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x04fb
            goto L_0x0123
        L_0x04fb:
            r0 = 69
            goto L_0x08ae
        L_0x04ff:
            java.lang.String r0 = "F03H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0509
            goto L_0x0123
        L_0x0509:
            r0 = 68
            goto L_0x08ae
        L_0x050d:
            java.lang.String r0 = "F02H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0517
            goto L_0x0123
        L_0x0517:
            r0 = 67
            goto L_0x08ae
        L_0x051b:
            java.lang.String r0 = "F01J"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0525
            goto L_0x0123
        L_0x0525:
            r0 = 66
            goto L_0x08ae
        L_0x0529:
            java.lang.String r0 = "F01H"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0533
            goto L_0x0123
        L_0x0533:
            r0 = 65
            goto L_0x08ae
        L_0x0537:
            java.lang.String r0 = "1714"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0541
            goto L_0x0123
        L_0x0541:
            r0 = 64
            goto L_0x08ae
        L_0x0545:
            java.lang.String r0 = "1713"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x054f
            goto L_0x0123
        L_0x054f:
            r0 = 63
            goto L_0x08ae
        L_0x0553:
            java.lang.String r0 = "1601"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x055d
            goto L_0x0123
        L_0x055d:
            r0 = 62
            goto L_0x08ae
        L_0x0561:
            java.lang.String r0 = "flo"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x056b
            goto L_0x0123
        L_0x056b:
            r0 = 61
            goto L_0x08ae
        L_0x056f:
            java.lang.String r0 = "deb"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0579
            goto L_0x0123
        L_0x0579:
            r0 = 60
            goto L_0x08ae
        L_0x057d:
            java.lang.String r0 = "cv3"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0587
            goto L_0x0123
        L_0x0587:
            r0 = 59
            goto L_0x08ae
        L_0x058b:
            java.lang.String r0 = "cv1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0595
            goto L_0x0123
        L_0x0595:
            r0 = 58
            goto L_0x08ae
        L_0x0599:
            java.lang.String r0 = "Z80"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05a3
            goto L_0x0123
        L_0x05a3:
            r0 = 57
            goto L_0x08ae
        L_0x05a7:
            java.lang.String r0 = "QX1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05b1
            goto L_0x0123
        L_0x05b1:
            r0 = 56
            goto L_0x08ae
        L_0x05b5:
            java.lang.String r0 = "PLE"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05bf
            goto L_0x0123
        L_0x05bf:
            r0 = 55
            goto L_0x08ae
        L_0x05c3:
            java.lang.String r0 = "P85"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05cd
            goto L_0x0123
        L_0x05cd:
            r0 = 54
            goto L_0x08ae
        L_0x05d1:
            java.lang.String r0 = "MX6"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05db
            goto L_0x0123
        L_0x05db:
            r0 = 53
            goto L_0x08ae
        L_0x05df:
            java.lang.String r0 = "M5c"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05e9
            goto L_0x0123
        L_0x05e9:
            r0 = 52
            goto L_0x08ae
        L_0x05ed:
            java.lang.String r0 = "M04"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x05f7
            goto L_0x0123
        L_0x05f7:
            r0 = 51
            goto L_0x08ae
        L_0x05fb:
            java.lang.String r0 = "JGZ"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0605
            goto L_0x0123
        L_0x0605:
            r0 = 50
            goto L_0x08ae
        L_0x0609:
            java.lang.String r0 = "mh"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0613
            goto L_0x0123
        L_0x0613:
            r0 = 49
            goto L_0x08ae
        L_0x0617:
            java.lang.String r0 = "b5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0621
            goto L_0x0123
        L_0x0621:
            r0 = 48
            goto L_0x08ae
        L_0x0625:
            java.lang.String r0 = "V5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x062f
            goto L_0x0123
        L_0x062f:
            r0 = 47
            goto L_0x08ae
        L_0x0633:
            java.lang.String r0 = "V1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x063d
            goto L_0x0123
        L_0x063d:
            r0 = 46
            goto L_0x08ae
        L_0x0641:
            java.lang.String r0 = "Q5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x064b
            goto L_0x0123
        L_0x064b:
            r0 = 45
            goto L_0x08ae
        L_0x064f:
            java.lang.String r0 = "C1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0659
            goto L_0x0123
        L_0x0659:
            r0 = 44
            goto L_0x08ae
        L_0x065d:
            java.lang.String r0 = "woods_fn"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0667
            goto L_0x0123
        L_0x0667:
            r0 = 43
            goto L_0x08ae
        L_0x066b:
            java.lang.String r0 = "ELUGA_A3_Pro"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0675
            goto L_0x0123
        L_0x0675:
            r0 = 42
            goto L_0x08ae
        L_0x0679:
            java.lang.String r0 = "Z12_PRO"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0683
            goto L_0x0123
        L_0x0683:
            r0 = 41
            goto L_0x08ae
        L_0x0687:
            java.lang.String r0 = "BLACK-1X"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0691
            goto L_0x0123
        L_0x0691:
            r0 = 40
            goto L_0x08ae
        L_0x0695:
            java.lang.String r0 = "taido_row"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x069f
            goto L_0x0123
        L_0x069f:
            r0 = 39
            goto L_0x08ae
        L_0x06a3:
            java.lang.String r0 = "Pixi4-7_3G"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06ad
            goto L_0x0123
        L_0x06ad:
            r0 = 38
            goto L_0x08ae
        L_0x06b1:
            java.lang.String r0 = "GIONEE_GBL7360"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06bb
            goto L_0x0123
        L_0x06bb:
            r0 = 37
            goto L_0x08ae
        L_0x06bf:
            java.lang.String r0 = "GiONEE_CBL7513"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06c9
            goto L_0x0123
        L_0x06c9:
            r0 = 36
            goto L_0x08ae
        L_0x06cd:
            java.lang.String r0 = "OnePlus5T"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06d7
            goto L_0x0123
        L_0x06d7:
            r0 = 35
            goto L_0x08ae
        L_0x06db:
            java.lang.String r0 = "whyred"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06e5
            goto L_0x0123
        L_0x06e5:
            r0 = 34
            goto L_0x08ae
        L_0x06e9:
            java.lang.String r0 = "watson"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x06f3
            goto L_0x0123
        L_0x06f3:
            r0 = 33
            goto L_0x08ae
        L_0x06f7:
            java.lang.String r0 = "SVP-DTV15"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0701
            goto L_0x0123
        L_0x0701:
            r0 = 32
            goto L_0x08ae
        L_0x0705:
            java.lang.String r0 = "A7000-a"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x070f
            goto L_0x0123
        L_0x070f:
            r0 = 31
            goto L_0x08ae
        L_0x0713:
            java.lang.String r0 = "nicklaus_f"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x071d
            goto L_0x0123
        L_0x071d:
            r0 = 30
            goto L_0x08ae
        L_0x0721:
            java.lang.String r0 = "tcl_eu"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x072b
            goto L_0x0123
        L_0x072b:
            r0 = 29
            goto L_0x08ae
        L_0x072f:
            java.lang.String r0 = "ELUGA_Ray_X"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0739
            goto L_0x0123
        L_0x0739:
            r0 = r3
            goto L_0x08ae
        L_0x073c:
            java.lang.String r0 = "s905x018"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0746
            goto L_0x0123
        L_0x0746:
            r0 = r2
            goto L_0x08ae
        L_0x0749:
            java.lang.String r2 = "A10-70L"
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L_0x08ae
            goto L_0x0123
        L_0x0753:
            java.lang.String r0 = "A10-70F"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x075d
            goto L_0x0123
        L_0x075d:
            r0 = 25
            goto L_0x08ae
        L_0x0761:
            java.lang.String r0 = "namath"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x076b
            goto L_0x0123
        L_0x076b:
            r0 = 24
            goto L_0x08ae
        L_0x076f:
            java.lang.String r0 = "Slate_Pro"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0779
            goto L_0x0123
        L_0x0779:
            r0 = 23
            goto L_0x08ae
        L_0x077d:
            java.lang.String r0 = "iris60"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0787
            goto L_0x0123
        L_0x0787:
            r0 = 22
            goto L_0x08ae
        L_0x078b:
            java.lang.String r0 = "BRAVIA_ATV2"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0795
            goto L_0x0123
        L_0x0795:
            r0 = 21
            goto L_0x08ae
        L_0x0799:
            java.lang.String r0 = "GiONEE_GBL7319"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07a3
            goto L_0x0123
        L_0x07a3:
            r0 = 20
            goto L_0x08ae
        L_0x07a7:
            java.lang.String r0 = "panell_dt"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07b1
            goto L_0x0123
        L_0x07b1:
            r0 = 19
            goto L_0x08ae
        L_0x07b5:
            java.lang.String r0 = "panell_ds"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07bf
            goto L_0x0123
        L_0x07bf:
            r0 = 18
            goto L_0x08ae
        L_0x07c3:
            java.lang.String r0 = "panell_dl"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07cd
            goto L_0x0123
        L_0x07cd:
            r0 = 17
            goto L_0x08ae
        L_0x07d1:
            java.lang.String r0 = "vernee_M5"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07db
            goto L_0x0123
        L_0x07db:
            r0 = 16
            goto L_0x08ae
        L_0x07df:
            java.lang.String r0 = "pacificrim"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07e9
            goto L_0x0123
        L_0x07e9:
            r0 = 15
            goto L_0x08ae
        L_0x07ed:
            java.lang.String r0 = "Phantom6"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x07f7
            goto L_0x0123
        L_0x07f7:
            r0 = 14
            goto L_0x08ae
        L_0x07fb:
            java.lang.String r0 = "ComioS1"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0805
            goto L_0x0123
        L_0x0805:
            r0 = 13
            goto L_0x08ae
        L_0x0809:
            java.lang.String r0 = "XT1663"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0813
            goto L_0x0123
        L_0x0813:
            r0 = 12
            goto L_0x08ae
        L_0x0817:
            java.lang.String r0 = "RAIJIN"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0821
            goto L_0x0123
        L_0x0821:
            r0 = 11
            goto L_0x08ae
        L_0x0825:
            java.lang.String r0 = "AquaPowerM"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x082f
            goto L_0x0123
        L_0x082f:
            r0 = 10
            goto L_0x08ae
        L_0x0833:
            java.lang.String r0 = "PGN611"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x083d
            goto L_0x0123
        L_0x083d:
            r0 = 9
            goto L_0x08ae
        L_0x0841:
            java.lang.String r0 = "PGN610"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x084b
            goto L_0x0123
        L_0x084b:
            r0 = 8
            goto L_0x08ae
        L_0x084f:
            java.lang.String r0 = "PGN528"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0859
            goto L_0x0123
        L_0x0859:
            r0 = r4
            goto L_0x08ae
        L_0x085b:
            java.lang.String r0 = "NX573J"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0865
            goto L_0x0123
        L_0x0865:
            r0 = r5
            goto L_0x08ae
        L_0x0867:
            java.lang.String r0 = "NX541J"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0871
            goto L_0x0123
        L_0x0871:
            r0 = r6
            goto L_0x08ae
        L_0x0873:
            java.lang.String r0 = "CP8676_I02"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x087d
            goto L_0x0123
        L_0x087d:
            r0 = r7
            goto L_0x08ae
        L_0x087f:
            java.lang.String r0 = "K50a40"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0889
            goto L_0x0123
        L_0x0889:
            r0 = r8
            goto L_0x08ae
        L_0x088b:
            java.lang.String r0 = "GIONEE_SWW1631"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0895
            goto L_0x0123
        L_0x0895:
            r0 = r9
            goto L_0x08ae
        L_0x0897:
            java.lang.String r0 = "GIONEE_SWW1627"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x08a1
            goto L_0x0123
        L_0x08a1:
            r0 = r11
            goto L_0x08ae
        L_0x08a3:
            java.lang.String r0 = "GIONEE_SWW1609"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x08ad
            goto L_0x0123
        L_0x08ad:
            r0 = r13
        L_0x08ae:
            switch(r0) {
                case 0: goto L_0x008f;
                case 1: goto L_0x008f;
                case 2: goto L_0x008f;
                case 3: goto L_0x008f;
                case 4: goto L_0x008f;
                case 5: goto L_0x008f;
                case 6: goto L_0x008f;
                case 7: goto L_0x008f;
                case 8: goto L_0x008f;
                case 9: goto L_0x008f;
                case 10: goto L_0x008f;
                case 11: goto L_0x008f;
                case 12: goto L_0x008f;
                case 13: goto L_0x008f;
                case 14: goto L_0x008f;
                case 15: goto L_0x008f;
                case 16: goto L_0x008f;
                case 17: goto L_0x008f;
                case 18: goto L_0x008f;
                case 19: goto L_0x008f;
                case 20: goto L_0x008f;
                case 21: goto L_0x008f;
                case 22: goto L_0x008f;
                case 23: goto L_0x008f;
                case 24: goto L_0x008f;
                case 25: goto L_0x008f;
                case 26: goto L_0x008f;
                case 27: goto L_0x008f;
                case 28: goto L_0x008f;
                case 29: goto L_0x008f;
                case 30: goto L_0x008f;
                case 31: goto L_0x008f;
                case 32: goto L_0x008f;
                case 33: goto L_0x008f;
                case 34: goto L_0x008f;
                case 35: goto L_0x008f;
                case 36: goto L_0x008f;
                case 37: goto L_0x008f;
                case 38: goto L_0x008f;
                case 39: goto L_0x008f;
                case 40: goto L_0x008f;
                case 41: goto L_0x008f;
                case 42: goto L_0x008f;
                case 43: goto L_0x008f;
                case 44: goto L_0x008f;
                case 45: goto L_0x008f;
                case 46: goto L_0x008f;
                case 47: goto L_0x008f;
                case 48: goto L_0x008f;
                case 49: goto L_0x008f;
                case 50: goto L_0x008f;
                case 51: goto L_0x008f;
                case 52: goto L_0x008f;
                case 53: goto L_0x008f;
                case 54: goto L_0x008f;
                case 55: goto L_0x008f;
                case 56: goto L_0x008f;
                case 57: goto L_0x008f;
                case 58: goto L_0x008f;
                case 59: goto L_0x008f;
                case 60: goto L_0x008f;
                case 61: goto L_0x008f;
                case 62: goto L_0x008f;
                case 63: goto L_0x008f;
                case 64: goto L_0x008f;
                case 65: goto L_0x008f;
                case 66: goto L_0x008f;
                case 67: goto L_0x008f;
                case 68: goto L_0x008f;
                case 69: goto L_0x008f;
                case 70: goto L_0x008f;
                case 71: goto L_0x008f;
                case 72: goto L_0x008f;
                case 73: goto L_0x008f;
                case 74: goto L_0x008f;
                case 75: goto L_0x008f;
                case 76: goto L_0x008f;
                case 77: goto L_0x008f;
                case 78: goto L_0x008f;
                case 79: goto L_0x008f;
                case 80: goto L_0x008f;
                case 81: goto L_0x008f;
                case 82: goto L_0x008f;
                case 83: goto L_0x008f;
                case 84: goto L_0x008f;
                case 85: goto L_0x008f;
                case 86: goto L_0x008f;
                case 87: goto L_0x008f;
                case 88: goto L_0x008f;
                case 89: goto L_0x008f;
                case 90: goto L_0x008f;
                case 91: goto L_0x008f;
                case 92: goto L_0x008f;
                case 93: goto L_0x008f;
                case 94: goto L_0x008f;
                case 95: goto L_0x008f;
                case 96: goto L_0x008f;
                case 97: goto L_0x008f;
                case 98: goto L_0x008f;
                case 99: goto L_0x008f;
                case 100: goto L_0x008f;
                case 101: goto L_0x008f;
                case 102: goto L_0x008f;
                case 103: goto L_0x008f;
                case 104: goto L_0x008f;
                case 105: goto L_0x008f;
                case 106: goto L_0x008f;
                case 107: goto L_0x008f;
                case 108: goto L_0x008f;
                case 109: goto L_0x008f;
                case 110: goto L_0x008f;
                case 111: goto L_0x008f;
                case 112: goto L_0x008f;
                case 113: goto L_0x008f;
                case 114: goto L_0x008f;
                case 115: goto L_0x008f;
                case 116: goto L_0x008f;
                case 117: goto L_0x008f;
                case 118: goto L_0x008f;
                case 119: goto L_0x008f;
                case 120: goto L_0x008f;
                case 121: goto L_0x008f;
                case 122: goto L_0x008f;
                case 123: goto L_0x008f;
                case 124: goto L_0x008f;
                case 125: goto L_0x008f;
                case 126: goto L_0x008f;
                case 127: goto L_0x008f;
                case 128: goto L_0x008f;
                case 129: goto L_0x008f;
                case 130: goto L_0x008f;
                case 131: goto L_0x008f;
                case 132: goto L_0x008f;
                case 133: goto L_0x008f;
                case 134: goto L_0x008f;
                case 135: goto L_0x008f;
                case 136: goto L_0x008f;
                case 137: goto L_0x008f;
                case 138: goto L_0x008f;
                case 139: goto L_0x008f;
                default: goto L_0x08b1;
            }
        L_0x08b1:
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008f
        L_0x08b9:
            y2 = r13     // Catch:{ all -> 0x08be }
            x2 = r11     // Catch:{ all -> 0x08be }
            goto L_0x08c0
        L_0x08be:
            r0 = move-exception
            goto L_0x08c4
        L_0x08c0:
            monitor-exit(r12)     // Catch:{ all -> 0x08be }
            boolean r0 = y2
            return r0
        L_0x08c4:
            monitor-exit(r12)     // Catch:{ all -> 0x08be }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.z0(java.lang.String):boolean");
    }

    public final void C(float f, float f3) {
        super.C(f, f3);
        bd3 bd3 = this.a2;
        if (bd3 != null) {
            lgf lgf = bd3.q.o;
            lgf.getClass();
            fm9.f(f > 0.0f);
            cgf cgf = lgf.b;
            if (f != cgf.k) {
                cgf.k = f;
                kgf kgf = cgf.b;
                kgf.g = f;
                kgf.k = 0;
                kgf.n = -1;
                kgf.l = -1;
                kgf.d(false);
                return;
            }
            return;
        }
        cgf cgf2 = this.V1;
        if (f != cgf2.k) {
            cgf2.k = f;
            kgf kgf2 = cgf2.b;
            kgf2.g = f;
            kgf2.k = 0;
            kgf2.n = -1;
            kgf2.l = -1;
            kgf2.d(false);
        }
    }

    public final void D0() {
        if (this.j2 > 0) {
            this.Z.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.i2;
            int i = this.j2;
            aab aab = this.S1;
            Handler handler = (Handler) aab.a;
            if (handler != null) {
                handler.post(new ykf(aab, i, j, 1));
            }
            this.j2 = 0;
            this.i2 = elapsedRealtime;
        }
    }

    public final void E0(jlf jlf) {
        if (!jlf.equals(jlf.e) && !jlf.equals(this.q2)) {
            this.q2 = jlf;
            this.S1.q(jlf);
        }
    }

    public final void F0() {
        int i;
        s78 s78;
        if (this.s2 && (i = oaf.a) >= 23 && (s78 = this.W0) != null) {
            this.u2 = new r88(this, s78);
            if (i >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                s78.setParameters(bundle);
            }
        }
    }

    public final s54 G(y78 y78, qy5 qy5, qy5 qy52) {
        s54 b = y78.b(qy5, qy52);
        w3 w3Var = this.X1;
        w3Var.getClass();
        int i = qy52.t;
        int i3 = w3Var.a;
        int i4 = b.e;
        if (i > i3 || qy52.u > w3Var.b) {
            i4 |= 256;
        }
        if (C0(y78, qy52) > w3Var.c) {
            i4 |= 64;
        }
        int i5 = i4;
        return new s54(y78.a, qy5, qy52, i5 != 0 ? 0 : b.d, i5);
    }

    public final void G0() {
        Surface surface = this.d2;
        o2b o2b = this.e2;
        if (surface == o2b) {
            this.d2 = null;
        }
        if (o2b != null) {
            o2b.release();
            this.e2 = null;
        }
    }

    public final MediaCodecDecoderException H(IllegalStateException illegalStateException, y78 y78) {
        Surface surface = this.d2;
        MediaCodecDecoderException mediaCodecDecoderException = new MediaCodecDecoderException(illegalStateException, y78);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecDecoderException;
    }

    public final void H0(s78 s78, int i) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        s78.releaseOutputBuffer(i, true);
        Trace.endSection();
        this.L1.f++;
        boolean z = false;
        this.k2 = 0;
        if (this.a2 == null) {
            E0(this.p2);
            cgf cgf = this.V1;
            if (cgf.e != 3) {
                z = true;
            }
            cgf.e = 3;
            cgf.l.getClass();
            cgf.g = oaf.S(SystemClock.elapsedRealtime());
            if (z && (surface = this.d2) != null) {
                aab aab = this.S1;
                Handler handler = (Handler) aab.a;
                if (handler != null) {
                    handler.post(new tb2((Object) aab, (Object) surface, SystemClock.elapsedRealtime(), 8));
                }
                this.g2 = true;
            }
        }
    }

    public final void I0(s78 s78, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        s78.d(i, j);
        Trace.endSection();
        this.L1.f++;
        boolean z = false;
        this.k2 = 0;
        if (this.a2 == null) {
            E0(this.p2);
            cgf cgf = this.V1;
            if (cgf.e != 3) {
                z = true;
            }
            cgf.e = 3;
            cgf.l.getClass();
            cgf.g = oaf.S(SystemClock.elapsedRealtime());
            if (z && (surface = this.d2) != null) {
                aab aab = this.S1;
                Handler handler = (Handler) aab.a;
                if (handler != null) {
                    handler.post(new tb2((Object) aab, (Object) surface, SystemClock.elapsedRealtime(), 8));
                }
                this.g2 = true;
            }
        }
    }

    public final boolean J0(y78 y78) {
        return oaf.a >= 23 && !this.s2 && !z0(y78.a) && (!y78.f || o2b.a(this.Q1));
    }

    public final void K0(s78 s78, int i) {
        Trace.beginSection("skipVideoBuffer");
        s78.releaseOutputBuffer(i, false);
        Trace.endSection();
        this.L1.g++;
    }

    public final void L0(int i, int i3) {
        n54 n54 = this.L1;
        n54.i += i;
        int i4 = i + i3;
        n54.h += i4;
        this.j2 += i4;
        int i5 = this.k2 + i4;
        this.k2 = i5;
        n54.j = Math.max(i5, n54.j);
        int i6 = this.T1;
        if (i6 > 0 && this.j2 >= i6) {
            D0();
        }
    }

    public final void M0(long j) {
        n54 n54 = this.L1;
        n54.l += j;
        n54.m++;
        this.m2 += j;
        this.n2++;
    }

    public final int Q(p54 p54) {
        return (oaf.a < 34 || !this.s2 || p54.Z >= this.w0) ? 0 : 32;
    }

    public final boolean R() {
        return this.s2 && oaf.a < 23;
    }

    public final float S(float f, qy5[] qy5Arr) {
        float f3 = -1.0f;
        for (qy5 qy5 : qy5Arr) {
            float f4 = qy5.v;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            return -1.0f;
        }
        return f3 * f;
    }

    public final ArrayList T(xw0 xw0, qy5 qy5, boolean z) {
        return p88.h(qy5, B0(this.Q1, xw0, qy5, z, this.s2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0220  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.o78 U(defpackage.y78 r24, defpackage.qy5 r25, android.media.MediaCrypto r26, float r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r3 = r25
            r2 = r27
            o2b r4 = r0.e2
            boolean r5 = r1.f
            if (r4 == 0) goto L_0x0015
            boolean r4 = r4.a
            if (r4 == r5) goto L_0x0015
            r23.G0()
        L_0x0015:
            qy5[] r4 = r0.u0
            r4.getClass()
            int r6 = r3.t
            int r7 = C0(r24, r25)
            int r8 = r4.length
            r9 = 1
            float r11 = r3.v
            int r12 = r3.t
            i63 r13 = r3.A
            int r14 = r3.u
            r15 = -1
            if (r8 != r9) goto L_0x0049
            if (r7 == r15) goto L_0x003e
            int r4 = A0(r24, r25)
            if (r4 == r15) goto L_0x003e
            float r7 = (float) r7
            r8 = 1069547520(0x3fc00000, float:1.5)
            float r7 = r7 * r8
            int r7 = (int) r7
            int r7 = java.lang.Math.min(r7, r4)
        L_0x003e:
            w3 r4 = new w3
            r4.<init>(r6, r14, r7)
            r20 = r5
            r16 = r13
            goto L_0x01aa
        L_0x0049:
            int r8 = r4.length
            r10 = r14
            r9 = 0
            r16 = 0
        L_0x004e:
            if (r9 >= r8) goto L_0x00a3
            r15 = r4[r9]
            r18 = r4
            if (r13 == 0) goto L_0x0065
            i63 r4 = r15.A
            if (r4 != 0) goto L_0x0065
            ny5 r4 = r15.a()
            r4.z = r13
            qy5 r15 = new qy5
            r15.<init>(r4)
        L_0x0065:
            s54 r4 = r1.b(r3, r15)
            int r4 = r4.d
            if (r4 == 0) goto L_0x0094
            int r4 = r15.u
            r19 = r8
            int r8 = r15.t
            r20 = r5
            r5 = -1
            if (r8 == r5) goto L_0x007e
            if (r4 != r5) goto L_0x007b
            goto L_0x007e
        L_0x007b:
            r17 = 0
            goto L_0x0080
        L_0x007e:
            r17 = 1
        L_0x0080:
            r16 = r16 | r17
            int r6 = java.lang.Math.max(r6, r8)
            int r10 = java.lang.Math.max(r10, r4)
            int r4 = C0(r1, r15)
            int r4 = java.lang.Math.max(r7, r4)
            r7 = r4
            goto L_0x0099
        L_0x0094:
            r20 = r5
            r19 = r8
            r5 = -1
        L_0x0099:
            int r9 = r9 + 1
            r15 = r5
            r4 = r18
            r8 = r19
            r5 = r20
            goto L_0x004e
        L_0x00a3:
            r20 = r5
            if (r16 == 0) goto L_0x01a3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Resolutions unknown. Codec max resolution: "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r5 = "x"
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            defpackage.z04.c0(r4)
            if (r14 <= r12) goto L_0x00c4
            r4 = 1
            goto L_0x00c5
        L_0x00c4:
            r4 = 0
        L_0x00c5:
            if (r4 == 0) goto L_0x00c9
            r8 = r14
            goto L_0x00ca
        L_0x00c9:
            r8 = r12
        L_0x00ca:
            if (r4 == 0) goto L_0x00ce
            r9 = r12
            goto L_0x00cf
        L_0x00ce:
            r9 = r14
        L_0x00cf:
            float r15 = (float) r9
            float r2 = (float) r8
            float r15 = r15 / r2
            int[] r2 = w2
            r16 = r13
            r13 = 0
        L_0x00d7:
            r3 = 9
            r17 = 0
            if (r13 >= r3) goto L_0x0166
            r3 = r2[r13]
            r18 = r2
            float r2 = (float) r3
            float r2 = r2 * r15
            int r2 = (int) r2
            if (r3 <= r8) goto L_0x0166
            if (r2 > r9) goto L_0x00ea
            goto L_0x0166
        L_0x00ea:
            r19 = r8
            int r8 = defpackage.oaf.a
            r21 = r9
            r9 = 21
            if (r8 < r9) goto L_0x0134
            if (r4 == 0) goto L_0x00f8
            r8 = r2
            goto L_0x00f9
        L_0x00f8:
            r8 = r3
        L_0x00f9:
            if (r4 == 0) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r3 = r2
        L_0x00fd:
            android.media.MediaCodecInfo$CodecCapabilities r2 = r1.d
            if (r2 != 0) goto L_0x0106
        L_0x0101:
            r22 = r15
            r15 = r17
            goto L_0x0126
        L_0x0106:
            android.media.MediaCodecInfo$VideoCapabilities r2 = r2.getVideoCapabilities()
            if (r2 != 0) goto L_0x010d
            goto L_0x0101
        L_0x010d:
            int r9 = r2.getWidthAlignment()
            int r2 = r2.getHeightAlignment()
            r22 = r15
            android.graphics.Point r15 = new android.graphics.Point
            int r8 = defpackage.oaf.g(r8, r9)
            int r8 = r8 * r9
            int r3 = defpackage.oaf.g(r3, r2)
            int r3 = r3 * r2
            r15.<init>(r8, r3)
        L_0x0126:
            if (r15 == 0) goto L_0x015a
            int r2 = r15.x
            int r3 = r15.y
            double r8 = (double) r11
            boolean r2 = r1.f(r2, r3, r8)
            if (r2 == 0) goto L_0x015a
            goto L_0x0168
        L_0x0134:
            r22 = r15
            r8 = 16
            int r3 = defpackage.oaf.g(r3, r8)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0166 }
            int r3 = r3 * r8
            int r2 = defpackage.oaf.g(r2, r8)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0166 }
            int r2 = r2 * r8
            int r8 = r3 * r2
            int r9 = defpackage.p88.k()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0166 }
            if (r8 > r9) goto L_0x015a
            android.graphics.Point r8 = new android.graphics.Point     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0166 }
            if (r4 == 0) goto L_0x0150
            r9 = r2
            goto L_0x0151
        L_0x0150:
            r9 = r3
        L_0x0151:
            if (r4 == 0) goto L_0x0154
            goto L_0x0155
        L_0x0154:
            r3 = r2
        L_0x0155:
            r8.<init>(r9, r3)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0166 }
            r15 = r8
            goto L_0x0168
        L_0x015a:
            int r13 = r13 + 1
            r2 = r18
            r8 = r19
            r9 = r21
            r15 = r22
            goto L_0x00d7
        L_0x0166:
            r15 = r17
        L_0x0168:
            if (r15 == 0) goto L_0x01a5
            int r2 = r15.x
            int r6 = java.lang.Math.max(r6, r2)
            int r2 = r15.y
            int r10 = java.lang.Math.max(r10, r2)
            ny5 r2 = r25.a()
            r2.s = r6
            r2.t = r10
            qy5 r3 = new qy5
            r3.<init>(r2)
            int r2 = A0(r1, r3)
            int r7 = java.lang.Math.max(r7, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Codec max resolution adjusted to: "
            r2.<init>(r3)
            r2.append(r6)
            r2.append(r5)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            defpackage.z04.c0(r2)
            goto L_0x01a5
        L_0x01a3:
            r16 = r13
        L_0x01a5:
            w3 r4 = new w3
            r4.<init>(r6, r10, r7)
        L_0x01aa:
            r0.X1 = r4
            boolean r2 = r0.s2
            if (r2 == 0) goto L_0x01b3
            int r2 = r0.t2
            goto L_0x01b4
        L_0x01b3:
            r2 = 0
        L_0x01b4:
            android.media.MediaFormat r3 = new android.media.MediaFormat
            r3.<init>()
            java.lang.String r5 = "mime"
            java.lang.String r6 = r1.c
            r3.setString(r5, r6)
            java.lang.String r5 = "width"
            r3.setInteger(r5, r12)
            java.lang.String r5 = "height"
            r3.setInteger(r5, r14)
            r5 = r25
            java.util.List r6 = r5.q
            defpackage.j47.k0(r3, r6)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r7 == 0) goto L_0x01dc
            java.lang.String r7 = "frame-rate"
            r3.setFloat(r7, r11)
        L_0x01dc:
            java.lang.String r7 = "rotation-degrees"
            int r8 = r5.w
            defpackage.j47.X(r3, r7, r8)
            r7 = r16
            defpackage.j47.W(r3, r7)
            java.lang.String r7 = "video/dolby-vision"
            java.lang.String r8 = r5.n
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0205
            android.util.Pair r7 = defpackage.p88.d(r25)
            if (r7 == 0) goto L_0x0205
            java.lang.Object r7 = r7.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.String r8 = "profile"
            defpackage.j47.X(r3, r8, r7)
        L_0x0205:
            int r7 = r4.a
            java.lang.String r8 = "max-width"
            r3.setInteger(r8, r7)
            java.lang.String r7 = "max-height"
            int r8 = r4.b
            r3.setInteger(r7, r8)
            java.lang.String r7 = "max-input-size"
            int r4 = r4.c
            defpackage.j47.X(r3, r7, r4)
            int r4 = defpackage.oaf.a
            r7 = 23
            if (r4 < r7) goto L_0x0231
            java.lang.String r7 = "priority"
            r8 = 0
            r3.setInteger(r7, r8)
            r7 = r27
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0231
            java.lang.String r6 = "operating-rate"
            r3.setFloat(r6, r7)
        L_0x0231:
            boolean r6 = r0.U1
            if (r6 == 0) goto L_0x0242
            java.lang.String r6 = "no-post-process"
            r7 = 1
            r3.setInteger(r6, r7)
            java.lang.String r6 = "auto-frc"
            r8 = 0
            r3.setInteger(r6, r8)
            goto L_0x0243
        L_0x0242:
            r7 = 1
        L_0x0243:
            if (r2 == 0) goto L_0x024f
            java.lang.String r6 = "tunneled-playback"
            r3.setFeatureEnabled(r6, r7)
            java.lang.String r6 = "audio-session-id"
            r3.setInteger(r6, r2)
        L_0x024f:
            r2 = 35
            if (r4 < r2) goto L_0x0260
            int r2 = r0.r2
            int r2 = -r2
            r4 = 0
            int r2 = java.lang.Math.max(r4, r2)
            java.lang.String r4 = "importance"
            r3.setInteger(r4, r2)
        L_0x0260:
            android.view.Surface r2 = r0.d2
            if (r2 != 0) goto L_0x0283
            boolean r2 = r23.J0(r24)
            if (r2 == 0) goto L_0x027d
            o2b r2 = r0.e2
            if (r2 != 0) goto L_0x0278
            android.content.Context r2 = r0.Q1
            r4 = r20
            o2b r2 = defpackage.o2b.b(r2, r4)
            r0.e2 = r2
        L_0x0278:
            o2b r2 = r0.e2
            r0.d2 = r2
            goto L_0x0283
        L_0x027d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0283:
            bd3 r2 = r0.a2
            if (r2 == 0) goto L_0x0295
            android.content.Context r2 = r2.a
            boolean r2 = defpackage.oaf.M(r2)
            if (r2 != 0) goto L_0x0295
            java.lang.String r2 = "allow-frame-drop"
            r4 = 0
            r3.setInteger(r2, r4)
        L_0x0295:
            bd3 r2 = r0.a2
            if (r2 == 0) goto L_0x02c1
            boolean r0 = r2.c()
            defpackage.fm9.k(r0)
            bgf r0 = r2.e
            defpackage.fm9.l(r0)
            rf4 r0 = (defpackage.rf4) r0
            s27 r0 = r0.d
            android.util.SparseArray r0 = r0.g
            r2 = 1
            boolean r4 = defpackage.oaf.l(r0, r2)
            defpackage.fm9.k(r4)
            java.lang.Object r0 = r0.get(r2)
            r27 r0 = (defpackage.r27) r0
            v2 r0 = r0.a
            android.view.Surface r0 = r0.j()
        L_0x02bf:
            r4 = r0
            goto L_0x02c4
        L_0x02c1:
            android.view.Surface r0 = r0.d2
            goto L_0x02bf
        L_0x02c4:
            o78 r6 = new o78
            r0 = r6
            r1 = r24
            r2 = r3
            r3 = r25
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.U(y78, qy5, android.media.MediaCrypto, float):o78");
    }

    public final void V(p54 p54) {
        if (this.Z1) {
            ByteBuffer byteBuffer = p54.s0;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s3 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b != -75 || s != 60 || s3 != 1 || b3 != 4) {
                    return;
                }
                if (b4 == 0 || b4 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    s78 s78 = this.W0;
                    s78.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    s78.setParameters(bundle);
                }
            }
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r11, java.lang.Object r12) {
        /*
            r10 = this;
            cgf r0 = r10.V1
            r1 = 0
            r2 = 1
            if (r11 == r2) goto L_0x00e8
            r3 = 7
            if (r11 == r3) goto L_0x00d7
            r3 = 10
            if (r11 == r3) goto L_0x00bf
            r3 = 16
            if (r11 == r3) goto L_0x0092
            r1 = 4
            if (r11 == r1) goto L_0x007e
            r1 = 5
            if (r11 == r1) goto L_0x0066
            r0 = 13
            if (r11 == r0) goto L_0x0046
            r0 = 14
            if (r11 == r0) goto L_0x0029
            r0 = 11
            if (r11 != r0) goto L_0x0196
            w75 r12 = (defpackage.w75) r12
            r10.R0 = r12
            goto L_0x0196
        L_0x0029:
            r12.getClass()
            lsd r12 = (defpackage.lsd) r12
            int r11 = r12.a
            if (r11 == 0) goto L_0x0196
            int r11 = r12.b
            if (r11 == 0) goto L_0x0196
            r10.f2 = r12
            bd3 r11 = r10.a2
            if (r11 == 0) goto L_0x0196
            android.view.Surface r10 = r10.d2
            defpackage.fm9.l(r10)
            r11.f(r10, r12)
            goto L_0x0196
        L_0x0046:
            r12.getClass()
            java.util.List r12 = (java.util.List) r12
            r10.c2 = r12
            bd3 r10 = r10.a2
            if (r10 == 0) goto L_0x0196
            java.util.ArrayList r11 = r10.c
            boolean r0 = r11.equals(r12)
            if (r0 == 0) goto L_0x005b
            goto L_0x0196
        L_0x005b:
            r11.clear()
            r11.addAll(r12)
            r10.d()
            goto L_0x0196
        L_0x0066:
            r12.getClass()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r10 = r12.intValue()
            kgf r11 = r0.b
            int r12 = r11.h
            if (r12 != r10) goto L_0x0077
            goto L_0x0196
        L_0x0077:
            r11.h = r10
            r11.d(r2)
            goto L_0x0196
        L_0x007e:
            r12.getClass()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r10.h2 = r11
            s78 r10 = r10.W0
            if (r10 == 0) goto L_0x0196
            r10.h(r11)
            goto L_0x0196
        L_0x0092:
            r12.getClass()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r10.r2 = r11
            s78 r11 = r10.W0
            if (r11 != 0) goto L_0x00a3
            goto L_0x0196
        L_0x00a3:
            int r12 = defpackage.oaf.a
            r0 = 35
            if (r12 < r0) goto L_0x0196
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            int r10 = r10.r2
            int r10 = -r10
            int r10 = java.lang.Math.max(r1, r10)
            java.lang.String r0 = "importance"
            r12.putInt(r0, r10)
            r11.setParameters(r12)
            goto L_0x0196
        L_0x00bf:
            r12.getClass()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            int r12 = r10.t2
            if (r12 == r11) goto L_0x0196
            r10.t2 = r11
            boolean r11 = r10.s2
            if (r11 == 0) goto L_0x0196
            r10.n0()
            goto L_0x0196
        L_0x00d7:
            r12.getClass()
            q75 r12 = (defpackage.q75) r12
            r10.v2 = r12
            bd3 r10 = r10.a2
            if (r10 == 0) goto L_0x0196
            cd3 r10 = r10.q
            r10.t0 = r12
            goto L_0x0196
        L_0x00e8:
            boolean r11 = r12 instanceof android.view.Surface
            r3 = 0
            if (r11 == 0) goto L_0x00f0
            android.view.Surface r12 = (android.view.Surface) r12
            goto L_0x00f1
        L_0x00f0:
            r12 = r3
        L_0x00f1:
            if (r12 != 0) goto L_0x010d
            o2b r11 = r10.e2
            if (r11 == 0) goto L_0x00f9
            r12 = r11
            goto L_0x010d
        L_0x00f9:
            y78 r11 = r10.d1
            if (r11 == 0) goto L_0x010d
            boolean r4 = r10.J0(r11)
            if (r4 == 0) goto L_0x010d
            android.content.Context r12 = r10.Q1
            boolean r11 = r11.f
            o2b r12 = defpackage.o2b.b(r12, r11)
            r10.e2 = r12
        L_0x010d:
            android.view.Surface r11 = r10.d2
            aab r5 = r10.S1
            if (r11 == r12) goto L_0x016c
            r10.d2 = r12
            bd3 r11 = r10.a2
            if (r11 != 0) goto L_0x011c
            r0.h(r12)
        L_0x011c:
            r10.g2 = r1
            int r11 = r10.s0
            s78 r1 = r10.W0
            if (r1 == 0) goto L_0x013e
            bd3 r4 = r10.a2
            if (r4 != 0) goto L_0x013e
            int r4 = defpackage.oaf.a
            r6 = 23
            if (r4 < r6) goto L_0x0138
            if (r12 == 0) goto L_0x0138
            boolean r4 = r10.Y1
            if (r4 != 0) goto L_0x0138
            r1.j(r12)
            goto L_0x013e
        L_0x0138:
            r10.n0()
            r10.Y()
        L_0x013e:
            if (r12 == 0) goto L_0x0152
            o2b r1 = r10.e2
            if (r12 == r1) goto L_0x0152
            jlf r12 = r10.q2
            if (r12 == 0) goto L_0x014b
            r5.q(r12)
        L_0x014b:
            r12 = 2
            if (r11 != r12) goto L_0x0168
            r0.c(r2)
            goto L_0x0168
        L_0x0152:
            r10.q2 = r3
            bd3 r11 = r10.a2
            if (r11 == 0) goto L_0x0168
            cd3 r11 = r11.q
            r11.getClass()
            lsd r12 = defpackage.lsd.c
            int r0 = r12.a
            int r12 = r12.b
            r11.a(r3, r0, r12)
            r11.w0 = r3
        L_0x0168:
            r10.F0()
            goto L_0x0196
        L_0x016c:
            if (r12 == 0) goto L_0x0196
            o2b r11 = r10.e2
            if (r12 == r11) goto L_0x0196
            jlf r11 = r10.q2
            if (r11 == 0) goto L_0x0179
            r5.q(r11)
        L_0x0179:
            android.view.Surface r6 = r10.d2
            if (r6 == 0) goto L_0x0196
            boolean r10 = r10.g2
            if (r10 == 0) goto L_0x0196
            java.lang.Object r10 = r5.a
            android.os.Handler r10 = (android.os.Handler) r10
            if (r10 == 0) goto L_0x0196
            long r7 = android.os.SystemClock.elapsedRealtime()
            tb2 r11 = new tb2
            r9 = 8
            r4 = r11
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (long) r7, (int) r9)
            r10.post(r11)
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.a(int, java.lang.Object):void");
    }

    public final void a0(Exception exc) {
        z04.v("Video codec error", exc);
        aab aab = this.S1;
        Handler handler = (Handler) aab.a;
        if (handler != null) {
            handler.post(new fre(aab, 15, exc));
        }
    }

    public final void b0(long j, String str, long j3) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        aab aab = this.S1;
        Handler handler = (Handler) aab.a;
        if (handler != null) {
            handler.post(new v60(aab, str, j, j3, 3));
        }
        this.Y1 = z0(str);
        y78 y78 = this.d1;
        y78.getClass();
        boolean z = false;
        if (oaf.a >= 29 && "video/x-vnd.on2.vp9".equals(y78.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = y78.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.Z1 = z;
        F0();
    }

    public final void c0(String str) {
        aab aab = this.S1;
        Handler handler = (Handler) aab.a;
        if (handler != null) {
            handler.post(new fre(aab, 16, str));
        }
    }

    public final s54 d0(y7g y7g) {
        s54 d0 = super.d0(y7g);
        qy5 qy5 = (qy5) y7g.c;
        qy5.getClass();
        aab aab = this.S1;
        Handler handler = (Handler) aab.a;
        if (handler != null) {
            handler.post(new ewc(aab, qy5, d0, 14));
        }
        return d0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
        if (r9.a2 == null) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e0(defpackage.qy5 r10, android.media.MediaFormat r11) {
        /*
            r9 = this;
            s78 r0 = r9.W0
            if (r0 == 0) goto L_0x0009
            int r1 = r9.h2
            r0.h(r1)
        L_0x0009:
            boolean r0 = r9.s2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0014
            int r11 = r10.t
            int r0 = r10.u
            goto L_0x0064
        L_0x0014:
            r11.getClass()
            java.lang.String r0 = "crop-right"
            boolean r3 = r11.containsKey(r0)
            java.lang.String r4 = "crop-top"
            java.lang.String r5 = "crop-bottom"
            java.lang.String r6 = "crop-left"
            if (r3 == 0) goto L_0x0039
            boolean r3 = r11.containsKey(r6)
            if (r3 == 0) goto L_0x0039
            boolean r3 = r11.containsKey(r5)
            if (r3 == 0) goto L_0x0039
            boolean r3 = r11.containsKey(r4)
            if (r3 == 0) goto L_0x0039
            r3 = r2
            goto L_0x003a
        L_0x0039:
            r3 = r1
        L_0x003a:
            if (r3 == 0) goto L_0x0047
            int r0 = r11.getInteger(r0)
            int r6 = r11.getInteger(r6)
            int r0 = r0 - r6
            int r0 = r0 + r2
            goto L_0x004d
        L_0x0047:
            java.lang.String r0 = "width"
            int r0 = r11.getInteger(r0)
        L_0x004d:
            if (r3 == 0) goto L_0x005b
            int r3 = r11.getInteger(r5)
            int r11 = r11.getInteger(r4)
            int r3 = r3 - r11
            int r3 = r3 + r2
            r11 = r3
            goto L_0x0061
        L_0x005b:
            java.lang.String r3 = "height"
            int r11 = r11.getInteger(r3)
        L_0x0061:
            r8 = r0
            r0 = r11
            r11 = r8
        L_0x0064:
            float r3 = r10.x
            int r4 = defpackage.oaf.a
            r5 = 21
            int r6 = r10.w
            if (r4 < r5) goto L_0x007f
            r7 = 90
            if (r6 == r7) goto L_0x0076
            r7 = 270(0x10e, float:3.78E-43)
            if (r6 != r7) goto L_0x0084
        L_0x0076:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = r6 / r3
            r6 = r1
            r8 = r0
            r0 = r11
            r11 = r8
            goto L_0x0085
        L_0x007f:
            bd3 r7 = r9.a2
            if (r7 != 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r6 = r1
        L_0x0085:
            jlf r7 = new jlf
            r7.<init>(r3, r11, r0, r6)
            r9.p2 = r7
            bd3 r7 = r9.a2
            if (r7 == 0) goto L_0x013f
            ny5 r9 = r10.a()
            r9.s = r11
            r9.t = r0
            r9.v = r6
            r9.w = r3
            qy5 r9 = r9.a()
            boolean r10 = r7.c()
            defpackage.fm9.k(r10)
            cd3 r10 = r7.q
            cgf r10 = r10.c
            float r11 = r9.v
            r10.g(r11)
            r10 = 0
            if (r4 >= r5) goto L_0x0119
            r11 = -1
            int r0 = r9.w
            if (r0 == r11) goto L_0x0119
            if (r0 == 0) goto L_0x0119
            z18 r11 = r7.d
            if (r11 == 0) goto L_0x00c6
            qy5 r11 = r7.f
            if (r11 == 0) goto L_0x00c6
            int r11 = r11.w
            if (r11 == r0) goto L_0x011b
        L_0x00c6:
            float r11 = (float) r0
            java.lang.reflect.Constructor r0 = defpackage.kq0.i     // Catch:{ Exception -> 0x0112 }
            if (r0 == 0) goto L_0x00d3
            java.lang.reflect.Method r0 = defpackage.kq0.j     // Catch:{ Exception -> 0x0112 }
            if (r0 == 0) goto L_0x00d3
            java.lang.reflect.Method r0 = defpackage.kq0.k     // Catch:{ Exception -> 0x0112 }
            if (r0 != 0) goto L_0x00f1
        L_0x00d3:
            java.lang.Class<nsc> r0 = defpackage.nsc.class
            java.lang.reflect.Constructor r3 = r0.getConstructor(r10)     // Catch:{ Exception -> 0x0112 }
            defpackage.kq0.i = r3     // Catch:{ Exception -> 0x0112 }
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x0112 }
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch:{ Exception -> 0x0112 }
            java.lang.String r4 = "setRotationDegrees"
            java.lang.reflect.Method r3 = r0.getMethod(r4, r3)     // Catch:{ Exception -> 0x0112 }
            defpackage.kq0.j = r3     // Catch:{ Exception -> 0x0112 }
            java.lang.String r3 = "build"
            java.lang.reflect.Method r0 = r0.getMethod(r3, r10)     // Catch:{ Exception -> 0x0112 }
            defpackage.kq0.k = r0     // Catch:{ Exception -> 0x0112 }
        L_0x00f1:
            java.lang.reflect.Constructor r0 = defpackage.kq0.i     // Catch:{ Exception -> 0x0112 }
            java.lang.Object r0 = r0.newInstance(r10)     // Catch:{ Exception -> 0x0112 }
            java.lang.reflect.Method r3 = defpackage.kq0.j     // Catch:{ Exception -> 0x0112 }
            java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch:{ Exception -> 0x0112 }
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch:{ Exception -> 0x0112 }
            r3.invoke(r0, r11)     // Catch:{ Exception -> 0x0112 }
            java.lang.reflect.Method r11 = defpackage.kq0.k     // Catch:{ Exception -> 0x0112 }
            java.lang.Object r10 = r11.invoke(r0, r10)     // Catch:{ Exception -> 0x0112 }
            r10.getClass()     // Catch:{ Exception -> 0x0112 }
            z18 r10 = (defpackage.z18) r10     // Catch:{ Exception -> 0x0112 }
            r7.d = r10
            goto L_0x011b
        L_0x0112:
            r9 = move-exception
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r9)
            throw r10
        L_0x0119:
            r7.d = r10
        L_0x011b:
            r7.g = r2
            r7.f = r9
            boolean r9 = r7.m
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 != 0) goto L_0x0130
            r7.d()
            r7.m = r2
            r7.n = r10
            goto L_0x0146
        L_0x0130:
            long r3 = r7.l
            int r9 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0137
            r1 = r2
        L_0x0137:
            defpackage.fm9.k(r1)
            long r9 = r7.l
            r7.n = r9
            goto L_0x0146
        L_0x013f:
            cgf r9 = r9.V1
            float r10 = r10.v
            r9.g(r10)
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.e0(qy5, android.media.MediaFormat):void");
    }

    public final void g() {
        bd3 bd3 = this.a2;
        if (bd3 != null) {
            cgf cgf = bd3.q.c;
            if (cgf.e == 0) {
                cgf.e = 1;
                return;
            }
            return;
        }
        cgf cgf2 = this.V1;
        if (cgf2.e == 0) {
            cgf2.e = 1;
        }
    }

    public final void g0(long j) {
        super.g0(j);
        if (!this.s2) {
            this.l2--;
        }
    }

    public final void h0() {
        bd3 bd3 = this.a2;
        if (bd3 != null) {
            long j = this.M1.c;
            bd3.j |= (bd3.h == j && bd3.i == 0) ? false : true;
            bd3.h = j;
            bd3.i = 0;
        } else {
            this.V1.d(2);
        }
        F0();
    }

    public final void i0(p54 p54) {
        Surface surface;
        boolean z = this.s2;
        if (!z) {
            this.l2++;
        }
        if (oaf.a < 23 && z) {
            long j = p54.Z;
            y0(j);
            E0(this.p2);
            this.L1.f++;
            cgf cgf = this.V1;
            boolean z2 = cgf.e != 3;
            cgf.e = 3;
            cgf.l.getClass();
            cgf.g = oaf.S(SystemClock.elapsedRealtime());
            if (z2 && (surface = this.d2) != null) {
                aab aab = this.S1;
                Handler handler = (Handler) aab.a;
                if (handler != null) {
                    handler.post(new tb2((Object) aab, (Object) surface, SystemClock.elapsedRealtime(), 8));
                }
                this.g2 = true;
            }
            g0(j);
        }
    }

    public final void j0(qy5 qy5) {
        bd3 bd3 = this.a2;
        if (bd3 != null && !bd3.c()) {
            try {
                this.a2.b(qy5);
            } catch (VideoSink$VideoSinkException e) {
                throw e(e, qy5, false, 7000);
            }
        }
    }

    public final String k() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l0(long r17, long r19, defpackage.s78 r21, java.nio.ByteBuffer r22, int r23, int r24, int r25, long r26, boolean r28, boolean r29, defpackage.qy5 r30) {
        /*
            r16 = this;
            r1 = r16
            r0 = r21
            r2 = r23
            r21.getClass()
            e88 r3 = r1.M1
            long r4 = r3.c
            long r14 = r26 - r4
            l7 r13 = r1.W1
            cgf r4 = r1.V1
            long r10 = r3.b
            r3 = r4
            r4 = r26
            r6 = r17
            r8 = r19
            r12 = r29
            int r3 = r3.a(r4, r6, r8, r10, r12, r13)
            r4 = 4
            r5 = 0
            if (r3 != r4) goto L_0x0027
            return r5
        L_0x0027:
            r4 = 1
            if (r28 == 0) goto L_0x0030
            if (r29 != 0) goto L_0x0030
            r1.K0(r0, r2)
            return r4
        L_0x0030:
            android.view.Surface r6 = r1.d2
            o2b r7 = r1.e2
            r8 = 30000(0x7530, double:1.4822E-319)
            l7 r10 = r1.W1
            if (r6 != r7) goto L_0x004e
            bd3 r6 = r1.a2
            if (r6 != 0) goto L_0x004e
            long r6 = r10.b
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x004d
            r1.K0(r0, r2)
            long r2 = r10.b
            r1.M0(r2)
            return r4
        L_0x004d:
            return r5
        L_0x004e:
            bd3 r6 = r1.a2
            r7 = 21
            if (r6 == 0) goto L_0x00fd
            r8 = r17
            r11 = r19
            r6.e(r8, r11)     // Catch:{ VideoSink$VideoSinkException -> 0x00f2 }
            bd3 r3 = r1.a2
            boolean r6 = r3.c()
            defpackage.fm9.k(r6)
            r6 = -1
            int r8 = r3.b
            if (r8 == r6) goto L_0x006b
            r6 = r4
            goto L_0x006c
        L_0x006b:
            r6 = r5
        L_0x006c:
            defpackage.fm9.k(r6)
            long r9 = r3.n
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            cd3 r13 = r3.q
            if (r6 == 0) goto L_0x0095
            int r6 = r13.x0
            if (r6 != 0) goto L_0x0092
            lgf r6 = r13.o
            long r14 = r6.j
            int r6 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0092
            int r6 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x0092
            r3.d()
            r3.n = r11
            goto L_0x0095
        L_0x0092:
            r8 = r11
            r10 = r8
            goto L_0x00e1
        L_0x0095:
            bgf r6 = r3.e
            defpackage.fm9.l(r6)
            rf4 r6 = (defpackage.rf4) r6
            s27 r6 = r6.d
            v2 r6 = r6.k
            if (r6 == 0) goto L_0x00a7
            int r6 = r6.k()
            goto L_0x00a8
        L_0x00a7:
            r6 = r5
        L_0x00a8:
            if (r6 < r8) goto L_0x00ab
            goto L_0x0092
        L_0x00ab:
            bgf r6 = r3.e
            defpackage.fm9.l(r6)
            rf4 r6 = (defpackage.rf4) r6
            boolean r6 = r6.b()
            if (r6 != 0) goto L_0x00b9
            goto L_0x0092
        L_0x00b9:
            long r8 = r3.i
            long r14 = r26 - r8
            boolean r6 = r3.j
            if (r6 == 0) goto L_0x00d2
            long r11 = r3.h
            r13.z0 = r8
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            lgf r8 = r13.o
            due r8 = r8.e
            r8.a(r14, r6)
            r3.j = r5
        L_0x00d2:
            r3.l = r14
            if (r29 == 0) goto L_0x00d8
            r3.k = r14
        L_0x00d8:
            r8 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r26
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e1:
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00e6
            return r5
        L_0x00e6:
            int r3 = defpackage.oaf.a
            if (r3 < r7) goto L_0x00ee
            r1.I0(r0, r2, r8)
            goto L_0x00f1
        L_0x00ee:
            r1.H0(r0, r2)
        L_0x00f1:
            return r4
        L_0x00f2:
            r0 = move-exception
            r2 = r0
            qy5 r0 = r2.a
            r3 = 7001(0x1b59, float:9.81E-42)
            androidx.media3.exoplayer.ExoPlaybackException r0 = r1.e(r2, r0, r5, r3)
            throw r0
        L_0x00fd:
            if (r3 == 0) goto L_0x0183
            if (r3 == r4) goto L_0x0132
            r6 = 2
            if (r3 == r6) goto L_0x011e
            r6 = 3
            if (r3 == r6) goto L_0x0115
            r0 = 5
            if (r3 != r0) goto L_0x010b
            return r5
        L_0x010b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r0.<init>(r1)
            throw r0
        L_0x0115:
            r1.K0(r0, r2)
            long r2 = r10.b
            r1.M0(r2)
            return r4
        L_0x011e:
            java.lang.String r3 = "dropVideoBuffer"
            android.os.Trace.beginSection(r3)
            r0.releaseOutputBuffer(r2, r5)
            android.os.Trace.endSection()
            r1.L0(r5, r4)
            long r2 = r10.b
            r1.M0(r2)
            return r4
        L_0x0132:
            long r8 = r10.c
            long r10 = r10.b
            int r3 = defpackage.oaf.a
            if (r3 < r7) goto L_0x0155
            long r5 = r1.o2
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0144
            r1.K0(r0, r2)
            goto L_0x014e
        L_0x0144:
            q75 r3 = r1.v2
            if (r3 == 0) goto L_0x014b
            r3.d(r14, r8)
        L_0x014b:
            r1.I0(r0, r2, r8)
        L_0x014e:
            r1.M0(r10)
            r1.o2 = r8
        L_0x0153:
            r5 = r4
            goto L_0x0182
        L_0x0155:
            r6 = 30000(0x7530, double:1.4822E-319)
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0182
            r6 = 11000(0x2af8, double:5.4347E-320)
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0174
            r6 = 10000(0x2710, double:4.9407E-320)
            long r6 = r10 - r6
            r12 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r12
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x016c }
            goto L_0x0174
        L_0x016c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0182
        L_0x0174:
            q75 r3 = r1.v2
            if (r3 == 0) goto L_0x017b
            r3.d(r14, r8)
        L_0x017b:
            r1.H0(r0, r2)
            r1.M0(r10)
            goto L_0x0153
        L_0x0182:
            return r5
        L_0x0183:
            she r3 = r1.Z
            r3.getClass()
            long r5 = java.lang.System.nanoTime()
            q75 r3 = r1.v2
            if (r3 == 0) goto L_0x0193
            r3.d(r14, r5)
        L_0x0193:
            int r3 = defpackage.oaf.a
            if (r3 < r7) goto L_0x019b
            r1.I0(r0, r2, r5)
            goto L_0x019e
        L_0x019b:
            r1.H0(r0, r2)
        L_0x019e:
            long r2 = r10.b
            r1.M0(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.l0(long, long, s78, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, qy5):boolean");
    }

    public final boolean m() {
        if (this.H1) {
            bd3 bd3 = this.a2;
            if (bd3 != null) {
                if (bd3.c()) {
                    long j = bd3.k;
                    if (j != -9223372036854775807L) {
                        cd3 cd3 = bd3.q;
                        if (cd3.x0 == 0) {
                            long j3 = cd3.o.j;
                            if (j3 == -9223372036854775807L || j3 < j) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0.o.b.b(true) != false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o() {
        /*
            r4 = this;
            boolean r0 = super.o()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            bd3 r0 = r4.a2
            if (r0 == 0) goto L_0x0021
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x0023
            cd3 r0 = r0.q
            int r2 = r0.x0
            if (r2 != 0) goto L_0x0023
            lgf r0 = r0.o
            cgf r0 = r0.b
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L_0x0023
        L_0x0021:
            r0 = r1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0037
            o2b r2 = r4.e2
            if (r2 == 0) goto L_0x002e
            android.view.Surface r3 = r4.d2
            if (r3 == r2) goto L_0x0036
        L_0x002e:
            s78 r2 = r4.W0
            if (r2 == 0) goto L_0x0036
            boolean r2 = r4.s2
            if (r2 == 0) goto L_0x0037
        L_0x0036:
            return r1
        L_0x0037:
            cgf r4 = r4.V1
            boolean r4 = r4.b(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.o():boolean");
    }

    public final void p() {
        aab aab = this.S1;
        this.q2 = null;
        bd3 bd3 = this.a2;
        if (bd3 != null) {
            bd3.q.c.d(0);
        } else {
            this.V1.d(0);
        }
        F0();
        this.g2 = false;
        this.u2 = null;
        try {
            super.p();
            n54 n54 = this.L1;
            aab.getClass();
            synchronized (n54) {
            }
            Handler handler = (Handler) aab.a;
            if (handler != null) {
                handler.post(new alf(aab, n54, 1));
            }
            aab.q(jlf.e);
        } catch (Throwable th) {
            n54 n542 = this.L1;
            aab.getClass();
            synchronized (n542) {
                Handler handler2 = (Handler) aab.a;
                if (handler2 != null) {
                    handler2.post(new alf(aab, n542, 1));
                }
                aab.q(jlf.e);
                throw th;
            }
        }
    }

    public final void p0() {
        super.p0();
        this.l2 = 0;
    }

    /* JADX WARNING: type inference failed for: r7v20, types: [od, java.lang.Object] */
    public final void q(boolean z, boolean z2) {
        this.L1 = new n54(1);
        lgc lgc = this.o;
        lgc.getClass();
        boolean z3 = true;
        boolean z4 = lgc.b;
        fm9.k(!z4 || this.t2 != 0);
        if (this.s2 != z4) {
            this.s2 = z4;
            n0();
        }
        n54 n54 = this.L1;
        aab aab = this.S1;
        Handler handler = (Handler) aab.a;
        if (handler != null) {
            handler.post(new alf(aab, n54, 0));
        }
        boolean z5 = this.b2;
        cgf cgf = this.V1;
        if (!z5) {
            if ((this.c2 != null || !this.R1) && this.a2 == null) {
                Context context = this.Q1;
                ? obj = new Object();
                obj.b = context.getApplicationContext();
                obj.c = cgf;
                obj.Y = she.a;
                she she = this.Z;
                she.getClass();
                obj.Y = she;
                fm9.k(!obj.a);
                if (((zc3) obj.X) == null) {
                    if (((yc3) obj.o) == null) {
                        obj.o = new Object();
                    }
                    obj.X = new zc3((yc3) obj.o);
                }
                cd3 cd3 = new cd3(obj);
                obj.a = true;
                this.a2 = cd3.b;
            }
            this.b2 = true;
        }
        bd3 bd3 = this.a2;
        if (bd3 != null) {
            rxd rxd = new rxd(21, this);
            nk4 nk4 = nk4.a;
            bd3.o = rxd;
            bd3.p = nk4;
            q75 q75 = this.v2;
            if (q75 != null) {
                bd3.q.t0 = q75;
            }
            if (this.d2 != null && !this.f2.equals(lsd.c)) {
                this.a2.f(this.d2, this.f2);
            }
            bd3 bd32 = this.a2;
            float f = this.U0;
            lgf lgf = bd32.q.o;
            lgf.getClass();
            if (f <= 0.0f) {
                z3 = false;
            }
            fm9.f(z3);
            cgf cgf2 = lgf.b;
            if (f != cgf2.k) {
                cgf2.k = f;
                kgf kgf = cgf2.b;
                kgf.g = f;
                kgf.k = 0;
                kgf.n = -1;
                kgf.l = -1;
                kgf.d(false);
            }
            List list = this.c2;
            if (list != null) {
                bd3 bd33 = this.a2;
                ArrayList arrayList = bd33.c;
                if (!arrayList.equals(list)) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    bd33.d();
                }
            }
            this.a2.q.c.e = z2;
            return;
        }
        she she2 = this.Z;
        she2.getClass();
        cgf.l = she2;
        cgf.e = z2 ? 1 : 0;
    }

    public final void r(long j, boolean z) {
        bd3 bd3 = this.a2;
        if (bd3 != null) {
            bd3.a(true);
            bd3 bd32 = this.a2;
            long j3 = this.M1.c;
            bd32.j |= (bd32.h == j3 && bd32.i == 0) ? false : true;
            bd32.h = j3;
            bd32.i = 0;
        }
        super.r(j, z);
        bd3 bd33 = this.a2;
        cgf cgf = this.V1;
        if (bd33 == null) {
            kgf kgf = cgf.b;
            kgf.k = 0;
            kgf.n = -1;
            kgf.l = -1;
            cgf.h = -9223372036854775807L;
            cgf.f = -9223372036854775807L;
            cgf.d(1);
            cgf.i = -9223372036854775807L;
        }
        if (z) {
            cgf.c(false);
        }
        F0();
        this.k2 = 0;
    }

    public final void s() {
        bd3 bd3 = this.a2;
        if (bd3 != null && this.R1) {
            cd3 cd3 = bd3.q;
            if (cd3.y0 != 2) {
                bie bie = cd3.u0;
                if (bie != null) {
                    bie.a.removeCallbacksAndMessages((Object) null);
                }
                s8b s8b = cd3.v0;
                if (s8b != null) {
                    s8b.release();
                }
                cd3.w0 = null;
                cd3.y0 = 2;
            }
        }
    }

    public final boolean t0(y78 y78) {
        return this.d2 != null || J0(y78);
    }

    public final void u() {
        try {
            J();
            n0();
            fr4 fr4 = this.Q0;
            if (fr4 != null) {
                fr4.f((lr4) null);
            }
            this.Q0 = null;
            this.b2 = false;
            if (this.e2 != null) {
                G0();
            }
        } catch (Throwable th) {
            this.b2 = false;
            if (this.e2 != null) {
                G0();
            }
            throw th;
        }
    }

    public final void v() {
        this.j2 = 0;
        this.Z.getClass();
        this.i2 = SystemClock.elapsedRealtime();
        this.m2 = 0;
        this.n2 = 0;
        bd3 bd3 = this.a2;
        if (bd3 != null) {
            bd3.q.c.e();
        } else {
            this.V1.e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v0(defpackage.xw0 r11, defpackage.qy5 r12) {
        /*
            r10 = this;
            java.lang.String r0 = r12.n
            boolean r0 = defpackage.ia9.k(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            int r10 = defpackage.vj0.b(r1, r1, r1, r1)
            return r10
        L_0x000e:
            dr4 r0 = r12.r
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            android.content.Context r10 = r10.Q1
            java.util.List r3 = B0(r10, r11, r12, r0, r1)
            if (r0 == 0) goto L_0x0028
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0028
            java.util.List r3 = B0(r10, r11, r12, r1, r1)
        L_0x0028:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0033
            int r10 = defpackage.vj0.b(r2, r1, r1, r1)
            return r10
        L_0x0033:
            int r4 = r12.K
            if (r4 == 0) goto L_0x0040
            r5 = 2
            if (r4 != r5) goto L_0x003b
            goto L_0x0040
        L_0x003b:
            int r10 = defpackage.vj0.b(r5, r1, r1, r1)
            return r10
        L_0x0040:
            java.lang.Object r4 = r3.get(r1)
            y78 r4 = (defpackage.y78) r4
            boolean r5 = r4.d(r12)
            if (r5 != 0) goto L_0x0066
            r6 = r2
        L_0x004d:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0066
            java.lang.Object r7 = r3.get(r6)
            y78 r7 = (defpackage.y78) r7
            boolean r8 = r7.d(r12)
            if (r8 == 0) goto L_0x0063
            r3 = r1
            r5 = r2
            r4 = r7
            goto L_0x0067
        L_0x0063:
            int r6 = r6 + 1
            goto L_0x004d
        L_0x0066:
            r3 = r2
        L_0x0067:
            if (r5 == 0) goto L_0x006b
            r6 = 4
            goto L_0x006c
        L_0x006b:
            r6 = 3
        L_0x006c:
            boolean r7 = r4.e(r12)
            if (r7 == 0) goto L_0x0075
            r7 = 16
            goto L_0x0077
        L_0x0075:
            r7 = 8
        L_0x0077:
            boolean r4 = r4.g
            if (r4 == 0) goto L_0x007e
            r4 = 64
            goto L_0x007f
        L_0x007e:
            r4 = r1
        L_0x007f:
            if (r3 == 0) goto L_0x0084
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0085
        L_0x0084:
            r3 = r1
        L_0x0085:
            int r8 = defpackage.oaf.a
            r9 = 26
            if (r8 < r9) goto L_0x009d
            java.lang.String r8 = "video/dolby-vision"
            java.lang.String r9 = r12.n
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x009d
            boolean r8 = defpackage.q88.a(r10)
            if (r8 != 0) goto L_0x009d
            r3 = 256(0x100, float:3.59E-43)
        L_0x009d:
            if (r5 == 0) goto L_0x00c1
            java.util.List r10 = B0(r10, r11, r12, r0, r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00c1
            java.util.ArrayList r10 = defpackage.p88.h(r12, r10)
            java.lang.Object r10 = r10.get(r1)
            y78 r10 = (defpackage.y78) r10
            boolean r11 = r10.d(r12)
            if (r11 == 0) goto L_0x00c1
            boolean r10 = r10.e(r12)
            if (r10 == 0) goto L_0x00c1
            r1 = 32
        L_0x00c1:
            r10 = r6 | r7
            r10 = r10 | r1
            r10 = r10 | r4
            r10 = r10 | r3
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.v0(xw0, qy5):int");
    }

    public final void w() {
        D0();
        int i = this.n2;
        if (i != 0) {
            long j = this.m2;
            aab aab = this.S1;
            Handler handler = (Handler) aab.a;
            if (handler != null) {
                handler.post(new ule(aab, j, i, 14));
            }
            this.m2 = 0;
            this.n2 = 0;
        }
        bd3 bd3 = this.a2;
        if (bd3 != null) {
            bd3.q.c.f();
        } else {
            this.V1.f();
        }
    }

    public final void z(long j, long j3) {
        super.z(j, j3);
        bd3 bd3 = this.a2;
        if (bd3 != null) {
            try {
                bd3.e(j, j3);
            } catch (VideoSink$VideoSinkException e) {
                throw e(e, e.a, false, 7001);
            }
        }
    }
}
