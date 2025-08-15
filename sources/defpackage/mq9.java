package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.camera.video.internal.encoder.EncodeException;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: mq9  reason: default package */
public final class mq9 implements b66, pic, cc3, s43, df9, o05 {
    public static final mq9 X = new mq9(3);
    public static final mq9 Y = new mq9(4);
    public static mq9 Z;
    public static mq9 b;
    public static final mq9 c = new mq9(1);
    public static final mq9 o = new mq9(2);
    public final /* synthetic */ int a;

    public /* synthetic */ mq9(int i) {
        this.a = i;
    }

    public static final String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        byte b2;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int i4 = -1;
        byte[] bArr5 = PublicSuffixDatabase.e;
        int length = bArr3.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > i4 && bArr3[i6] != ((byte) 10)) {
                i6 += i4;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr3[i2] == ((byte) 10)) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    b2 = 46;
                    z = false;
                } else {
                    byte b3 = bArr4[i10][i11];
                    byte[] bArr6 = naf.a;
                    byte b4 = b3 & 255;
                    z = z2;
                    b2 = b4;
                }
                byte b5 = bArr3[i7 + i12];
                byte[] bArr7 = naf.a;
                i3 = b2 - (b5 & 255);
                if (i3 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    } else if (bArr4[i10].length != i11) {
                        z2 = z;
                    } else if (i10 == bArr4.length - 1) {
                        break;
                    } else {
                        i10++;
                        z2 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr4[i10].length - i11;
                    int length3 = bArr4.length;
                    for (int i14 = i10 + 1; i14 < length3; i14++) {
                        length2 += bArr4[i14].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr3, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
                i4 = -1;
            }
            length = i6;
            i4 = -1;
        }
        return null;
    }

    public static File h(Context context, o97 o97) {
        File i = i(context);
        m6d.y(i);
        return lk5.J(i, o97.b + '_' + System.currentTimeMillis() + ".bin");
    }

    public static File i(Context context) {
        String str;
        String q = c37.q();
        if (q.equals(context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(q.replace(':', '-'));
        }
        return new File(context.getCacheDir(), str);
    }

    public Object apply(Object obj) {
        List<ec1> list = (List) obj;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (ec1 ec1 : list) {
            arrayList.add(new dc1(ec1.c, ec1.a, ec1.b));
        }
        return arrayList;
    }

    public void b(EncodeException encodeException) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(long r8, int r10, defpackage.lu0 r11, defpackage.cz5 r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            r7 = this;
            boolean r0 = r14 instanceof defpackage.yo2
            if (r0 == 0) goto L_0x0014
            r0 = r14
            yo2 r0 = (defpackage.yo2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.s0 = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            yo2 r0 = new yo2
            r0.<init>(r7, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r7 = r6.Y
            tx3 r14 = defpackage.tx3.a
            int r0 = r6.s0
            r1 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r1) goto L_0x002d
            int r10 = r6.X
            boolean r13 = r6.o
            defpackage.od2.a0(r7)
            goto L_0x0063
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            defpackage.od2.a0(r7)
            r7 = 0
            if (r12 == 0) goto L_0x003f
            java.util.Set r0 = r12.a
            r2 = r0
            goto L_0x0040
        L_0x003f:
            r2 = r7
        L_0x0040:
            if (r12 == 0) goto L_0x0046
            java.lang.Long r0 = r12.b
            r3 = r0
            goto L_0x0047
        L_0x0046:
            r3 = r7
        L_0x0047:
            if (r12 == 0) goto L_0x004b
            java.lang.CharSequence r7 = r12.d
        L_0x004b:
            r4 = r7
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r8)
            java.util.Set r5 = java.util.Collections.singleton(r7)
            r6.o = r13
            r6.X = r10
            r6.s0 = r1
            r1 = r11
            java.lang.Object r7 = r1.a(r2, r3, r4, r5, r6)
            if (r7 != r14) goto L_0x0063
            return r14
        L_0x0063:
            zy5 r7 = (defpackage.zy5) r7
            zo2 r8 = new zo2
            r8.<init>(r10, r7, r13)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq9.c(long, int, lu0, cz5, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void d() {
    }

    public /* bridge */ /* synthetic */ void e(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
    }

    public Object f(bg4 bg4) {
        return nd7.s((Executor) bg4.f(new lqb(ip0.class, Executor.class)));
    }

    public void j(d05 d05) {
    }

    public w3 k(Context context, String str, lq9 lq9) {
        w3 w3Var = new w3();
        int d = lq9.d(context, str, true);
        w3Var.b = d;
        if (d != 0) {
            w3Var.c = 1;
        } else {
            int c2 = lq9.c(context, str);
            w3Var.a = c2;
            if (c2 != 0) {
                w3Var.c = -1;
            }
        }
        return w3Var;
    }

    public void n(q64 q64) {
    }

    public Object r(gy8 gy8) {
        switch (this.a) {
            case 6:
                long j = 0;
                try {
                    j = lz7.M(gy8, 0);
                } catch (Throwable th) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                    Iterator it = u7d.a.iterator();
                    while (it.hasNext()) {
                        ((r4a) it.next()).getClass();
                        r4a.a(th);
                    }
                    int s = au1.s(k7d.a);
                    if (s != 0) {
                        if (s != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th;
                    }
                }
                return Long.valueOf(j);
            default:
                long j2 = 0;
                try {
                    j2 = lz7.M(gy8, 0);
                } catch (Throwable th2) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                    Iterator it2 = u7d.a.iterator();
                    while (it2.hasNext()) {
                        ((r4a) it2.next()).getClass();
                        r4a.a(th2);
                    }
                    int s2 = au1.s(k7d.a);
                    if (s2 != 0) {
                        if (s2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th2;
                    }
                }
                return Long.valueOf(j2);
        }
    }

    public gle w(gy8 gy8) {
        int i;
        String str;
        gy8 gy82 = gy8;
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            Throwable th2 = th;
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th2);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        int i2 = -1;
        long j = -1;
        long j2 = -1;
        long j3 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th3) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th3);
                }
                int s2 = au1.s(k7d.a);
                if (s2 != 0) {
                    if (s2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
            }
            if (str != null) {
                try {
                    switch (str.hashCode()) {
                        case -1361631597:
                            if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
                                j = lz7.M(gy82, 0);
                                continue;
                            }
                            break;
                        case -840272977:
                            if (str.equals("unread")) {
                                i2 = lz7.L(gy8);
                                continue;
                            }
                            break;
                        case -836030906:
                            if (str.equals("userId")) {
                                j2 = lz7.M(gy82, 0);
                                continue;
                            }
                            break;
                        case 3344077:
                            if (str.equals("mark")) {
                                j3 = lz7.M(gy82, 0);
                                continue;
                            }
                            break;
                    }
                    gy8.z();
                } catch (Throwable th4) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                    Iterator it3 = u7d.a.iterator();
                    while (it3.hasNext()) {
                        ((r4a) it3.next()).getClass();
                        r4a.a(th4);
                    }
                    int s3 = au1.s(k7d.a);
                    if (s3 != 0) {
                        if (s3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th4;
                    }
                }
            }
        }
        if (j == -1 && j2 == -1 && j3 == -1 && i2 == -1) {
            return null;
        }
        return new es9(i2, j, j2, j3);
    }
}
