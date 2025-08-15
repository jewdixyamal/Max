package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: nu0  reason: default package */
public abstract class nu0 implements j8e {
    public static final Object A0 = new Object();
    public static boolean B0 = false;
    public static long C0 = 0;
    public static boolean D0 = true;
    public static final /* synthetic */ int E0 = 0;
    public static final eq6 X = new eq6(HttpStatus.SC_BAD_REQUEST, "SC_BAD_REQUEST");
    public static final eq6 Y = new eq6(HttpStatus.SC_PRECONDITION_FAILED, "SC_PRECONDITION_FAILED");
    public static final eq6 Z = new eq6(HttpStatus.SC_FORBIDDEN, "SC_FORBIDDEN");
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, MultiFileUploader.MSG_TRY_UPLOAD_NEXT, 1000, 960, 800, 800, 480, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST, 2048};
    public static final eq6 b = new eq6(HttpStatus.SC_NOT_FOUND, "SC_NOT_FOUND");
    public static final eq6 c = new eq6(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, "SC_REQUESTED_RANGE_NOT_SATISFIABLE");
    public static final eq6 o = new eq6(500, "SC_INTERNAL_SERVER_ERROR");
    public static final eq6 s0 = new eq6(HttpStatus.SC_CONFLICT, "SC_CONFLICT");
    public static final eq6 t0 = new eq6(HttpStatus.SC_REQUEST_TOO_LONG, "SC_REQUEST_ENTITY_TOO_LARGE");
    public static final eq6 u0 = new eq6(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, "SC_UNSUPPORTED_MEDIA_TYPE");
    public static final eq6 v0 = new eq6(HttpStatus.SC_NOT_ACCEPTABLE, "SC_NOT_ACCEPTABLE");
    public static final eq6 w0 = new eq6(-1, "UNKNOWN_ERROR");
    public static final eq6 x0 = new eq6(-100, "FILE_NOT_FOUND");
    public static final eq6 y0 = new eq6(-101, "FILE_ZERO_LENGTH");
    public static final Object z0 = new Object();

    public static int A(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(rh4.h("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
    }

    public static final int B(int i) {
        int s = au1.s(i);
        if (s == 0) {
            return 0;
        }
        if (s == 1) {
            return 1;
        }
        if (s == 2) {
            return 2;
        }
        if (s == 3) {
            return 3;
        }
        if (s == 4) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + ey8.t(i) + " to int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: qpd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.util.Map} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x023f, code lost:
        r11 = r18;
        r9 = r5;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        r18.z();
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x037b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x037c, code lost:
        r1 = r0;
        defpackage.hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", r1);
        r0 = defpackage.u7d.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x038a, code lost:
        if (r0.hasNext() != false) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x038c, code lost:
        ((defpackage.r4a) r0.next()).getClass();
        defpackage.r4a.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0399, code lost:
        r0 = defpackage.au1.s(defpackage.k7d.a);
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x039f, code lost:
        if (r0 != 0) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x03a2, code lost:
        if (r0 != 1) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x03a9, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x03aa, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x03af, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x03b0, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        r11 = r18;
        r9 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.le3 C(defpackage.gy8 r18) {
        /*
            r1 = 1
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            r4 = 0
            int r0 = defpackage.lz7.N(r18)     // Catch:{ all -> 0x000c }
            r5 = r0
            goto L_0x003c
        L_0x000c:
            r0 = move-exception
            r5 = r0
            defpackage.hm9.l0(r3, r2, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x002a
            java.lang.Object r6 = r0.next()
            r4a r6 = (defpackage.r4a) r6
            r6.getClass()
            defpackage.r4a.a(r5)
            goto L_0x0017
        L_0x002a:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x003b
            if (r0 == r1) goto L_0x003a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003a:
            throw r5
        L_0x003b:
            r5 = r4
        L_0x003c:
            r6 = 0
            if (r5 != 0) goto L_0x0040
            return r6
        L_0x0040:
            oz4 r0 = defpackage.oz4.a
            r7 = r0
            r8 = r4
            r10 = r6
            r12 = r10
            r13 = r12
            r14 = r13
        L_0x0048:
            if (r8 >= r5) goto L_0x03b6
            java.lang.String r0 = defpackage.lz7.P(r18)     // Catch:{ all -> 0x004f }
            goto L_0x007f
        L_0x004f:
            r0 = move-exception
            r9 = r0
            defpackage.hm9.l0(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x005a:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x006d
            java.lang.Object r11 = r0.next()
            r4a r11 = (defpackage.r4a) r11
            r11.getClass()
            defpackage.r4a.a(r9)
            goto L_0x005a
        L_0x006d:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x007e
            if (r0 == r1) goto L_0x007d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x007d:
            throw r9
        L_0x007e:
            r0 = r6
        L_0x007f:
            if (r0 != 0) goto L_0x0086
            r11 = r18
            r9 = r5
            goto L_0x03b0
        L_0x0086:
            int r9 = r0.hashCode()
            switch(r9) {
                case -905826493: goto L_0x036c;
                case 3195150: goto L_0x0328;
                case 3599307: goto L_0x0316;
                case 94623771: goto L_0x0244;
                case 1287422797: goto L_0x0092;
                default: goto L_0x008d;
            }
        L_0x008d:
            r11 = r18
            r9 = r5
            goto L_0x0377
        L_0x0092:
            java.lang.String r9 = "chatFolders"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x009b
            goto L_0x008d
        L_0x009b:
            sa2 r0 = defpackage.sa2.c
            int r0 = defpackage.lz7.N(r18)     // Catch:{ all -> 0x00a3 }
            r9 = r0
            goto L_0x00d3
        L_0x00a3:
            r0 = move-exception
            r9 = r0
            defpackage.hm9.l0(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00ae:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00c1
            java.lang.Object r11 = r0.next()
            r4a r11 = (defpackage.r4a) r11
            r11.getClass()
            defpackage.r4a.a(r9)
            goto L_0x00ae
        L_0x00c1:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x00d2
            if (r0 == r1) goto L_0x00d1
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00d1:
            throw r9
        L_0x00d2:
            r9 = r4
        L_0x00d3:
            if (r9 != 0) goto L_0x00da
            sa2 r0 = defpackage.sa2.c
        L_0x00d7:
            r14 = r0
            goto L_0x023f
        L_0x00da:
            xs r11 = new xs
            r11.<init>((int) r4)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r15 = r4
        L_0x00e5:
            if (r15 >= r9) goto L_0x0230
            java.lang.String r0 = defpackage.lz7.P(r18)     // Catch:{ all -> 0x00ec }
            goto L_0x011c
        L_0x00ec:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00f7:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x010a
            java.lang.Object r16 = r0.next()
            r4a r16 = (defpackage.r4a) r16
            r16.getClass()
            defpackage.r4a.a(r4)
            goto L_0x00f7
        L_0x010a:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x011b
            if (r0 == r1) goto L_0x011a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x011a:
            throw r4
        L_0x011b:
            r0 = r6
        L_0x011c:
            if (r0 != 0) goto L_0x0121
        L_0x011e:
            r4 = r1
            goto L_0x022a
        L_0x0121:
            java.lang.String r4 = "ALL_FILTER_EXCLUDE"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x01a8
            int r0 = defpackage.lz7.G(r18)     // Catch:{ all -> 0x012f }
            r4 = r0
            goto L_0x015f
        L_0x012f:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x013a:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x014d
            java.lang.Object r16 = r0.next()
            r4a r16 = (defpackage.r4a) r16
            r16.getClass()
            defpackage.r4a.a(r4)
            goto L_0x013a
        L_0x014d:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x015e
            if (r0 == r1) goto L_0x015d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x015d:
            throw r4
        L_0x015e:
            r4 = 0
        L_0x015f:
            r6 = 0
        L_0x0160:
            if (r6 >= r4) goto L_0x011e
            java.lang.String r0 = defpackage.lz7.P(r18)     // Catch:{ all -> 0x016a }
            r17 = r4
            r4 = r1
            goto L_0x019e
        L_0x016a:
            r0 = move-exception
            r1 = r0
            defpackage.hm9.l0(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0175:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x0188
            java.lang.Object r17 = r0.next()
            r4a r17 = (defpackage.r4a) r17
            r17.getClass()
            defpackage.r4a.a(r1)
            goto L_0x0175
        L_0x0188:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x019a
            r4 = 1
            if (r0 == r4) goto L_0x0199
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0199:
            throw r1
        L_0x019a:
            r17 = r4
            r4 = 1
            r0 = 0
        L_0x019e:
            if (r0 == 0) goto L_0x01a3
            r11.add(r0)
        L_0x01a3:
            int r6 = r6 + r4
            r1 = r4
            r4 = r17
            goto L_0x0160
        L_0x01a8:
            java.lang.String r1 = "FOLDERS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01f5
            int r0 = defpackage.lz7.G(r18)     // Catch:{ all -> 0x01b5 }
            goto L_0x01e6
        L_0x01b5:
            r0 = move-exception
            r1 = r0
            defpackage.hm9.l0(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01c0:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01d3
            java.lang.Object r4 = r0.next()
            r4a r4 = (defpackage.r4a) r4
            r4.getClass()
            defpackage.r4a.a(r1)
            goto L_0x01c0
        L_0x01d3:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x01e5
            r4 = 1
            if (r0 == r4) goto L_0x01e4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01e4:
            throw r1
        L_0x01e5:
            r0 = 0
        L_0x01e6:
            r1 = 0
        L_0x01e7:
            if (r1 >= r0) goto L_0x01f8
            qa2 r4 = defpackage.ay7.z(r18)
            if (r4 == 0) goto L_0x01f2
            r14.add(r4)
        L_0x01f2:
            r4 = 1
            int r1 = r1 + r4
            goto L_0x01e7
        L_0x01f5:
            r18.z()     // Catch:{ all -> 0x01fa }
        L_0x01f8:
            r4 = 1
            goto L_0x022a
        L_0x01fa:
            r0 = move-exception
            r1 = r0
            defpackage.hm9.l0(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0205:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0218
            java.lang.Object r4 = r0.next()
            r4a r4 = (defpackage.r4a) r4
            r4.getClass()
            defpackage.r4a.a(r1)
            goto L_0x0205
        L_0x0218:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x01f8
            r4 = 1
            if (r0 == r4) goto L_0x0229
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0229:
            throw r1
        L_0x022a:
            int r15 = r15 + r4
            r1 = r4
            r4 = 0
            r6 = 0
            goto L_0x00e5
        L_0x0230:
            sa2 r0 = new sa2
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r11)
            java.util.List r4 = java.util.Collections.unmodifiableList(r14)
            r0.<init>(r4, r1)
            goto L_0x00d7
        L_0x023f:
            r11 = r18
            r9 = r5
            goto L_0x03af
        L_0x0244:
            java.lang.String r1 = "chats"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x024e
            goto L_0x008d
        L_0x024e:
            int r0 = defpackage.lz7.N(r18)     // Catch:{ all -> 0x0254 }
            r1 = r0
            goto L_0x0285
        L_0x0254:
            r0 = move-exception
            r1 = r0
            defpackage.hm9.l0(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x025f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0272
            java.lang.Object r4 = r0.next()
            r4a r4 = (defpackage.r4a) r4
            r4.getClass()
            defpackage.r4a.a(r1)
            goto L_0x025f
        L_0x0272:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0284
            r4 = 1
            if (r0 == r4) goto L_0x0283
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0283:
            throw r1
        L_0x0284:
            r1 = 0
        L_0x0285:
            us r12 = new us
            r12.<init>(r1)
            r4 = 0
        L_0x028b:
            if (r4 >= r1) goto L_0x023f
            r9 = r5
            r5 = 0
            r11 = r18
            long r5 = defpackage.lz7.M(r11, r5)     // Catch:{ all -> 0x0297 }
            goto L_0x02c9
        L_0x0297:
            r0 = move-exception
            r15 = r0
            defpackage.hm9.l0(r3, r2, r15)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02a2:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x02b5
            java.lang.Object r17 = r0.next()
            r4a r17 = (defpackage.r4a) r17
            r17.getClass()
            defpackage.r4a.a(r15)
            goto L_0x02a2
        L_0x02b5:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x02c7
            r5 = 1
            if (r0 == r5) goto L_0x02c6
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02c6:
            throw r15
        L_0x02c7:
            r5 = 0
        L_0x02c9:
            xq2 r0 = defpackage.xq2.a(r18)     // Catch:{ all -> 0x02d0 }
            r17 = r1
            goto L_0x0303
        L_0x02d0:
            r0 = move-exception
            r15 = r0
            defpackage.hm9.l0(r3, r2, r15)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02db:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x02ee
            java.lang.Object r17 = r0.next()
            r4a r17 = (defpackage.r4a) r17
            r17.getClass()
            defpackage.r4a.a(r15)
            goto L_0x02db
        L_0x02ee:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0300
            r1 = 1
            if (r0 == r1) goto L_0x02ff
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02ff:
            throw r15
        L_0x0300:
            r17 = r1
            r0 = 0
        L_0x0303:
            if (r0 == 0) goto L_0x030f
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.Object r0 = r12.put(r1, r0)
            xq2 r0 = (defpackage.xq2) r0
        L_0x030f:
            r1 = 1
            int r4 = r4 + r1
            r5 = r9
            r1 = r17
            goto L_0x028b
        L_0x0316:
            r11 = r18
            r9 = r5
            java.lang.String r1 = "user"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0322
            goto L_0x0377
        L_0x0322:
            gaf r13 = defpackage.tu0.E(r18)
            goto L_0x03af
        L_0x0328:
            r11 = r18
            r9 = r5
            java.lang.String r1 = "hash"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0377
            java.lang.String r0 = defpackage.lz7.P(r18)     // Catch:{ all -> 0x033a }
            r10 = r0
            goto L_0x03af
        L_0x033a:
            r0 = move-exception
            r1 = r0
            defpackage.hm9.l0(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0345:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0358
            java.lang.Object r4 = r0.next()
            r4a r4 = (defpackage.r4a) r4
            r4.getClass()
            defpackage.r4a.a(r1)
            goto L_0x0345
        L_0x0358:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x036a
            r4 = 1
            if (r0 == r4) goto L_0x0369
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0369:
            throw r1
        L_0x036a:
            r10 = 0
            goto L_0x03af
        L_0x036c:
            r11 = r18
            r9 = r5
            java.lang.String r1 = "server"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03ab
        L_0x0377:
            r18.z()     // Catch:{ all -> 0x037b }
            goto L_0x03af
        L_0x037b:
            r0 = move-exception
            r1 = r0
            defpackage.hm9.l0(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0386:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0399
            java.lang.Object r4 = r0.next()
            r4a r4 = (defpackage.r4a) r4
            r4.getClass()
            defpackage.r4a.a(r1)
            goto L_0x0386
        L_0x0399:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x03af
            r4 = 1
            if (r0 == r4) goto L_0x03aa
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03aa:
            throw r1
        L_0x03ab:
            java.util.Map r7 = defpackage.tu0.I(r18)
        L_0x03af:
            r1 = 1
        L_0x03b0:
            int r8 = r8 + r1
            r5 = r9
            r4 = 0
            r6 = 0
            goto L_0x0048
        L_0x03b6:
            le3 r0 = new le3
            a8d r11 = new a8d
            r11.<init>(r7)
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.C(gy8):le3");
    }

    public static final int D(jna jna) {
        int ordinal = jna.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (r9 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r9 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r9 != 8) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.w3 E(defpackage.s02 r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L_0x0018
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L_0x0032
        L_0x0029:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L_0x0029
        L_0x0032:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L_0x0047
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L_0x0047
            r9.t(r1)
        L_0x0047:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L_0x0055
            r5 = r7
            goto L_0x0056
        L_0x0055:
            r5 = r6
        L_0x0056:
            int r9 = r9.i(r3)
            int[] r8 = a
            if (r5 != r6) goto L_0x0065
            r6 = 13
            if (r9 != r6) goto L_0x0065
            r9 = r8[r9]
            goto L_0x0093
        L_0x0065:
            if (r5 != r7) goto L_0x0092
            r6 = 14
            if (r9 >= r6) goto L_0x0092
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L_0x008b
            r7 = 11
            if (r2 == r1) goto L_0x0086
            if (r2 == r4) goto L_0x008b
            if (r2 == r3) goto L_0x007d
            goto L_0x0090
        L_0x007d:
            if (r9 == r4) goto L_0x0083
            if (r9 == r8) goto L_0x0083
            if (r9 != r7) goto L_0x0090
        L_0x0083:
            int r9 = r6 + 1
            goto L_0x0093
        L_0x0086:
            if (r9 == r8) goto L_0x0083
            if (r9 != r7) goto L_0x0090
            goto L_0x0083
        L_0x008b:
            if (r9 == r4) goto L_0x0083
            if (r9 != r8) goto L_0x0090
            goto L_0x0083
        L_0x0090:
            r9 = r6
            goto L_0x0093
        L_0x0092:
            r9 = 0
        L_0x0093:
            w3 r1 = new w3
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.E(s02):w3");
    }

    public static void F(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final String G(Long l) {
        if (l.longValue() > 0) {
            return String.format(Locale.ENGLISH, "%d [%tF %tT %tL]", Arrays.copyOf(new Object[]{l, l, l, l}, 4));
        }
        return l + "ms";
    }

    public static void H(Throwable th) {
        Class<Error> cls = Error.class;
        if (!cls.isInstance(th)) {
            Class<RuntimeException> cls2 = RuntimeException.class;
            if (!cls2.isInstance(th)) {
                throw new RuntimeException(th);
            }
            throw cls2.cast(th);
        }
        throw cls.cast(th);
    }

    public static String I(Object obj) {
        return "'" + String.valueOf(obj) + "'";
    }

    public static long J(int i, byte[] bArr) {
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        byte b4 = bArr[i + 2];
        byte b5 = bArr[i + 3];
        byte b6 = b2 & true;
        int i2 = b2;
        if (b6 == true) {
            i2 = (b2 & Byte.MAX_VALUE) + 128;
        }
        byte b7 = b3 & true;
        int i3 = b3;
        if (b7 == true) {
            i3 = (b3 & Byte.MAX_VALUE) + 128;
        }
        byte b8 = b4 & true;
        int i4 = b4;
        if (b8 == true) {
            i4 = (b4 & Byte.MAX_VALUE) + 128;
        }
        byte b9 = b5 & true;
        int i5 = b5;
        if (b9 == true) {
            i5 = (b5 & Byte.MAX_VALUE) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static long K(int i, byte[] bArr) {
        long J = J(i, bArr);
        long J2 = J(i + 4, bArr);
        if (J == 0 && J2 == 0) {
            return 0;
        }
        return ((J2 * 1000) / 4294967296L) + ((J - 2208988800L) * 1000);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gic, java.lang.Object] */
    public static final gic L(k56 k56) {
        ? obj = new Object();
        obj.a = k56;
        obj.b = c32.Y;
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        defpackage.v3c.i(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        defpackage.v3c.i(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] M(java.util.Set r4) {
        /*
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000a
            r4 = 0
            byte[] r4 = new byte[r4]
            return r4
        L_0x000a:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0048 }
            r1.<init>(r0)     // Catch:{ all -> 0x0048 }
            int r2 = r4.size()     // Catch:{ all -> 0x003a }
            r1.writeInt(r2)     // Catch:{ all -> 0x003a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x003a }
        L_0x001f:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x003a }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x003a }
            jj3 r2 = (defpackage.jj3) r2     // Catch:{ all -> 0x003a }
            android.net.Uri r3 = r2.a     // Catch:{ all -> 0x003a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003a }
            r1.writeUTF(r3)     // Catch:{ all -> 0x003a }
            boolean r2 = r2.b     // Catch:{ all -> 0x003a }
            r1.writeBoolean(r2)     // Catch:{ all -> 0x003a }
            goto L_0x001f
        L_0x003a:
            r4 = move-exception
            goto L_0x004a
        L_0x003c:
            r4 = 0
            defpackage.v3c.i(r1, r4)     // Catch:{ all -> 0x0048 }
            defpackage.v3c.i(r0, r4)
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x0048:
            r4 = move-exception
            goto L_0x0050
        L_0x004a:
            throw r4     // Catch:{ all -> 0x004b }
        L_0x004b:
            r2 = move-exception
            defpackage.v3c.i(r1, r4)     // Catch:{ all -> 0x0048 }
            throw r2     // Catch:{ all -> 0x0048 }
        L_0x0050:
            throw r4     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            defpackage.v3c.i(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.M(java.util.Set):byte[]");
    }

    public static void N(View view, q18 q18) {
        ew4 ew4 = q18.a.b;
        if (ew4 != null && ew4.a) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = zmf.a;
                f += omf.i((View) parent);
            }
            p18 p18 = q18.a;
            if (p18.m != f) {
                p18.m = f;
                q18.q();
            }
        }
    }

    public static final int O(m7g m7g) {
        int ordinal = m7g.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2) {
            return 2;
        }
        if (ordinal == 3) {
            return 3;
        }
        if (ordinal == 4) {
            return 4;
        }
        if (ordinal == 5) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean P(String str) {
        return str != null && str.trim().length() > 0;
    }

    public static final m32 Q(mn5 mn5, long j) {
        return new m32(new oo5(j, mn5, (Continuation) null), hz4.a, -2, 1, 0);
    }

    public static ArrayList R(Collection collection, w56 w56) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object apply : collection) {
            arrayList.add((Bundle) w56.apply(apply));
        }
        return arrayList;
    }

    public static final void S(y5f y5f) {
        y5f.c(b64.class, new lxc(10));
    }

    public static long a() {
        DatagramSocket datagramSocket;
        long j;
        synchronized (A0) {
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
                j = currentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j2 = currentTimeMillis / 1000;
                long j3 = currentTimeMillis - (j2 * 1000);
                long j4 = j2 + 2208988800L;
                j = currentTimeMillis;
                bArr[40] = (byte) ((int) (j4 >> 24));
                bArr[41] = (byte) ((int) (j4 >> 16));
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) ((int) (j4 >> 8));
                    bArr[43] = (byte) ((int) j4);
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) ((int) (j5 >> 24));
                    bArr[45] = (byte) ((int) (j5 >> 16));
                    bArr[46] = (byte) ((int) (j5 >> 8));
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
            long j6 = (elapsedRealtime2 - elapsedRealtime) + j;
            byte b2 = bArr[0];
            long K = K(24, bArr);
            long K2 = K(32, bArr);
            long K3 = K(40, bArr);
            d((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), bArr[1] & 255, K3);
            long j7 = (j6 + (((K3 - j6) + (K2 - K)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j7;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
            Throwable th22 = th;
            datagramSocket.close();
            throw th22;
        }
    }

    public static final int b(mf0 mf0) {
        int ordinal = mf0.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        defpackage.v3c.i(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashSet c(byte[] r8) {
        /*
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r8.length
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r8)
            r8 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x003a }
            r2.<init>(r1)     // Catch:{ IOException -> 0x003a }
            int r3 = r2.readInt()     // Catch:{ all -> 0x0032 }
            r4 = 0
        L_0x0019:
            if (r4 >= r3) goto L_0x0034
            java.lang.String r5 = r2.readUTF()     // Catch:{ all -> 0x0032 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0032 }
            boolean r6 = r2.readBoolean()     // Catch:{ all -> 0x0032 }
            jj3 r7 = new jj3     // Catch:{ all -> 0x0032 }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x0032 }
            r0.add(r7)     // Catch:{ all -> 0x0032 }
            int r4 = r4 + 1
            goto L_0x0019
        L_0x0032:
            r3 = move-exception
            goto L_0x003c
        L_0x0034:
            defpackage.v3c.i(r2, r8)     // Catch:{ IOException -> 0x003a }
            goto L_0x0045
        L_0x0038:
            r8 = move-exception
            goto L_0x0049
        L_0x003a:
            r2 = move-exception
            goto L_0x0042
        L_0x003c:
            throw r3     // Catch:{ all -> 0x003d }
        L_0x003d:
            r4 = move-exception
            defpackage.v3c.i(r2, r3)     // Catch:{ IOException -> 0x003a }
            throw r4     // Catch:{ IOException -> 0x003a }
        L_0x0042:
            r2.printStackTrace()     // Catch:{ all -> 0x0038 }
        L_0x0045:
            defpackage.v3c.i(r1, r8)
            return r0
        L_0x0049:
            throw r8     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            defpackage.v3c.i(r1, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.c(byte[]):java.util.LinkedHashSet");
    }

    public static void d(byte b2, byte b3, int i, long j) {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b3 != 4 && b3 != 5) {
            throw new IOException(z7b.h(26, b3, "SNTP: Untrusted mode: "));
        } else if (i == 0 || i > 15) {
            throw new IOException(z7b.h(36, i, "SNTP: Untrusted stratum: "));
        } else if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static final zn5 e(mn5 mn5, long j, a66 a66) {
        return new zn5(new t03(new m32(new vn5(j, mn5, (Continuation) null), hz4.a, -2, 1, 0), 8), a66, 0);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [hm9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [hm9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [hm9, java.lang.Object] */
    public static hm9 f(int i) {
        return i != 0 ? i != 1 ? new Object() : new Object() : new Object();
    }

    public static List g(p8c p8c, int i) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (arrayList.size() == i) {
                break;
            }
            Object f = p8c.f();
            if (f instanceof h42) {
                Throwable a2 = i42.a(f);
                if (a2 != null) {
                    throw a2;
                }
            } else {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    public static final ac h(mn5 mn5, long j, a66 a66) {
        jp5 Z2 = od2.Z(new zn5(mn5, a66, 1), 1);
        int i = ft4.o;
        return new ac(new t03(new qn5(0, new zo5(z7.S(j, kt4.MILLISECONDS), Z2, (Continuation) null)), 9), 18, new y03(3, (Continuation) null, 3));
    }

    public static ffc i(w56 w56, List list) {
        ww6 i = zw6.i();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Bundle bundle = (Bundle) list.get(i2);
            bundle.getClass();
            i.a(w56.apply(bundle));
        }
        return i.j();
    }

    public static eq6 j(int i, String str) {
        eq6 eq6 = i != 400 ? i != 406 ? i != 409 ? i != 500 ? i != 403 ? i != 404 ? i != 412 ? i != 413 ? i != 415 ? i != 416 ? new eq6(i, (String) null) : c : u0 : t0 : Y : b : Z : o : s0 : v0 : X;
        return str == null ? eq6 : new eq6(eq6.a, eq6.b, str);
    }

    public static void k(int i, wpa wpa) {
        wpa.D(7);
        byte[] bArr = wpa.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static kl7 l(a66 a66) {
        kk0 kk0 = kk0.a;
        kk0 kk02 = kk0.X;
        kl7 l = j1e.l();
        Iterator it = new r08((List) nk0.a).iterator();
        while (true) {
            ListIterator listIterator = ((fkc) it).b;
            if (!listIterator.hasPrevious()) {
                return j1e.d(l);
            }
            kk0 kk03 = (kk0) listIterator.previous();
            if (kk03.compareTo(kk0) >= 0 && kk03.compareTo(kk02) <= 0) {
                String str = (String) a66.invoke(kk03, jk0.b);
                if (str != null) {
                    l.add(str);
                }
                String str2 = (String) a66.invoke(kk03, jk0.a);
                if (str2 != null) {
                    l.add(str2);
                }
            }
        }
    }

    public static kl7 m(a66 a66, a66 a662) {
        kk0 kk0 = kk0.a;
        kk0 kk02 = kk0.X;
        kl7 l = j1e.l();
        Iterator it = new r08((List) nk0.a).iterator();
        while (true) {
            ListIterator listIterator = ((fkc) it).b;
            if (!listIterator.hasPrevious()) {
                return j1e.d(l);
            }
            kk0 kk03 = (kk0) listIterator.previous();
            if (kk03.compareTo(kk0) >= 0 && kk03.compareTo(kk02) <= 0) {
                jk0 jk0 = jk0.b;
                String str = (String) a662.invoke(kk03, jk0);
                if (str != null) {
                    l.add(str);
                }
                jk0 jk02 = jk0.a;
                String str2 = (String) a662.invoke(kk03, jk02);
                if (str2 != null) {
                    l.add(str2);
                }
                String str3 = (String) a66.invoke(kk03, jk0);
                if (str3 != null) {
                    l.add(str3);
                }
                String str4 = (String) a66.invoke(kk03, jk02);
                if (str4 != null) {
                    l.add(str4);
                }
            }
        }
    }

    public static final kl7 n(kk0 kk0, kk0 kk02, m56 m56) {
        String str;
        kl7 l = j1e.l();
        Iterator it = new r08((List) nk0.a).iterator();
        while (true) {
            ListIterator listIterator = ((fkc) it).b;
            if (!listIterator.hasPrevious()) {
                return j1e.d(l);
            }
            kk0 kk03 = (kk0) listIterator.previous();
            if (kk03.compareTo(kk0) >= 0 && kk03.compareTo(kk02) <= 0 && (str = (String) m56.invoke(kk03)) != null) {
                l.add(str);
            }
        }
    }

    public static final sy1 o(Continuation continuation) {
        if (!(continuation instanceof DispatchedContinuation)) {
            return new sy1(1, continuation);
        }
        sy1 claimReusableCancellableContinuation$kotlinx_coroutines_core = ((DispatchedContinuation) continuation).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sy1.o;
            Object obj = atomicReferenceFieldUpdater.get(claimReusableCancellableContinuation$kotlinx_coroutines_core);
            if (!(obj instanceof jb3) || ((jb3) obj).d == null) {
                sy1.c.set(claimReusableCancellableContinuation$kotlinx_coroutines_core, 536870911);
                atomicReferenceFieldUpdater.set(claimReusableCancellableContinuation$kotlinx_coroutines_core, o7.a);
            } else {
                claimReusableCancellableContinuation$kotlinx_coroutines_core.h();
                claimReusableCancellableContinuation$kotlinx_coroutines_core = null;
            }
            if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
                return claimReusableCancellableContinuation$kotlinx_coroutines_core;
            }
        }
        return new sy1(2, continuation);
    }

    public static final int p(Layout layout) {
        if (layout != null) {
            return layout.getHeight();
        }
        return 0;
    }

    public static final int q(Layout layout) {
        if (layout == null) {
            return 0;
        }
        return (layout.getLineCount() <= 0 || layout.getEllipsisCount(0) != 0) ? layout.getEllipsizedWidth() : (int) layout.getLineMax(0);
    }

    public static final int r(r6d r6d, r6d[] r6dArr) {
        int hashCode = (r6d.a().hashCode() * 31) + Arrays.hashCode(r6dArr);
        u6d u6d = new u6d(r6d, 0);
        int i = 1;
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (!u6d.hasNext()) {
                break;
            }
            int i4 = i2 * 31;
            String a2 = ((r6d) u6d.next()).a();
            if (a2 != null) {
                i3 = a2.hashCode();
            }
            i2 = i4 + i3;
        }
        u6d u6d2 = new u6d(r6d, 0);
        while (u6d2.hasNext()) {
            int i5 = i * 31;
            pag e = ((r6d) u6d2.next()).e();
            i = i5 + (e != null ? e.hashCode() : 0);
        }
        return (((hashCode * 31) + i2) * 31) + i;
    }

    public static final mf0 s(int i) {
        if (i == 0) {
            return mf0.a;
        }
        if (i == 1) {
            return mf0.b;
        }
        throw new IllegalArgumentException(wg0.g(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int t(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                if (i == 4) {
                    return 5;
                }
                if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                    return 6;
                }
                throw new IllegalArgumentException(wg0.g(i, "Could not convert ", " to NetworkType"));
            }
        }
        return i2;
    }

    public static final jna u(int i) {
        if (i == 0) {
            return jna.a;
        }
        if (i == 1) {
            return jna.b;
        }
        throw new IllegalArgumentException(wg0.g(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final m7g v(int i) {
        if (i == 0) {
            return m7g.a;
        }
        if (i == 1) {
            return m7g.b;
        }
        if (i == 2) {
            return m7g.c;
        }
        if (i == 3) {
            return m7g.o;
        }
        if (i == 4) {
            return m7g.X;
        }
        if (i == 5) {
            return m7g.Y;
        }
        throw new IllegalArgumentException(wg0.g(i, "Could not convert ", " to State"));
    }

    public static final void w(ry1 ry1, iy1 iy1) {
        if (ry1 instanceof sy1) {
            ((sy1) ry1).p(iy1);
            return;
        }
        throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
    }

    public static boolean x(eq6 eq6) {
        return t0.equals(eq6) || u0.equals(eq6) || v0.equals(eq6) || o.equals(eq6) || x0.equals(eq6) || y0.equals(eq6);
    }

    public static final boolean y(int i) {
        return (8400 <= i && i < 8448) || (8596 <= i && i < 8601) || ((9100 <= i && i < 9301) || ((9723 <= i && i < 9727) || ((9728 <= i && i < 9984) || ((9984 <= i && i < 10176) || ((65024 <= i && i < 65040) || ((127462 <= i && i < 127488) || ((127744 <= i && i < 128512) || ((128512 <= i && i < 128592) || ((128640 <= i && i < 128768) || ((128992 <= i && i < 129004) || ((129648 <= i && i < 129661) || ((129664 <= i && i < 129734) || ((129742 <= i && i < 129756) || ((129760 <= i && i < 129769) || ((129776 <= i && i < 129785) || ((129280 <= i && i < 129536) || ((127000 <= i && i < 127601) || ((917536 <= i && i < 917632) || i == 126980 || i == 129008 || i == 8252 || i == 8265 || i == 8482 || i == 8505 || i == 8601 || i == 8617 || i == 8618 || i == 8986 || i == 8987 || i == 9000 || i == 9410 || i == 9642 || i == 9643 || i == 9654 || i == 9664 || i == 10548 || i == 10549 || i == 11013 || i == 11014 || i == 11015 || i == 11035 || i == 11036 || i == 11088 || i == 11093 || i == 12336 || i == 12349 || i == 12951 || i == 12953 || i == 169 || i == 174))))))))))))))))));
    }

    public static void z(zn5 zn5, sx3 sx3) {
        j47.T(sx3, (lx3) null, vx3.a, new io5(zn5, (Continuation) null), 1);
    }
}
