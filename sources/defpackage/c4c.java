package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: c4c  reason: default package */
public final class c4c {
    public final long a;
    public final hdf b;
    public final List c;
    public final List d;
    public final HashMap e = new HashMap();

    public c4c(long j, hdf hdf, List list, ArrayList arrayList, ArrayList arrayList2) {
        this.a = j;
        this.b = hdf;
        Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(arrayList2);
    }

    public static BigInteger a(String str, a4c a4c) {
        if (str == null) {
            return null;
        }
        try {
            return new BigInteger(str);
        } catch (NumberFormatException e2) {
            a4c.logException("RTCStat", "stat.parse", e2);
            return null;
        }
    }

    public static long b(String str, a4c a4c) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e2) {
            a4c.logException("RTCStat", "stat.parse", e2);
            return -1;
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [jxd] */
    /* JADX WARNING: type inference failed for: r28v6, types: [hxd] */
    /* JADX WARNING: type inference failed for: r28v7, types: [dxd] */
    /* JADX WARNING: type inference failed for: r28v8, types: [ixd] */
    /* JADX WARNING: type inference failed for: r28v9, types: [gxd] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0599, code lost:
        r6 = r19 + 1;
        r1 = r62;
        r15 = r5;
        r13 = r20;
        r2 = r21;
        r10 = r23;
        r11 = r24;
        r14 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012d, code lost:
        r5 = new java.util.HashMap();
        r6 = r7.values;
        r8 = r6.length;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0137, code lost:
        if (r9 >= r8) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0139, code lost:
        r12 = r6[r9];
        r5.put(r12.name, r12.value);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0145, code lost:
        r11.put(r7.id, r5);
        r21 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014c, code lost:
        r23 = r10;
        r24 = r11;
        r26 = r14;
        r5 = r15;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02ba A[LOOP:4: B:123:0x02b8->B:124:0x02ba, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0594  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.c4c d(defpackage.a4c r61, org.webrtc.StatsReport[] r62) {
        /*
            r0 = r61
            r1 = r62
            java.lang.String r4 = "ssrc"
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            int r10 = r1.length
            r16 = 0
            r18 = 0
            r2 = r16
            r6 = r18
            r16 = 0
        L_0x0025:
            if (r6 >= r10) goto L_0x05aa
            r7 = r1[r6]
            r19 = r6
            double r5 = r7.timestamp
            r20 = r13
            double r12 = (double) r2
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x0035
            long r2 = (long) r5
        L_0x0035:
            java.lang.String r5 = r7.type
            r5.getClass()
            int r6 = r5.hashCode()
            switch(r6) {
                case 3540113: goto L_0x0064;
                case 292608541: goto L_0x0059;
                case 1216004181: goto L_0x004e;
                case 1452734571: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            r5 = -1
            goto L_0x006d
        L_0x0043:
            java.lang.String r6 = "googTrack"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x004c
            goto L_0x0041
        L_0x004c:
            r5 = 3
            goto L_0x006d
        L_0x004e:
            java.lang.String r6 = "VideoBwe"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0057
            goto L_0x0041
        L_0x0057:
            r5 = 2
            goto L_0x006d
        L_0x0059:
            java.lang.String r6 = "googCandidatePair"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0062
            goto L_0x0041
        L_0x0062:
            r5 = 1
            goto L_0x006d
        L_0x0064:
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x006b
            goto L_0x0041
        L_0x006b:
            r5 = r18
        L_0x006d:
            switch(r5) {
                case 0: goto L_0x025d;
                case 1: goto L_0x0156;
                case 2: goto L_0x007f;
                case 3: goto L_0x0072;
                default: goto L_0x0070;
            }
        L_0x0070:
            goto L_0x012d
        L_0x0072:
            org.webrtc.StatsReport$Value[] r5 = r7.values
            r5 = r5[r18]
            java.lang.String r5 = r5.value
            r14.add(r5)
            r21 = r2
            goto L_0x014c
        L_0x007f:
            org.webrtc.StatsReport$Value[] r5 = r7.values
            int r6 = r5.length
            r12 = -1
            r22 = r12
            r24 = r22
            r26 = r24
            r12 = r18
        L_0x008c:
            if (r12 >= r6) goto L_0x0126
            r13 = r5[r12]
            java.lang.String r8 = r13.name
            r8.getClass()
            int r16 = r8.hashCode()
            switch(r16) {
                case -1997975273: goto L_0x00e0;
                case -1709278787: goto L_0x00d5;
                case -1197172950: goto L_0x00ca;
                case -414492000: goto L_0x00bf;
                case 210522329: goto L_0x00b4;
                case 1074688577: goto L_0x00a9;
                case 1093751428: goto L_0x009e;
                default: goto L_0x009c;
            }
        L_0x009c:
            r8 = -1
            goto L_0x00eb
        L_0x009e:
            java.lang.String r9 = "googTargetEncBitrate"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00a7
            goto L_0x009c
        L_0x00a7:
            r8 = 6
            goto L_0x00eb
        L_0x00a9:
            java.lang.String r9 = "googActualEncBitrate"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00b2
            goto L_0x009c
        L_0x00b2:
            r8 = 5
            goto L_0x00eb
        L_0x00b4:
            java.lang.String r9 = "googBucketDelay"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00bd
            goto L_0x009c
        L_0x00bd:
            r8 = 4
            goto L_0x00eb
        L_0x00bf:
            java.lang.String r9 = "googAvailableSendBandwidth"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00c8
            goto L_0x009c
        L_0x00c8:
            r8 = 3
            goto L_0x00eb
        L_0x00ca:
            java.lang.String r9 = "googRetransmitBitrate"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00d3
            goto L_0x009c
        L_0x00d3:
            r8 = 2
            goto L_0x00eb
        L_0x00d5:
            java.lang.String r9 = "googTransmitBitrate"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00de
            goto L_0x009c
        L_0x00de:
            r8 = 1
            goto L_0x00eb
        L_0x00e0:
            java.lang.String r9 = "googAvailableReceiveBandwidth"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00e9
            goto L_0x009c
        L_0x00e9:
            r8 = r18
        L_0x00eb:
            switch(r8) {
                case 0: goto L_0x011d;
                case 1: goto L_0x0114;
                case 2: goto L_0x010b;
                case 3: goto L_0x0105;
                case 4: goto L_0x00ff;
                case 5: goto L_0x00f6;
                case 6: goto L_0x00f0;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            r8 = 1
            goto L_0x0123
        L_0x00f0:
            java.lang.String r8 = r13.value
            b(r8, r0)
            goto L_0x00ee
        L_0x00f6:
            java.lang.String r8 = r13.value
            long r8 = b(r8, r0)
            r22 = r8
            goto L_0x00ee
        L_0x00ff:
            java.lang.String r8 = r13.value
            b(r8, r0)
            goto L_0x00ee
        L_0x0105:
            java.lang.String r8 = r13.value
            b(r8, r0)
            goto L_0x00ee
        L_0x010b:
            java.lang.String r8 = r13.value
            long r8 = b(r8, r0)
            r24 = r8
            goto L_0x00ee
        L_0x0114:
            java.lang.String r8 = r13.value
            long r8 = b(r8, r0)
            r26 = r8
            goto L_0x00ee
        L_0x011d:
            java.lang.String r8 = r13.value
            b(r8, r0)
            goto L_0x00ee
        L_0x0123:
            int r12 = r12 + r8
            goto L_0x008c
        L_0x0126:
            hdf r16 = new hdf
            r21 = r16
            r21.<init>(r22, r24, r26)
        L_0x012d:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            org.webrtc.StatsReport$Value[] r6 = r7.values
            int r8 = r6.length
            r9 = r18
        L_0x0137:
            if (r9 >= r8) goto L_0x0145
            r12 = r6[r9]
            java.lang.String r13 = r12.name
            java.lang.String r12 = r12.value
            r5.put(r13, r12)
            r12 = 1
            int r9 = r9 + r12
            goto L_0x0137
        L_0x0145:
            java.lang.String r6 = r7.id
            r11.put(r6, r5)
            r21 = r2
        L_0x014c:
            r23 = r10
            r24 = r11
            r26 = r14
            r5 = r15
        L_0x0153:
            r1 = 1
            goto L_0x0599
        L_0x0156:
            java.lang.String r5 = r7.id
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            org.webrtc.StatsReport$Value[] r7 = r7.values
            int r8 = r7.length
            r9 = r18
            r39 = r9
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
        L_0x0176:
            if (r9 >= r8) goto L_0x0246
            r12 = r7[r9]
            java.lang.String r13 = r12.name
            r13.getClass()
            java.lang.String r1 = ":"
            int r21 = r13.hashCode()
            switch(r21) {
                case -1553358190: goto L_0x01ea;
                case -747991196: goto L_0x01dd;
                case -244374237: goto L_0x01d0;
                case -200882018: goto L_0x01c3;
                case 207096210: goto L_0x01b6;
                case 230681321: goto L_0x01a9;
                case 585525230: goto L_0x019c;
                case 930973655: goto L_0x018d;
                default: goto L_0x0188;
            }
        L_0x0188:
            r21 = r2
        L_0x018a:
            r2 = -1
            goto L_0x01f7
        L_0x018d:
            r21 = r2
            java.lang.String r2 = "googRemoteCandidateType"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0199
            goto L_0x01f4
        L_0x0199:
            r2 = 7
            goto L_0x01f7
        L_0x019c:
            r21 = r2
            java.lang.String r2 = "googRemoteAddress"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x01a7
            goto L_0x01f4
        L_0x01a7:
            r2 = 6
            goto L_0x01f7
        L_0x01a9:
            r21 = r2
            java.lang.String r2 = "googLocalAddress"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x01b4
            goto L_0x01f4
        L_0x01b4:
            r2 = 5
            goto L_0x01f7
        L_0x01b6:
            r21 = r2
            java.lang.String r2 = "googRtt"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x01c1
            goto L_0x01f4
        L_0x01c1:
            r2 = 4
            goto L_0x01f7
        L_0x01c3:
            r21 = r2
            java.lang.String r2 = "googChannelId"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x01ce
            goto L_0x01f4
        L_0x01ce:
            r2 = 3
            goto L_0x01f7
        L_0x01d0:
            r21 = r2
            java.lang.String r2 = "googTransportType"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x01db
            goto L_0x01f4
        L_0x01db:
            r2 = 2
            goto L_0x01f7
        L_0x01dd:
            r21 = r2
            java.lang.String r2 = "googActiveConnection"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x01e8
            goto L_0x01f4
        L_0x01e8:
            r2 = 1
            goto L_0x01f7
        L_0x01ea:
            r21 = r2
            java.lang.String r2 = "googLocalCandidateType"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x01f5
        L_0x01f4:
            goto L_0x018a
        L_0x01f5:
            r2 = r18
        L_0x01f7:
            switch(r2) {
                case 0: goto L_0x023a;
                case 1: goto L_0x0231;
                case 2: goto L_0x022c;
                case 3: goto L_0x0227;
                case 4: goto L_0x0222;
                case 5: goto L_0x0215;
                case 6: goto L_0x0208;
                case 7: goto L_0x0203;
                default: goto L_0x01fa;
            }
        L_0x01fa:
            java.lang.String r1 = r12.name
            java.lang.String r2 = r12.value
            r6.put(r1, r2)
        L_0x0201:
            r1 = 1
            goto L_0x023f
        L_0x0203:
            java.lang.String r1 = r12.value
            r33 = r1
            goto L_0x0201
        L_0x0208:
            java.lang.String r2 = r12.value
            if (r2 == 0) goto L_0x0212
            java.lang.String[] r1 = r2.split(r1)
            r35 = r1[r18]
        L_0x0212:
            r34 = r2
            goto L_0x0201
        L_0x0215:
            java.lang.String r2 = r12.value
            if (r2 == 0) goto L_0x021f
            java.lang.String[] r1 = r2.split(r1)
            r32 = r1[r18]
        L_0x021f:
            r31 = r2
            goto L_0x0201
        L_0x0222:
            java.lang.String r1 = r12.value
            r36 = r1
            goto L_0x0201
        L_0x0227:
            java.lang.String r1 = r12.value
            r38 = r1
            goto L_0x0201
        L_0x022c:
            java.lang.String r1 = r12.value
            r37 = r1
            goto L_0x0201
        L_0x0231:
            java.lang.String r1 = r12.value
            java.lang.String r2 = "true"
            boolean r39 = r2.equalsIgnoreCase(r1)
            goto L_0x0201
        L_0x023a:
            java.lang.String r1 = r12.value
            r30 = r1
            goto L_0x0201
        L_0x023f:
            int r9 = r9 + r1
            r1 = r62
            r2 = r21
            goto L_0x0176
        L_0x0246:
            r21 = r2
            cz1 r1 = new cz1
            r28 = r1
            r29 = r5
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            java.util.HashMap r2 = r1.l
            r2.putAll(r6)
            r5 = r20
            r5.add(r1)
            goto L_0x014c
        L_0x025d:
            r21 = r2
            r5 = r20
            java.lang.String r1 = r7.id
            int r2 = r1.length()
            r6 = 4
            int r2 = r2 - r6
            java.lang.String r1 = r1.substring(r2)
            r1.getClass()
            java.lang.String r2 = "recv"
            boolean r2 = r1.equals(r2)
            java.lang.String r3 = "stat.parse"
            java.lang.String r8 = "CallsSsrc"
            if (r2 != 0) goto L_0x02aa
            java.lang.String r2 = "send"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02a8
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r9 = "ssrc type '"
            r2.<init>(r9)
            java.lang.String r7 = r7.id
            java.lang.String r9 = "' is not send/recv"
            java.lang.String r2 = defpackage.zr6.l(r2, r7, r9)
            r1.<init>(r2)
            r0.logException(r8, r3, r1)
            r20 = r5
            r23 = r10
            r24 = r11
            r26 = r14
            r27 = r15
        L_0x02a5:
            r1 = 0
            goto L_0x0590
        L_0x02a8:
            r1 = 2
            goto L_0x02ab
        L_0x02aa:
            r1 = 1
        L_0x02ab:
            java.util.HashMap r2 = new java.util.HashMap
            org.webrtc.StatsReport$Value[] r9 = r7.values
            int r9 = r9.length
            r2.<init>(r9)
            org.webrtc.StatsReport$Value[] r7 = r7.values
            int r9 = r7.length
            r12 = r18
        L_0x02b8:
            if (r12 >= r9) goto L_0x02c7
            r13 = r7[r12]
            java.lang.String r6 = r13.name
            java.lang.String r13 = r13.value
            r2.put(r6, r13)
            r6 = 1
            int r12 = r12 + r6
            r6 = 4
            goto L_0x02b8
        L_0x02c7:
            java.lang.String r6 = "mediaType"
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            bkb r7 = new bkb
            java.lang.String r9 = "googCodecName"
            java.lang.Object r9 = r2.remove(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r12 = ""
            if (r9 != 0) goto L_0x02de
            r9 = r12
        L_0x02de:
            java.lang.String r13 = "codecImplementationName"
            java.lang.Object r13 = r2.remove(r13)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto L_0x02ed
            r20 = r5
            r13 = r12
        L_0x02eb:
            r5 = 0
            goto L_0x02f0
        L_0x02ed:
            r20 = r5
            goto L_0x02eb
        L_0x02f0:
            r7.<init>(r9, r13, r5)
            java.lang.String r9 = "' is not video/audio"
            java.lang.String r13 = "media type '"
            java.lang.String r5 = "video"
            r23 = r10
            java.lang.String r10 = "audio"
            r24 = r11
            java.lang.String r11 = "googTrackId"
            r25 = r12
            java.lang.String r12 = "packetsLost"
            r26 = r14
            java.lang.String r14 = "transportId"
            r27 = r15
            r15 = 2
            if (r1 != r15) goto L_0x042c
            boolean r1 = r10.equalsIgnoreCase(r6)
            java.lang.String r10 = "bytesSent"
            java.lang.String r15 = "packetsSent"
            if (r1 == 0) goto L_0x0369
            exd r1 = new exd
            java.lang.Object r3 = r2.remove(r4)
            java.lang.String r3 = (java.lang.String) r3
            long r30 = b(r3, r0)
            java.lang.Object r3 = r2.remove(r14)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x032f
            r32 = r25
            goto L_0x0331
        L_0x032f:
            r32 = r3
        L_0x0331:
            java.lang.Object r3 = r2.remove(r15)
            java.lang.String r3 = (java.lang.String) r3
            java.math.BigInteger r33 = a(r3, r0)
            java.lang.Object r3 = r2.remove(r12)
            java.lang.String r3 = (java.lang.String) r3
            java.math.BigInteger r34 = a(r3, r0)
            java.lang.Object r3 = r2.remove(r10)
            java.lang.String r3 = (java.lang.String) r3
            java.math.BigInteger r35 = a(r3, r0)
            java.lang.Object r3 = r2.remove(r11)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x035a
            r36 = r25
            goto L_0x035c
        L_0x035a:
            r36 = r3
        L_0x035c:
            r29 = 1
            r38 = 0
            r28 = r1
            r37 = r7
            r28.<init>(r29, r30, r32, r33, r34, r35, r36, r37, r38)
            goto L_0x0578
        L_0x0369:
            boolean r1 = r5.equalsIgnoreCase(r6)
            if (r1 == 0) goto L_0x041e
            ixd r1 = new ixd
            java.lang.Object r3 = r2.remove(r4)
            java.lang.String r3 = (java.lang.String) r3
            long r29 = b(r3, r0)
            java.lang.Object r3 = r2.remove(r14)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0386
            r31 = r25
            goto L_0x0388
        L_0x0386:
            r31 = r3
        L_0x0388:
            java.lang.Object r3 = r2.remove(r15)
            java.lang.String r3 = (java.lang.String) r3
            java.math.BigInteger r32 = a(r3, r0)
            java.lang.Object r3 = r2.remove(r12)
            java.lang.String r3 = (java.lang.String) r3
            java.math.BigInteger r33 = a(r3, r0)
            java.lang.Object r3 = r2.remove(r10)
            java.lang.String r3 = (java.lang.String) r3
            java.math.BigInteger r34 = a(r3, r0)
            java.lang.String r3 = "googNacksReceived"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r35 = b(r3, r0)
            java.lang.String r3 = "googPlisReceived"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r37 = b(r3, r0)
            java.lang.String r3 = "googFirsReceived"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r39 = b(r3, r0)
            java.lang.String r3 = "framesEncoded"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r41 = b(r3, r0)
            java.lang.String r3 = "googAdaptationChanges"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r43 = b(r3, r0)
            java.lang.String r3 = "googAvgEncodeMs"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r45 = b(r3, r0)
            java.lang.String r3 = "googFrameWidthSent"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r47 = b(r3, r0)
            java.lang.String r3 = "googFrameHeightSent"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r49 = b(r3, r0)
            java.lang.Object r3 = r2.remove(r11)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0411
            r51 = r25
            goto L_0x0413
        L_0x0411:
            r51 = r3
        L_0x0413:
            r53 = 0
            r28 = r1
            r52 = r7
            r28.<init>(r29, r31, r32, r33, r34, r35, r37, r39, r41, r43, r45, r47, r49, r51, r52, r53)
            goto L_0x0578
        L_0x041e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = defpackage.zr6.i(r13, r6, r9)
            r1.<init>(r2)
            r0.logException(r8, r3, r1)
            goto L_0x02a5
        L_0x042c:
            boolean r1 = r10.equalsIgnoreCase(r6)
            java.lang.String r10 = "googJitterBufferMs"
            java.lang.String r15 = "bytesReceived"
            r28 = r3
            java.lang.String r3 = "packetsDiscarded"
            r29 = r8
            java.lang.String r8 = "packetsReceived"
            if (r1 == 0) goto L_0x04b6
            dxd r1 = new dxd
            java.lang.Object r5 = r2.remove(r4)
            java.lang.String r5 = (java.lang.String) r5
            long r29 = b(r5, r0)
            java.lang.Object r5 = r2.remove(r14)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0455
            r31 = r25
            goto L_0x0457
        L_0x0455:
            r31 = r5
        L_0x0457:
            java.lang.Object r5 = r2.remove(r8)
            java.lang.String r5 = (java.lang.String) r5
            java.math.BigInteger r32 = a(r5, r0)
            java.lang.Object r5 = r2.remove(r12)
            java.lang.String r5 = (java.lang.String) r5
            java.math.BigInteger r33 = a(r5, r0)
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            a(r3, r0)
            java.lang.Object r3 = r2.remove(r15)
            java.lang.String r3 = (java.lang.String) r3
            java.math.BigInteger r34 = a(r3, r0)
            java.lang.String r3 = "audioOutputLevel"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r35 = b(r3, r0)
            java.lang.Object r3 = r2.remove(r10)
            java.lang.String r3 = (java.lang.String) r3
            long r37 = b(r3, r0)
            java.lang.Object r3 = r2.remove(r11)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x049f
            r39 = r25
            goto L_0x04a1
        L_0x049f:
            r39 = r3
        L_0x04a1:
            r44 = -1
            r46 = -1
            r40 = -1
            r42 = -1
            r48 = -1
            r50 = -1
            r28 = r1
            r52 = r7
            r28.<init>(r29, r31, r32, r33, r34, r35, r37, r39, r40, r42, r44, r46, r48, r50, r52)
            goto L_0x0578
        L_0x04b6:
            boolean r1 = r5.equalsIgnoreCase(r6)
            if (r1 == 0) goto L_0x057e
            hxd r1 = new hxd
            java.lang.Object r5 = r2.remove(r4)
            java.lang.String r5 = (java.lang.String) r5
            long r29 = b(r5, r0)
            java.lang.Object r5 = r2.remove(r14)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x04d3
            r31 = r25
            goto L_0x04d5
        L_0x04d3:
            r31 = r5
        L_0x04d5:
            java.lang.Object r5 = r2.remove(r8)
            java.lang.String r5 = (java.lang.String) r5
            java.math.BigInteger r32 = a(r5, r0)
            java.lang.Object r5 = r2.remove(r12)
            java.lang.String r5 = (java.lang.String) r5
            java.math.BigInteger r33 = a(r5, r0)
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            a(r3, r0)
            java.lang.Object r3 = r2.remove(r15)
            java.lang.String r3 = (java.lang.String) r3
            java.math.BigInteger r34 = a(r3, r0)
            java.lang.Object r3 = r2.remove(r10)
            java.lang.String r3 = (java.lang.String) r3
            long r35 = b(r3, r0)
            java.lang.String r3 = "googNacksSent"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r37 = b(r3, r0)
            java.lang.String r3 = "googPlisSent"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r39 = b(r3, r0)
            java.lang.String r3 = "googFirsSent"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r41 = b(r3, r0)
            java.lang.String r3 = "framesDecoded"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r43 = b(r3, r0)
            java.lang.String r3 = "framesReceived"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r45 = b(r3, r0)
            java.lang.String r3 = "googFrameHeightReceived"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r47 = b(r3, r0)
            java.lang.String r3 = "googFrameWidthReceived"
            java.lang.Object r3 = r2.remove(r3)
            java.lang.String r3 = (java.lang.String) r3
            long r49 = b(r3, r0)
            java.lang.Object r3 = r2.remove(r11)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0565
            r51 = r25
            goto L_0x0567
        L_0x0565:
            r51 = r3
        L_0x0567:
            r54 = 0
            r55 = 0
            r52 = 0
            r57 = 0
            r59 = 0
            r28 = r1
            r56 = r7
            r28.<init>(r29, r31, r32, r33, r34, r35, r37, r39, r41, r43, r45, r47, r49, r51, r52, r54, r55, r56, r57, r59)
        L_0x0578:
            java.util.HashMap r3 = r1.g
            r3.putAll(r2)
            goto L_0x0590
        L_0x057e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = defpackage.zr6.i(r13, r6, r9)
            r1.<init>(r2)
            r2 = r28
            r3 = r29
            r0.logException(r3, r2, r1)
            goto L_0x02a5
        L_0x0590:
            r5 = r27
            if (r1 == 0) goto L_0x0153
            r5.add(r1)
            goto L_0x0153
        L_0x0599:
            int r6 = r19 + 1
            r1 = r62
            r15 = r5
            r13 = r20
            r2 = r21
            r10 = r23
            r11 = r24
            r14 = r26
            goto L_0x0025
        L_0x05aa:
            r24 = r11
            r20 = r13
            r26 = r14
            r5 = r15
            c4c r0 = new c4c
            r10 = r0
            r1 = r24
            r11 = r2
            r2 = r20
            r13 = r16
            r16 = r2
            r10.<init>(r11, r13, r14, r15, r16)
            java.util.HashMap r2 = r0.e
            r2.putAll(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4c.d(a4c, org.webrtc.StatsReport[]):c4c");
    }

    public final cz1 c() {
        for (cz1 cz1 : this.d) {
            if (cz1.k) {
                return cz1;
            }
        }
        return null;
    }
}
