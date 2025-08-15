package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: fc3  reason: default package */
public class fc3 implements zb3, mde {
    public static final dc3 s0 = new dc3(0);
    public static final byte[] t0 = {0, 7, 8, 15};
    public static final byte[] u0 = {0, 119, -120, -1};
    public static final byte[] v0 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public fc3(int i) {
        switch (i) {
            case 5:
                this.a = tu0.r(3, new hbc(21));
                this.b = tu0.r(3, new hbc(22));
                this.c = tu0.r(3, new hbc(23));
                this.o = tu0.r(3, new hbc(24));
                this.X = tu0.r(3, new hbc(25));
                this.Y = tu0.r(3, new hbc(26));
                this.Z = tu0.r(3, new hbc(27));
                return;
            default:
                this.b = new jj9(20);
                this.c = new jj9(21);
                this.o = hl.a;
                return;
        }
    }

    public static byte[] h(int i, int i2, s02 s02) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) s02.i(i2);
        }
        return bArr;
    }

    public static int[] j() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = l(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = l(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    public static int[] k() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = l(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = l(255, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = l(255, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = l(255, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = l(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    public static int l(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v62, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v63, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v34, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v7, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01f3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0226 A[LOOP:3: B:86:0x0174->B:115:0x0226, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0221 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            r0 = r23
            r1 = r25
            r8 = r28
            s02 r9 = new s02
            int r2 = r0.length
            r3 = 1
            r4 = 0
            r9.<init>((byte[]) r0, (int) r2, (int) r3, (byte) r4)
            r2 = r26
            r10 = r27
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0015:
            int r3 = r9.b()
            if (r3 == 0) goto L_0x0231
            r14 = 8
            int r3 = r9.i(r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x022b
            r15 = 2
            r7 = 1
            r16 = 0
            r6 = 3
            r5 = 4
            switch(r3) {
                case 16: goto L_0x0159;
                case 17: goto L_0x009f;
                case 18: goto L_0x0043;
                default: goto L_0x002e;
            }
        L_0x002e:
            switch(r3) {
                case 32: goto L_0x003e;
                case 33: goto L_0x0039;
                case 34: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0015
        L_0x0032:
            r3 = 16
            byte[] r12 = h(r3, r14, r9)
            goto L_0x0015
        L_0x0039:
            byte[] r11 = h(r5, r14, r9)
            goto L_0x0015
        L_0x003e:
            byte[] r13 = h(r5, r5, r9)
            goto L_0x0015
        L_0x0043:
            r15 = r2
            r2 = r16
        L_0x0046:
            int r3 = r9.i(r14)
            if (r3 == 0) goto L_0x0051
            r17 = r2
            r18 = r7
            goto L_0x0079
        L_0x0051:
            boolean r3 = r9.h()
            r4 = 7
            if (r3 != 0) goto L_0x006c
            int r3 = r9.i(r4)
            if (r3 == 0) goto L_0x0065
            r17 = r2
            r18 = r3
            r3 = r16
            goto L_0x0079
        L_0x0065:
            r17 = r7
            r3 = r16
            r18 = r3
            goto L_0x0079
        L_0x006c:
            int r3 = r9.i(r4)
            int r4 = r9.i(r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L_0x0079:
            if (r18 == 0) goto L_0x0093
            if (r8 == 0) goto L_0x0093
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r15
            float r4 = (float) r10
            int r2 = r15 + r18
            float r5 = (float) r2
            int r2 = r10 + 1
            float r6 = (float) r2
            r2 = r29
            r0 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0094
        L_0x0093:
            r0 = r7
        L_0x0094:
            int r15 = r15 + r18
            if (r17 == 0) goto L_0x009b
            r2 = r15
            goto L_0x0015
        L_0x009b:
            r7 = r0
            r2 = r17
            goto L_0x0046
        L_0x009f:
            r0 = r7
            if (r1 != r6) goto L_0x00ab
            if (r12 != 0) goto L_0x00a7
            byte[] r3 = v0
            goto L_0x00a8
        L_0x00a7:
            r3 = r12
        L_0x00a8:
            r17 = r3
            goto L_0x00ad
        L_0x00ab:
            r17 = 0
        L_0x00ad:
            r7 = r2
            r2 = r16
        L_0x00b0:
            int r3 = r9.i(r5)
            if (r3 == 0) goto L_0x00bc
            r19 = r0
            r18 = r2
            goto L_0x011c
        L_0x00bc:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00d8
            int r3 = r9.i(r6)
            if (r3 == 0) goto L_0x00d1
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
        L_0x00ce:
            r3 = r16
            goto L_0x011c
        L_0x00d1:
            r18 = r0
        L_0x00d3:
            r3 = r16
            r19 = r3
            goto L_0x011c
        L_0x00d8:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00ed
            int r3 = r9.i(r15)
            int r3 = r3 + r5
            int r4 = r9.i(r5)
        L_0x00e7:
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x011c
        L_0x00ed:
            int r3 = r9.i(r15)
            if (r3 == 0) goto L_0x0117
            if (r3 == r0) goto L_0x0112
            if (r3 == r15) goto L_0x0107
            if (r3 == r6) goto L_0x00fc
            r18 = r2
            goto L_0x00d3
        L_0x00fc:
            int r3 = r9.i(r14)
            int r3 = r3 + 25
            int r4 = r9.i(r5)
            goto L_0x00e7
        L_0x0107:
            int r3 = r9.i(r5)
            int r3 = r3 + 9
            int r4 = r9.i(r5)
            goto L_0x00e7
        L_0x0112:
            r18 = r2
            r19 = r15
            goto L_0x00ce
        L_0x0117:
            r19 = r0
            r18 = r2
            goto L_0x00ce
        L_0x011c:
            if (r19 == 0) goto L_0x0144
            if (r8 == 0) goto L_0x0144
            if (r17 == 0) goto L_0x0124
            byte r3 = r17[r3]
        L_0x0124:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r19
            float r2 = (float) r2
            int r5 = r10 + 1
            float r5 = (float) r5
            r20 = r2
            r2 = r29
            r22 = r5
            r5 = r20
            r14 = r6
            r6 = r22
            r20 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0147
        L_0x0144:
            r14 = r6
            r20 = r7
        L_0x0147:
            int r7 = r20 + r19
            if (r18 == 0) goto L_0x0151
            r9.c()
        L_0x014e:
            r2 = r7
            goto L_0x0015
        L_0x0151:
            r6 = r14
            r2 = r18
            r5 = 4
            r14 = 8
            goto L_0x00b0
        L_0x0159:
            r14 = r6
            r0 = r7
            if (r1 != r14) goto L_0x0166
            if (r11 != 0) goto L_0x0162
            byte[] r3 = u0
            goto L_0x0163
        L_0x0162:
            r3 = r11
        L_0x0163:
            r17 = r3
            goto L_0x0171
        L_0x0166:
            if (r1 != r15) goto L_0x016f
            if (r13 != 0) goto L_0x016d
            byte[] r3 = t0
            goto L_0x0163
        L_0x016d:
            r3 = r13
            goto L_0x0163
        L_0x016f:
            r17 = 0
        L_0x0171:
            r7 = r2
            r2 = r16
        L_0x0174:
            int r3 = r9.i(r15)
            if (r3 == 0) goto L_0x0183
            r19 = r0
            r18 = r2
        L_0x017e:
            r5 = 4
            r6 = 8
            goto L_0x01f1
        L_0x0183:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x0198
            int r3 = r9.i(r14)
            int r3 = r3 + r14
            int r4 = r9.i(r15)
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x017e
        L_0x0198:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x01a5
            r19 = r0
            r18 = r2
            r3 = r16
            goto L_0x017e
        L_0x01a5:
            int r3 = r9.i(r15)
            if (r3 == 0) goto L_0x01e8
            if (r3 == r0) goto L_0x01de
            if (r3 == r15) goto L_0x01cb
            if (r3 == r14) goto L_0x01b8
            r18 = r2
            r3 = r16
            r19 = r3
            goto L_0x017e
        L_0x01b8:
            r6 = 8
            int r3 = r9.i(r6)
            int r3 = r3 + 29
            int r4 = r9.i(r15)
            r18 = r2
            r19 = r3
            r3 = r4
            r5 = 4
            goto L_0x01f1
        L_0x01cb:
            r5 = 4
            r6 = 8
            int r3 = r9.i(r5)
            int r3 = r3 + 12
            int r4 = r9.i(r15)
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x01f1
        L_0x01de:
            r5 = 4
            r6 = 8
            r18 = r2
            r19 = r15
            r3 = r16
            goto L_0x01f1
        L_0x01e8:
            r5 = 4
            r6 = 8
            r18 = r0
            r3 = r16
            r19 = r3
        L_0x01f1:
            if (r19 == 0) goto L_0x0218
            if (r8 == 0) goto L_0x0218
            if (r17 == 0) goto L_0x01f9
            byte r3 = r17[r3]
        L_0x01f9:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r19
            float r2 = (float) r2
            int r0 = r10 + 1
            float r0 = (float) r0
            r21 = r2
            r2 = r29
            r22 = r5
            r5 = r21
            r21 = r6
            r6 = r0
            r0 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x021d
        L_0x0218:
            r22 = r5
            r21 = r6
            r0 = r7
        L_0x021d:
            int r7 = r0 + r19
            if (r18 == 0) goto L_0x0226
            r9.c()
            goto L_0x014e
        L_0x0226:
            r2 = r18
            r0 = 1
            goto L_0x0174
        L_0x022b:
            int r10 = r10 + 2
            r2 = r26
            goto L_0x0015
        L_0x0231:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc3.m(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static mt4 n(s02 s02, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        s02 s022 = s02;
        int i7 = 8;
        int i8 = s022.i(8);
        s022.t(8);
        int i9 = 2;
        int i10 = i - 2;
        int i11 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] j = j();
        int[] k = k();
        while (i10 > 0) {
            int i12 = s022.i(i7);
            int i13 = s022.i(i7);
            int[] iArr2 = (i13 & 128) != 0 ? iArr : (i13 & 64) != 0 ? j : k;
            if ((i13 & 1) != 0) {
                i5 = s022.i(i7);
                i4 = s022.i(i7);
                i3 = s022.i(i7);
                i2 = s022.i(i7);
                i6 = i10 - 6;
            } else {
                i3 = s022.i(4) << 4;
                i6 = i10 - 4;
                int i14 = s022.i(4) << 4;
                i2 = s022.i(i9) << 6;
                i5 = s022.i(6) << i9;
                i4 = i14;
            }
            if (i5 == 0) {
                i4 = i11;
                i3 = i4;
                i2 = 255;
            }
            double d = (double) i5;
            double d2 = (double) (i4 - 128);
            double d3 = (double) (i3 - 128);
            iArr2[i12] = l((byte) (255 - (i2 & 255)), maf.j((int) ((1.402d * d2) + d), 0, 255), maf.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), maf.j((int) ((d3 * 1.772d) + d), 0, 255));
            i10 = i6;
            i11 = 0;
            i8 = i8;
            k = k;
            i7 = 8;
            i9 = 2;
        }
        return new mt4(i8, iArr, j, k);
    }

    public static pt4 o(s02 s02) {
        byte[] bArr;
        int i = s02.i(16);
        s02.t(4);
        int i2 = s02.i(2);
        boolean h = s02.h();
        s02.t(1);
        byte[] bArr2 = maf.f;
        if (i2 == 1) {
            s02.t(s02.i(8) * 16);
        } else if (i2 == 0) {
            int i3 = s02.i(16);
            int i4 = s02.i(16);
            if (i3 > 0) {
                bArr2 = new byte[i3];
                s02.l(i3, bArr2);
            }
            if (i4 > 0) {
                bArr = new byte[i4];
                s02.l(i4, bArr);
                return new pt4(i, h, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new pt4(i, h, bArr2, bArr);
    }

    public synchronized gpb d(lqb lqb) {
        pe7 pe7 = (pe7) ((HashMap) this.c).get(lqb);
        if (pe7 != null) {
            return pe7;
        }
        return s0;
    }

    public synchronized gpb e(lqb lqb) {
        a14.h(lqb, "Null interface requested.");
        return (gpb) ((HashMap) this.b).get(lqb);
    }

    public q2a g() {
        se3 se3 = (se3) this.a;
        dwe dwe = (dwe) this.b;
        nl nlVar = (nl) this.Z;
        rl rlVar = (rl) this.Y;
        p31 p31 = (p31) this.X;
        if (nlVar != null && rlVar != null && p31 != null) {
            return new wc4(this, nlVar, rlVar, p31);
        }
        if (se3 != null && dwe != null) {
            return new wc4(this, se3, dwe);
        }
        throw new IllegalArgumentException("You must either provide configurationStore and tokenProvider, either sessionStore, tokenInfoProvider and appKeyProvider");
    }

    public Object get() {
        ha0 ha0 = (ha0) this.X;
        int i = ha0.d;
        Range range = see.p;
        Range range2 = (Range) this.Z;
        int intValue = !Objects.equals(range2, range) ? ((Integer) range2.clamp(Integer.valueOf(i))).intValue() : i;
        Integer valueOf = Integer.valueOf(intValue);
        Integer valueOf2 = Integer.valueOf(i);
        boolean equals = Objects.equals(range2, range);
        Object obj = range2;
        if (!equals) {
            obj = "<UNSPECIFIED>";
        }
        String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", new Object[]{valueOf, valueOf2, obj});
        Range range3 = ((mc0) this.c).c;
        int i2 = ((eu4) this.Y).b;
        Size size = (Size) this.o;
        int i3 = intValue;
        int c2 = eef.c(ha0.c, i2, ha0.h, i3, ha0.d, size.getWidth(), ha0.e, size.getHeight(), ha0.f, range3);
        String str = (String) this.a;
        int i4 = ha0.g;
        jc0 a2 = eef.a(i4, str);
        qp4 d = ic0.d();
        if (str != null) {
            d.a = str;
            bue bue = (bue) this.b;
            if (bue != null) {
                d.c = bue;
                d.o = size;
                d.t0 = Integer.valueOf(c2);
                d.Z = Integer.valueOf(intValue);
                d.b = Integer.valueOf(i4);
                d.Y = a2;
                return d.b();
            }
            throw new NullPointerException("Null inputTimebase");
        }
        throw new NullPointerException("Null mimeType");
    }

    public void i(Map map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            gpb gpb = (gpb) entry.getValue();
            int i = ((nb3) entry.getKey()).d;
            if (i == 1 || (i == 2 && z)) {
                gpb.get();
            }
        }
        r35 r35 = (r35) this.X;
        synchronized (r35) {
            arrayDeque = r35.b;
            if (arrayDeque != null) {
                r35.b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                au1.r(it.next());
                throw null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [uma, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v4, types: [pe7, java.lang.Object] */
    public void p() {
        for (nb3 nb3 : ((HashMap) this.a).keySet()) {
            Iterator it = nb3.c.iterator();
            while (true) {
                if (it.hasNext()) {
                    nh4 nh4 = (nh4) it.next();
                    if (nh4.b == 2 && !((HashMap) this.c).containsKey(nh4.a)) {
                        lqb lqb = nh4.a;
                        Set emptySet = Collections.emptySet();
                        ? obj = new Object();
                        obj.b = null;
                        obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                        obj.a.addAll(emptySet);
                        ((HashMap) this.c).put(lqb, obj);
                    } else if (((HashMap) this.b).containsKey(nh4.a)) {
                        continue;
                    } else {
                        int i = nh4.b;
                        if (i == 1) {
                            lqb lqb2 = nh4.a;
                            throw new RuntimeException("Unsatisfied dependency for component " + nb3 + ": " + lqb2);
                        } else if (i != 2) {
                            lqb lqb3 = nh4.a;
                            av1 av1 = uma.c;
                            dc3 dc3 = uma.d;
                            ? obj2 = new Object();
                            obj2.a = av1;
                            obj2.b = dc3;
                            ((HashMap) this.b).put(lqb3, obj2);
                        }
                    }
                }
            }
        }
    }

    public ArrayList q(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nb3 nb3 = (nb3) it.next();
            if (nb3.e == 0) {
                gpb gpb = (gpb) ((HashMap) this.a).get(nb3);
                for (lqb lqb : nb3.b) {
                    HashMap hashMap = (HashMap) this.b;
                    if (!hashMap.containsKey(lqb)) {
                        hashMap.put(lqb, gpb);
                    } else {
                        arrayList2.add(new wt1((uma) ((gpb) hashMap.get(lqb)), 9, gpb));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [pe7, java.lang.Object] */
    public ArrayList r() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            nb3 nb3 = (nb3) entry.getKey();
            if (nb3.e != 0) {
                gpb gpb = (gpb) entry.getValue();
                for (lqb lqb : nb3.b) {
                    if (!hashMap.containsKey(lqb)) {
                        hashMap.put(lqb, new HashSet());
                    }
                    ((Set) hashMap.get(lqb)).add(gpb);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = (HashMap) this.c;
            if (!hashMap2.containsKey(key)) {
                ? obj = new Object();
                obj.b = null;
                obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap2.put((lqb) entry2.getKey(), obj);
            } else {
                pe7 pe7 = (pe7) hashMap2.get(entry2.getKey());
                for (gpb wt1 : (Set) entry2.getValue()) {
                    arrayList.add(new wt1(pe7, 10, wt1));
                }
            }
        }
        return arrayList;
    }

    public fc3(String str, bue bue, mc0 mc0, Size size, ha0 ha0, eu4 eu4, Range range) {
        this.a = str;
        this.b = bue;
        this.c = mc0;
        this.o = size;
        this.X = ha0;
        this.Y = eu4;
        this.Z = range;
    }
}
