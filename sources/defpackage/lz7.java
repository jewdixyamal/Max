package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.ParserException;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.buffer.OutputStreamBufferOutput;

/* renamed from: lz7  reason: default package */
public abstract class lz7 implements qsd {
    public static boolean a = false;
    public static int b = 1;
    public static final fs4 c = new fs4(24);
    public static final Object d = new Object();
    public static boolean e;
    public static int f;
    public static final /* synthetic */ int g = 0;

    public static void C(ww8 ww8, Map map) {
        ww8.o(map.size());
        for (Map.Entry entry : map.entrySet()) {
            D(ww8, entry.getKey());
            D(ww8, entry.getValue());
        }
    }

    /* JADX WARNING: type inference failed for: r2v20, types: [qpd, java.util.Map] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0269  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void D(defpackage.ww8 r17, java.lang.Object r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x000f
            java.lang.String r1 = (java.lang.String) r1
            r0.U(r1)
            goto L_0x02fc
        L_0x000f:
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x001e
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.m(r1)
            goto L_0x02fc
        L_0x001e:
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 == 0) goto L_0x002d
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.n(r1)
            goto L_0x02fc
        L_0x002d:
            boolean r2 = r1 instanceof java.lang.Float
            if (r2 == 0) goto L_0x0057
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r2 = 5
            r0.d(r2)
            org.msgpack.core.buffer.MessageBuffer r2 = r0.X
            int r3 = r0.Y
            int r4 = r3 + 1
            r0.Y = r4
            r4 = -54
            r2.putByte(r3, r4)
            org.msgpack.core.buffer.MessageBuffer r2 = r0.X
            int r3 = r0.Y
            r2.putFloat(r3, r1)
            int r1 = r0.Y
            int r1 = r1 + 4
            r0.Y = r1
            goto L_0x02fc
        L_0x0057:
            boolean r2 = r1 instanceof java.lang.Double
            if (r2 == 0) goto L_0x0082
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r3 = 9
            r0.d(r3)
            org.msgpack.core.buffer.MessageBuffer r3 = r0.X
            int r4 = r0.Y
            int r5 = r4 + 1
            r0.Y = r5
            r5 = -53
            r3.putByte(r4, r5)
            org.msgpack.core.buffer.MessageBuffer r3 = r0.X
            int r4 = r0.Y
            r3.putDouble(r4, r1)
            int r1 = r0.Y
            int r1 = r1 + 8
            r0.Y = r1
            goto L_0x02fc
        L_0x0082:
            boolean r2 = r1 instanceof java.lang.Short
            r3 = 256(0x100, float:3.59E-43)
            r4 = -48
            r5 = -32
            if (r2 == 0) goto L_0x00c0
            java.lang.Short r1 = (java.lang.Short) r1
            short r1 = r1.shortValue()
            if (r1 >= r5) goto L_0x00a5
            r2 = -128(0xffffffffffffff80, float:NaN)
            if (r1 >= r2) goto L_0x009f
            r2 = -47
            r0.q0(r2, r1)
            goto L_0x02fc
        L_0x009f:
            byte r1 = (byte) r1
            r0.n0(r4, r1)
            goto L_0x02fc
        L_0x00a5:
            r2 = 128(0x80, float:1.794E-43)
            if (r1 >= r2) goto L_0x00af
            byte r1 = (byte) r1
            r0.m0(r1)
            goto L_0x02fc
        L_0x00af:
            if (r1 >= r3) goto L_0x00b9
            r2 = -52
            byte r1 = (byte) r1
            r0.n0(r2, r1)
            goto L_0x02fc
        L_0x00b9:
            r2 = -51
            r0.q0(r2, r1)
            goto L_0x02fc
        L_0x00c0:
            boolean r2 = r1 instanceof java.lang.Byte
            if (r2 == 0) goto L_0x00d6
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 >= r5) goto L_0x00d1
            r0.n0(r4, r1)
            goto L_0x02fc
        L_0x00d1:
            r0.m0(r1)
            goto L_0x02fc
        L_0x00d6:
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L_0x00ec
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00e5
            r1 = -61
            goto L_0x00e7
        L_0x00e5:
            r1 = -62
        L_0x00e7:
            r0.m0(r1)
            goto L_0x02fc
        L_0x00ec:
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L_0x010b
            java.util.List r1 = (java.util.List) r1
            int r2 = r1.size()
            r0.g(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x00fd:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02fc
            java.lang.Object r2 = r1.next()
            D(r0, r2)
            goto L_0x00fd
        L_0x010b:
            boolean r2 = r1 instanceof java.util.Set
            if (r2 == 0) goto L_0x012a
            java.util.Set r1 = (java.util.Set) r1
            int r2 = r1.size()
            r0.g(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x011c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02fc
            java.lang.Object r2 = r1.next()
            D(r0, r2)
            goto L_0x011c
        L_0x012a:
            boolean r2 = r1 instanceof java.util.Map
            if (r2 == 0) goto L_0x0135
            java.util.Map r1 = (java.util.Map) r1
            C(r0, r1)
            goto L_0x02fc
        L_0x0135:
            boolean r2 = r1 instanceof long[]
            r4 = 0
            if (r2 == 0) goto L_0x014b
            long[] r1 = (long[]) r1
            int r2 = r1.length
            r0.g(r2)
            int r2 = r1.length
        L_0x0141:
            if (r4 >= r2) goto L_0x02fc
            r5 = r1[r4]
            r0.n(r5)
            int r4 = r4 + 1
            goto L_0x0141
        L_0x014b:
            boolean r2 = r1 instanceof byte[]
            if (r2 == 0) goto L_0x0194
            byte[] r1 = (byte[]) r1
            int r2 = r1.length
            if (r2 >= r3) goto L_0x015b
            r3 = -60
            byte r2 = (byte) r2
            r0.n0(r3, r2)
            goto L_0x016b
        L_0x015b:
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r2 >= r3) goto L_0x0166
            r3 = -59
            short r2 = (short) r2
            r0.q0(r3, r2)
            goto L_0x016b
        L_0x0166:
            r3 = -58
            r0.o0(r2, r3)
        L_0x016b:
            int r2 = r1.length
            org.msgpack.core.buffer.MessageBuffer r3 = r0.X
            if (r3 == 0) goto L_0x018a
            int r3 = r3.size()
            int r5 = r0.Y
            int r3 = r3 - r5
            if (r3 < r2) goto L_0x018a
            int r3 = r0.b
            if (r2 <= r3) goto L_0x017e
            goto L_0x018a
        L_0x017e:
            org.msgpack.core.buffer.MessageBuffer r3 = r0.X
            r3.putBytes(r5, r1, r4, r2)
            int r1 = r0.Y
            int r1 = r1 + r2
            r0.Y = r1
            goto L_0x02fc
        L_0x018a:
            r17.flush()
            org.msgpack.core.buffer.MessageBufferOutput r0 = r0.o
            r0.write(r1, r4, r2)
            goto L_0x02fc
        L_0x0194:
            boolean r2 = r1 instanceof defpackage.bz
            if (r2 == 0) goto L_0x01a3
            bz r1 = (defpackage.bz) r1
            java.util.HashMap r1 = r1.a()
            C(r0, r1)
            goto L_0x02fc
        L_0x01a3:
            boolean r2 = r1 instanceof defpackage.lna
            if (r2 == 0) goto L_0x01b2
            lna r1 = (defpackage.lna) r1
            us r1 = r1.a()
            C(r0, r1)
            goto L_0x02fc
        L_0x01b2:
            boolean r2 = r1 instanceof defpackage.nna
            java.lang.String r3 = "type"
            if (r2 == 0) goto L_0x01f6
            nna r1 = (defpackage.nna) r1
            r1.getClass()
            java.util.HashMap r2 = new java.util.HashMap
            r4 = 3
            r2.<init>(r4)
            int r4 = r1.a
            r5 = 1
            if (r4 == r5) goto L_0x01d6
            r5 = 2
            if (r4 == r5) goto L_0x01d3
            r5 = 3
            if (r4 != r5) goto L_0x01d1
            java.lang.String r4 = "FORWARD"
            goto L_0x01d8
        L_0x01d1:
            r0 = 0
            throw r0
        L_0x01d3:
            java.lang.String r4 = "REPLY"
            goto L_0x01d8
        L_0x01d6:
            java.lang.String r4 = "UNKNOWN"
        L_0x01d8:
            r2.put(r3, r4)
            long r3 = r1.b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "chatId"
            r2.put(r4, r3)
            long r3 = r1.c
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = "messageId"
            r2.put(r3, r1)
            C(r0, r2)
            goto L_0x02fc
        L_0x01f6:
            boolean r2 = r1 instanceof defpackage.lu8
            if (r2 == 0) goto L_0x0283
            lu8 r1 = (defpackage.lu8) r1
            long r4 = r1.a
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r6 = "entityId"
            r7 = 0
            if (r2 <= 0) goto L_0x0212
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            kpa r9 = new kpa
            r9.<init>(r6, r8)
        L_0x0210:
            r11 = r9
            goto L_0x0226
        L_0x0212:
            java.lang.String r8 = r1.b
            if (r8 == 0) goto L_0x0225
            int r9 = r8.length()
            if (r9 != 0) goto L_0x021d
            goto L_0x0225
        L_0x021d:
            kpa r9 = new kpa
            java.lang.String r10 = "entityName"
            r9.<init>(r10, r8)
            goto L_0x0210
        L_0x0225:
            r11 = r7
        L_0x0226:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            if (r2 <= 0) goto L_0x022d
            goto L_0x022e
        L_0x022d:
            r4 = r7
        L_0x022e:
            if (r4 == 0) goto L_0x023f
            long r4 = r4.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            kpa r4 = new kpa
            r4.<init>(r6, r2)
            r12 = r4
            goto L_0x0240
        L_0x023f:
            r12 = r7
        L_0x0240:
            pu8 r2 = r1.c
            java.lang.String r2 = r2.name()
            kpa r13 = new kpa
            r13.<init>(r3, r2)
            short r2 = r1.o
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            kpa r14 = new kpa
            java.lang.String r3 = "from"
            r14.<init>(r3, r2)
            short r2 = r1.X
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            kpa r15 = new kpa
            java.lang.String r3 = "length"
            r15.<init>(r3, r2)
            java.util.Map r1 = r1.Y
            if (r1 == 0) goto L_0x0270
            kpa r7 = new kpa
            java.lang.String r2 = "attributes"
            r7.<init>(r2, r1)
        L_0x0270:
            r16 = r7
            kpa[] r1 = new defpackage.kpa[]{r11, r12, r13, r14, r15, r16}
            java.util.ArrayList r1 = defpackage.ys.d0(r1)
            java.util.Map r1 = defpackage.mz7.c0(r1)
            C(r0, r1)
            goto L_0x02fc
        L_0x0283:
            boolean r2 = r1 instanceof defpackage.n7d
            if (r2 == 0) goto L_0x0291
            n7d r1 = (defpackage.n7d) r1
            java.util.Map r1 = r1.a()
            C(r0, r1)
            goto L_0x02fc
        L_0x0291:
            boolean r2 = r1 instanceof defpackage.qa2
            if (r2 == 0) goto L_0x02fd
            qa2 r1 = (defpackage.qa2) r1
            r1.getClass()
            us r2 = new us
            r2.<init>(r4)
            java.lang.String r3 = "id"
            java.lang.String r4 = r1.a
            r2.put(r3, r4)
            java.lang.String r3 = "title"
            java.lang.String r4 = r1.b
            r2.put(r3, r4)
            java.lang.String r3 = r1.c
            if (r3 == 0) goto L_0x02b6
            java.lang.String r4 = "emoji"
            r2.put(r4, r3)
        L_0x02b6:
            java.lang.String r3 = "include"
            java.util.Set r4 = r1.o
            r2.put(r3, r4)
            java.lang.String r3 = "favorites"
            java.util.Set r4 = r1.X
            r2.put(r3, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            java.util.Set r5 = r1.Y
            int r4 = defpackage.z53.S(r5, r4)
            r3.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x02d5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02e9
            java.lang.Object r5 = r4.next()
            pa2 r5 = (defpackage.pa2) r5
            java.lang.String r5 = r5.name()
            r3.add(r5)
            goto L_0x02d5
        L_0x02e9:
            java.lang.String r4 = "filters"
            r2.put(r4, r3)
            boolean r1 = r1.Z
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r3 = "hideEmpty"
            r2.put(r3, r1)
            C(r0, r2)
        L_0x02fc:
            return
        L_0x02fd:
            if (r1 != 0) goto L_0x0307
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "value == null"
            r0.<init>(r1)
            throw r0
        L_0x0307:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Class r1 = r18.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "type "
            java.lang.String r3 = " isn't yet implemented"
            java.lang.String r1 = defpackage.zr6.i(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz7.D(ww8, java.lang.Object):void");
    }

    public static Set E(String str) {
        Character ch;
        if (str.length() == 0) {
            return wz4.a;
        }
        String substring = str.substring(w9e.z0(str, '(', 0, false, 6) + 1, w9e.E0(str, ')', 0, 6));
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i2 < substring.length()) {
            char charAt = substring.charAt(i2);
            int i4 = i3 + 1;
            if (charAt == '\'' || charAt == '\"' || charAt == '`') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push(Character.valueOf(charAt));
                } else {
                    Character ch2 = (Character) arrayDeque.peek();
                    if (ch2 != null && ch2.charValue() == charAt) {
                        arrayDeque.pop();
                    }
                }
            } else if (charAt == '[') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push(Character.valueOf(charAt));
                }
            } else if (charAt == ']') {
                if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                    arrayDeque.pop();
                }
            } else if (charAt == ',' && arrayDeque.isEmpty()) {
                String substring2 = substring.substring(i + 1, i3);
                int length = substring2.length() - 1;
                int i5 = 0;
                boolean z = false;
                while (i5 <= length) {
                    boolean z2 = tpa.m(substring2.charAt(!z ? i5 : length), 32) <= 0;
                    if (!z) {
                        if (!z2) {
                            z = true;
                        } else {
                            i5++;
                        }
                    } else if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                }
                arrayList.add(substring2.subSequence(i5, length + 1).toString());
                i = i3;
            }
            i2++;
            i3 = i4;
        }
        arrayList.add(w9e.b1(substring.substring(i + 1)).toString());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str2 = (String) next;
            String[] strArr = h56.d;
            int i6 = 0;
            while (true) {
                if (i6 >= 9) {
                    break;
                } else if (eae.o0(str2, strArr[i6], false)) {
                    arrayList2.add(next);
                    break;
                } else {
                    i6++;
                }
            }
        }
        return x53.H0(arrayList2);
    }

    public static Object F(uaf uaf) {
        switch (au1.s(uaf.e())) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(((nw6) uaf).a);
            case 2:
                return Long.valueOf(uaf.f().i());
            case 3:
                return Float.valueOf((float) ((rw6) uaf).a);
            case 4:
                return ((m1) uaf.m()).y();
            case 5:
                return ByteBuffer.wrap(((m1) uaf.o()).a).asReadOnlyBuffer();
            case 6:
                hw6 c2 = uaf.c();
                ArrayList arrayList = new ArrayList(r0);
                for (uaf F : c2.a) {
                    arrayList.add(F(F));
                }
                return arrayList;
            case 7:
                fx6 g2 = uaf.g();
                HashMap hashMap = new HashMap(g2.a.length / 2);
                Iterator it = new ps(g2.a).iterator();
                while (true) {
                    gw6 gw6 = (gw6) it;
                    if (!gw6.hasNext()) {
                        return hashMap;
                    }
                    Map.Entry entry = (Map.Entry) gw6.next();
                    hashMap.put(F((uaf) entry.getKey()), F((uaf) entry.getValue()));
                }
            default:
                throw new RuntimeException(zr6.i("Type ", h4f.s(uaf.e()), " isn't yet implemented"));
        }
    }

    public static int G(gy8 gy8) {
        if (gy8.n().a() == 7) {
            return gy8.s0();
        }
        gy8.z();
        return 0;
    }

    public static boolean H(gy8 gy8) {
        Boolean bool = Boolean.FALSE;
        if (gy8.n().a() == 2) {
            bool = Boolean.valueOf(gy8.u0());
        } else {
            gy8.z();
        }
        return bool.booleanValue();
    }

    public static byte I(gy8 gy8) {
        int readShort;
        long readLong;
        if (gy8.n().a() == 3) {
            byte readByte = gy8.readByte();
            if (wmd.w(readByte)) {
                return readByte;
            }
            switch (readByte) {
                case -52:
                    byte readByte2 = gy8.readByte();
                    if (readByte2 >= 0) {
                        return readByte2;
                    }
                    throw new MessageIntegerOverflowException(BigInteger.valueOf((long) (readByte2 & 255)));
                case -51:
                    readShort = gy8.readShort();
                    if (readShort < 0 || readShort > 127) {
                        throw new MessageIntegerOverflowException(BigInteger.valueOf((long) (readShort & 65535)));
                    }
                case -50:
                    readShort = gy8.readInt();
                    if (readShort < 0 || readShort > 127) {
                        throw gy8.U(readShort);
                    }
                case -49:
                    readLong = gy8.readLong();
                    if (readLong < 0 || readLong > 127) {
                        throw gy8.e0(readLong);
                    }
                case -48:
                    return gy8.readByte();
                case -47:
                    readShort = gy8.readShort();
                    if (readShort < -128 || readShort > 127) {
                        throw new MessageIntegerOverflowException(BigInteger.valueOf((long) readShort));
                    }
                case -46:
                    readShort = gy8.readInt();
                    if (readShort < -128 || readShort > 127) {
                        throw new MessageIntegerOverflowException(BigInteger.valueOf((long) readShort));
                    }
                case -45:
                    readLong = gy8.readLong();
                    if (readLong < -128 || readLong > 127) {
                        throw new MessageIntegerOverflowException(BigInteger.valueOf(readLong));
                    }
                default:
                    throw gy8.r0("Integer", readByte);
            }
            readShort = (int) readLong;
            return (byte) readShort;
        }
        gy8.z();
        return 0;
    }

    public static Double J(gy8 gy8, Double d2) {
        double d3;
        if (gy8.n().a() == 4) {
            byte readByte = gy8.readByte();
            if (readByte == -54) {
                d3 = (double) gy8.m0(4).getFloat(gy8.v0);
            } else if (readByte == -53) {
                d3 = gy8.m0(8).getDouble(gy8.v0);
            } else {
                throw gy8.r0("Float", readByte);
            }
            return Double.valueOf(d3);
        }
        gy8.z();
        return d2;
    }

    public static Float K(gy8 gy8, Float f2) {
        float f3;
        if (gy8.n().a() == 4) {
            byte readByte = gy8.readByte();
            if (readByte == -54) {
                f3 = gy8.m0(4).getFloat(gy8.v0);
            } else if (readByte == -53) {
                f3 = (float) gy8.m0(8).getDouble(gy8.v0);
            } else {
                throw gy8.r0("Float", readByte);
            }
            return Float.valueOf(f3);
        }
        gy8.z();
        return f2;
    }

    public static int L(gy8 gy8) {
        Integer num = 0;
        if (gy8.n().a() == 3) {
            num = Integer.valueOf(gy8.v0());
        } else {
            gy8.z();
        }
        return num.intValue();
    }

    public static long M(gy8 gy8, long j) {
        if (gy8.n().a() == 3) {
            return gy8.w0();
        }
        gy8.z();
        return j;
    }

    public static int N(gy8 gy8) {
        if (gy8.n().a() == 8) {
            return gy8.x0();
        }
        gy8.z();
        return 0;
    }

    public static short O(gy8 gy8) {
        int readByte;
        long readLong;
        if (gy8.n().a() == 3) {
            byte readByte2 = gy8.readByte();
            if (wmd.w(readByte2)) {
                return (short) readByte2;
            }
            switch (readByte2) {
                case -52:
                    readByte = gy8.readByte() & 255;
                    break;
                case -51:
                    short readShort = gy8.readShort();
                    if (readShort >= 0) {
                        return readShort;
                    }
                    throw new MessageIntegerOverflowException(BigInteger.valueOf((long) (readShort & 65535)));
                case -50:
                    readByte = gy8.readInt();
                    if (readByte < 0 || readByte > 32767) {
                        throw gy8.U(readByte);
                    }
                case -49:
                    readLong = gy8.readLong();
                    if (readLong < 0 || readLong > 32767) {
                        throw gy8.e0(readLong);
                    }
                case -48:
                    readByte = gy8.readByte();
                    break;
                case -47:
                    return gy8.readShort();
                case -46:
                    readByte = gy8.readInt();
                    if (readByte < -32768 || readByte > 32767) {
                        throw new MessageIntegerOverflowException(BigInteger.valueOf((long) readByte));
                    }
                case -45:
                    readLong = gy8.readLong();
                    if (readLong < -32768 || readLong > 32767) {
                        throw new MessageIntegerOverflowException(BigInteger.valueOf(readLong));
                    }
                default:
                    throw gy8.r0("Integer", readByte2);
            }
            readByte = (int) readLong;
            return (short) readByte;
        }
        gy8.z();
        return 0;
    }

    public static String P(gy8 gy8) {
        if (gy8.n().a() == 5) {
            return gy8.z0();
        }
        gy8.z();
        return null;
    }

    public static String Q(gy8 gy8, String str) {
        if (gy8.n().a() == 5) {
            return gy8.z0();
        }
        gy8.z();
        return str;
    }

    public static void R(Map map, ByteArrayOutputStream byteArrayOutputStream) {
        tw8 tw8 = vw8.b;
        ww8 ww8 = new ww8(new OutputStreamBufferOutput(byteArrayOutputStream, tw8.c), tw8);
        try {
            ww8.o(map.size());
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                ww8.U(str);
                D(ww8, obj);
            }
        } finally {
            ww8.close();
        }
    }

    public static int S(fka fka, b7a b7a, z6a z6a, boolean z) {
        if (z) {
            int ordinal = b7a.ordinal();
            if (ordinal == 0) {
                int ordinal2 = z6a.ordinal();
                if (ordinal2 == 0 || ordinal2 == 1) {
                    fka.getText();
                    return -1;
                } else if (ordinal2 == 2) {
                    return fka.getText().a;
                } else {
                    if (ordinal2 == 3) {
                        fka.getText();
                        return -1;
                    } else if (ordinal2 == 4) {
                        return fka.getText().f;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                int ordinal3 = z6a.ordinal();
                if (ordinal3 == 0) {
                    return fka.getText().j;
                }
                if (ordinal3 == 1) {
                    return fka.getText().b;
                }
                if (ordinal3 == 2) {
                    return fka.getText().e;
                }
                if (ordinal3 == 3) {
                    return fka.getText().c;
                }
                if (ordinal3 == 4) {
                    fka.getText();
                    return -1;
                }
                throw new NoWhenBranchMatchedException();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int ordinal4 = b7a.ordinal();
            if (ordinal4 == 0) {
                int ordinal5 = z6a.ordinal();
                if (ordinal5 == 0 || ordinal5 == 1) {
                    return fka.d().c.b.b;
                }
                if (ordinal5 == 2) {
                    return fka.d().c.b.a;
                }
                if (ordinal5 == 3) {
                    return fka.d().c.b.b;
                }
                if (ordinal5 == 4) {
                    return fka.d().c.b.f;
                }
                throw new NoWhenBranchMatchedException();
            } else if (ordinal4 == 1 || ordinal4 == 2 || ordinal4 == 3) {
                int ordinal6 = z6a.ordinal();
                if (ordinal6 == 0) {
                    return fka.getText().j;
                }
                if (ordinal6 == 1) {
                    return fka.getText().b;
                }
                if (ordinal6 == 2) {
                    return fka.getText().e;
                }
                if (ordinal6 == 3) {
                    return fka.getText().c;
                }
                if (ordinal6 == 4) {
                    fka.getText();
                    return -1;
                }
                throw new NoWhenBranchMatchedException();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static String T(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 'A' || charAt > 'Z') {
                i++;
            } else {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
        }
        return str;
    }

    public static String U(int i) {
        return wg0.g(i, "ProfileItemId(value=", ")");
    }

    public static String V(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 'a' || charAt > 'z') {
                i++;
            } else {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i] = (char) (c2 ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
        }
        return str;
    }

    public static ArrayList W(gy8 gy8, df9 df9) {
        if (gy8.n().a() == 7) {
            ArrayList arrayList = new ArrayList();
            int s0 = gy8.s0();
            for (int i = 0; i < s0; i++) {
                arrayList.add(df9.r(gy8));
            }
            return arrayList;
        }
        gy8.z();
        return null;
    }

    public static Set X(gy8 gy8, df9 df9) {
        if (gy8.n().a() == 7) {
            int s0 = gy8.s0();
            HashSet hashSet = new HashSet(s0);
            for (int i = 0; i < s0; i++) {
                hashSet.add(df9.r(gy8));
            }
            return hashSet;
        }
        gy8.z();
        return Collections.emptySet();
    }

    public static long Y(gy8 gy8) {
        if (gy8.n().a() == 3) {
            return gy8.w0();
        }
        gy8.z();
        av8 n = gy8.n();
        throw new IllegalArgumentException("invalid type " + n);
    }

    public static final void Z(y5f y5f) {
        y5f.e(w0f.class, new k1e(14));
        y5f.e(c7f.class, new k1e(15));
        y5f.e(x0f.class, new k1e(16));
        y5f.e(cge.class, new k1e(17));
        y5f.e(ige.class, new k1e(18));
        y5f.e(kq6.class, new k1e(19));
        y5f.e(gq6.class, new k1e(20));
        y5f.e(dfe.class, new k1e(21));
        y5f.e(ct0.class, new k1e(22));
        y5f.e(zve.class, new lxc(19));
        y5f.c(pi4.class, new lxc(18));
    }

    public static void a0(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = np8.R("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                str = np8.R("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void b0(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? c0(i, i3, "start index") : (i2 < 0 || i2 > i3) ? c0(i2, i3, "end index") : np8.R("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static hv0 c(fka fka, b7a b7a, z6a z6a, boolean z) {
        if (z) {
            int ordinal = b7a.ordinal();
            if (ordinal == 0) {
                int ordinal2 = z6a.ordinal();
                if (ordinal2 == 0) {
                    return new hv0(fka.d().a.a.g, Integer.valueOf(fka.b().a.m));
                } else if (ordinal2 == 1) {
                    return new hv0(fka.d().a.a.b, Integer.valueOf(fka.b().a.e));
                } else if (ordinal2 == 2) {
                    return new hv0(fka.d().a.a.c, Integer.valueOf(fka.b().a.f));
                } else if (ordinal2 == 3) {
                    return new hv0(fka.d().a.a.e, Integer.valueOf(fka.b().a.k));
                } else if (ordinal2 == 4) {
                    fka.b().a.getClass();
                    fka.d().a.a.getClass();
                    return new hv0(-1907998, -1);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (ordinal == 1) {
                return new hv0(fka.d().a.a.d, Integer.valueOf(fka.b().a.g));
            } else if (ordinal == 2 || ordinal == 3) {
                return new hv0(fka.d().a.a.h, (Integer) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int ordinal3 = b7a.ordinal();
            if (ordinal3 == 0) {
                int ordinal4 = z6a.ordinal();
                if (ordinal4 == 0) {
                    return new hv0(fka.d().a.b.l, Integer.valueOf(fka.d().a.b.l));
                } else if (ordinal4 == 1) {
                    return new hv0(fka.d().a.b.d, Integer.valueOf(fka.d().a.b.d));
                } else if (ordinal4 == 2) {
                    return new hv0(fka.d().a.b.e, Integer.valueOf(fka.d().a.b.e));
                } else if (ordinal4 == 3) {
                    return new hv0(fka.d().a.b.h, Integer.valueOf(fka.d().a.b.h));
                } else if (ordinal4 == 4) {
                    return new hv0(fka.d().a.b.c, Integer.valueOf(fka.d().a.b.c));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (ordinal3 == 1) {
                return new hv0(fka.d().a.b.f, Integer.valueOf(fka.d().a.b.f));
            } else if (ordinal3 == 2 || ordinal3 == 3) {
                return new hv0(fka.d().a.a.h, (Integer) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static String c0(int i, int i2, String str) {
        if (i < 0) {
            return np8.R("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return np8.R("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static float d(c7a c7a) {
        float f2;
        float f3;
        int ordinal = c7a.ordinal();
        if (ordinal == 0) {
            f2 = fk4.d().getDisplayMetrics().density;
            f3 = 10.0f;
        } else if (ordinal == 1) {
            f2 = fk4.d().getDisplayMetrics().density;
            f3 = 12.0f;
        } else if (ordinal == 2) {
            f2 = fk4.d().getDisplayMetrics().density;
            f3 = 16.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return f2 * f3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: yj4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: yj4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: yj4} */
    /* JADX WARNING: type inference failed for: r5v0, types: [yj4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v37, types: [zj4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v28, types: [zj4, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.wj4 e(defpackage.hm9 r20) {
        /*
            r0 = r20
            int r1 = r20.F()
            int r2 = r20.D()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            yj4 r5 = new yj4
            r5.<init>()
            r6 = 0
            r5.a = r6
            r5.b = r1
            r5.c = r6
            r5.d = r2
            r4.add(r5)
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 + r2
            int r1 = r1 / 2
            int r1 = r1 * 2
            int r1 = r1 + r2
            int[] r5 = new int[r1]
            int r7 = r1 / 2
            int[] r1 = new int[r1]
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0038:
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L_0x0271
            int r9 = r4.size()
            int r9 = r9 - r2
            java.lang.Object r9 = r4.remove(r9)
            yj4 r9 = (defpackage.yj4) r9
            int r10 = r9.b()
            if (r10 < r2) goto L_0x01cc
            int r10 = r9.a()
            if (r10 >= r2) goto L_0x0057
            goto L_0x01cc
        L_0x0057:
            int r10 = r9.b()
            int r12 = r9.a()
            int r12 = r12 + r10
            int r12 = r12 + r2
            int r12 = r12 / 2
            int r10 = r9.a
            int r13 = r2 + r7
            r5[r13] = r10
            int r10 = r9.b
            r1[r13] = r10
            r10 = r6
        L_0x006e:
            if (r10 >= r12) goto L_0x01cc
            int r13 = r9.b()
            int r14 = r9.a()
            int r13 = r13 - r14
            int r13 = java.lang.Math.abs(r13)
            int r13 = r13 % 2
            if (r13 != r2) goto L_0x0083
            r13 = r2
            goto L_0x0084
        L_0x0083:
            r13 = r6
        L_0x0084:
            int r14 = r9.b()
            int r15 = r9.a()
            int r14 = r14 - r15
            int r15 = -r10
            r11 = r15
        L_0x008f:
            if (r11 > r10) goto L_0x0118
            if (r11 == r15) goto L_0x00ae
            if (r11 == r10) goto L_0x00a4
            int r16 = r11 + 1
            int r16 = r16 + r7
            r2 = r5[r16]
            int r16 = r11 + -1
            int r16 = r16 + r7
            r6 = r5[r16]
            if (r2 <= r6) goto L_0x00a4
            goto L_0x00ae
        L_0x00a4:
            int r2 = r11 + -1
            int r2 = r2 + r7
            r2 = r5[r2]
            int r6 = r2 + 1
        L_0x00ab:
            r16 = r12
            goto L_0x00b5
        L_0x00ae:
            int r2 = r11 + 1
            int r2 = r2 + r7
            r2 = r5[r2]
            r6 = r2
            goto L_0x00ab
        L_0x00b5:
            int r12 = r9.c
            r17 = r4
            int r4 = r9.a
            int r4 = r6 - r4
            int r4 = r4 + r12
            int r4 = r4 - r11
            if (r10 == 0) goto L_0x00c7
            if (r6 == r2) goto L_0x00c4
            goto L_0x00c7
        L_0x00c4:
            int r12 = r4 + -1
            goto L_0x00c8
        L_0x00c7:
            r12 = r4
        L_0x00c8:
            r18 = r8
        L_0x00ca:
            int r8 = r9.b
            if (r6 >= r8) goto L_0x00dd
            int r8 = r9.d
            if (r4 >= r8) goto L_0x00dd
            boolean r8 = r0.d(r6, r4)
            if (r8 == 0) goto L_0x00dd
            int r6 = r6 + 1
            int r4 = r4 + 1
            goto L_0x00ca
        L_0x00dd:
            int r8 = r11 + r7
            r5[r8] = r6
            if (r13 == 0) goto L_0x0107
            int r8 = r14 - r11
            r19 = r13
            int r13 = r15 + 1
            if (r8 < r13) goto L_0x0105
            int r13 = r10 + -1
            if (r8 > r13) goto L_0x0105
            int r8 = r8 + r7
            r8 = r1[r8]
            if (r8 > r6) goto L_0x0105
            zj4 r8 = new zj4
            r8.<init>()
            r8.a = r2
            r8.b = r12
            r8.c = r6
            r8.d = r4
            r2 = 0
            r8.e = r2
            goto L_0x0120
        L_0x0105:
            r2 = 0
            goto L_0x010a
        L_0x0107:
            r19 = r13
            goto L_0x0105
        L_0x010a:
            int r11 = r11 + 2
            r6 = r2
            r12 = r16
            r4 = r17
            r8 = r18
            r13 = r19
            r2 = 1
            goto L_0x008f
        L_0x0118:
            r17 = r4
            r2 = r6
            r18 = r8
            r16 = r12
            r8 = 0
        L_0x0120:
            if (r8 == 0) goto L_0x0127
            r11 = r8
            r19 = r9
            goto L_0x01d3
        L_0x0127:
            int r4 = r9.b()
            int r6 = r9.a()
            int r4 = r4 - r6
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0136
            r4 = 1
            goto L_0x0137
        L_0x0136:
            r4 = r2
        L_0x0137:
            int r6 = r9.b()
            int r8 = r9.a()
            int r6 = r6 - r8
            r8 = r15
        L_0x0141:
            if (r8 > r10) goto L_0x01b7
            if (r8 == r15) goto L_0x015c
            if (r8 == r10) goto L_0x0154
            int r11 = r8 + 1
            int r11 = r11 + r7
            r11 = r1[r11]
            int r12 = r8 + -1
            int r12 = r12 + r7
            r12 = r1[r12]
            if (r11 >= r12) goto L_0x0154
            goto L_0x015c
        L_0x0154:
            int r11 = r8 + -1
            int r11 = r11 + r7
            r11 = r1[r11]
            int r12 = r11 + -1
            goto L_0x0162
        L_0x015c:
            int r11 = r8 + 1
            int r11 = r11 + r7
            r11 = r1[r11]
            r12 = r11
        L_0x0162:
            int r13 = r9.d
            int r14 = r9.b
            int r14 = r14 - r12
            int r14 = r14 - r8
            int r13 = r13 - r14
            if (r10 == 0) goto L_0x0171
            if (r12 == r11) goto L_0x016e
            goto L_0x0171
        L_0x016e:
            int r14 = r13 + 1
            goto L_0x0172
        L_0x0171:
            r14 = r13
        L_0x0172:
            int r2 = r9.a
            if (r12 <= r2) goto L_0x018d
            int r2 = r9.c
            if (r13 <= r2) goto L_0x018d
            int r2 = r12 + -1
            r19 = r9
            int r9 = r13 + -1
            boolean r2 = r0.d(r2, r9)
            if (r2 == 0) goto L_0x018f
            int r12 = r12 + -1
            int r13 = r13 + -1
            r9 = r19
            goto L_0x0172
        L_0x018d:
            r19 = r9
        L_0x018f:
            int r2 = r8 + r7
            r1[r2] = r12
            if (r4 == 0) goto L_0x01b1
            int r2 = r6 - r8
            if (r2 < r15) goto L_0x01b1
            if (r2 > r10) goto L_0x01b1
            int r2 = r2 + r7
            r2 = r5[r2]
            if (r2 < r12) goto L_0x01b1
            zj4 r2 = new zj4
            r2.<init>()
            r2.a = r12
            r2.b = r13
            r2.c = r11
            r2.d = r14
            r4 = 1
            r2.e = r4
            goto L_0x01ba
        L_0x01b1:
            int r8 = r8 + 2
            r9 = r19
            r2 = 0
            goto L_0x0141
        L_0x01b7:
            r19 = r9
            r2 = 0
        L_0x01ba:
            if (r2 == 0) goto L_0x01be
            r11 = r2
            goto L_0x01d3
        L_0x01be:
            int r10 = r10 + 1
            r12 = r16
            r4 = r17
            r8 = r18
            r9 = r19
            r2 = 1
            r6 = 0
            goto L_0x006e
        L_0x01cc:
            r17 = r4
            r18 = r8
            r19 = r9
            r11 = 0
        L_0x01d3:
            if (r11 == 0) goto L_0x0261
            int r2 = r11.a()
            if (r2 <= 0) goto L_0x0217
            int r2 = r11.d
            int r4 = r11.b
            int r2 = r2 - r4
            int r6 = r11.c
            int r8 = r11.a
            int r6 = r6 - r8
            if (r2 == r6) goto L_0x020f
            boolean r9 = r11.e
            if (r9 == 0) goto L_0x01f5
            vj4 r2 = new vj4
            int r6 = r11.a()
            r2.<init>(r8, r4, r6)
            goto L_0x0214
        L_0x01f5:
            if (r2 <= r6) goto L_0x0203
            vj4 r2 = new vj4
            int r4 = r4 + 1
            int r6 = r11.a()
            r2.<init>(r8, r4, r6)
            goto L_0x0214
        L_0x0203:
            vj4 r2 = new vj4
            int r8 = r8 + 1
            int r6 = r11.a()
            r2.<init>(r8, r4, r6)
            goto L_0x0214
        L_0x020f:
            vj4 r2 = new vj4
            r2.<init>(r8, r4, r6)
        L_0x0214:
            r3.add(r2)
        L_0x0217:
            boolean r2 = r18.isEmpty()
            if (r2 == 0) goto L_0x0228
            yj4 r2 = new yj4
            r2.<init>()
            r6 = r18
            r9 = r19
            r4 = 1
            goto L_0x0238
        L_0x0228:
            int r2 = r18.size()
            r4 = 1
            int r2 = r2 - r4
            r6 = r18
            java.lang.Object r2 = r6.remove(r2)
            yj4 r2 = (defpackage.yj4) r2
            r9 = r19
        L_0x0238:
            int r8 = r9.a
            r2.a = r8
            int r8 = r9.c
            r2.c = r8
            int r8 = r11.a
            r2.b = r8
            int r8 = r11.b
            r2.d = r8
            r8 = r17
            r8.add(r2)
            int r2 = r9.b
            r9.b = r2
            int r2 = r9.d
            r9.d = r2
            int r2 = r11.c
            r9.a = r2
            int r2 = r11.d
            r9.c = r2
            r8.add(r9)
            goto L_0x026b
        L_0x0261:
            r8 = r17
            r6 = r18
            r9 = r19
            r4 = 1
            r6.add(r9)
        L_0x026b:
            r2 = r4
            r4 = r8
            r8 = r6
            r6 = 0
            goto L_0x0038
        L_0x0271:
            fs4 r2 = c
            java.util.Collections.sort(r3, r2)
            wj4 r2 = new wj4
            r2.<init>((defpackage.hm9) r0, (java.util.ArrayList) r3, (int[]) r5, (int[]) r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz7.e(hm9):wj4");
    }

    public static void f(String str, boolean z) {
        if (!z) {
            throw ParserException.a((RuntimeException) null, str);
        }
    }

    public static int g(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException(wg0.h("overflow: checkedAdd(", i, ", ", i2, ")"));
    }

    public static csc h(Bundle bundle, Bundle bundle2) {
        if (bundle != null) {
            bundle.setClassLoader(csc.class.getClassLoader());
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                linkedHashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
            }
            return new csc(linkedHashMap);
        } else if (bundle2 == null) {
            return new csc();
        } else {
            HashMap hashMap = new HashMap();
            for (String next : bundle2.keySet()) {
                hashMap.put(next, bundle2.get(next));
            }
            return new csc(hashMap);
        }
    }

    public static final boolean i(int i, int i2) {
        return i == i2;
    }

    public static boolean j(CharSequence charSequence, CharSequence charSequence2) {
        char c2;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((c2 = (char) ((charAt | ' ') - 'a')) >= 26 || c2 != ((char) ((charAt2 | ' ') - 'a')))) {
                return false;
            }
        }
        return true;
    }

    public static long k(long j, k92 k92) {
        long j2;
        Comparable comparable;
        Long b2;
        uaa uaa = k92.f0;
        if (uaa == null) {
            j2 = 0;
        } else {
            j2 = k92.g0;
            if (j2 == 0 && (uaa.b() == null || ((b2 = uaa.b()) != null && b2.longValue() == 0))) {
                j2 = k92.h0;
            }
        }
        long j3 = 0L;
        Comparable[] comparableArr = {Long.valueOf(k92.P), Long.valueOf(j), Long.valueOf(j2)};
        if (comparableArr.length == 0) {
            comparable = null;
        } else {
            Comparable comparable2 = comparableArr[0];
            int i = 1;
            int length = comparableArr.length - 1;
            if (1 <= length) {
                while (true) {
                    Comparable comparable3 = comparableArr[i];
                    if (comparable2.compareTo(comparable3) < 0) {
                        comparable2 = comparable3;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            comparable = comparable2;
        }
        if (comparable != null) {
            j3 = comparable;
        }
        long longValue = ((Number) j3).longValue();
        return longValue == 0 ? k92.k : longValue;
    }

    public static final HashSet l(String str) {
        HashSet hashSet = new HashSet();
        try {
            for (String add : w9e.Q0(str, new String[]{","}, false, 6)) {
                hashSet.add(add);
            }
        } catch (Throwable th) {
            hm9.p("WorkersQueue/TagsTypeConverter", "fail to convert string to tags", th);
        }
        return hashSet;
    }

    public static final at m(View view) {
        return new at(5, new jnf(view, (Continuation) null));
    }

    public static Context n(Context context) {
        int c2;
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (c2 = on0.c(context)) != on0.c(applicationContext)) {
            applicationContext = on0.a(applicationContext, c2);
        }
        if (i < 30) {
            return applicationContext;
        }
        String b2 = eu3.b(context);
        return !Objects.equals(b2, eu3.b(applicationContext)) ? eu3.a(applicationContext, b2) : applicationContext;
    }

    public static int o(int i) {
        return i >= tu0.G(((float) 200) * fk4.d().getDisplayMetrics().density) ? tu0.G(((float) 90) * fk4.d().getDisplayMetrics().density) : i >= tu0.G(((float) 72) * fk4.d().getDisplayMetrics().density) ? tu0.G(((float) 36) * fk4.d().getDisplayMetrics().density) : i >= tu0.G(((float) 64) * fk4.d().getDisplayMetrics().density) ? tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density) : i >= tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density) ? tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density) : i >= tu0.G(((float) 36) * fk4.d().getDisplayMetrics().density) ? tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density) : i >= tu0.G(((float) 32) * fk4.d().getDisplayMetrics().density) ? tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density) : i >= 28 ? tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density) : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:7|8|9|10|(1:12)(1:13)|14|15|16|17|18|(1:20)|23|24|25|(2:27|(1:29)(1:30))(1:31)|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[Catch:{ RemoteException -> 0x0079, all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070 A[Catch:{ RemoteException -> 0x0079, all -> 0x004c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int p(android.content.Context r5) {
        /*
            java.lang.Class<lz7> r0 = defpackage.lz7.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            defpackage.fp3.o(r5, r1)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "null"
            java.lang.String r2 = "preferredRenderer: "
            r2.concat(r1)     // Catch:{ all -> 0x004c }
            boolean r1 = a     // Catch:{ all -> 0x004c }
            r2 = 0
            if (r1 == 0) goto L_0x0015
            goto L_0x0077
        L_0x0015:
            hhg r1 = defpackage.dy7.N(r5)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0080 }
            sfg r3 = r1.I0()     // Catch:{ RemoteException -> 0x0079 }
            defpackage.fp3.n(r3)     // Catch:{ RemoteException -> 0x0079 }
            defpackage.mr0.m = r3     // Catch:{ RemoteException -> 0x0079 }
            xig r3 = r1.K0()     // Catch:{ RemoteException -> 0x0079 }
            xig r4 = defpackage.z04.d     // Catch:{ RemoteException -> 0x0079 }
            if (r4 == 0) goto L_0x002b
            goto L_0x0032
        L_0x002b:
            java.lang.String r4 = "delegate must not be null"
            defpackage.fp3.o(r3, r4)     // Catch:{ RemoteException -> 0x0079 }
            defpackage.z04.d = r3     // Catch:{ RemoteException -> 0x0079 }
        L_0x0032:
            r3 = 1
            a = r3     // Catch:{ all -> 0x004c }
            android.os.Parcel r3 = r1.G0()     // Catch:{ RemoteException -> 0x0062 }
            r4 = 9
            android.os.Parcel r3 = r1.R(r3, r4)     // Catch:{ RemoteException -> 0x0062 }
            int r4 = r3.readInt()     // Catch:{ RemoteException -> 0x0062 }
            r3.recycle()     // Catch:{ RemoteException -> 0x0062 }
            r3 = 2
            if (r4 != r3) goto L_0x004e
            b = r3     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x004e
        L_0x004c:
            r5 = move-exception
            goto L_0x0085
        L_0x004e:
            oy9 r3 = new oy9     // Catch:{ RemoteException -> 0x0062 }
            r3.<init>(r5)     // Catch:{ RemoteException -> 0x0062 }
            android.os.Parcel r5 = r1.G0()     // Catch:{ RemoteException -> 0x0062 }
            defpackage.agg.c(r5, r3)     // Catch:{ RemoteException -> 0x0062 }
            r5.writeInt(r2)     // Catch:{ RemoteException -> 0x0062 }
            r3 = 10
            r1.H0(r5, r3)     // Catch:{ RemoteException -> 0x0062 }
        L_0x0062:
            int r5 = b     // Catch:{ all -> 0x004c }
            r1 = 1
            if (r5 == r1) goto L_0x0070
            r1 = 2
            if (r5 == r1) goto L_0x006d
            java.lang.String r5 = "null"
            goto L_0x0072
        L_0x006d:
            java.lang.String r5 = "LATEST"
            goto L_0x0072
        L_0x0070:
            java.lang.String r5 = "LEGACY"
        L_0x0072:
            java.lang.String r1 = "loadedRenderer: "
            r1.concat(r5)     // Catch:{ all -> 0x004c }
        L_0x0077:
            monitor-exit(r0)
            return r2
        L_0x0079:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch:{ all -> 0x004c }
            r1.<init>(r5)     // Catch:{ all -> 0x004c }
            throw r1     // Catch:{ all -> 0x004c }
        L_0x0080:
            r5 = move-exception
            int r5 = r5.a     // Catch:{ all -> 0x004c }
            monitor-exit(r0)
            return r5
        L_0x0085:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz7.p(android.content.Context):int");
    }

    public static vi4 q(Context context) {
        int i;
        long j;
        vi4 vi4 = vi4.c;
        vi4 vi42 = vi4.b;
        if (vi42 != null) {
            return vi42;
        }
        int i2 = Build.VERSION.SDK_INT;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        try {
            if (activityManager.isLowRamDevice()) {
                return vi4;
            }
            i = activityManager.getMemoryClass();
            if (Build.VERSION.SDK_INT >= 31 && Build.SOC_MODEL != null && ys.R(Build.SOC_MODEL.toUpperCase(Locale.getDefault()).hashCode(), vi4.a)) {
                return vi4;
            }
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < availableProcessors; i5++) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i5 + "/cpufreq/cpuinfo_max_freq", "r");
                    String readLine = randomAccessFile.readLine();
                    if (readLine != null) {
                        if (readLine.length() != 0) {
                            i4 += Integer.parseInt(readLine) / 1000;
                            i3++;
                        }
                    }
                    randomAccessFile.close();
                } catch (FileNotFoundException | IOException unused) {
                }
            }
            int ceil = i3 == 0 ? -1 : (int) Math.ceil(((double) i4) / ((double) i3));
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                j = memoryInfo.totalMem;
            } catch (Throwable unused2) {
                j = -1;
            }
            if (availableProcessors > 2 && i > 100 && ((availableProcessors > 4 || ceil == -1 || ceil > 1250) && (j == -1 || j >= 2147483648L))) {
                vi4 = (availableProcessors < 8 || i <= 160 || (ceil != -1 && ceil <= 2050)) ? vi4.o : vi4.X;
            }
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                String str = Build.MANUFACTURER;
                StringBuilder sb = new StringBuilder("selected_class = ");
                sb.append(vi4);
                sb.append(": (cpu_count = ");
                sb.append(availableProcessors);
                sb.append(", freq = ");
                ms2.k(sb, ceil, ", memoryClass = ", i, ", android version ");
                sb.append(i2);
                sb.append(", manufacture ");
                sb.append(str);
                sb.append(")");
                ir6.d(us7, "DevicePerformanceClass", sb.toString(), (Throwable) null);
            }
            vi4.b = vi4;
            return vi4;
        } catch (Throwable unused3) {
            i = 0;
        }
    }

    public static int r(c7a c7a) {
        int ordinal = c7a.ordinal();
        if (ordinal == 0) {
            return tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density);
        }
        if (ordinal == 1) {
            return tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density);
        }
        if (ordinal == 2) {
            return tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density);
        }
        throw new NoWhenBranchMatchedException();
    }

    public void A(dh8 dh8) {
    }

    public void B() {
    }

    public float a(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public abstract void w(dh8 dh8);

    public void x() {
    }

    public void y(dh8 dh8) {
    }

    public void z() {
    }
}
