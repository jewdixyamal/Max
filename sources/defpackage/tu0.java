package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;

/* renamed from: tu0  reason: default package */
public abstract class tu0 {
    public static final int[] a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781, 16844062};
    public static final int[] e = {16843161};
    public static final int[] f = {16842755, 16843213};
    public static final yxc g = new yxc(10);
    public static final Object h = new Object();
    public static final Object i = new Object();
    public static boolean j;
    public static long k;
    public static jm9 l;
    public static final /* synthetic */ int m = 0;

    public static void A(Set set, pi0 pi0, boolean z) {
        hm9.m("tu0", "event: " + pi0.getClass().getName() + " postponed", new Object[0]);
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                pi0 pi02 = (pi0) it.next();
                if (pi02.getClass().equals(pi0.getClass())) {
                    arrayList.add(pi02);
                }
            }
            set.removeAll(arrayList);
        }
        set.add(pi0);
    }

    public static long B(int i2, byte[] bArr) {
        byte b2 = bArr[i2];
        byte b3 = bArr[i2 + 1];
        byte b4 = bArr[i2 + 2];
        byte b5 = bArr[i2 + 3];
        byte b6 = b2 & true;
        int i3 = b2;
        if (b6 == true) {
            i3 = (b2 & Byte.MAX_VALUE) + 128;
        }
        byte b7 = b3 & true;
        int i4 = b3;
        if (b7 == true) {
            i4 = (b3 & Byte.MAX_VALUE) + 128;
        }
        byte b8 = b4 & true;
        int i5 = b4;
        if (b8 == true) {
            i5 = (b4 & Byte.MAX_VALUE) + 128;
        }
        byte b9 = b5 & true;
        int i6 = b5;
        if (b9 == true) {
            i6 = (b5 & Byte.MAX_VALUE) + 128;
        }
        return (((long) i3) << 24) + (((long) i4) << 16) + (((long) i5) << 8) + ((long) i6);
    }

    public static final int C(InputStream inputStream, int i2, boolean z) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int read = inputStream.read();
            if (read != -1) {
                if (z) {
                    i3 = (read & 255) << (i4 * 8);
                } else {
                    i5 <<= 8;
                    i3 = read & 255;
                }
                i5 |= i3;
                i4++;
            } else {
                throw new IOException("no more bytes");
            }
        }
        return i5;
    }

    public static long D(int i2, byte[] bArr) {
        long B = B(i2, bArr);
        long B2 = B(i2 + 4, bArr);
        if (B == 0 && B2 == 0) {
            return 0;
        }
        return ((B2 * 1000) / 4294967296L) + ((B - 2208988800L) * 1000);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, eaf] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0415, code lost:
        defpackage.hm9.n("ConfigurationUserSettingsParsing", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e0, code lost:
        r7 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.gaf E(defpackage.gy8 r12) {
        /*
            r0 = 0
            r1 = 1
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            eaf r4 = new eaf
            r4.<init>()
            int r5 = defpackage.lz7.N(r12)     // Catch:{ all -> 0x0010 }
            goto L_0x003f
        L_0x0010:
            r5 = move-exception
            defpackage.hm9.l0(r3, r2, r5)
            java.util.concurrent.CopyOnWriteArraySet r6 = defpackage.u7d.a
            java.util.Iterator r6 = r6.iterator()
        L_0x001a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x002d
            java.lang.Object r7 = r6.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r5)
            goto L_0x001a
        L_0x002d:
            int r6 = defpackage.k7d.a
            int r6 = defpackage.au1.s(r6)
            if (r6 == 0) goto L_0x003e
            if (r6 == r1) goto L_0x003d
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x003d:
            throw r5
        L_0x003e:
            r5 = r0
        L_0x003f:
            r6 = r0
        L_0x0040:
            if (r6 >= r5) goto L_0x0478
            java.lang.String r7 = defpackage.lz7.P(r12)     // Catch:{ all -> 0x0047 }
            goto L_0x0079
        L_0x0047:
            r7 = move-exception
            defpackage.hm9.l0(r3, r2, r7)     // Catch:{ all -> 0x0064 }
            java.util.concurrent.CopyOnWriteArraySet r8 = defpackage.u7d.a     // Catch:{ all -> 0x0064 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0064 }
        L_0x0051:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x0067
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0064 }
            r4a r9 = (defpackage.r4a) r9     // Catch:{ all -> 0x0064 }
            r9.getClass()     // Catch:{ all -> 0x0064 }
            defpackage.r4a.a(r7)     // Catch:{ all -> 0x0064 }
            goto L_0x0051
        L_0x0064:
            r12 = move-exception
            goto L_0x044b
        L_0x0067:
            int r8 = defpackage.k7d.a     // Catch:{ all -> 0x0064 }
            int r8 = defpackage.au1.s(r8)     // Catch:{ all -> 0x0064 }
            if (r8 == 0) goto L_0x0078
            if (r8 == r1) goto L_0x0077
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0064 }
            r12.<init>()     // Catch:{ all -> 0x0064 }
            throw r12     // Catch:{ all -> 0x0064 }
        L_0x0077:
            throw r7     // Catch:{ all -> 0x0064 }
        L_0x0078:
            r7 = 0
        L_0x0079:
            if (r7 == 0) goto L_0x0448
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r8.<init>()     // Catch:{ all -> 0x00ba }
            r8.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r9 = "="
            r8.append(r9)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00ba }
            int r9 = r7.hashCode()     // Catch:{ all -> 0x00ba }
            switch(r9) {
                case -2099474505: goto L_0x03df;
                case -1972016425: goto L_0x03bb;
                case -1965172674: goto L_0x039b;
                case -1917056995: goto L_0x0377;
                case -952000630: goto L_0x0356;
                case -747186863: goto L_0x0331;
                case -694542025: goto L_0x030c;
                case -658898441: goto L_0x02e7;
                case -389923664: goto L_0x02c2;
                case -248197113: goto L_0x029d;
                case 75243: goto L_0x0278;
                case 2634307: goto L_0x0253;
                case 130531239: goto L_0x022e;
                case 136965804: goto L_0x020d;
                case 345218686: goto L_0x01e8;
                case 640193528: goto L_0x0191;
                case 836229259: goto L_0x016c;
                case 1633771469: goto L_0x0147;
                case 1684923157: goto L_0x0123;
                case 1911151182: goto L_0x0103;
                case 1950966460: goto L_0x00e3;
                case 1958389377: goto L_0x00bd;
                case 2130809258: goto L_0x0095;
                default: goto L_0x0093;
            }     // Catch:{ all -> 0x00ba }
        L_0x0093:
            goto L_0x03e7
        L_0x0095:
            java.lang.String r9 = "HIDDEN"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x009f
            goto L_0x03e7
        L_0x009f:
            boolean r7 = r12.u0()     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.h = r9     // Catch:{ all -> 0x00ba }
            goto L_0x0415
        L_0x00ba:
            r7 = move-exception
            goto L_0x041b
        L_0x00bd:
            java.lang.String r9 = "M_CALL_PUSH_NOTIFICATION"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x00c7
            goto L_0x03e7
        L_0x00c7:
            java.lang.String r7 = defpackage.lz7.P(r12)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            int r7 = defpackage.h4f.c(r7)     // Catch:{ all -> 0x00ba }
            r4.r = r7     // Catch:{ all -> 0x00ba }
        L_0x00e0:
            r7 = r8
            goto L_0x0415
        L_0x00e3:
            java.lang.String r9 = "DIALOGS_PUSH_NOTIFICATION"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x00ed
            goto L_0x03e7
        L_0x00ed:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            r4.c = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x0103:
            java.lang.String r9 = "CHATS_PUSH_SOUND"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x010d
            goto L_0x03e7
        L_0x010d:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            r4.g = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x0123:
            java.lang.String r9 = "SAFE_MODE"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x012d
            goto L_0x03e7
        L_0x012d:
            boolean r7 = defpackage.lz7.H(r12)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            r4.u = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x0147:
            java.lang.String r9 = "CHATS_INVITE"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0151
            goto L_0x03e7
        L_0x0151:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            int r7 = defpackage.h4f.d(r7)     // Catch:{ all -> 0x00ba }
            r4.o = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x016c:
            java.lang.String r9 = "AUDIO_TRANSCRIPTION_ENABLED"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0176
            goto L_0x03e7
        L_0x0176:
            boolean r7 = defpackage.lz7.H(r12)     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.t = r9     // Catch:{ all -> 0x00ba }
            goto L_0x0415
        L_0x0191:
            java.lang.String r9 = "INACTIVE_TTL"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x019b
            goto L_0x03e7
        L_0x019b:
            java.lang.String r7 = defpackage.lz7.P(r12)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            faf r9 = defpackage.faf.TTL_6M     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x01e4
            r10 = -1
            int r11 = r7.hashCode()
            switch(r11) {
                case 1596: goto L_0x01d1;
                case 1658: goto L_0x01c6;
                case 1751: goto L_0x01bb;
                default: goto L_0x01ba;
            }
        L_0x01ba:
            goto L_0x01db
        L_0x01bb:
            java.lang.String r11 = "6M"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x01c4
            goto L_0x01db
        L_0x01c4:
            r10 = 2
            goto L_0x01db
        L_0x01c6:
            java.lang.String r11 = "3M"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x01cf
            goto L_0x01db
        L_0x01cf:
            r10 = r1
            goto L_0x01db
        L_0x01d1:
            java.lang.String r11 = "1M"
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L_0x01da
            goto L_0x01db
        L_0x01da:
            r10 = r0
        L_0x01db:
            switch(r10) {
                case 0: goto L_0x01e2;
                case 1: goto L_0x01df;
                case 2: goto L_0x01e4;
                default: goto L_0x01de;
            }
        L_0x01de:
            goto L_0x01e4
        L_0x01df:
            faf r9 = defpackage.faf.TTL_3M     // Catch:{ all -> 0x00ba }
            goto L_0x01e4
        L_0x01e2:
            faf r9 = defpackage.faf.TTL_1M     // Catch:{ all -> 0x00ba }
        L_0x01e4:
            r4.q = r9     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x01e8:
            java.lang.String r9 = "UNSAFE_FILES"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x01f2
            goto L_0x03e7
        L_0x01f2:
            boolean r7 = defpackage.lz7.H(r12)     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.w = r9     // Catch:{ all -> 0x00ba }
            goto L_0x0415
        L_0x020d:
            java.lang.String r9 = "CHATS_PUSH_NOTIFICATION"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0217
            goto L_0x03e7
        L_0x0217:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            r4.d = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x022e:
            java.lang.String r9 = "CHATS_LED"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0238
            goto L_0x03e7
        L_0x0238:
            int r7 = r12.v0()     // Catch:{ all -> 0x00ba }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.k = r9     // Catch:{ all -> 0x00ba }
            goto L_0x0415
        L_0x0253:
            java.lang.String r9 = "VIBR"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x025d
            goto L_0x03e7
        L_0x025d:
            boolean r7 = r12.u0()     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.l = r9     // Catch:{ all -> 0x00ba }
            goto L_0x0415
        L_0x0278:
            java.lang.String r9 = "LED"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0282
            goto L_0x03e7
        L_0x0282:
            int r7 = r12.v0()     // Catch:{ all -> 0x00ba }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.i = r9     // Catch:{ all -> 0x00ba }
            goto L_0x0415
        L_0x029d:
            java.lang.String r9 = "CHATS_VIBR"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x02a7
            goto L_0x03e7
        L_0x02a7:
            boolean r7 = r12.u0()     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.n = r9     // Catch:{ all -> 0x00ba }
            goto L_0x0415
        L_0x02c2:
            java.lang.String r9 = "DONT_DISTURB_UNTIL"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x02cc
            goto L_0x03e7
        L_0x02cc:
            long r9 = r12.w0()     // Catch:{ all -> 0x00ba }
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r11.<init>()     // Catch:{ all -> 0x00ba }
            r11.append(r8)     // Catch:{ all -> 0x00ba }
            r11.append(r9)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x00ba }
            r4.b = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x02e7:
            java.lang.String r9 = "DIALOGS_VIBR"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x02f1
            goto L_0x03e7
        L_0x02f1:
            boolean r7 = r12.u0()     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.m = r9     // Catch:{ all -> 0x00ba }
            goto L_0x0415
        L_0x030c:
            java.lang.String r9 = "PUSH_NEW_CONTACTS"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0316
            goto L_0x03e7
        L_0x0316:
            boolean r7 = r12.u0()     // Catch:{ all -> 0x00ba }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.a = r9     // Catch:{ all -> 0x00ba }
            goto L_0x0415
        L_0x0331:
            java.lang.String r9 = "SUGGEST_STICKERS"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x033b
            goto L_0x03e7
        L_0x033b:
            java.lang.String r7 = defpackage.lz7.P(r12)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            int r7 = defpackage.h4f.e(r7)     // Catch:{ all -> 0x00ba }
            r4.s = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x0356:
            java.lang.String r9 = "PUSH_SOUND"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0360
            goto L_0x03e7
        L_0x0360:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            r4.e = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x0377:
            java.lang.String r9 = "SEARCH_BY_PHONE"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x0380
            goto L_0x03e7
        L_0x0380:
            java.lang.String r7 = defpackage.lz7.P(r12)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            int r7 = defpackage.h4f.d(r7)     // Catch:{ all -> 0x00ba }
            r4.v = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x039b:
            java.lang.String r9 = "DIALOGS_PUSH_SOUND"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x03a4
            goto L_0x03e7
        L_0x03a4:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            r4.f = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x03bb:
            java.lang.String r9 = "INCOMING_CALL"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x03c4
            goto L_0x03e7
        L_0x03c4:
            java.lang.String r7 = r12.z0()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r9.<init>()     // Catch:{ all -> 0x00ba }
            r9.append(r8)     // Catch:{ all -> 0x00ba }
            r9.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00ba }
            int r7 = defpackage.h4f.d(r7)     // Catch:{ all -> 0x00ba }
            r4.p = r7     // Catch:{ all -> 0x00ba }
            goto L_0x00e0
        L_0x03df:
            java.lang.String r9 = "DIALOGS_LED"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x00ba }
            if (r7 != 0) goto L_0x03fc
        L_0x03e7:
            r12.z()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "skip!"
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00ba }
            goto L_0x0415
        L_0x03fc:
            int r7 = r12.v0()     // Catch:{ all -> 0x00ba }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r10.<init>()     // Catch:{ all -> 0x00ba }
            r10.append(r8)     // Catch:{ all -> 0x00ba }
            r10.append(r7)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x00ba }
            r4.j = r9     // Catch:{ all -> 0x00ba }
        L_0x0415:
            java.lang.String r8 = "ConfigurationUserSettingsParsing"
            defpackage.hm9.m(r8, r7, new java.lang.Object[0])     // Catch:{ all -> 0x00ba }
            goto L_0x0448
        L_0x041b:
            defpackage.hm9.l0(r3, r2, r7)     // Catch:{ all -> 0x0064 }
            java.util.concurrent.CopyOnWriteArraySet r8 = defpackage.u7d.a     // Catch:{ all -> 0x0064 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0064 }
        L_0x0424:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0064 }
            if (r9 == 0) goto L_0x0437
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0064 }
            r4a r9 = (defpackage.r4a) r9     // Catch:{ all -> 0x0064 }
            r9.getClass()     // Catch:{ all -> 0x0064 }
            defpackage.r4a.a(r7)     // Catch:{ all -> 0x0064 }
            goto L_0x0424
        L_0x0437:
            int r8 = defpackage.k7d.a     // Catch:{ all -> 0x0064 }
            int r8 = defpackage.au1.s(r8)     // Catch:{ all -> 0x0064 }
            if (r8 == 0) goto L_0x0448
            if (r8 == r1) goto L_0x0447
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0064 }
            r12.<init>()     // Catch:{ all -> 0x0064 }
            throw r12     // Catch:{ all -> 0x0064 }
        L_0x0447:
            throw r7     // Catch:{ all -> 0x0064 }
        L_0x0448:
            int r6 = r6 + r1
            goto L_0x0040
        L_0x044b:
            defpackage.hm9.l0(r3, r2, r12)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0454:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0467
            java.lang.Object r2 = r0.next()
            r4a r2 = (defpackage.r4a) r2
            r2.getClass()
            defpackage.r4a.a(r12)
            goto L_0x0454
        L_0x0467:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0478
            if (r0 == r1) goto L_0x0477
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x0477:
            throw r12
        L_0x0478:
            gaf r12 = new gaf
            r12.<init>(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu0.E(gy8):gaf");
    }

    public static int F(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d2 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d2);
        }
    }

    public static int G(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long H(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [qpd, java.util.Map] */
    public static final Map I(gy8 gy8) {
        int a2 = gy8.n().a();
        oz4 oz4 = oz4.a;
        if (a2 != 8) {
            gy8.z();
            return oz4;
        }
        int N = lz7.N(gy8);
        if (N == 0) {
            return oz4;
        }
        ? qpd = new qpd(N);
        for (int i2 = 0; i2 < N; i2++) {
            String P = lz7.P(gy8);
            if (P != null) {
                qpd.put(P, J(gy8));
            } else {
                gy8.z();
            }
        }
        return qpd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object J(defpackage.gy8 r4) {
        /*
            av8 r0 = r4.n()
            int r0 = r0.a()
            if (r0 != 0) goto L_0x000c
            r0 = -1
            goto L_0x0014
        L_0x000c:
            int[] r1 = defpackage.qe3.$EnumSwitchMapping$0
            int r0 = defpackage.au1.s(r0)
            r0 = r1[r0]
        L_0x0014:
            r1 = 0
            switch(r0) {
                case 1: goto L_0x0072;
                case 2: goto L_0x0069;
                case 3: goto L_0x0051;
                case 4: goto L_0x004c;
                case 5: goto L_0x0047;
                case 6: goto L_0x0021;
                case 7: goto L_0x001c;
                default: goto L_0x0018;
            }
        L_0x0018:
            r4.z()
            return r1
        L_0x001c:
            java.util.Map r4 = I(r4)
            goto L_0x007c
        L_0x0021:
            av8 r0 = r4.n()
            int r0 = r0.a()
            r2 = 7
            if (r0 != r2) goto L_0x0042
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r0 = r4.s0()
            r2 = 0
        L_0x0036:
            if (r2 >= r0) goto L_0x0045
            java.lang.Object r3 = J(r4)
            r1.add(r3)
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0042:
            r4.z()
        L_0x0045:
            r4 = r1
            goto L_0x007c
        L_0x0047:
            java.lang.String r4 = defpackage.lz7.Q(r4, r1)
            goto L_0x007c
        L_0x004c:
            java.lang.Float r4 = defpackage.lz7.K(r4, r1)
            goto L_0x007c
        L_0x0051:
            av8 r0 = r4.n()
            int r0 = r0.a()
            r2 = 3
            if (r0 != r2) goto L_0x0065
            long r0 = r4.w0()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x0045
        L_0x0065:
            r4.z()
            goto L_0x0045
        L_0x0069:
            boolean r4 = defpackage.lz7.H(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x007c
        L_0x0072:
            byte r4 = r4.readByte()
            r0 = -64
            if (r4 != r0) goto L_0x007d
            e5f r4 = defpackage.e5f.a
        L_0x007c:
            return r4
        L_0x007d:
            java.lang.String r0 = "Nil"
            org.msgpack.core.MessagePackException r4 = defpackage.gy8.r0(r0, r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu0.J(gy8):java.lang.Object");
    }

    public static final void K(View view, long j2, View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            view.setOnClickListener(new e44(j2, onClickListener));
        } else {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public static void M(a66 a66, Object obj, Continuation continuation) {
        try {
            DispatchedContinuationKt.resumeCancellableWith(v3c.u(v3c.j(a66, obj, continuation)), e5f.a, (m56) null);
        } catch (Throwable th) {
            continuation.resumeWith(new njc(th));
            throw th;
        }
    }

    public static final void N(y9b y9b, WorkDatabase workDatabase, me3 me3, List list, h8g h8g, Set set) {
        i8g y = workDatabase.y();
        String str = h8g.a;
        h8g l2 = y.l(str);
        if (l2 == null) {
            throw new IllegalArgumentException(zr6.i("Worker with ", str, " doesn't exist"));
        } else if (!l2.b.a()) {
            if (!(l2.d() ^ h8g.d())) {
                boolean d2 = y9b.d(str);
                if (!d2) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((auc) it.next()).d(str);
                    }
                }
                workDatabase.q(new dk8(workDatabase, h8g, l2, list, str, set, d2));
                if (!d2) {
                    nuc.a(me3, workDatabase, list);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Can't update ");
            String str2 = "OneTime";
            sb.append(l2.d() ? "Periodic" : str2);
            sb.append(" Worker to ");
            if (h8g.d()) {
                str2 = "Periodic";
            }
            throw new UnsupportedOperationException(zr6.l(sb, str2, " Worker. Update operation must preserve worker's type."));
        }
    }

    public static long a() {
        DatagramSocket datagramSocket;
        long j2;
        synchronized (i) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j2 = currentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j3 = currentTimeMillis / 1000;
                long j4 = currentTimeMillis - (j3 * 1000);
                long j5 = j3 + 2208988800L;
                j2 = currentTimeMillis;
                bArr[40] = (byte) ((int) (j5 >> 24));
                bArr[41] = (byte) ((int) (j5 >> 16));
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) ((int) (j5 >> 8));
                    bArr[43] = (byte) ((int) j5);
                    long j6 = (j4 * 4294967296L) / 1000;
                    bArr[44] = (byte) ((int) (j6 >> 24));
                    bArr[45] = (byte) ((int) (j6 >> 16));
                    bArr[46] = (byte) ((int) (j6 >> 8));
                    bArr[47] = (byte) ((int) (Math.random() * 255.0d));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j7 = (elapsedRealtime2 - elapsedRealtime) + j2;
            byte b2 = bArr[0];
            long D = D(24, bArr);
            long D2 = D(32, bArr);
            long D3 = D(40, bArr);
            d((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), bArr[1] & 255, D3);
            long j8 = (j7 + (((D3 - j7) + (D2 - D)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j8;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
            Throwable th22 = th;
            datagramSocket.close();
            throw th22;
        }
    }

    public static final void b(LinkedHashMap linkedHashMap, r6d r6d, String str, int i2) {
        String str2 = tpa.f(r6d.e(), w6d.f) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException("The suggested name '" + str + "' for " + str2 + ' ' + r6d.g(i2) + " is already one of the names for " + str2 + ' ' + r6d.g(((Number) mz7.X(linkedHashMap, str)).intValue()) + " in " + r6d);
    }

    public static void d(byte b2, byte b3, int i2, long j2) {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b3 != 4 && b3 != 5) {
            throw new IOException(zr6.h(b3, "SNTP: Untrusted mode: "));
        } else if (i2 == 0 || i2 > 15) {
            throw new IOException(zr6.h(i2, "SNTP: Untrusted stratum: "));
        } else if (j2 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String, java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|19|20|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab A[SYNTHETIC, Splitter:B:39:0x00ab] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0 A[Catch:{ Exception -> 0x00b3 }, DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri e(android.net.Uri r7, android.content.Context r8, defpackage.zi5 r9) {
        /*
            java.lang.String r0 = "tu0"
            java.lang.String r1 = "Uri is from FileProvider, need copy: "
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0021 }
            r3.<init>(r1)     // Catch:{ all -> 0x0021 }
            r3.append(r7)     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0021 }
            defpackage.hm9.m(r0, r1, new java.lang.Object[0])     // Catch:{ all -> 0x0021 }
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = r1.getType(r7)     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = "application/octet-stream"
            goto L_0x0025
        L_0x0021:
            r8 = move-exception
            r4 = r2
            goto L_0x00a4
        L_0x0025:
            android.webkit.MimeTypeMap r3 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ all -> 0x0021 }
            java.lang.String r3 = r3.getExtensionFromMimeType(r1)     // Catch:{ all -> 0x0021 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0021 }
            r4.<init>()     // Catch:{ all -> 0x0021 }
            java.lang.String r5 = r7.getLastPathSegment()     // Catch:{ all -> 0x0021 }
            if (r5 == 0) goto L_0x003f
            java.lang.String r5 = r7.getLastPathSegment()     // Catch:{ all -> 0x0021 }
            r4.append(r5)     // Catch:{ all -> 0x0021 }
        L_0x003f:
            if (r3 == 0) goto L_0x0053
            java.lang.String r5 = r4.toString()     // Catch:{ all -> 0x0021 }
            boolean r5 = r5.endsWith(r3)     // Catch:{ all -> 0x0021 }
            if (r5 != 0) goto L_0x0053
            java.lang.String r5 = "."
            r4.append(r5)     // Catch:{ all -> 0x0021 }
            r4.append(r3)     // Catch:{ all -> 0x0021 }
        L_0x0053:
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0021 }
            kk5 r9 = (defpackage.kk5) r9     // Catch:{ all -> 0x0021 }
            java.io.File r9 = r9.q(r3)     // Catch:{ all -> 0x0021 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0021 }
            r3.<init>(r9)     // Catch:{ all -> 0x0021 }
            android.content.ContentResolver r4 = r8.getContentResolver()     // Catch:{ all -> 0x00a1 }
            java.io.InputStream r4 = r4.openInputStream(r7)     // Catch:{ all -> 0x00a1 }
            defpackage.s5c.t(r4, r3)     // Catch:{ all -> 0x0089 }
            r3.close()     // Catch:{ all -> 0x0089 }
            r4.close()     // Catch:{ all -> 0x0089 }
            android.net.Uri r9 = android.net.Uri.fromFile(r9)     // Catch:{ all -> 0x0089 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0089 }
            r5.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "mime_type"
            r5.put(r6, r1)     // Catch:{ all -> 0x0089 }
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x008c }
            r1.update(r9, r5, r2, r2)     // Catch:{ IllegalArgumentException -> 0x008c }
            goto L_0x009a
        L_0x0089:
            r8 = move-exception
        L_0x008a:
            r2 = r3
            goto L_0x00a4
        L_0x008c:
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0094 }
            r8.insert(r9, r5)     // Catch:{ IllegalArgumentException -> 0x0094 }
            goto L_0x009a
        L_0x0094:
            r8 = move-exception
            java.lang.String r1 = "copyContentOfUri failed to copy mimetype"
            defpackage.hm9.l0(r0, r1, r8)     // Catch:{ all -> 0x0089 }
        L_0x009a:
            r3.close()     // Catch:{ Exception -> 0x00a0 }
            r4.close()     // Catch:{ Exception -> 0x00a0 }
        L_0x00a0:
            return r9
        L_0x00a1:
            r8 = move-exception
            r4 = r2
            goto L_0x008a
        L_0x00a4:
            java.lang.String r9 = "handleSingleMediaIntent failed to copy FileProvider uri: "
            defpackage.hm9.p(r0, r9, r8)     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x00ae
            r2.close()     // Catch:{ Exception -> 0x00b3 }
        L_0x00ae:
            if (r4 == 0) goto L_0x00b3
            r4.close()     // Catch:{ Exception -> 0x00b3 }
        L_0x00b3:
            return r7
        L_0x00b4:
            r7 = move-exception
            if (r2 == 0) goto L_0x00ba
            r2.close()     // Catch:{ Exception -> 0x00bf }
        L_0x00ba:
            if (r4 == 0) goto L_0x00bf
            r4.close()     // Catch:{ Exception -> 0x00bf }
        L_0x00bf:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu0.e(android.net.Uri, android.content.Context, zi5):android.net.Uri");
    }

    public static int f(Context context, int i2) {
        return (int) TypedValue.applyDimension(1, (float) i2, context.getResources().getDisplayMetrics());
    }

    public static final kq1 g(mn5 mn5, gh7 gh7, fg7 fg7) {
        return od2.g(new go5(gh7, fg7, mn5, (Continuation) null));
    }

    public static ffc h(ru0 ru0, ArrayList arrayList) {
        ww6 i2 = zw6.i();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Bundle bundle = (Bundle) arrayList.get(i3);
            bundle.getClass();
            i2.a(ru0.g(bundle));
        }
        return i2.j();
    }

    public static List i(ru0 ru0, ArrayList arrayList, ffc ffc) {
        return arrayList == null ? ffc : h(ru0, arrayList);
    }

    public static final int j(r6d r6d, ja7 ja7, String str) {
        boolean z = ja7.a.m;
        Object obj = null;
        yxc yxc = g;
        xh3 xh3 = ja7.c;
        if (!z || !tpa.f(r6d.e(), w6d.f)) {
            t(ja7, r6d);
            int d2 = r6d.d(str);
            if (d2 != -3 || !ja7.a.l) {
                return d2;
            }
            yf3 yf3 = new yf3(r6d, 14, ja7);
            ConcurrentHashMap concurrentHashMap = xh3.a;
            Map map = (Map) concurrentHashMap.get(r6d);
            Object obj2 = map != null ? map.get(yxc) : null;
            if (obj2 != null) {
                obj = obj2;
            }
            if (obj == null) {
                obj = yf3.invoke();
                Object obj3 = concurrentHashMap.get(r6d);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(r6d, obj3);
                }
                ((Map) obj3).put(yxc, obj);
            }
            Integer num = (Integer) ((Map) obj).get(str);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        yf3 yf32 = new yf3(r6d, 14, ja7);
        ConcurrentHashMap concurrentHashMap2 = xh3.a;
        Map map2 = (Map) concurrentHashMap2.get(r6d);
        Object obj4 = map2 != null ? map2.get(yxc) : null;
        if (obj4 != null) {
            obj = obj4;
        }
        if (obj == null) {
            obj = yf32.invoke();
            Object obj5 = concurrentHashMap2.get(r6d);
            if (obj5 == null) {
                obj5 = new ConcurrentHashMap(2);
                concurrentHashMap2.put(r6d, obj5);
            }
            ((Map) obj5).put(yxc, obj);
        }
        Integer num2 = (Integer) ((Map) obj).get(lowerCase);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final int k(r6d r6d, ja7 ja7, String str, String str2) {
        int j2 = j(r6d, ja7, str);
        if (j2 != -3) {
            return j2;
        }
        throw new IllegalArgumentException(r6d.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static int l(Intent intent) {
        String type = intent.getType();
        boolean z = false;
        if ((type != null ? eae.o0(type, ey8.f(10), true) : false) && intent.getParcelableExtra("android.intent.extra.STREAM") == null && intent.getParcelableArrayListExtra("android.intent.extra.STREAM") == null) {
            return 0;
        }
        if (type != null ? eae.o0(type, ey8.f(11), true) : false) {
            return 5;
        }
        if (type != null && type.length() != 0 && eae.o0(type, "image/", true) && !w9e.p0(type, "djvu", true)) {
            return 1;
        }
        if (!(type == null || type.length() == 0 || !eae.o0(type, "video/", true))) {
            z = true;
        }
        return z ? 2 : 4;
    }

    public static ArrayList m(Intent intent, Context context, o45 o45, zi5 zi5) {
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (parcelableArrayListExtra != null) {
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                Parcelable parcelable = (Parcelable) it.next();
                Uri parse = parcelable == null ? null : parcelable instanceof Uri ? (Uri) parcelable : Uri.parse(parcelable.toString());
                if (parse != null && !tfg.x(parse, context, o45)) {
                    if (zi5 != null) {
                        parse = e(parse, context, zi5);
                    }
                    arrayList.add(parse);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList n(Intent intent, Context context, o45 o45, zi5 zi5) {
        ArrayList arrayList = new ArrayList();
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
        if (parcelableExtra == null) {
            return arrayList;
        }
        Uri parse = parcelableExtra instanceof Uri ? (Uri) parcelableExtra : Uri.parse(parcelableExtra.toString());
        if (parse == null) {
            return arrayList;
        }
        if (parse.toString().startsWith("content://ru.oneme.app")) {
            arrayList.add(parse);
        } else if (!tfg.x(parse, context, o45)) {
            if (zi5 != null) {
                parse = e(parse, context, zi5);
            }
            arrayList.add(parse);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r2.getCharSequenceExtra("android.intent.extra.TEXT");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String o(android.content.Intent r2) {
        /*
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r1 = r2.getStringExtra(r0)
            if (r1 != 0) goto L_0x0012
            java.lang.CharSequence r2 = r2.getCharSequenceExtra(r0)
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = r2.toString()
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu0.o(android.content.Intent):java.lang.String");
    }

    public static final boolean p(int i2, int i3, jic jic) {
        if (jic == null) {
            if (((float) ((int) (((float) i2) * 1.3333334f))) < 2048.0f || ((int) (((float) i3) * 1.3333334f)) < 2048) {
                return false;
            }
        } else if (((int) (((float) i2) * 1.3333334f)) < jic.a || ((int) (((float) i3) * 1.3333334f)) < jic.b) {
            return false;
        }
        return true;
    }

    public static final boolean q(g05 g05, jic jic) {
        if (g05 == null) {
            return false;
        }
        g05.o0();
        int i2 = g05.o;
        if (i2 == 90 || i2 == 270) {
            g05.o0();
            int i3 = g05.Z;
            g05.o0();
            return p(i3, g05.Y, jic);
        }
        g05.o0();
        int i4 = g05.Y;
        g05.o0();
        return p(i4, g05.Z, jic);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [uqc, java.lang.Object, je7] */
    /* JADX WARNING: type inference failed for: r2v6, types: [x5f, java.lang.Object, je7] */
    public static je7 r(int i2, k56 k56) {
        int i3 = oe7.$EnumSwitchMapping$0[au1.s(i2)];
        if (i3 == 1) {
            return new khe(k56);
        }
        qq9 qq9 = qq9.v0;
        if (i3 == 2) {
            ? obj = new Object();
            obj.a = k56;
            obj.b = qq9;
            return obj;
        } else if (i3 == 3) {
            ? obj2 = new Object();
            obj2.a = k56;
            obj2.b = qq9;
            return obj2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static rk0 s(String str) {
        return new rk0(sl.a(str));
    }

    public static final void t(ja7 ja7, r6d r6d) {
        if (tpa.f(r6d.e(), nae.e)) {
            ja7.a.getClass();
        }
    }

    public static void u(Bundle bundle, Set set) {
        List list;
        hm9.k("tu0", "onCreate");
        if (bundle.containsKey("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS") && (list = (List) bundle.get("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS")) != null) {
            set.clear();
            set.addAll(list);
        }
    }

    public static final boolean z(String str) {
        return !str.equals(HttpGet.METHOD_NAME) && !str.equals(HttpHead.METHOD_NAME);
    }

    public void c(int i2) {
        new Handler(Looper.getMainLooper()).post(new l40(i2, 14, this));
    }

    public abstract void v(Throwable th);

    public abstract void w(int i2);

    public abstract void x(Typeface typeface);

    public abstract void y(t99 t99);
}
