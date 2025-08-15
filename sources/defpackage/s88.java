package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: s88  reason: default package */
public final class s88 extends f88 {
    public static boolean A2;
    public static boolean B2;
    public static final int[] z2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final Context Q1;
    public final kgf R1;
    public final wva S1;
    public final long T1;
    public final int U1 = 50;
    public final boolean V1;
    public w3 W1;
    public boolean X1;
    public boolean Y1;
    public Surface Z1;
    public ct4 a2;
    public boolean b2;
    public int c2;
    public boolean d2;
    public boolean e2;
    public boolean f2;
    public long g2;
    public long h2;
    public long i2;
    public int j2;
    public int k2;
    public int l2;
    public long m2;
    public long n2;
    public long o2;
    public int p2;
    public int q2;
    public int r2;
    public int s2;
    public float t2;
    public ilf u2;
    public boolean v2;
    public int w2;
    public r88 x2;
    public tff y2;

    public s88(Context context, p78 p78, xw0 xw0, long j, Handler handler, n75 n75) {
        super(2, p78, xw0, 30.0f);
        this.T1 = j;
        Context applicationContext = context.getApplicationContext();
        this.Q1 = applicationContext;
        this.R1 = new kgf(applicationContext, 0);
        this.S1 = new wva(handler, 14, n75);
        this.V1 = "NVIDIA".equals(maf.c);
        this.h2 = -9223372036854775807L;
        this.q2 = -1;
        this.r2 = -1;
        this.t2 = -1.0f;
        this.c2 = 1;
        this.w2 = 0;
        this.u2 = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x06d7, code lost:
        if (r12.equals("A10-70L") == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x084d, code lost:
        if (r0.equals("AFTN") == false) goto L_0x0845;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean s0(java.lang.String r15) {
        /*
            r0 = 26
            r1 = 27
            r2 = 7
            r3 = 6
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 28
            r8 = 2
            r9 = -1
            r10 = 1
            java.lang.String r11 = "OMX.google"
            boolean r15 = r15.startsWith(r11)
            r11 = 0
            if (r15 == 0) goto L_0x0018
            return r11
        L_0x0018:
            java.lang.Class<s88> r15 = defpackage.s88.class
            monitor-enter(r15)
            boolean r12 = A2     // Catch:{ all -> 0x086d }
            if (r12 != 0) goto L_0x086f
            int r12 = defpackage.maf.a     // Catch:{ all -> 0x086d }
            if (r12 > r7) goto L_0x0090
            java.lang.String r13 = defpackage.maf.b     // Catch:{ all -> 0x086d }
            r13.getClass()     // Catch:{ all -> 0x086d }
            int r14 = r13.hashCode()
            switch(r14) {
                case -1339091551: goto L_0x007f;
                case -1220081023: goto L_0x0074;
                case -1220066608: goto L_0x0069;
                case -1012436106: goto L_0x005e;
                case -760312546: goto L_0x0053;
                case -64886864: goto L_0x0048;
                case 3415681: goto L_0x003d;
                case 825323514: goto L_0x0032;
                default: goto L_0x002f;
            }
        L_0x002f:
            r13 = r9
            goto L_0x0089
        L_0x0032:
            java.lang.String r14 = "machuca"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x003b
            goto L_0x002f
        L_0x003b:
            r13 = r2
            goto L_0x0089
        L_0x003d:
            java.lang.String r14 = "once"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0046
            goto L_0x002f
        L_0x0046:
            r13 = r3
            goto L_0x0089
        L_0x0048:
            java.lang.String r14 = "magnolia"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0051
            goto L_0x002f
        L_0x0051:
            r13 = r4
            goto L_0x0089
        L_0x0053:
            java.lang.String r14 = "aquaman"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x005c
            goto L_0x002f
        L_0x005c:
            r13 = r5
            goto L_0x0089
        L_0x005e:
            java.lang.String r14 = "oneday"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0067
            goto L_0x002f
        L_0x0067:
            r13 = r6
            goto L_0x0089
        L_0x0069:
            java.lang.String r14 = "dangalUHD"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0072
            goto L_0x002f
        L_0x0072:
            r13 = r8
            goto L_0x0089
        L_0x0074:
            java.lang.String r14 = "dangalFHD"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x007d
            goto L_0x002f
        L_0x007d:
            r13 = r10
            goto L_0x0089
        L_0x007f:
            java.lang.String r14 = "dangal"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0088
            goto L_0x002f
        L_0x0088:
            r13 = r11
        L_0x0089:
            switch(r13) {
                case 0: goto L_0x008d;
                case 1: goto L_0x008d;
                case 2: goto L_0x008d;
                case 3: goto L_0x008d;
                case 4: goto L_0x008d;
                case 5: goto L_0x008d;
                case 6: goto L_0x008d;
                case 7: goto L_0x008d;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x0090
        L_0x008d:
            r11 = r10
            goto L_0x0868
        L_0x0090:
            if (r12 > r1) goto L_0x009d
            java.lang.String r13 = "HWEML"
            java.lang.String r14 = defpackage.maf.b     // Catch:{ all -> 0x086d }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x086d }
            if (r13 == 0) goto L_0x009d
            goto L_0x008d
        L_0x009d:
            if (r12 > r0) goto L_0x0868
            java.lang.String r12 = defpackage.maf.b     // Catch:{ all -> 0x086d }
            r12.getClass()     // Catch:{ all -> 0x086d }
            int r13 = r12.hashCode()
            switch(r13) {
                case -2144781245: goto L_0x082b;
                case -2144781185: goto L_0x081f;
                case -2144781160: goto L_0x0813;
                case -2097309513: goto L_0x0807;
                case -2022874474: goto L_0x07fb;
                case -1978993182: goto L_0x07ef;
                case -1978990237: goto L_0x07e3;
                case -1936688988: goto L_0x07d7;
                case -1936688066: goto L_0x07c9;
                case -1936688065: goto L_0x07bb;
                case -1931988508: goto L_0x07ad;
                case -1885099851: goto L_0x079f;
                case -1696512866: goto L_0x0791;
                case -1680025915: goto L_0x0783;
                case -1615810839: goto L_0x0775;
                case -1600724499: goto L_0x0767;
                case -1554255044: goto L_0x0759;
                case -1481772737: goto L_0x074b;
                case -1481772730: goto L_0x073d;
                case -1481772729: goto L_0x072f;
                case -1320080169: goto L_0x0721;
                case -1217592143: goto L_0x0713;
                case -1180384755: goto L_0x0705;
                case -1139198265: goto L_0x06f7;
                case -1052835013: goto L_0x06e9;
                case -993250464: goto L_0x06db;
                case -993250458: goto L_0x06d1;
                case -965403638: goto L_0x06c4;
                case -958336948: goto L_0x06b7;
                case -879245230: goto L_0x06a9;
                case -842500323: goto L_0x069b;
                case -821392978: goto L_0x068d;
                case -797483286: goto L_0x067f;
                case -794946968: goto L_0x0671;
                case -788334647: goto L_0x0663;
                case -782144577: goto L_0x0655;
                case -575125681: goto L_0x0647;
                case -521118391: goto L_0x0639;
                case -430914369: goto L_0x062b;
                case -290434366: goto L_0x061d;
                case -282781963: goto L_0x060f;
                case -277133239: goto L_0x0601;
                case -173639913: goto L_0x05f3;
                case -56598463: goto L_0x05e5;
                case 2126: goto L_0x05d7;
                case 2564: goto L_0x05c9;
                case 2715: goto L_0x05bb;
                case 2719: goto L_0x05ad;
                case 3091: goto L_0x059f;
                case 3483: goto L_0x0591;
                case 73405: goto L_0x0583;
                case 75537: goto L_0x0575;
                case 75739: goto L_0x0567;
                case 76779: goto L_0x0559;
                case 78669: goto L_0x054b;
                case 79305: goto L_0x053d;
                case 80618: goto L_0x052f;
                case 88274: goto L_0x0521;
                case 98846: goto L_0x0513;
                case 98848: goto L_0x0505;
                case 99329: goto L_0x04f7;
                case 101481: goto L_0x04e9;
                case 1513190: goto L_0x04db;
                case 1514184: goto L_0x04cd;
                case 1514185: goto L_0x04bf;
                case 2133089: goto L_0x04b1;
                case 2133091: goto L_0x04a3;
                case 2133120: goto L_0x0495;
                case 2133151: goto L_0x0487;
                case 2133182: goto L_0x0479;
                case 2133184: goto L_0x046b;
                case 2436959: goto L_0x045d;
                case 2463773: goto L_0x044f;
                case 2464648: goto L_0x0441;
                case 2689555: goto L_0x0433;
                case 3154429: goto L_0x0425;
                case 3284551: goto L_0x0417;
                case 3351335: goto L_0x0409;
                case 3386211: goto L_0x03fb;
                case 41325051: goto L_0x03ed;
                case 51349633: goto L_0x03df;
                case 51350594: goto L_0x03d1;
                case 55178625: goto L_0x03c3;
                case 61542055: goto L_0x03b5;
                case 65355429: goto L_0x03a7;
                case 66214468: goto L_0x0399;
                case 66214470: goto L_0x038b;
                case 66214473: goto L_0x037d;
                case 66215429: goto L_0x036f;
                case 66215431: goto L_0x0361;
                case 66215433: goto L_0x0353;
                case 66216390: goto L_0x0345;
                case 76402249: goto L_0x0337;
                case 76404105: goto L_0x0329;
                case 76404911: goto L_0x031b;
                case 80963634: goto L_0x030d;
                case 82882791: goto L_0x02ff;
                case 98715550: goto L_0x02f1;
                case 101370885: goto L_0x02e3;
                case 102844228: goto L_0x02d5;
                case 165221241: goto L_0x02c7;
                case 182191441: goto L_0x02b9;
                case 245388979: goto L_0x02ab;
                case 287431619: goto L_0x029d;
                case 307593612: goto L_0x028f;
                case 308517133: goto L_0x0281;
                case 316215098: goto L_0x0273;
                case 316215116: goto L_0x0265;
                case 316246811: goto L_0x0257;
                case 316246818: goto L_0x0249;
                case 407160593: goto L_0x023b;
                case 507412548: goto L_0x022d;
                case 793982701: goto L_0x021f;
                case 794038622: goto L_0x0211;
                case 794040393: goto L_0x0203;
                case 835649806: goto L_0x01f5;
                case 917340916: goto L_0x01e7;
                case 958008161: goto L_0x01d9;
                case 1060579533: goto L_0x01cb;
                case 1150207623: goto L_0x01bd;
                case 1176899427: goto L_0x01af;
                case 1280332038: goto L_0x01a1;
                case 1306947716: goto L_0x0193;
                case 1349174697: goto L_0x0185;
                case 1522194893: goto L_0x0177;
                case 1691543273: goto L_0x0169;
                case 1691544261: goto L_0x015b;
                case 1709443163: goto L_0x014d;
                case 1865889110: goto L_0x013f;
                case 1906253259: goto L_0x0131;
                case 1977196784: goto L_0x0123;
                case 2006372676: goto L_0x0116;
                case 2019281702: goto L_0x0109;
                case 2029784656: goto L_0x00fc;
                case 2030379515: goto L_0x00ef;
                case 2033393791: goto L_0x00e2;
                case 2047190025: goto L_0x00d5;
                case 2047252157: goto L_0x00c8;
                case 2048319463: goto L_0x00bb;
                case 2048855701: goto L_0x00ae;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r0 = r9
            goto L_0x0836
        L_0x00ae:
            java.lang.String r0 = "HWWAS-H"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x00b7
            goto L_0x00ab
        L_0x00b7:
            r0 = 139(0x8b, float:1.95E-43)
            goto L_0x0836
        L_0x00bb:
            java.lang.String r0 = "HWVNS-H"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x00c4
            goto L_0x00ab
        L_0x00c4:
            r0 = 138(0x8a, float:1.93E-43)
            goto L_0x0836
        L_0x00c8:
            java.lang.String r0 = "ELUGA_Prim"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x00d1
            goto L_0x00ab
        L_0x00d1:
            r0 = 137(0x89, float:1.92E-43)
            goto L_0x0836
        L_0x00d5:
            java.lang.String r0 = "ELUGA_Note"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x00de
            goto L_0x00ab
        L_0x00de:
            r0 = 136(0x88, float:1.9E-43)
            goto L_0x0836
        L_0x00e2:
            java.lang.String r0 = "ASUS_X00AD_2"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x00eb
            goto L_0x00ab
        L_0x00eb:
            r0 = 135(0x87, float:1.89E-43)
            goto L_0x0836
        L_0x00ef:
            java.lang.String r0 = "HWCAM-H"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x00f8
            goto L_0x00ab
        L_0x00f8:
            r0 = 134(0x86, float:1.88E-43)
            goto L_0x0836
        L_0x00fc:
            java.lang.String r0 = "HWBLN-H"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0105
            goto L_0x00ab
        L_0x0105:
            r0 = 133(0x85, float:1.86E-43)
            goto L_0x0836
        L_0x0109:
            java.lang.String r0 = "DM-01K"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0112
            goto L_0x00ab
        L_0x0112:
            r0 = 132(0x84, float:1.85E-43)
            goto L_0x0836
        L_0x0116:
            java.lang.String r0 = "BRAVIA_ATV3_4K"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x011f
            goto L_0x00ab
        L_0x011f:
            r0 = 131(0x83, float:1.84E-43)
            goto L_0x0836
        L_0x0123:
            java.lang.String r0 = "Infinix-X572"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x012d
            goto L_0x00ab
        L_0x012d:
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x0836
        L_0x0131:
            java.lang.String r0 = "PB2-670M"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x013b
            goto L_0x00ab
        L_0x013b:
            r0 = 129(0x81, float:1.81E-43)
            goto L_0x0836
        L_0x013f:
            java.lang.String r0 = "santoni"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0149
            goto L_0x00ab
        L_0x0149:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x0836
        L_0x014d:
            java.lang.String r0 = "iball8735_9806"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0157
            goto L_0x00ab
        L_0x0157:
            r0 = 127(0x7f, float:1.78E-43)
            goto L_0x0836
        L_0x015b:
            java.lang.String r0 = "CPH1715"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0165
            goto L_0x00ab
        L_0x0165:
            r0 = 126(0x7e, float:1.77E-43)
            goto L_0x0836
        L_0x0169:
            java.lang.String r0 = "CPH1609"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0173
            goto L_0x00ab
        L_0x0173:
            r0 = 125(0x7d, float:1.75E-43)
            goto L_0x0836
        L_0x0177:
            java.lang.String r0 = "woods_f"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0181
            goto L_0x00ab
        L_0x0181:
            r0 = 124(0x7c, float:1.74E-43)
            goto L_0x0836
        L_0x0185:
            java.lang.String r0 = "htc_e56ml_dtul"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x018f
            goto L_0x00ab
        L_0x018f:
            r0 = 123(0x7b, float:1.72E-43)
            goto L_0x0836
        L_0x0193:
            java.lang.String r0 = "EverStar_S"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x019d
            goto L_0x00ab
        L_0x019d:
            r0 = 122(0x7a, float:1.71E-43)
            goto L_0x0836
        L_0x01a1:
            java.lang.String r0 = "hwALE-H"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01ab
            goto L_0x00ab
        L_0x01ab:
            r0 = 121(0x79, float:1.7E-43)
            goto L_0x0836
        L_0x01af:
            java.lang.String r0 = "itel_S41"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01b9
            goto L_0x00ab
        L_0x01b9:
            r0 = 120(0x78, float:1.68E-43)
            goto L_0x0836
        L_0x01bd:
            java.lang.String r0 = "LS-5017"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01c7
            goto L_0x00ab
        L_0x01c7:
            r0 = 119(0x77, float:1.67E-43)
            goto L_0x0836
        L_0x01cb:
            java.lang.String r0 = "panell_d"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01d5
            goto L_0x00ab
        L_0x01d5:
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x0836
        L_0x01d9:
            java.lang.String r0 = "j2xlteins"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01e3
            goto L_0x00ab
        L_0x01e3:
            r0 = 117(0x75, float:1.64E-43)
            goto L_0x0836
        L_0x01e7:
            java.lang.String r0 = "A7000plus"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01f1
            goto L_0x00ab
        L_0x01f1:
            r0 = 116(0x74, float:1.63E-43)
            goto L_0x0836
        L_0x01f5:
            java.lang.String r0 = "manning"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01ff
            goto L_0x00ab
        L_0x01ff:
            r0 = 115(0x73, float:1.61E-43)
            goto L_0x0836
        L_0x0203:
            java.lang.String r0 = "GIONEE_WBL7519"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x020d
            goto L_0x00ab
        L_0x020d:
            r0 = 114(0x72, float:1.6E-43)
            goto L_0x0836
        L_0x0211:
            java.lang.String r0 = "GIONEE_WBL7365"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x021b
            goto L_0x00ab
        L_0x021b:
            r0 = 113(0x71, float:1.58E-43)
            goto L_0x0836
        L_0x021f:
            java.lang.String r0 = "GIONEE_WBL5708"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0229
            goto L_0x00ab
        L_0x0229:
            r0 = 112(0x70, float:1.57E-43)
            goto L_0x0836
        L_0x022d:
            java.lang.String r0 = "QM16XE_U"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0237
            goto L_0x00ab
        L_0x0237:
            r0 = 111(0x6f, float:1.56E-43)
            goto L_0x0836
        L_0x023b:
            java.lang.String r0 = "Pixi5-10_4G"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0245
            goto L_0x00ab
        L_0x0245:
            r0 = 110(0x6e, float:1.54E-43)
            goto L_0x0836
        L_0x0249:
            java.lang.String r0 = "TB3-850M"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0253
            goto L_0x00ab
        L_0x0253:
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x0836
        L_0x0257:
            java.lang.String r0 = "TB3-850F"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0261
            goto L_0x00ab
        L_0x0261:
            r0 = 108(0x6c, float:1.51E-43)
            goto L_0x0836
        L_0x0265:
            java.lang.String r0 = "TB3-730X"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x026f
            goto L_0x00ab
        L_0x026f:
            r0 = 107(0x6b, float:1.5E-43)
            goto L_0x0836
        L_0x0273:
            java.lang.String r0 = "TB3-730F"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x027d
            goto L_0x00ab
        L_0x027d:
            r0 = 106(0x6a, float:1.49E-43)
            goto L_0x0836
        L_0x0281:
            java.lang.String r0 = "A7020a48"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x028b
            goto L_0x00ab
        L_0x028b:
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x0836
        L_0x028f:
            java.lang.String r0 = "A7010a48"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0299
            goto L_0x00ab
        L_0x0299:
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x0836
        L_0x029d:
            java.lang.String r0 = "griffin"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x02a7
            goto L_0x00ab
        L_0x02a7:
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x0836
        L_0x02ab:
            java.lang.String r0 = "marino_f"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x02b5
            goto L_0x00ab
        L_0x02b5:
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x0836
        L_0x02b9:
            java.lang.String r0 = "CPY83_I00"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x02c3
            goto L_0x00ab
        L_0x02c3:
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x0836
        L_0x02c7:
            java.lang.String r0 = "A2016a40"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x02d1
            goto L_0x00ab
        L_0x02d1:
            r0 = 100
            goto L_0x0836
        L_0x02d5:
            java.lang.String r0 = "le_x6"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x02df
            goto L_0x00ab
        L_0x02df:
            r0 = 99
            goto L_0x0836
        L_0x02e3:
            java.lang.String r0 = "l5460"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x02ed
            goto L_0x00ab
        L_0x02ed:
            r0 = 98
            goto L_0x0836
        L_0x02f1:
            java.lang.String r0 = "i9031"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x02fb
            goto L_0x00ab
        L_0x02fb:
            r0 = 97
            goto L_0x0836
        L_0x02ff:
            java.lang.String r0 = "X3_HK"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0309
            goto L_0x00ab
        L_0x0309:
            r0 = 96
            goto L_0x0836
        L_0x030d:
            java.lang.String r0 = "V23GB"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0317
            goto L_0x00ab
        L_0x0317:
            r0 = 95
            goto L_0x0836
        L_0x031b:
            java.lang.String r0 = "Q4310"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0325
            goto L_0x00ab
        L_0x0325:
            r0 = 94
            goto L_0x0836
        L_0x0329:
            java.lang.String r0 = "Q4260"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0333
            goto L_0x00ab
        L_0x0333:
            r0 = 93
            goto L_0x0836
        L_0x0337:
            java.lang.String r0 = "PRO7S"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0341
            goto L_0x00ab
        L_0x0341:
            r0 = 92
            goto L_0x0836
        L_0x0345:
            java.lang.String r0 = "F3311"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x034f
            goto L_0x00ab
        L_0x034f:
            r0 = 91
            goto L_0x0836
        L_0x0353:
            java.lang.String r0 = "F3215"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x035d
            goto L_0x00ab
        L_0x035d:
            r0 = 90
            goto L_0x0836
        L_0x0361:
            java.lang.String r0 = "F3213"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x036b
            goto L_0x00ab
        L_0x036b:
            r0 = 89
            goto L_0x0836
        L_0x036f:
            java.lang.String r0 = "F3211"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0379
            goto L_0x00ab
        L_0x0379:
            r0 = 88
            goto L_0x0836
        L_0x037d:
            java.lang.String r0 = "F3116"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0387
            goto L_0x00ab
        L_0x0387:
            r0 = 87
            goto L_0x0836
        L_0x038b:
            java.lang.String r0 = "F3113"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0395
            goto L_0x00ab
        L_0x0395:
            r0 = 86
            goto L_0x0836
        L_0x0399:
            java.lang.String r0 = "F3111"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03a3
            goto L_0x00ab
        L_0x03a3:
            r0 = 85
            goto L_0x0836
        L_0x03a7:
            java.lang.String r0 = "E5643"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03b1
            goto L_0x00ab
        L_0x03b1:
            r0 = 84
            goto L_0x0836
        L_0x03b5:
            java.lang.String r0 = "A1601"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03bf
            goto L_0x00ab
        L_0x03bf:
            r0 = 83
            goto L_0x0836
        L_0x03c3:
            java.lang.String r0 = "Aura_Note_2"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03cd
            goto L_0x00ab
        L_0x03cd:
            r0 = 82
            goto L_0x0836
        L_0x03d1:
            java.lang.String r0 = "602LV"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03db
            goto L_0x00ab
        L_0x03db:
            r0 = 81
            goto L_0x0836
        L_0x03df:
            java.lang.String r0 = "601LV"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03e9
            goto L_0x00ab
        L_0x03e9:
            r0 = 80
            goto L_0x0836
        L_0x03ed:
            java.lang.String r0 = "MEIZU_M5"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x03f7
            goto L_0x00ab
        L_0x03f7:
            r0 = 79
            goto L_0x0836
        L_0x03fb:
            java.lang.String r0 = "p212"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0405
            goto L_0x00ab
        L_0x0405:
            r0 = 78
            goto L_0x0836
        L_0x0409:
            java.lang.String r0 = "mido"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0413
            goto L_0x00ab
        L_0x0413:
            r0 = 77
            goto L_0x0836
        L_0x0417:
            java.lang.String r0 = "kate"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0421
            goto L_0x00ab
        L_0x0421:
            r0 = 76
            goto L_0x0836
        L_0x0425:
            java.lang.String r0 = "fugu"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x042f
            goto L_0x00ab
        L_0x042f:
            r0 = 75
            goto L_0x0836
        L_0x0433:
            java.lang.String r0 = "XE2X"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x043d
            goto L_0x00ab
        L_0x043d:
            r0 = 74
            goto L_0x0836
        L_0x0441:
            java.lang.String r0 = "Q427"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x044b
            goto L_0x00ab
        L_0x044b:
            r0 = 73
            goto L_0x0836
        L_0x044f:
            java.lang.String r0 = "Q350"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0459
            goto L_0x00ab
        L_0x0459:
            r0 = 72
            goto L_0x0836
        L_0x045d:
            java.lang.String r0 = "P681"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0467
            goto L_0x00ab
        L_0x0467:
            r0 = 71
            goto L_0x0836
        L_0x046b:
            java.lang.String r0 = "F04J"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0475
            goto L_0x00ab
        L_0x0475:
            r0 = 70
            goto L_0x0836
        L_0x0479:
            java.lang.String r0 = "F04H"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0483
            goto L_0x00ab
        L_0x0483:
            r0 = 69
            goto L_0x0836
        L_0x0487:
            java.lang.String r0 = "F03H"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0491
            goto L_0x00ab
        L_0x0491:
            r0 = 68
            goto L_0x0836
        L_0x0495:
            java.lang.String r0 = "F02H"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x049f
            goto L_0x00ab
        L_0x049f:
            r0 = 67
            goto L_0x0836
        L_0x04a3:
            java.lang.String r0 = "F01J"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x04ad
            goto L_0x00ab
        L_0x04ad:
            r0 = 66
            goto L_0x0836
        L_0x04b1:
            java.lang.String r0 = "F01H"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x04bb
            goto L_0x00ab
        L_0x04bb:
            r0 = 65
            goto L_0x0836
        L_0x04bf:
            java.lang.String r0 = "1714"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x04c9
            goto L_0x00ab
        L_0x04c9:
            r0 = 64
            goto L_0x0836
        L_0x04cd:
            java.lang.String r0 = "1713"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x04d7
            goto L_0x00ab
        L_0x04d7:
            r0 = 63
            goto L_0x0836
        L_0x04db:
            java.lang.String r0 = "1601"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x04e5
            goto L_0x00ab
        L_0x04e5:
            r0 = 62
            goto L_0x0836
        L_0x04e9:
            java.lang.String r0 = "flo"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x04f3
            goto L_0x00ab
        L_0x04f3:
            r0 = 61
            goto L_0x0836
        L_0x04f7:
            java.lang.String r0 = "deb"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0501
            goto L_0x00ab
        L_0x0501:
            r0 = 60
            goto L_0x0836
        L_0x0505:
            java.lang.String r0 = "cv3"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x050f
            goto L_0x00ab
        L_0x050f:
            r0 = 59
            goto L_0x0836
        L_0x0513:
            java.lang.String r0 = "cv1"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x051d
            goto L_0x00ab
        L_0x051d:
            r0 = 58
            goto L_0x0836
        L_0x0521:
            java.lang.String r0 = "Z80"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x052b
            goto L_0x00ab
        L_0x052b:
            r0 = 57
            goto L_0x0836
        L_0x052f:
            java.lang.String r0 = "QX1"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0539
            goto L_0x00ab
        L_0x0539:
            r0 = 56
            goto L_0x0836
        L_0x053d:
            java.lang.String r0 = "PLE"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0547
            goto L_0x00ab
        L_0x0547:
            r0 = 55
            goto L_0x0836
        L_0x054b:
            java.lang.String r0 = "P85"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0555
            goto L_0x00ab
        L_0x0555:
            r0 = 54
            goto L_0x0836
        L_0x0559:
            java.lang.String r0 = "MX6"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0563
            goto L_0x00ab
        L_0x0563:
            r0 = 53
            goto L_0x0836
        L_0x0567:
            java.lang.String r0 = "M5c"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0571
            goto L_0x00ab
        L_0x0571:
            r0 = 52
            goto L_0x0836
        L_0x0575:
            java.lang.String r0 = "M04"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x057f
            goto L_0x00ab
        L_0x057f:
            r0 = 51
            goto L_0x0836
        L_0x0583:
            java.lang.String r0 = "JGZ"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x058d
            goto L_0x00ab
        L_0x058d:
            r0 = 50
            goto L_0x0836
        L_0x0591:
            java.lang.String r0 = "mh"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x059b
            goto L_0x00ab
        L_0x059b:
            r0 = 49
            goto L_0x0836
        L_0x059f:
            java.lang.String r0 = "b5"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x05a9
            goto L_0x00ab
        L_0x05a9:
            r0 = 48
            goto L_0x0836
        L_0x05ad:
            java.lang.String r0 = "V5"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x05b7
            goto L_0x00ab
        L_0x05b7:
            r0 = 47
            goto L_0x0836
        L_0x05bb:
            java.lang.String r0 = "V1"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x05c5
            goto L_0x00ab
        L_0x05c5:
            r0 = 46
            goto L_0x0836
        L_0x05c9:
            java.lang.String r0 = "Q5"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x05d3
            goto L_0x00ab
        L_0x05d3:
            r0 = 45
            goto L_0x0836
        L_0x05d7:
            java.lang.String r0 = "C1"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x05e1
            goto L_0x00ab
        L_0x05e1:
            r0 = 44
            goto L_0x0836
        L_0x05e5:
            java.lang.String r0 = "woods_fn"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x05ef
            goto L_0x00ab
        L_0x05ef:
            r0 = 43
            goto L_0x0836
        L_0x05f3:
            java.lang.String r0 = "ELUGA_A3_Pro"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x05fd
            goto L_0x00ab
        L_0x05fd:
            r0 = 42
            goto L_0x0836
        L_0x0601:
            java.lang.String r0 = "Z12_PRO"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x060b
            goto L_0x00ab
        L_0x060b:
            r0 = 41
            goto L_0x0836
        L_0x060f:
            java.lang.String r0 = "BLACK-1X"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0619
            goto L_0x00ab
        L_0x0619:
            r0 = 40
            goto L_0x0836
        L_0x061d:
            java.lang.String r0 = "taido_row"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0627
            goto L_0x00ab
        L_0x0627:
            r0 = 39
            goto L_0x0836
        L_0x062b:
            java.lang.String r0 = "Pixi4-7_3G"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0635
            goto L_0x00ab
        L_0x0635:
            r0 = 38
            goto L_0x0836
        L_0x0639:
            java.lang.String r0 = "GIONEE_GBL7360"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0643
            goto L_0x00ab
        L_0x0643:
            r0 = 37
            goto L_0x0836
        L_0x0647:
            java.lang.String r0 = "GiONEE_CBL7513"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0651
            goto L_0x00ab
        L_0x0651:
            r0 = 36
            goto L_0x0836
        L_0x0655:
            java.lang.String r0 = "OnePlus5T"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x065f
            goto L_0x00ab
        L_0x065f:
            r0 = 35
            goto L_0x0836
        L_0x0663:
            java.lang.String r0 = "whyred"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x066d
            goto L_0x00ab
        L_0x066d:
            r0 = 34
            goto L_0x0836
        L_0x0671:
            java.lang.String r0 = "watson"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x067b
            goto L_0x00ab
        L_0x067b:
            r0 = 33
            goto L_0x0836
        L_0x067f:
            java.lang.String r0 = "SVP-DTV15"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0689
            goto L_0x00ab
        L_0x0689:
            r0 = 32
            goto L_0x0836
        L_0x068d:
            java.lang.String r0 = "A7000-a"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0697
            goto L_0x00ab
        L_0x0697:
            r0 = 31
            goto L_0x0836
        L_0x069b:
            java.lang.String r0 = "nicklaus_f"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x06a5
            goto L_0x00ab
        L_0x06a5:
            r0 = 30
            goto L_0x0836
        L_0x06a9:
            java.lang.String r0 = "tcl_eu"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x06b3
            goto L_0x00ab
        L_0x06b3:
            r0 = 29
            goto L_0x0836
        L_0x06b7:
            java.lang.String r0 = "ELUGA_Ray_X"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x06c1
            goto L_0x00ab
        L_0x06c1:
            r0 = r7
            goto L_0x0836
        L_0x06c4:
            java.lang.String r0 = "s905x018"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x06ce
            goto L_0x00ab
        L_0x06ce:
            r0 = r1
            goto L_0x0836
        L_0x06d1:
            java.lang.String r1 = "A10-70L"
            boolean r1 = r12.equals(r1)
            if (r1 != 0) goto L_0x0836
            goto L_0x00ab
        L_0x06db:
            java.lang.String r0 = "A10-70F"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x06e5
            goto L_0x00ab
        L_0x06e5:
            r0 = 25
            goto L_0x0836
        L_0x06e9:
            java.lang.String r0 = "namath"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x06f3
            goto L_0x00ab
        L_0x06f3:
            r0 = 24
            goto L_0x0836
        L_0x06f7:
            java.lang.String r0 = "Slate_Pro"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0701
            goto L_0x00ab
        L_0x0701:
            r0 = 23
            goto L_0x0836
        L_0x0705:
            java.lang.String r0 = "iris60"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x070f
            goto L_0x00ab
        L_0x070f:
            r0 = 22
            goto L_0x0836
        L_0x0713:
            java.lang.String r0 = "BRAVIA_ATV2"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x071d
            goto L_0x00ab
        L_0x071d:
            r0 = 21
            goto L_0x0836
        L_0x0721:
            java.lang.String r0 = "GiONEE_GBL7319"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x072b
            goto L_0x00ab
        L_0x072b:
            r0 = 20
            goto L_0x0836
        L_0x072f:
            java.lang.String r0 = "panell_dt"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0739
            goto L_0x00ab
        L_0x0739:
            r0 = 19
            goto L_0x0836
        L_0x073d:
            java.lang.String r0 = "panell_ds"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0747
            goto L_0x00ab
        L_0x0747:
            r0 = 18
            goto L_0x0836
        L_0x074b:
            java.lang.String r0 = "panell_dl"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0755
            goto L_0x00ab
        L_0x0755:
            r0 = 17
            goto L_0x0836
        L_0x0759:
            java.lang.String r0 = "vernee_M5"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0763
            goto L_0x00ab
        L_0x0763:
            r0 = 16
            goto L_0x0836
        L_0x0767:
            java.lang.String r0 = "pacificrim"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0771
            goto L_0x00ab
        L_0x0771:
            r0 = 15
            goto L_0x0836
        L_0x0775:
            java.lang.String r0 = "Phantom6"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x077f
            goto L_0x00ab
        L_0x077f:
            r0 = 14
            goto L_0x0836
        L_0x0783:
            java.lang.String r0 = "ComioS1"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x078d
            goto L_0x00ab
        L_0x078d:
            r0 = 13
            goto L_0x0836
        L_0x0791:
            java.lang.String r0 = "XT1663"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x079b
            goto L_0x00ab
        L_0x079b:
            r0 = 12
            goto L_0x0836
        L_0x079f:
            java.lang.String r0 = "RAIJIN"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x07a9
            goto L_0x00ab
        L_0x07a9:
            r0 = 11
            goto L_0x0836
        L_0x07ad:
            java.lang.String r0 = "AquaPowerM"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x07b7
            goto L_0x00ab
        L_0x07b7:
            r0 = 10
            goto L_0x0836
        L_0x07bb:
            java.lang.String r0 = "PGN611"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x07c5
            goto L_0x00ab
        L_0x07c5:
            r0 = 9
            goto L_0x0836
        L_0x07c9:
            java.lang.String r0 = "PGN610"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x07d3
            goto L_0x00ab
        L_0x07d3:
            r0 = 8
            goto L_0x0836
        L_0x07d7:
            java.lang.String r0 = "PGN528"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x07e1
            goto L_0x00ab
        L_0x07e1:
            r0 = r2
            goto L_0x0836
        L_0x07e3:
            java.lang.String r0 = "NX573J"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x07ed
            goto L_0x00ab
        L_0x07ed:
            r0 = r3
            goto L_0x0836
        L_0x07ef:
            java.lang.String r0 = "NX541J"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x07f9
            goto L_0x00ab
        L_0x07f9:
            r0 = r4
            goto L_0x0836
        L_0x07fb:
            java.lang.String r0 = "CP8676_I02"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0805
            goto L_0x00ab
        L_0x0805:
            r0 = r5
            goto L_0x0836
        L_0x0807:
            java.lang.String r0 = "K50a40"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0811
            goto L_0x00ab
        L_0x0811:
            r0 = r6
            goto L_0x0836
        L_0x0813:
            java.lang.String r0 = "GIONEE_SWW1631"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x081d
            goto L_0x00ab
        L_0x081d:
            r0 = r8
            goto L_0x0836
        L_0x081f:
            java.lang.String r0 = "GIONEE_SWW1627"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0829
            goto L_0x00ab
        L_0x0829:
            r0 = r10
            goto L_0x0836
        L_0x082b:
            java.lang.String r0 = "GIONEE_SWW1609"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0835
            goto L_0x00ab
        L_0x0835:
            r0 = r11
        L_0x0836:
            switch(r0) {
                case 0: goto L_0x008d;
                case 1: goto L_0x008d;
                case 2: goto L_0x008d;
                case 3: goto L_0x008d;
                case 4: goto L_0x008d;
                case 5: goto L_0x008d;
                case 6: goto L_0x008d;
                case 7: goto L_0x008d;
                case 8: goto L_0x008d;
                case 9: goto L_0x008d;
                case 10: goto L_0x008d;
                case 11: goto L_0x008d;
                case 12: goto L_0x008d;
                case 13: goto L_0x008d;
                case 14: goto L_0x008d;
                case 15: goto L_0x008d;
                case 16: goto L_0x008d;
                case 17: goto L_0x008d;
                case 18: goto L_0x008d;
                case 19: goto L_0x008d;
                case 20: goto L_0x008d;
                case 21: goto L_0x008d;
                case 22: goto L_0x008d;
                case 23: goto L_0x008d;
                case 24: goto L_0x008d;
                case 25: goto L_0x008d;
                case 26: goto L_0x008d;
                case 27: goto L_0x008d;
                case 28: goto L_0x008d;
                case 29: goto L_0x008d;
                case 30: goto L_0x008d;
                case 31: goto L_0x008d;
                case 32: goto L_0x008d;
                case 33: goto L_0x008d;
                case 34: goto L_0x008d;
                case 35: goto L_0x008d;
                case 36: goto L_0x008d;
                case 37: goto L_0x008d;
                case 38: goto L_0x008d;
                case 39: goto L_0x008d;
                case 40: goto L_0x008d;
                case 41: goto L_0x008d;
                case 42: goto L_0x008d;
                case 43: goto L_0x008d;
                case 44: goto L_0x008d;
                case 45: goto L_0x008d;
                case 46: goto L_0x008d;
                case 47: goto L_0x008d;
                case 48: goto L_0x008d;
                case 49: goto L_0x008d;
                case 50: goto L_0x008d;
                case 51: goto L_0x008d;
                case 52: goto L_0x008d;
                case 53: goto L_0x008d;
                case 54: goto L_0x008d;
                case 55: goto L_0x008d;
                case 56: goto L_0x008d;
                case 57: goto L_0x008d;
                case 58: goto L_0x008d;
                case 59: goto L_0x008d;
                case 60: goto L_0x008d;
                case 61: goto L_0x008d;
                case 62: goto L_0x008d;
                case 63: goto L_0x008d;
                case 64: goto L_0x008d;
                case 65: goto L_0x008d;
                case 66: goto L_0x008d;
                case 67: goto L_0x008d;
                case 68: goto L_0x008d;
                case 69: goto L_0x008d;
                case 70: goto L_0x008d;
                case 71: goto L_0x008d;
                case 72: goto L_0x008d;
                case 73: goto L_0x008d;
                case 74: goto L_0x008d;
                case 75: goto L_0x008d;
                case 76: goto L_0x008d;
                case 77: goto L_0x008d;
                case 78: goto L_0x008d;
                case 79: goto L_0x008d;
                case 80: goto L_0x008d;
                case 81: goto L_0x008d;
                case 82: goto L_0x008d;
                case 83: goto L_0x008d;
                case 84: goto L_0x008d;
                case 85: goto L_0x008d;
                case 86: goto L_0x008d;
                case 87: goto L_0x008d;
                case 88: goto L_0x008d;
                case 89: goto L_0x008d;
                case 90: goto L_0x008d;
                case 91: goto L_0x008d;
                case 92: goto L_0x008d;
                case 93: goto L_0x008d;
                case 94: goto L_0x008d;
                case 95: goto L_0x008d;
                case 96: goto L_0x008d;
                case 97: goto L_0x008d;
                case 98: goto L_0x008d;
                case 99: goto L_0x008d;
                case 100: goto L_0x008d;
                case 101: goto L_0x008d;
                case 102: goto L_0x008d;
                case 103: goto L_0x008d;
                case 104: goto L_0x008d;
                case 105: goto L_0x008d;
                case 106: goto L_0x008d;
                case 107: goto L_0x008d;
                case 108: goto L_0x008d;
                case 109: goto L_0x008d;
                case 110: goto L_0x008d;
                case 111: goto L_0x008d;
                case 112: goto L_0x008d;
                case 113: goto L_0x008d;
                case 114: goto L_0x008d;
                case 115: goto L_0x008d;
                case 116: goto L_0x008d;
                case 117: goto L_0x008d;
                case 118: goto L_0x008d;
                case 119: goto L_0x008d;
                case 120: goto L_0x008d;
                case 121: goto L_0x008d;
                case 122: goto L_0x008d;
                case 123: goto L_0x008d;
                case 124: goto L_0x008d;
                case 125: goto L_0x008d;
                case 126: goto L_0x008d;
                case 127: goto L_0x008d;
                case 128: goto L_0x008d;
                case 129: goto L_0x008d;
                case 130: goto L_0x008d;
                case 131: goto L_0x008d;
                case 132: goto L_0x008d;
                case 133: goto L_0x008d;
                case 134: goto L_0x008d;
                case 135: goto L_0x008d;
                case 136: goto L_0x008d;
                case 137: goto L_0x008d;
                case 138: goto L_0x008d;
                case 139: goto L_0x008d;
                default: goto L_0x0839;
            }
        L_0x0839:
            java.lang.String r0 = defpackage.maf.d     // Catch:{ all -> 0x086d }
            r0.getClass()     // Catch:{ all -> 0x086d }
            int r1 = r0.hashCode()
            switch(r1) {
                case -594534941: goto L_0x085b;
                case 2006354: goto L_0x0850;
                case 2006367: goto L_0x0847;
                default: goto L_0x0845;
            }
        L_0x0845:
            r8 = r9
            goto L_0x0865
        L_0x0847:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0865
            goto L_0x0845
        L_0x0850:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0859
            goto L_0x0845
        L_0x0859:
            r8 = r10
            goto L_0x0865
        L_0x085b:
            java.lang.String r1 = "JSN-L21"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0864
            goto L_0x0845
        L_0x0864:
            r8 = r11
        L_0x0865:
            switch(r8) {
                case 0: goto L_0x008d;
                case 1: goto L_0x008d;
                case 2: goto L_0x008d;
                default: goto L_0x0868;
            }
        L_0x0868:
            B2 = r11     // Catch:{ all -> 0x086d }
            A2 = r10     // Catch:{ all -> 0x086d }
            goto L_0x086f
        L_0x086d:
            r0 = move-exception
            goto L_0x0873
        L_0x086f:
            monitor-exit(r15)     // Catch:{ all -> 0x086d }
            boolean r15 = B2
            return r15
        L_0x0873:
            monitor-exit(r15)     // Catch:{ all -> 0x086d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s88.s0(java.lang.String):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        if (r10.equals("video/hevc") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r12 = ((java.lang.Integer) r12.first).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int t0(defpackage.x78 r11, defpackage.oy5 r12) {
        /*
            r0 = 4
            r1 = 3
            java.lang.String r2 = "video/hevc"
            java.lang.String r3 = "video/avc"
            r4 = 1
            r5 = 2
            int r6 = r12.B0
            r7 = -1
            if (r6 == r7) goto L_0x00c1
            int r8 = r12.C0
            if (r8 != r7) goto L_0x0013
            goto L_0x00c1
        L_0x0013:
            java.lang.String r9 = "video/dolby-vision"
            java.lang.String r10 = r12.w0
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0036
            android.util.Pair r12 = defpackage.o88.d(r12)
            if (r12 == 0) goto L_0x0035
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r9 = 512(0x200, float:7.175E-43)
            if (r12 == r9) goto L_0x0033
            if (r12 == r4) goto L_0x0033
            if (r12 != r5) goto L_0x0035
        L_0x0033:
            r10 = r3
            goto L_0x0036
        L_0x0035:
            r10 = r2
        L_0x0036:
            r10.getClass()
            int r12 = r10.hashCode()
            switch(r12) {
                case -1664118616: goto L_0x0073;
                case -1662541442: goto L_0x006c;
                case 1187890754: goto L_0x0061;
                case 1331836730: goto L_0x0058;
                case 1599127256: goto L_0x004d;
                case 1599127257: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r4 = r7
            goto L_0x007d
        L_0x0042:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L_0x004b
            goto L_0x0040
        L_0x004b:
            r4 = 5
            goto L_0x007d
        L_0x004d:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L_0x0056
            goto L_0x0040
        L_0x0056:
            r4 = r0
            goto L_0x007d
        L_0x0058:
            boolean r12 = r10.equals(r3)
            if (r12 != 0) goto L_0x005f
            goto L_0x0040
        L_0x005f:
            r4 = r1
            goto L_0x007d
        L_0x0061:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L_0x006a
            goto L_0x0040
        L_0x006a:
            r4 = r5
            goto L_0x007d
        L_0x006c:
            boolean r12 = r10.equals(r2)
            if (r12 != 0) goto L_0x007d
            goto L_0x0040
        L_0x0073:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r10.equals(r12)
            if (r12 != 0) goto L_0x007c
            goto L_0x0040
        L_0x007c:
            r4 = 0
        L_0x007d:
            switch(r4) {
                case 0: goto L_0x0081;
                case 1: goto L_0x00bc;
                case 2: goto L_0x0081;
                case 3: goto L_0x0084;
                case 4: goto L_0x0081;
                case 5: goto L_0x00bc;
                default: goto L_0x0080;
            }
        L_0x0080:
            return r7
        L_0x0081:
            int r6 = r6 * r8
        L_0x0082:
            r0 = r5
            goto L_0x00bd
        L_0x0084:
            java.lang.String r12 = defpackage.maf.d
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r0 = "Amazon"
            java.lang.String r2 = defpackage.maf.c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = "KFSOWI"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r0 = "AFTS"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x00ad
            boolean r11 = r11.f
            if (r11 == 0) goto L_0x00ad
            goto L_0x00bb
        L_0x00ad:
            r11 = 16
            int r12 = defpackage.maf.g(r6, r11)
            int r11 = defpackage.maf.g(r8, r11)
            int r11 = r11 * r12
            int r6 = r11 * 256
            goto L_0x0082
        L_0x00bb:
            return r7
        L_0x00bc:
            int r6 = r6 * r8
        L_0x00bd:
            int r6 = r6 * r1
            int r0 = r0 * r5
            int r6 = r6 / r0
            return r6
        L_0x00c1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s88.t0(x78, oy5):int");
    }

    public static zw6 u0(xw0 xw0, oy5 oy5, boolean z, boolean z3) {
        String str = oy5.w0;
        if (str == null) {
            ls5 ls5 = zw6.b;
            return ffc.X;
        }
        xw0.getClass();
        List e = o88.e(str, z, z3);
        String b = o88.b(oy5);
        if (b == null) {
            return zw6.j(e);
        }
        List e3 = o88.e(b, z, z3);
        ww6 i = zw6.i();
        i.e(e);
        i.e(e3);
        return i.j();
    }

    public static int v0(x78 x78, oy5 oy5) {
        if (oy5.x0 == -1) {
            return t0(x78, oy5);
        }
        List list = oy5.y0;
        int size = list.size();
        int i = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i += ((byte[]) list.get(i3)).length;
        }
        return oy5.x0 + i;
    }

    public final void A0(r78 r78, int i, long j) {
        y0();
        j47.k("releaseOutputBuffer");
        r78.d(i, j);
        j47.A();
        this.n2 = SystemClock.elapsedRealtime() * 1000;
        this.L1.f++;
        this.k2 = 0;
        x0();
    }

    public final boolean B0(x78 x78) {
        return maf.a >= 23 && !this.v2 && !s0(x78.a) && (!x78.f || ct4.b(this.Q1));
    }

    public final void C0(r78 r78, int i) {
        j47.k("skipVideoBuffer");
        r78.releaseOutputBuffer(i, false);
        j47.A();
        this.L1.g++;
    }

    public final r54 D(x78 x78, oy5 oy5, oy5 oy52) {
        r54 b = x78.b(oy5, oy52);
        w3 w3Var = this.W1;
        int i = w3Var.a;
        int i3 = b.e;
        if (oy52.B0 > i || oy52.C0 > w3Var.b) {
            i3 |= 256;
        }
        if (v0(x78, oy52) > this.W1.c) {
            i3 |= 64;
        }
        int i4 = i3;
        return new r54(x78.a, oy5, oy52, i4 != 0 ? 0 : b.d, i4);
    }

    public final void D0(int i, int i3) {
        n54 n54 = this.L1;
        n54.i += i;
        int i4 = i + i3;
        n54.h += i4;
        this.j2 += i4;
        int i5 = this.k2 + i4;
        this.k2 = i5;
        n54.j = Math.max(i5, n54.j);
        int i6 = this.U1;
        if (i6 > 0 && this.j2 >= i6) {
            w0();
        }
    }

    public final MediaCodecDecoderException E(IllegalStateException illegalStateException, x78 x78) {
        Surface surface = this.Z1;
        MediaCodecDecoderException mediaCodecDecoderException = new MediaCodecDecoderException(illegalStateException, x78);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecDecoderException;
    }

    public final void E0(long j) {
        n54 n54 = this.L1;
        n54.l += j;
        n54.m++;
        this.o2 += j;
        this.p2++;
    }

    public final boolean M() {
        return this.v2 && maf.a < 23;
    }

    public final float N(float f, oy5[] oy5Arr) {
        float f3 = -1.0f;
        for (oy5 oy5 : oy5Arr) {
            float f4 = oy5.D0;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            return -1.0f;
        }
        return f3 * f;
    }

    public final ArrayList O(xw0 xw0, oy5 oy5, boolean z) {
        zw6 u0 = u0(xw0, oy5, z, this.v2);
        Pattern pattern = o88.a;
        ArrayList arrayList = new ArrayList(u0);
        Collections.sort(arrayList, new ca3(4, new z16(19, oy5)));
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.n78 Q(defpackage.x78 r22, defpackage.oy5 r23, android.media.MediaCrypto r24, float r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r3 = r23
            r2 = r25
            ct4 r4 = r0.a2
            r5 = 0
            if (r4 == 0) goto L_0x001e
            boolean r6 = r4.a
            boolean r7 = r1.f
            if (r6 == r7) goto L_0x001e
            android.view.Surface r6 = r0.Z1
            if (r6 != r4) goto L_0x0019
            r0.Z1 = r5
        L_0x0019:
            r4.release()
            r0.a2 = r5
        L_0x001e:
            java.lang.String r4 = r1.c
            oy5[] r6 = r0.s0
            r6.getClass()
            int r7 = r3.B0
            int r8 = v0(r22, r23)
            int r9 = r6.length
            r10 = 1
            float r12 = r3.D0
            int r13 = r3.B0
            h63 r14 = r3.I0
            int r15 = r3.C0
            r5 = -1
            if (r9 != r10) goto L_0x0052
            if (r8 == r5) goto L_0x0049
            int r6 = t0(r22, r23)
            if (r6 == r5) goto L_0x0049
            float r5 = (float) r8
            r8 = 1069547520(0x3fc00000, float:1.5)
            float r5 = r5 * r8
            int r5 = (int) r5
            int r8 = java.lang.Math.min(r5, r6)
        L_0x0049:
            w3 r5 = new w3
            r5.<init>(r7, r15, r8)
            r16 = r14
            goto L_0x0179
        L_0x0052:
            int r9 = r6.length
            r11 = r15
            r10 = 0
            r16 = 0
        L_0x0057:
            if (r10 >= r9) goto L_0x00a9
            r5 = r6[r10]
            r18 = r6
            if (r14 == 0) goto L_0x006f
            h63 r6 = r5.I0
            if (r6 != 0) goto L_0x006f
            my5 r5 = r5.a()
            r5.w = r14
            oy5 r6 = new oy5
            r6.<init>(r5)
            r5 = r6
        L_0x006f:
            r54 r6 = r1.b(r3, r5)
            int r6 = r6.d
            if (r6 == 0) goto L_0x009c
            int r6 = r5.C0
            r19 = r9
            int r9 = r5.B0
            r2 = -1
            if (r9 == r2) goto L_0x0086
            if (r6 != r2) goto L_0x0083
            goto L_0x0086
        L_0x0083:
            r17 = 0
            goto L_0x0088
        L_0x0086:
            r17 = 1
        L_0x0088:
            r16 = r16 | r17
            int r7 = java.lang.Math.max(r7, r9)
            int r11 = java.lang.Math.max(r11, r6)
            int r5 = v0(r1, r5)
            int r5 = java.lang.Math.max(r8, r5)
            r8 = r5
            goto L_0x009f
        L_0x009c:
            r19 = r9
            r2 = -1
        L_0x009f:
            int r10 = r10 + 1
            r5 = r2
            r6 = r18
            r9 = r19
            r2 = r25
            goto L_0x0057
        L_0x00a9:
            if (r16 == 0) goto L_0x0172
            if (r15 <= r13) goto L_0x00af
            r2 = 1
            goto L_0x00b0
        L_0x00af:
            r2 = 0
        L_0x00b0:
            if (r2 == 0) goto L_0x00b4
            r5 = r15
            goto L_0x00b5
        L_0x00b4:
            r5 = r13
        L_0x00b5:
            if (r2 == 0) goto L_0x00b9
            r6 = r13
            goto L_0x00ba
        L_0x00b9:
            r6 = r15
        L_0x00ba:
            float r9 = (float) r6
            float r10 = (float) r5
            float r9 = r9 / r10
            int[] r10 = z2
            r16 = r14
            r14 = 0
        L_0x00c2:
            r3 = 9
            if (r14 >= r3) goto L_0x014d
            r3 = r10[r14]
            r17 = r10
            float r10 = (float) r3
            float r10 = r10 * r9
            int r10 = (int) r10
            if (r3 <= r5) goto L_0x014d
            if (r10 > r6) goto L_0x00d3
            goto L_0x014d
        L_0x00d3:
            r18 = r5
            int r5 = defpackage.maf.a
            r19 = r6
            r6 = 21
            if (r5 < r6) goto L_0x011c
            if (r2 == 0) goto L_0x00e1
            r5 = r10
            goto L_0x00e2
        L_0x00e1:
            r5 = r3
        L_0x00e2:
            if (r2 == 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r3 = r10
        L_0x00e6:
            android.media.MediaCodecInfo$CodecCapabilities r6 = r1.d
            if (r6 != 0) goto L_0x00ee
        L_0x00ea:
            r20 = r9
            r9 = 0
            goto L_0x010e
        L_0x00ee:
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()
            if (r6 != 0) goto L_0x00f5
            goto L_0x00ea
        L_0x00f5:
            int r10 = r6.getWidthAlignment()
            int r6 = r6.getHeightAlignment()
            r20 = r9
            android.graphics.Point r9 = new android.graphics.Point
            int r5 = defpackage.maf.g(r5, r10)
            int r5 = r5 * r10
            int r3 = defpackage.maf.g(r3, r6)
            int r3 = r3 * r6
            r9.<init>(r5, r3)
        L_0x010e:
            int r3 = r9.x
            int r5 = r9.y
            r6 = r9
            double r9 = (double) r12
            boolean r3 = r1.e(r3, r5, r9)
            if (r3 == 0) goto L_0x0141
            r5 = r6
            goto L_0x014e
        L_0x011c:
            r20 = r9
            r5 = 16
            int r3 = defpackage.maf.g(r3, r5)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x014d }
            int r3 = r3 * r5
            int r6 = defpackage.maf.g(r10, r5)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x014d }
            int r6 = r6 * r5
            int r5 = r3 * r6
            int r9 = defpackage.o88.i()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x014d }
            if (r5 > r9) goto L_0x0141
            android.graphics.Point r5 = new android.graphics.Point     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x014d }
            if (r2 == 0) goto L_0x0138
            r9 = r6
            goto L_0x0139
        L_0x0138:
            r9 = r3
        L_0x0139:
            if (r2 == 0) goto L_0x013c
            goto L_0x013d
        L_0x013c:
            r3 = r6
        L_0x013d:
            r5.<init>(r9, r3)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x014d }
            goto L_0x014e
        L_0x0141:
            int r14 = r14 + 1
            r10 = r17
            r5 = r18
            r6 = r19
            r9 = r20
            goto L_0x00c2
        L_0x014d:
            r5 = 0
        L_0x014e:
            if (r5 == 0) goto L_0x0174
            int r2 = r5.x
            int r7 = java.lang.Math.max(r7, r2)
            int r2 = r5.y
            int r11 = java.lang.Math.max(r11, r2)
            my5 r2 = r23.a()
            r2.p = r7
            r2.q = r11
            oy5 r3 = new oy5
            r3.<init>(r2)
            int r2 = t0(r1, r3)
            int r8 = java.lang.Math.max(r8, r2)
            goto L_0x0174
        L_0x0172:
            r16 = r14
        L_0x0174:
            w3 r5 = new w3
            r5.<init>(r7, r11, r8)
        L_0x0179:
            r0.W1 = r5
            boolean r2 = r0.v2
            if (r2 == 0) goto L_0x0182
            int r2 = r0.w2
            goto L_0x0183
        L_0x0182:
            r2 = 0
        L_0x0183:
            android.media.MediaFormat r3 = new android.media.MediaFormat
            r3.<init>()
            java.lang.String r6 = "mime"
            r3.setString(r6, r4)
            java.lang.String r4 = "width"
            r3.setInteger(r4, r13)
            java.lang.String r4 = "height"
            r3.setInteger(r4, r15)
            r4 = r23
            java.util.List r6 = r4.y0
            defpackage.c37.y(r3, r6)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r7 == 0) goto L_0x01a9
            java.lang.String r7 = "frame-rate"
            r3.setFloat(r7, r12)
        L_0x01a9:
            java.lang.String r7 = "rotation-degrees"
            int r8 = r4.E0
            defpackage.c37.t(r3, r7, r8)
            if (r16 == 0) goto L_0x01d6
            java.lang.String r7 = "color-transfer"
            r8 = r16
            int r9 = r8.c
            defpackage.c37.t(r3, r7, r9)
            java.lang.String r7 = "color-standard"
            int r9 = r8.a
            defpackage.c37.t(r3, r7, r9)
            java.lang.String r7 = "color-range"
            int r9 = r8.b
            defpackage.c37.t(r3, r7, r9)
            byte[] r7 = r8.o
            if (r7 == 0) goto L_0x01d6
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            java.lang.String r8 = "hdr-static-info"
            r3.setByteBuffer(r8, r7)
        L_0x01d6:
            java.lang.String r7 = "video/dolby-vision"
            java.lang.String r8 = r4.w0
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x01f3
            android.util.Pair r7 = defpackage.o88.d(r23)
            if (r7 == 0) goto L_0x01f3
            java.lang.Object r7 = r7.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.String r8 = "profile"
            defpackage.c37.t(r3, r8, r7)
        L_0x01f3:
            int r7 = r5.a
            java.lang.String r8 = "max-width"
            r3.setInteger(r8, r7)
            java.lang.String r7 = "max-height"
            int r8 = r5.b
            r3.setInteger(r7, r8)
            java.lang.String r7 = "max-input-size"
            int r5 = r5.c
            defpackage.c37.t(r3, r7, r5)
            int r5 = defpackage.maf.a
            r7 = 23
            if (r5 < r7) goto L_0x021f
            java.lang.String r5 = "priority"
            r7 = 0
            r3.setInteger(r5, r7)
            r5 = r25
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x021f
            java.lang.String r6 = "operating-rate"
            r3.setFloat(r6, r5)
        L_0x021f:
            boolean r5 = r0.V1
            if (r5 == 0) goto L_0x0230
            java.lang.String r5 = "no-post-process"
            r6 = 1
            r3.setInteger(r5, r6)
            java.lang.String r5 = "auto-frc"
            r7 = 0
            r3.setInteger(r5, r7)
            goto L_0x0231
        L_0x0230:
            r6 = 1
        L_0x0231:
            if (r2 == 0) goto L_0x023d
            java.lang.String r5 = "tunneled-playback"
            r3.setFeatureEnabled(r5, r6)
            java.lang.String r5 = "audio-session-id"
            r3.setInteger(r5, r2)
        L_0x023d:
            android.view.Surface r2 = r0.Z1
            if (r2 != 0) goto L_0x0260
            boolean r2 = r21.B0(r22)
            if (r2 == 0) goto L_0x025a
            ct4 r2 = r0.a2
            if (r2 != 0) goto L_0x0255
            android.content.Context r2 = r0.Q1
            boolean r5 = r1.f
            ct4 r2 = defpackage.ct4.c(r2, r5)
            r0.a2 = r2
        L_0x0255:
            ct4 r2 = r0.a2
            r0.Z1 = r2
            goto L_0x0260
        L_0x025a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0260:
            android.view.Surface r5 = r0.Z1
            n78 r6 = new n78
            r0 = r6
            r1 = r22
            r2 = r3
            r3 = r23
            r4 = r5
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s88.Q(x78, oy5, android.media.MediaCrypto, float):n78");
    }

    public final void R(o54 o54) {
        if (this.Y1) {
            ByteBuffer byteBuffer = o54.Z;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s3 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s3 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    r78 r78 = this.U0;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    r78.setParameters(bundle);
                }
            }
        }
    }

    public final void V(Exception exc) {
        fm9.c("Video codec error", exc);
        wva wva = this.S1;
        Handler handler = (Handler) wva.b;
        if (handler != null) {
            handler.post(new fre(wva, 14, exc));
        }
    }

    public final void W(long j, String str, long j3) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        wva wva = this.S1;
        Handler handler = (Handler) wva.b;
        if (handler != null) {
            handler.post(new v60(wva, str, j, j3, 4));
        }
        this.X1 = s0(str);
        x78 x78 = this.b1;
        x78.getClass();
        boolean z = false;
        if (maf.a >= 29 && "video/x-vnd.on2.vp9".equals(x78.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = x78.d;
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
        this.Y1 = z;
        if (maf.a >= 23 && this.v2) {
            r78 r78 = this.U0;
            r78.getClass();
            this.x2 = new r88(this, r78);
        }
    }

    public final void X(String str) {
        wva wva = this.S1;
        Handler handler = (Handler) wva.b;
        if (handler != null) {
            handler.post(new fre(wva, 13, str));
        }
    }

    public final r54 Y(imc imc) {
        r54 Y = super.Y(imc);
        oy5 oy5 = (oy5) imc.c;
        wva wva = this.S1;
        Handler handler = (Handler) wva.b;
        if (handler != null) {
            handler.post(new ewc(wva, oy5, Y, 15));
        }
        return Y;
    }

    public final void Z(oy5 oy5, MediaFormat mediaFormat) {
        r78 r78 = this.U0;
        if (r78 != null) {
            r78.h(this.c2);
        }
        if (this.v2) {
            this.q2 = oy5.B0;
            this.r2 = oy5.C0;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.q2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.r2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f = oy5.F0;
        this.t2 = f;
        int i = maf.a;
        int i3 = oy5.E0;
        if (i < 21) {
            this.s2 = i3;
        } else if (i3 == 90 || i3 == 270) {
            int i4 = this.q2;
            this.q2 = this.r2;
            this.r2 = i4;
            this.t2 = 1.0f / f;
        }
        kgf kgf = this.R1;
        kgf.d = oy5.D0;
        em5 em5 = (em5) kgf.p;
        ((dm5) em5.e).c();
        ((dm5) em5.f).c();
        em5.b = false;
        em5.c = -9223372036854775807L;
        em5.d = 0;
        kgf.c();
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r10, java.lang.Object r11) {
        /*
            r9 = this;
            kgf r0 = r9.R1
            r1 = 1
            if (r10 == r1) goto L_0x0053
            r2 = 7
            if (r10 == r2) goto L_0x004d
            r2 = 10
            if (r10 == r2) goto L_0x0038
            r2 = 4
            if (r10 == r2) goto L_0x0027
            r9 = 5
            if (r10 == r9) goto L_0x0014
            goto L_0x0126
        L_0x0014:
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r9 = r11.intValue()
            int r10 = r0.h
            if (r10 != r9) goto L_0x0020
            goto L_0x0126
        L_0x0020:
            r0.h = r9
            r0.d(r1)
            goto L_0x0126
        L_0x0027:
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r9.c2 = r10
            r78 r9 = r9.U0
            if (r9 == 0) goto L_0x0126
            r9.h(r10)
            goto L_0x0126
        L_0x0038:
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            int r11 = r9.w2
            if (r11 == r10) goto L_0x0126
            r9.w2 = r10
            boolean r10 = r9.v2
            if (r10 == 0) goto L_0x0126
            r9.g0()
            goto L_0x0126
        L_0x004d:
            tff r11 = (defpackage.tff) r11
            r9.y2 = r11
            goto L_0x0126
        L_0x0053:
            boolean r10 = r11 instanceof android.view.Surface
            r2 = 0
            if (r10 == 0) goto L_0x005b
            android.view.Surface r11 = (android.view.Surface) r11
            goto L_0x005c
        L_0x005b:
            r11 = r2
        L_0x005c:
            if (r11 != 0) goto L_0x0078
            ct4 r10 = r9.a2
            if (r10 == 0) goto L_0x0064
            r11 = r10
            goto L_0x0078
        L_0x0064:
            x78 r10 = r9.b1
            if (r10 == 0) goto L_0x0078
            boolean r3 = r9.B0(r10)
            if (r3 == 0) goto L_0x0078
            android.content.Context r11 = r9.Q1
            boolean r10 = r10.f
            ct4 r11 = defpackage.ct4.c(r11, r10)
            r9.a2 = r11
        L_0x0078:
            android.view.Surface r10 = r9.Z1
            wva r4 = r9.S1
            if (r10 == r11) goto L_0x00f2
            r9.Z1 = r11
            r0.getClass()
            boolean r10 = r11 instanceof defpackage.ct4
            if (r10 == 0) goto L_0x0089
            r10 = r2
            goto L_0x008a
        L_0x0089:
            r10 = r11
        L_0x008a:
            android.view.Surface r3 = r0.c
            if (r3 != r10) goto L_0x008f
            goto L_0x0097
        L_0x008f:
            r0.b()
            r0.c = r10
            r0.d(r1)
        L_0x0097:
            r10 = 0
            r9.b2 = r10
            int r10 = r9.Y
            r78 r0 = r9.U0
            if (r0 == 0) goto L_0x00b6
            int r1 = defpackage.maf.a
            r3 = 23
            if (r1 < r3) goto L_0x00b0
            if (r11 == 0) goto L_0x00b0
            boolean r1 = r9.X1
            if (r1 != 0) goto L_0x00b0
            r0.j(r11)
            goto L_0x00b6
        L_0x00b0:
            r9.g0()
            r9.T()
        L_0x00b6:
            if (r11 == 0) goto L_0x00ec
            ct4 r0 = r9.a2
            if (r11 == r0) goto L_0x00ec
            ilf r11 = r9.u2
            if (r11 == 0) goto L_0x00d0
            java.lang.Object r0 = r4.b
            android.os.Handler r0 = (android.os.Handler) r0
            if (r0 == 0) goto L_0x00d0
            fre r1 = new fre
            r2 = 11
            r1.<init>(r4, r2, r11)
            r0.post(r1)
        L_0x00d0:
            r9.r0()
            r11 = 2
            if (r10 != r11) goto L_0x0126
            long r10 = r9.T1
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e4
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r10
            goto L_0x00e9
        L_0x00e4:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e9:
            r9.h2 = r0
            goto L_0x0126
        L_0x00ec:
            r9.u2 = r2
            r9.r0()
            goto L_0x0126
        L_0x00f2:
            if (r11 == 0) goto L_0x0126
            ct4 r10 = r9.a2
            if (r11 == r10) goto L_0x0126
            ilf r10 = r9.u2
            if (r10 == 0) goto L_0x010c
            java.lang.Object r11 = r4.b
            android.os.Handler r11 = (android.os.Handler) r11
            if (r11 == 0) goto L_0x010c
            fre r0 = new fre
            r1 = 11
            r0.<init>(r4, r1, r10)
            r11.post(r0)
        L_0x010c:
            boolean r10 = r9.b2
            if (r10 == 0) goto L_0x0126
            android.view.Surface r5 = r9.Z1
            java.lang.Object r9 = r4.b
            android.os.Handler r9 = (android.os.Handler) r9
            if (r9 == 0) goto L_0x0126
            long r6 = android.os.SystemClock.elapsedRealtime()
            tb2 r10 = new tb2
            r8 = 7
            r3 = r10
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (long) r6, (int) r8)
            r9.post(r10)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s88.a(int, java.lang.Object):void");
    }

    public final void a0(long j) {
        super.a0(j);
        if (!this.v2) {
            this.l2--;
        }
    }

    public final void b0() {
        r0();
    }

    public final void c0(o54 o54) {
        boolean z = this.v2;
        if (!z) {
            this.l2++;
        }
        if (maf.a < 23 && z) {
            long j = o54.Y;
            q0(j);
            y0();
            this.L1.f++;
            x0();
            a0(j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0079, code lost:
        if ((r9 == 0 ? false : r1.h[(int) ((r9 - 1) % 15)]) != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0147, code lost:
        if ((((r5 > -30000 ? 1 : (r5 == -30000 ? 0 : -1)) < 0) && r11 > 100000) != false) goto L_0x0149;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0174 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e0(long r28, long r30, defpackage.r78 r32, java.nio.ByteBuffer r33, int r34, int r35, int r36, long r37, boolean r39, boolean r40, defpackage.oy5 r41) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r3 = r32
            r4 = r34
            r5 = r37
            r32.getClass()
            long r7 = r0.g2
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x001a
            r0.g2 = r1
        L_0x001a:
            long r7 = r0.m2
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r11 = -1
            r8 = 1
            r15 = 0
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r7 == 0) goto L_0x00c8
            kgf r7 = r0.R1
            long r13 = r7.l
            int r18 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r18 == 0) goto L_0x0034
            r7.n = r13
            long r13 = r7.m
            r7.o = r13
        L_0x0034:
            long r13 = r7.k
            r18 = 1
            long r13 = r13 + r18
            r7.k = r13
            long r13 = r5 * r16
            java.lang.Object r11 = r7.p
            em5 r11 = (defpackage.em5) r11
            java.lang.Object r12 = r11.e
            dm5 r12 = (defpackage.dm5) r12
            r12.b(r13)
            java.lang.Object r12 = r11.e
            dm5 r12 = (defpackage.dm5) r12
            boolean r12 = r12.a()
            if (r12 == 0) goto L_0x0056
            r11.b = r15
            goto L_0x0094
        L_0x0056:
            long r1 = r11.c
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0094
            boolean r1 = r11.b
            if (r1 == 0) goto L_0x007b
            java.lang.Object r1 = r11.f
            dm5 r1 = (defpackage.dm5) r1
            long r9 = r1.e
            r20 = 0
            int r2 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x006e
            r1 = r15
            goto L_0x0079
        L_0x006e:
            long r9 = r9 - r18
            r18 = 15
            long r9 = r9 % r18
            int r2 = (int) r9
            boolean[] r1 = r1.h
            boolean r1 = r1[r2]
        L_0x0079:
            if (r1 == 0) goto L_0x008b
        L_0x007b:
            java.lang.Object r1 = r11.f
            dm5 r1 = (defpackage.dm5) r1
            r1.c()
            java.lang.Object r1 = r11.f
            dm5 r1 = (defpackage.dm5) r1
            long r9 = r11.c
            r1.b(r9)
        L_0x008b:
            r11.b = r8
            java.lang.Object r1 = r11.f
            dm5 r1 = (defpackage.dm5) r1
            r1.b(r13)
        L_0x0094:
            boolean r1 = r11.b
            if (r1 == 0) goto L_0x00b0
            java.lang.Object r1 = r11.f
            dm5 r1 = (defpackage.dm5) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x00b0
            java.lang.Object r1 = r11.e
            dm5 r1 = (defpackage.dm5) r1
            java.lang.Object r2 = r11.f
            dm5 r2 = (defpackage.dm5) r2
            r11.e = r2
            r11.f = r1
            r11.b = r15
        L_0x00b0:
            r11.c = r13
            java.lang.Object r1 = r11.e
            dm5 r1 = (defpackage.dm5) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x00be
            r1 = r15
            goto L_0x00c1
        L_0x00be:
            int r1 = r11.d
            int r1 = r1 + r8
        L_0x00c1:
            r11.d = r1
            r7.c()
            r0.m2 = r5
        L_0x00c8:
            long r1 = r0.N1
            long r21 = r5 - r1
            if (r39 == 0) goto L_0x00d4
            if (r40 != 0) goto L_0x00d4
            r0.C0(r3, r4)
            return r8
        L_0x00d4:
            float r7 = r0.S0
            double r9 = (double) r7
            int r7 = r0.Y
            r11 = 2
            if (r7 != r11) goto L_0x00de
            r7 = r8
            goto L_0x00df
        L_0x00de:
            r7 = r15
        L_0x00df:
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r11 = r11 * r16
            long r5 = r5 - r28
            double r5 = (double) r5
            double r5 = r5 / r9
            long r5 = (long) r5
            if (r7 == 0) goto L_0x00ef
            long r9 = r11 - r30
            long r5 = r5 - r9
        L_0x00ef:
            android.view.Surface r9 = r0.Z1
            ct4 r10 = r0.a2
            r13 = -30000(0xffffffffffff8ad0, double:NaN)
            if (r9 != r10) goto L_0x0108
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x00fd
            r1 = r8
            goto L_0x00fe
        L_0x00fd:
            r1 = r15
        L_0x00fe:
            if (r1 == 0) goto L_0x0107
            r0.C0(r3, r4)
            r0.E0(r5)
            return r8
        L_0x0107:
            return r15
        L_0x0108:
            long r9 = r0.n2
            long r11 = r11 - r9
            boolean r9 = r0.f2
            if (r9 != 0) goto L_0x011a
            if (r7 != 0) goto L_0x0118
            boolean r9 = r0.e2
            if (r9 == 0) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r9 = r15
            goto L_0x011f
        L_0x0118:
            r9 = r8
            goto L_0x011f
        L_0x011a:
            boolean r9 = r0.d2
            if (r9 != 0) goto L_0x0116
            goto L_0x0118
        L_0x011f:
            long r13 = r0.h2
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r10 != 0) goto L_0x014b
            int r1 = (r28 > r1 ? 1 : (r28 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x014b
            if (r9 != 0) goto L_0x0149
            if (r7 == 0) goto L_0x014b
            r1 = -30000(0xffffffffffff8ad0, double:NaN)
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x013a
            r1 = r8
            goto L_0x013b
        L_0x013a:
            r1 = r15
        L_0x013b:
            if (r1 == 0) goto L_0x0146
            r1 = 100000(0x186a0, double:4.94066E-319)
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0146
            r1 = r8
            goto L_0x0147
        L_0x0146:
            r1 = r15
        L_0x0147:
            if (r1 == 0) goto L_0x014b
        L_0x0149:
            r1 = r8
            goto L_0x014c
        L_0x014b:
            r1 = r15
        L_0x014c:
            r2 = 21
            if (r1 == 0) goto L_0x0174
            long r9 = java.lang.System.nanoTime()
            tff r1 = r0.y2
            if (r1 == 0) goto L_0x0165
            android.media.MediaFormat r7 = r0.W0
            r20 = r1
            r23 = r9
            r25 = r41
            r26 = r7
            r20.d(r21, r23, r25, r26)
        L_0x0165:
            int r1 = defpackage.maf.a
            if (r1 < r2) goto L_0x016d
            r0.A0(r3, r4, r9)
            goto L_0x0170
        L_0x016d:
            r0.z0(r3, r4)
        L_0x0170:
            r0.E0(r5)
            return r8
        L_0x0174:
            if (r7 == 0) goto L_0x031a
            long r9 = r0.g2
            int r1 = (r28 > r9 ? 1 : (r28 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x017e
            goto L_0x031a
        L_0x017e:
            long r9 = java.lang.System.nanoTime()
            long r5 = r5 * r16
            long r5 = r5 + r9
            kgf r1 = r0.R1
            long r11 = r1.n
            r13 = -1
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x01ed
            java.lang.Object r7 = r1.p
            em5 r7 = (defpackage.em5) r7
            java.lang.Object r7 = r7.e
            dm5 r7 = (defpackage.dm5) r7
            boolean r7 = r7.a()
            if (r7 == 0) goto L_0x01ed
            java.lang.Object r7 = r1.p
            em5 r7 = (defpackage.em5) r7
            java.lang.Object r11 = r7.e
            dm5 r11 = (defpackage.dm5) r11
            boolean r11 = r11.a()
            if (r11 == 0) goto L_0x01be
            java.lang.Object r7 = r7.e
            dm5 r7 = (defpackage.dm5) r7
            long r11 = r7.f
            r13 = 0
            int r18 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r18 != 0) goto L_0x01ba
            r13 = 0
            goto L_0x01c3
        L_0x01ba:
            long r13 = r7.g
            long r13 = r13 / r11
            goto L_0x01c3
        L_0x01be:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01c3:
            long r11 = r1.o
            long r2 = r1.k
            r37 = r9
            long r8 = r1.n
            long r2 = r2 - r8
            long r2 = r2 * r13
            float r2 = (float) r2
            float r3 = r1.g
            float r2 = r2 / r3
            long r2 = (long) r2
            long r11 = r11 + r2
            long r2 = r5 - r11
            long r2 = java.lang.Math.abs(r2)
            r8 = 20000000(0x1312d00, double:9.881313E-317)
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x01e2
            r5 = r11
            goto L_0x01ef
        L_0x01e2:
            r2 = 0
            r1.k = r2
            r2 = -1
            r1.n = r2
            r1.l = r2
            goto L_0x01ef
        L_0x01ed:
            r37 = r9
        L_0x01ef:
            long r2 = r1.k
            r1.l = r2
            r1.m = r5
            java.lang.Object r2 = r1.r
            igf r2 = (defpackage.igf) r2
            if (r2 == 0) goto L_0x020d
            long r8 = r1.i
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0207
            goto L_0x020d
        L_0x0207:
            long r2 = r2.a
            int r8 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0210
        L_0x020d:
            r1 = r37
            goto L_0x0230
        L_0x0210:
            long r8 = r1.i
            long r10 = r5 - r2
            long r10 = r10 / r8
            long r10 = r10 * r8
            long r10 = r10 + r2
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x021e
            long r2 = r10 - r8
            goto L_0x0221
        L_0x021e:
            long r8 = r8 + r10
            r2 = r10
            r10 = r8
        L_0x0221:
            long r8 = r10 - r5
            long r5 = r5 - r2
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0229
            goto L_0x022a
        L_0x0229:
            r10 = r2
        L_0x022a:
            long r1 = r1.j
            long r10 = r10 - r1
            r1 = r37
            r5 = r10
        L_0x0230:
            long r1 = r5 - r1
            long r1 = r1 / r16
            long r8 = r0.h2
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0241
            r3 = 1
            goto L_0x0242
        L_0x0241:
            r3 = r15
        L_0x0242:
            r8 = -500000(0xfffffffffff85ee0, double:NaN)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x024d
            if (r40 != 0) goto L_0x024d
            r8 = 1
            goto L_0x024e
        L_0x024d:
            r8 = r15
        L_0x024e:
            if (r8 == 0) goto L_0x028c
            frc r8 = r0.Z
            r8.getClass()
            long r9 = r0.t0
            long r9 = r28 - r9
            int r8 = r8.e(r9)
            if (r8 != 0) goto L_0x0261
            r8 = r15
            goto L_0x0289
        L_0x0261:
            if (r3 == 0) goto L_0x0272
            n54 r9 = r0.L1
            int r10 = r9.e
            int r10 = r10 + r8
            r9.e = r10
            int r8 = r9.g
            int r10 = r0.l2
            int r8 = r8 + r10
            r9.g = r8
            goto L_0x027f
        L_0x0272:
            n54 r9 = r0.L1
            int r10 = r9.k
            r7 = 1
            int r10 = r10 + r7
            r9.k = r10
            int r9 = r0.l2
            r0.D0(r8, r9)
        L_0x027f:
            boolean r8 = r27.K()
            if (r8 == 0) goto L_0x0288
            r27.T()
        L_0x0288:
            r8 = 1
        L_0x0289:
            if (r8 == 0) goto L_0x028c
            return r15
        L_0x028c:
            r8 = -30000(0xffffffffffff8ad0, double:NaN)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0294
            r8 = 1
            goto L_0x0295
        L_0x0294:
            r8 = r15
        L_0x0295:
            if (r8 == 0) goto L_0x029b
            if (r40 != 0) goto L_0x029b
            r8 = 1
            goto L_0x029c
        L_0x029b:
            r8 = r15
        L_0x029c:
            if (r8 == 0) goto L_0x02bc
            if (r3 == 0) goto L_0x02a7
            r3 = r32
            r0.C0(r3, r4)
            r3 = 1
            goto L_0x02b8
        L_0x02a7:
            r3 = r32
            java.lang.String r5 = "dropVideoBuffer"
            defpackage.j47.k(r5)
            r3.releaseOutputBuffer(r4, r15)
            defpackage.j47.A()
            r3 = 1
            r0.D0(r15, r3)
        L_0x02b8:
            r0.E0(r1)
            return r3
        L_0x02bc:
            r3 = r32
            int r8 = defpackage.maf.a
            r9 = 21
            if (r8 < r9) goto L_0x02e4
            r8 = 50000(0xc350, double:2.47033E-319)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x031a
            tff r8 = r0.y2
            if (r8 == 0) goto L_0x02dc
            android.media.MediaFormat r9 = r0.W0
            r20 = r8
            r23 = r5
            r25 = r41
            r26 = r9
            r20.d(r21, r23, r25, r26)
        L_0x02dc:
            r0.A0(r3, r4, r5)
            r0.E0(r1)
        L_0x02e2:
            r0 = 1
            return r0
        L_0x02e4:
            r8 = 30000(0x7530, double:1.4822E-319)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x031a
            r8 = 11000(0x2af8, double:5.4347E-320)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0302
            r8 = 10000(0x2710, double:4.9407E-320)
            long r8 = r1 - r8
            long r8 = r8 / r16
            java.lang.Thread.sleep(r8)     // Catch:{ InterruptedException -> 0x02fa }
            goto L_0x0302
        L_0x02fa:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return r15
        L_0x0302:
            tff r8 = r0.y2
            if (r8 == 0) goto L_0x0313
            android.media.MediaFormat r9 = r0.W0
            r20 = r8
            r23 = r5
            r25 = r41
            r26 = r9
            r20.d(r21, r23, r25, r26)
        L_0x0313:
            r0.z0(r3, r4)
            r0.E0(r1)
            goto L_0x02e2
        L_0x031a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s88.e0(long, long, r78, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, oy5):boolean");
    }

    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    public final void i0() {
        super.i0();
        this.l2 = 0;
    }

    public final boolean l() {
        ct4 ct4;
        if (super.l() && (this.d2 || (((ct4 = this.a2) != null && this.Z1 == ct4) || this.U0 == null || this.v2))) {
            this.h2 = -9223372036854775807L;
            return true;
        } else if (this.h2 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.h2) {
                return true;
            }
            this.h2 = -9223372036854775807L;
            return false;
        }
    }

    public final boolean l0(x78 x78) {
        return this.Z1 != null || B0(x78);
    }

    public final void m() {
        wva wva = this.S1;
        this.u2 = null;
        r0();
        this.b2 = false;
        this.x2 = null;
        try {
            this.L0 = null;
            this.M1 = -9223372036854775807L;
            this.N1 = -9223372036854775807L;
            this.O1 = 0;
            K();
            n54 n54 = this.L1;
            wva.getClass();
            synchronized (n54) {
            }
            Handler handler = (Handler) wva.b;
            if (handler != null) {
                handler.post(new zkf(wva, n54, 0));
            }
        } catch (Throwable th) {
            n54 n542 = this.L1;
            wva.getClass();
            synchronized (n542) {
                Handler handler2 = (Handler) wva.b;
                if (handler2 != null) {
                    handler2.post(new zkf(wva, n542, 0));
                }
                throw th;
            }
        }
    }

    public final void n(boolean z, boolean z3) {
        this.L1 = new n54(0);
        kgc kgc = this.c;
        kgc.getClass();
        boolean z4 = kgc.a;
        np8.f(!z4 || this.w2 != 0);
        if (this.v2 != z4) {
            this.v2 = z4;
            g0();
        }
        n54 n54 = this.L1;
        wva wva = this.S1;
        Handler handler = (Handler) wva.b;
        if (handler != null) {
            handler.post(new zkf(wva, n54, 1));
        }
        this.e2 = z3;
        this.f2 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int n0(defpackage.xw0 r10, defpackage.oy5 r11) {
        /*
            r9 = this;
            r9 = 4
            r0 = 1
            java.lang.String r1 = r11.w0
            boolean r1 = defpackage.ha9.j(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0010
            int r9 = defpackage.uj0.b(r2, r2, r2)
            return r9
        L_0x0010:
            cr4 r1 = r11.z0
            if (r1 == 0) goto L_0x0016
            r1 = r0
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            zw6 r3 = u0(r10, r11, r1, r2)
            if (r1 == 0) goto L_0x0027
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0027
            zw6 r3 = u0(r10, r11, r2, r2)
        L_0x0027:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0032
            int r9 = defpackage.uj0.b(r0, r2, r2)
            return r9
        L_0x0032:
            int r4 = r11.P0
            if (r4 == 0) goto L_0x003f
            r5 = 2
            if (r4 != r5) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            int r9 = defpackage.uj0.b(r5, r2, r2)
            return r9
        L_0x003f:
            java.lang.Object r4 = r3.get(r2)
            x78 r4 = (defpackage.x78) r4
            boolean r5 = r4.c(r11)
            if (r5 != 0) goto L_0x0064
            r6 = r0
        L_0x004c:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0064
            java.lang.Object r7 = r3.get(r6)
            x78 r7 = (defpackage.x78) r7
            boolean r8 = r7.c(r11)
            if (r8 == 0) goto L_0x0062
            r5 = r0
            r3 = r2
            r4 = r7
            goto L_0x0065
        L_0x0062:
            int r6 = r6 + r0
            goto L_0x004c
        L_0x0064:
            r3 = r0
        L_0x0065:
            if (r5 == 0) goto L_0x0069
            r6 = r9
            goto L_0x006a
        L_0x0069:
            r6 = 3
        L_0x006a:
            boolean r7 = r4.d(r11)
            if (r7 == 0) goto L_0x0073
            r7 = 16
            goto L_0x0075
        L_0x0073:
            r7 = 8
        L_0x0075:
            boolean r4 = r4.g
            if (r4 == 0) goto L_0x007c
            r4 = 64
            goto L_0x007d
        L_0x007c:
            r4 = r2
        L_0x007d:
            if (r3 == 0) goto L_0x0082
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0083
        L_0x0082:
            r3 = r2
        L_0x0083:
            if (r5 == 0) goto L_0x00b9
            zw6 r10 = u0(r10, r11, r1, r0)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00b9
            java.util.regex.Pattern r0 = defpackage.o88.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r10)
            z16 r10 = new z16
            r1 = 19
            r10.<init>(r1, r11)
            ca3 r1 = new ca3
            r1.<init>(r9, r10)
            java.util.Collections.sort(r0, r1)
            java.lang.Object r9 = r0.get(r2)
            x78 r9 = (defpackage.x78) r9
            boolean r10 = r9.c(r11)
            if (r10 == 0) goto L_0x00b9
            boolean r9 = r9.d(r11)
            if (r9 == 0) goto L_0x00b9
            r2 = 32
        L_0x00b9:
            r9 = r6 | r7
            r9 = r9 | r2
            r9 = r9 | r4
            r9 = r9 | r3
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s88.n0(xw0, oy5):int");
    }

    public final void o(long j, boolean z) {
        super.o(j, z);
        r0();
        kgf kgf = this.R1;
        kgf.k = 0;
        kgf.n = -1;
        kgf.l = -1;
        long j3 = -9223372036854775807L;
        this.m2 = -9223372036854775807L;
        this.g2 = -9223372036854775807L;
        this.k2 = 0;
        if (z) {
            long j4 = this.T1;
            if (j4 > 0) {
                j3 = SystemClock.elapsedRealtime() + j4;
            }
            this.h2 = j3;
            return;
        }
        this.h2 = -9223372036854775807L;
    }

    public final void p() {
        try {
            F();
            g0();
            er4 er4 = this.O0;
            if (er4 != null) {
                er4.f((kr4) null);
            }
            this.O0 = null;
            ct4 ct4 = this.a2;
            if (ct4 != null) {
                if (this.Z1 == ct4) {
                    this.Z1 = null;
                }
                ct4.release();
                this.a2 = null;
            }
        } catch (Throwable th) {
            ct4 ct42 = this.a2;
            if (ct42 != null) {
                if (this.Z1 == ct42) {
                    this.Z1 = null;
                }
                ct42.release();
                this.a2 = null;
            }
            throw th;
        }
    }

    public final void q() {
        this.j2 = 0;
        this.i2 = SystemClock.elapsedRealtime();
        this.n2 = SystemClock.elapsedRealtime() * 1000;
        this.o2 = 0;
        this.p2 = 0;
        kgf kgf = this.R1;
        kgf.b = true;
        kgf.k = 0;
        kgf.n = -1;
        kgf.l = -1;
        fgf fgf = kgf.q;
        if (fgf != null) {
            igf igf = (igf) kgf.r;
            igf.getClass();
            igf.b.sendEmptyMessage(1);
            fgf.b(new gte(11, (Object) kgf));
        }
        kgf.d(false);
    }

    public final void r() {
        this.h2 = -9223372036854775807L;
        w0();
        int i = this.p2;
        if (i != 0) {
            long j = this.o2;
            wva wva = this.S1;
            Handler handler = (Handler) wva.b;
            if (handler != null) {
                handler.post(new ule(wva, j, i, 15));
            }
            this.o2 = 0;
            this.p2 = 0;
        }
        kgf kgf = this.R1;
        kgf.b = false;
        fgf fgf = kgf.q;
        if (fgf != null) {
            fgf.c();
            igf igf = (igf) kgf.r;
            igf.getClass();
            igf.b.sendEmptyMessage(2);
        }
        kgf.b();
    }

    public final void r0() {
        r78 r78;
        this.d2 = false;
        if (maf.a >= 23 && this.v2 && (r78 = this.U0) != null) {
            this.x2 = new r88(this, r78);
        }
    }

    public final void w0() {
        if (this.j2 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.i2;
            int i = this.j2;
            wva wva = this.S1;
            Handler handler = (Handler) wva.b;
            if (handler != null) {
                handler.post(new ykf(wva, i, j, 0));
            }
            this.j2 = 0;
            this.i2 = elapsedRealtime;
        }
    }

    public final void x0() {
        this.f2 = true;
        if (!this.d2) {
            this.d2 = true;
            Surface surface = this.Z1;
            wva wva = this.S1;
            Handler handler = (Handler) wva.b;
            if (handler != null) {
                handler.post(new tb2((Object) wva, (Object) surface, SystemClock.elapsedRealtime(), 7));
            }
            this.b2 = true;
        }
    }

    public final void y0() {
        int i = this.q2;
        if (i != -1 || this.r2 != -1) {
            ilf ilf = this.u2;
            if (ilf == null || ilf.a != i || ilf.b != this.r2 || ilf.c != this.s2 || ilf.o != this.t2) {
                ilf ilf2 = new ilf(this.t2, i, this.r2, this.s2);
                this.u2 = ilf2;
                wva wva = this.S1;
                Handler handler = (Handler) wva.b;
                if (handler != null) {
                    handler.post(new fre(wva, 11, ilf2));
                }
            }
        }
    }

    public final void z(float f, float f3) {
        super.z(f, f3);
        kgf kgf = this.R1;
        kgf.g = f;
        kgf.k = 0;
        kgf.n = -1;
        kgf.l = -1;
        kgf.d(false);
    }

    public final void z0(r78 r78, int i) {
        y0();
        j47.k("releaseOutputBuffer");
        r78.releaseOutputBuffer(i, true);
        j47.A();
        this.n2 = SystemClock.elapsedRealtime() * 1000;
        this.L1.f++;
        this.k2 = 0;
        x0();
    }
}
