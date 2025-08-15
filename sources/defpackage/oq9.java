package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* renamed from: oq9  reason: default package */
public final class oq9 implements s43, zl6, cc3, dze, bha, Provider, poa, im9, hlf, ofc {
    public static final oq9 X = new oq9(3);
    public static final oq9 Y = new oq9(4);
    public static final oq9 Z = new oq9(5);
    public static oq9 b;
    public static final oq9 c = new oq9(1);
    public static final int[] o = {8, 13, 11, 2, 0, 1, 7};
    public final /* synthetic */ int a;

    public /* synthetic */ oq9(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [qg6, java.lang.Object] */
    public static final qg6 d() {
        int i = rg6.o;
        ? obj = new Object();
        obj.a = 0;
        obj.b = 0;
        obj.c = 0.0f;
        obj.d = 0;
        obj.e = false;
        obj.f = 1;
        return obj;
    }

    public static void e(ArrayList arrayList, int i) {
        if (s5c.H(i, 0, 7, o) != -1 && !arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [cpd, java.lang.Object] */
    public static dpd h(ji9 ji9) {
        ? obj = new Object();
        obj.a = ji9.f;
        obj.c = ji9.b;
        obj.d = ji9.c;
        obj.b = ji9.e;
        obj.e = ji9.g;
        obj.f = ji9.d;
        return new dpd(obj);
    }

    public static aw0 i(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (z04.a(str.charAt(i2 + 1)) + (z04.a(str.charAt(i2)) << 4));
            }
            return new aw0(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static aw0 j(String str) {
        aw0 aw0 = new aw0(str.getBytes(a52.a));
        aw0.b = str;
        return aw0;
    }

    public static aw0 k(byte[] bArr) {
        int length = bArr.length;
        hm9.g((long) bArr.length, (long) 0, (long) length);
        return new aw0(ys.Z(0, bArr, length));
    }

    public void E(VideoSink$VideoSinkException videoSink$VideoSinkException) {
    }

    public void M() {
    }

    public double a(double d, double d2, double d3, boolean z) {
        return 1.0d;
    }

    public void accept(Object obj, Object obj2) {
        dig dig = (dig) ((vgg) obj).o();
        djg djg = new djg((qne) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = igg.a;
        obtain.writeInt(1);
        ay7.W(obtain, ay7.T(obtain, 20293));
        obtain.writeStrongBinder(djg);
        Parcel obtain2 = Parcel.obtain();
        try {
            dig.c.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public boolean b(String str) {
        System.loadLibrary(str);
        return true;
    }

    public void c(double d) {
    }

    public Object f(bg4 bg4) {
        return nd7.s((Executor) bg4.f(new lqb(ip0.class, Executor.class)));
    }

    public void g() {
        gy2.c.P1().b(":chats-search", (Bundle) null);
    }

    public /* bridge */ /* synthetic */ Object get() {
        return "com.google.android.datatransport.events";
    }

    public void onFirstFrameRendered() {
    }

    public void reset() {
    }

    /* JADX WARNING: type inference failed for: r15v13, types: [java.lang.Throwable] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r23.z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01ca, code lost:
        r7 = r0;
        defpackage.hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", r7);
        r0 = defpackage.u7d.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01d8, code lost:
        if (r0.hasNext() != false) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01da, code lost:
        ((defpackage.r4a) r0.next()).getClass();
        defpackage.r4a.a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01e7, code lost:
        r0 = defpackage.au1.s(defpackage.k7d.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ed, code lost:
        if (r0 != 0) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01f0, code lost:
        if (r0 != 1) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01f7, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01f8, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0206, code lost:
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        r4 = r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x03f3 A[Catch:{ all -> 0x0294, all -> 0x02b2 }, LOOP:16: B:285:0x03ed->B:287:0x03f3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0408 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0412 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.gle w(defpackage.gy8 r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            int r0 = r0.a
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            switch(r0) {
                case 1: goto L_0x0247;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r0 = "NotifMsgDelayedCmd"
            java.lang.String r4 = "response"
            defpackage.hm9.m(r0, r4, new java.lang.Object[0])
            r4 = 1
            int r0 = defpackage.lz7.N(r23)     // Catch:{ all -> 0x001b }
            r6 = r0
            goto L_0x004b
        L_0x001b:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r3, r2, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0039
            java.lang.Object r7 = r0.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r6)
            goto L_0x0026
        L_0x0039:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x004a
            if (r0 == r4) goto L_0x0049
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0049:
            throw r6
        L_0x004a:
            r6 = 0
        L_0x004b:
            if (r6 != 0) goto L_0x0050
            r7 = 0
            goto L_0x0246
        L_0x0050:
            wz4 r8 = defpackage.wz4.a
            r9 = 5
            r10 = 0
            r20 = r8
            r18 = r9
            r14 = r10
            r16 = r14
            r12 = 0
            r19 = 0
        L_0x005f:
            if (r12 >= r6) goto L_0x0240
            java.lang.String r0 = defpackage.lz7.P(r23)     // Catch:{ all -> 0x0066 }
            goto L_0x0096
        L_0x0066:
            r0 = move-exception
            r13 = r0
            defpackage.hm9.l0(r3, r2, r13)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0071:
            boolean r21 = r0.hasNext()
            if (r21 == 0) goto L_0x0084
            java.lang.Object r21 = r0.next()
            r4a r21 = (defpackage.r4a) r21
            r21.getClass()
            defpackage.r4a.a(r13)
            goto L_0x0071
        L_0x0084:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0095
            if (r0 == r4) goto L_0x0094
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0094:
            throw r13
        L_0x0095:
            r0 = 0
        L_0x0096:
            if (r0 != 0) goto L_0x009c
        L_0x0098:
            r9 = r4
            r4 = r10
            goto L_0x0239
        L_0x009c:
            int r13 = r0.hashCode()
            switch(r13) {
                case -1690743503: goto L_0x01bc;
                case -1361631597: goto L_0x0176;
                case -907060194: goto L_0x00f4;
                case -836030906: goto L_0x00b4;
                case 954925063: goto L_0x00a6;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            r4 = r10
            goto L_0x01c5
        L_0x00a6:
            java.lang.String r13 = "message"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00af
            goto L_0x00a3
        L_0x00af:
            fs8 r19 = defpackage.tpa.z(r23)
            goto L_0x0098
        L_0x00b4:
            java.lang.String r13 = "userId"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00bd
            goto L_0x00a3
        L_0x00bd:
            long r16 = defpackage.lz7.M(r1, r10)     // Catch:{ all -> 0x00c2 }
            goto L_0x0098
        L_0x00c2:
            r0 = move-exception
            r13 = r0
            defpackage.hm9.l0(r3, r2, r13)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00cd:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x00e0
            java.lang.Object r16 = r0.next()
            r4a r16 = (defpackage.r4a) r16
            r16.getClass()
            defpackage.r4a.a(r13)
            goto L_0x00cd
        L_0x00e0:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x00f1
            if (r0 == r4) goto L_0x00f0
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00f0:
            throw r13
        L_0x00f1:
            r16 = r10
            goto L_0x0098
        L_0x00f4:
            java.lang.String r13 = "updateTypeId"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00fd
            goto L_0x00a3
        L_0x00fd:
            byte r0 = defpackage.lz7.I(r23)     // Catch:{ all -> 0x0106 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0106 }
            goto L_0x0135
        L_0x0106:
            r0 = move-exception
            defpackage.hm9.l0(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r13 = defpackage.u7d.a
            java.util.Iterator r13 = r13.iterator()
        L_0x0110:
            boolean r18 = r13.hasNext()
            if (r18 == 0) goto L_0x0123
            java.lang.Object r18 = r13.next()
            r4a r18 = (defpackage.r4a) r18
            r18.getClass()
            defpackage.r4a.a(r0)
            goto L_0x0110
        L_0x0123:
            int r13 = defpackage.k7d.a
            int r13 = defpackage.au1.s(r13)
            if (r13 == 0) goto L_0x0134
            if (r13 == r4) goto L_0x0133
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0133:
            throw r0
        L_0x0134:
            r0 = 0
        L_0x0135:
            if (r0 != 0) goto L_0x013a
        L_0x0137:
            r18 = r9
            goto L_0x0172
        L_0x013a:
            int[] r13 = defpackage.au1.v(r9)
            int r5 = r13.length
            r7 = 0
        L_0x0140:
            if (r7 >= r5) goto L_0x016d
            r9 = r13[r7]
            r4 = 1
            if (r9 == r4) goto L_0x015e
            r4 = 2
            if (r9 == r4) goto L_0x015c
            r4 = 3
            if (r9 == r4) goto L_0x015a
            r4 = 4
            if (r9 == r4) goto L_0x0158
            r4 = 5
            if (r9 != r4) goto L_0x0156
            r4 = -128(0xffffffffffffff80, float:NaN)
            goto L_0x015f
        L_0x0156:
            r0 = 0
            throw r0
        L_0x0158:
            r4 = 3
            goto L_0x015f
        L_0x015a:
            r4 = 2
            goto L_0x015f
        L_0x015c:
            r4 = 1
            goto L_0x015f
        L_0x015e:
            r4 = 0
        L_0x015f:
            byte r10 = r0.byteValue()
            if (r4 != r10) goto L_0x0166
            goto L_0x016e
        L_0x0166:
            int r7 = r7 + 1
            r4 = 1
            r9 = 5
            r10 = 0
            goto L_0x0140
        L_0x016d:
            r9 = 0
        L_0x016e:
            if (r9 != 0) goto L_0x0137
            r9 = 5
            goto L_0x0137
        L_0x0172:
            r4 = 0
            goto L_0x0206
        L_0x0176:
            java.lang.String r4 = "chatId"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0181
            r4 = 0
            goto L_0x01c5
        L_0x0181:
            r4 = 0
            long r9 = defpackage.lz7.M(r1, r4)     // Catch:{ all -> 0x018a }
            r14 = r9
            goto L_0x0206
        L_0x018a:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0195:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x01a8
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r7)
            goto L_0x0195
        L_0x01a8:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x01ba
            r9 = 1
            if (r0 == r9) goto L_0x01b9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01b9:
            throw r7
        L_0x01ba:
            r14 = r4
            goto L_0x0206
        L_0x01bc:
            r4 = r10
            java.lang.String r7 = "messageIds"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x01f9
        L_0x01c5:
            r23.z()     // Catch:{ all -> 0x01c9 }
            goto L_0x0206
        L_0x01c9:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01d4:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x01e7
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r7)
            goto L_0x01d4
        L_0x01e7:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0206
            r9 = 1
            if (r0 == r9) goto L_0x01f8
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01f8:
            throw r7
        L_0x01f9:
            nd2 r0 = new nd2     // Catch:{ all -> 0x0208 }
            r7 = 14
            r0.<init>(r7)     // Catch:{ all -> 0x0208 }
            java.util.Set r0 = defpackage.lz7.X(r1, r0)     // Catch:{ all -> 0x0208 }
            r20 = r0
        L_0x0206:
            r9 = 1
            goto L_0x0239
        L_0x0208:
            r0 = move-exception
            defpackage.hm9.l0(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r7 = defpackage.u7d.a
            java.util.Iterator r7 = r7.iterator()
        L_0x0212:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0225
            java.lang.Object r9 = r7.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r0)
            goto L_0x0212
        L_0x0225:
            int r7 = defpackage.k7d.a
            int r7 = defpackage.au1.s(r7)
            r9 = 1
            if (r7 == 0) goto L_0x0237
            if (r7 == r9) goto L_0x0236
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0236:
            throw r0
        L_0x0237:
            r20 = r8
        L_0x0239:
            int r12 = r12 + 1
            r10 = r4
            r4 = r9
            r9 = 5
            goto L_0x005f
        L_0x0240:
            ks9 r7 = new ks9
            r13 = r7
            r13.<init>(r14, r16, r18, r19, r20)
        L_0x0246:
            return r7
        L_0x0247:
            boolean r0 = r23.m()
            if (r0 != 0) goto L_0x0250
            r4 = 0
            goto L_0x0449
        L_0x0250:
            r5 = 1
            int r0 = defpackage.lz7.N(r23)     // Catch:{ all -> 0x0257 }
            r7 = r0
            goto L_0x0287
        L_0x0257:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0262:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0275
            java.lang.Object r8 = r0.next()
            r4a r8 = (defpackage.r4a) r8
            r8.getClass()
            defpackage.r4a.a(r7)
            goto L_0x0262
        L_0x0275:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0286
            if (r0 == r5) goto L_0x0285
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0285:
            throw r7
        L_0x0286:
            r7 = 0
        L_0x0287:
            r8 = -1
            r13 = r8
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x028d:
            if (r10 >= r7) goto L_0x0444
            java.lang.String r0 = defpackage.lz7.P(r23)     // Catch:{ all -> 0x0294 }
            goto L_0x02c7
        L_0x0294:
            r0 = move-exception
            r15 = r0
            defpackage.hm9.l0(r3, r2, r15)     // Catch:{ all -> 0x02b2 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x02b2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x02b2 }
        L_0x029f:
            boolean r16 = r0.hasNext()     // Catch:{ all -> 0x02b2 }
            if (r16 == 0) goto L_0x02b5
            java.lang.Object r16 = r0.next()     // Catch:{ all -> 0x02b2 }
            r4a r16 = (defpackage.r4a) r16     // Catch:{ all -> 0x02b2 }
            r16.getClass()     // Catch:{ all -> 0x02b2 }
            defpackage.r4a.a(r15)     // Catch:{ all -> 0x02b2 }
            goto L_0x029f
        L_0x02b2:
            r0 = move-exception
            goto L_0x0417
        L_0x02b5:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x02b2 }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x02b2 }
            if (r0 == 0) goto L_0x02c6
            if (r0 == r5) goto L_0x02c5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x02b2 }
            r0.<init>()     // Catch:{ all -> 0x02b2 }
            throw r0     // Catch:{ all -> 0x02b2 }
        L_0x02c5:
            throw r15     // Catch:{ all -> 0x02b2 }
        L_0x02c6:
            r0 = 0
        L_0x02c7:
            if (r0 == 0) goto L_0x0411
            int r15 = r0.hashCode()     // Catch:{ all -> 0x0326 }
            r4 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r15 == r4) goto L_0x036d
            r4 = -840272977(0xffffffffcdea73af, float:-4.91681248E8)
            if (r15 == r4) goto L_0x032a
            r4 = 3344077(0x3306cd, float:4.68605E-39)
            if (r15 == r4) goto L_0x02df
        L_0x02dc:
            r15 = r7
            goto L_0x0376
        L_0x02df:
            java.lang.String r4 = "mark"
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x0326 }
            if (r0 == 0) goto L_0x02dc
            r15 = r7
            r6 = 0
            long r6 = defpackage.lz7.M(r1, r6)     // Catch:{ all -> 0x02f1 }
            r13 = r6
            goto L_0x0412
        L_0x02f1:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r3, r2, r6)     // Catch:{ all -> 0x030f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x030f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x030f }
        L_0x02fc:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x030f }
            if (r7 == 0) goto L_0x0312
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x030f }
            r4a r7 = (defpackage.r4a) r7     // Catch:{ all -> 0x030f }
            r7.getClass()     // Catch:{ all -> 0x030f }
            defpackage.r4a.a(r6)     // Catch:{ all -> 0x030f }
            goto L_0x02fc
        L_0x030f:
            r0 = move-exception
            goto L_0x03e4
        L_0x0312:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x030f }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x030f }
            if (r0 == 0) goto L_0x0323
            if (r0 == r5) goto L_0x0322
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x030f }
            r0.<init>()     // Catch:{ all -> 0x030f }
            throw r0     // Catch:{ all -> 0x030f }
        L_0x0322:
            throw r6     // Catch:{ all -> 0x030f }
        L_0x0323:
            r13 = r8
            goto L_0x0412
        L_0x0326:
            r0 = move-exception
            r15 = r7
            goto L_0x03e4
        L_0x032a:
            r15 = r7
            java.lang.String r6 = "unread"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x030f }
            if (r0 != 0) goto L_0x0334
            goto L_0x0376
        L_0x0334:
            int r0 = defpackage.lz7.L(r23)     // Catch:{ all -> 0x033b }
            r11 = r0
            goto L_0x0412
        L_0x033b:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r3, r2, r6)     // Catch:{ all -> 0x030f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x030f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x030f }
        L_0x0346:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x030f }
            if (r7 == 0) goto L_0x0359
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x030f }
            r4a r7 = (defpackage.r4a) r7     // Catch:{ all -> 0x030f }
            r7.getClass()     // Catch:{ all -> 0x030f }
            defpackage.r4a.a(r6)     // Catch:{ all -> 0x030f }
            goto L_0x0346
        L_0x0359:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x030f }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x030f }
            if (r0 == 0) goto L_0x036a
            if (r0 == r5) goto L_0x0369
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x030f }
            r0.<init>()     // Catch:{ all -> 0x030f }
            throw r0     // Catch:{ all -> 0x030f }
        L_0x0369:
            throw r6     // Catch:{ all -> 0x030f }
        L_0x036a:
            r11 = 0
            goto L_0x0412
        L_0x036d:
            r15 = r7
            java.lang.String r6 = "success"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x030f }
            if (r0 != 0) goto L_0x03aa
        L_0x0376:
            r23.z()     // Catch:{ all -> 0x037b }
            goto L_0x0412
        L_0x037b:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r3, r2, r6)     // Catch:{ all -> 0x030f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x030f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x030f }
        L_0x0386:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x030f }
            if (r7 == 0) goto L_0x0399
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x030f }
            r4a r7 = (defpackage.r4a) r7     // Catch:{ all -> 0x030f }
            r7.getClass()     // Catch:{ all -> 0x030f }
            defpackage.r4a.a(r6)     // Catch:{ all -> 0x030f }
            goto L_0x0386
        L_0x0399:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x030f }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x030f }
            if (r0 == 0) goto L_0x0412
            if (r0 == r5) goto L_0x03a9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x030f }
            r0.<init>()     // Catch:{ all -> 0x030f }
            throw r0     // Catch:{ all -> 0x030f }
        L_0x03a9:
            throw r6     // Catch:{ all -> 0x030f }
        L_0x03aa:
            boolean r0 = defpackage.lz7.H(r23)     // Catch:{ all -> 0x03af }
            goto L_0x03df
        L_0x03af:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r3, r2, r6)     // Catch:{ all -> 0x030f }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a     // Catch:{ all -> 0x030f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x030f }
        L_0x03ba:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x030f }
            if (r7 == 0) goto L_0x03cd
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x030f }
            r4a r7 = (defpackage.r4a) r7     // Catch:{ all -> 0x030f }
            r7.getClass()     // Catch:{ all -> 0x030f }
            defpackage.r4a.a(r6)     // Catch:{ all -> 0x030f }
            goto L_0x03ba
        L_0x03cd:
            int r0 = defpackage.k7d.a     // Catch:{ all -> 0x030f }
            int r0 = defpackage.au1.s(r0)     // Catch:{ all -> 0x030f }
            if (r0 == 0) goto L_0x03de
            if (r0 == r5) goto L_0x03dd
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x030f }
            r0.<init>()     // Catch:{ all -> 0x030f }
            throw r0     // Catch:{ all -> 0x030f }
        L_0x03dd:
            throw r6     // Catch:{ all -> 0x030f }
        L_0x03de:
            r0 = 0
        L_0x03df:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x030f }
            goto L_0x0412
        L_0x03e4:
            defpackage.hm9.l0(r3, r2, r0)     // Catch:{ all -> 0x02b2 }
            java.util.concurrent.CopyOnWriteArraySet r6 = defpackage.u7d.a     // Catch:{ all -> 0x02b2 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x02b2 }
        L_0x03ed:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x02b2 }
            if (r7 == 0) goto L_0x0400
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x02b2 }
            r4a r7 = (defpackage.r4a) r7     // Catch:{ all -> 0x02b2 }
            r7.getClass()     // Catch:{ all -> 0x02b2 }
            defpackage.r4a.a(r0)     // Catch:{ all -> 0x02b2 }
            goto L_0x03ed
        L_0x0400:
            int r6 = defpackage.k7d.a     // Catch:{ all -> 0x02b2 }
            int r6 = defpackage.au1.s(r6)     // Catch:{ all -> 0x02b2 }
            if (r6 == 0) goto L_0x0412
            if (r6 == r5) goto L_0x0410
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x02b2 }
            r0.<init>()     // Catch:{ all -> 0x02b2 }
            throw r0     // Catch:{ all -> 0x02b2 }
        L_0x0410:
            throw r0     // Catch:{ all -> 0x02b2 }
        L_0x0411:
            r15 = r7
        L_0x0412:
            int r10 = r10 + 1
            r7 = r15
            goto L_0x028d
        L_0x0417:
            defpackage.hm9.l0(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r1 = defpackage.u7d.a
            java.util.Iterator r1 = r1.iterator()
        L_0x0420:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0433
            java.lang.Object r2 = r1.next()
            r4a r2 = (defpackage.r4a) r2
            r2.getClass()
            defpackage.r4a.a(r0)
            goto L_0x0420
        L_0x0433:
            int r1 = defpackage.k7d.a
            int r1 = defpackage.au1.s(r1)
            if (r1 == 0) goto L_0x0444
            if (r1 == r5) goto L_0x0443
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0443:
            throw r0
        L_0x0444:
            qd2 r4 = new qd2
            r4.<init>(r13, r11, r12)
        L_0x0449:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq9.w(gy8):gle");
    }

    public /* synthetic */ oq9(tjg tjg) {
        this.a = 19;
    }
}
