package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* renamed from: tda  reason: default package */
public final class tda {
    public final Context a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public tda(je7 je7, je7 je72, je7 je73, je7 je74, Context context) {
        this.a = context;
        this.b = je7;
        this.c = je72;
        this.d = je73;
        this.e = je74;
        Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
    }

    public final gt9 a() {
        return (gt9) this.e.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.e52 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.pda
            if (r0 == 0) goto L_0x0013
            r0 = r6
            pda r0 = (defpackage.pda) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            pda r0 = new pda
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            e52 r5 = r0.X
            tda r4 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.od2.a0(r6)
            qda r6 = new qda
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.o = r4
            r0.X = r5
            r0.s0 = r3
            r2 = 200(0xc8, double:9.9E-322)
            java.lang.Object r6 = defpackage.fp3.I(r2, r6, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L_0x0066
            gt9 r4 = r4.a()
            r4.getClass()
            r5.k0()
            r5.l0()
            java.lang.CharSequence r6 = r5.x0
            long r0 = r5.f()
            android.graphics.Bitmap r6 = r4.e(r6, r0)
        L_0x0066:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tda.b(e52, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.uj3 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.rda
            if (r0 == 0) goto L_0x0013
            r0 = r6
            rda r0 = (defpackage.rda) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            rda r0 = new rda
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            uj3 r5 = r0.X
            tda r4 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.od2.a0(r6)
            sda r6 = new sda
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.o = r4
            r0.X = r5
            r0.s0 = r3
            r2 = 200(0xc8, double:9.9E-322)
            java.lang.Object r6 = defpackage.fp3.I(r2, r6, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L_0x0062
            gt9 r4 = r4.a()
            r4.getClass()
            java.lang.CharSequence r6 = r5.m()
            long r0 = r5.n()
            android.graphics.Bitmap r6 = r4.e(r6, r0)
        L_0x0062:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tda.c(uj3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int d() {
        return qp4.u0.b(this.a).i().b().a.m;
    }

    public final int e() {
        return Long.hashCode(((p7b) ((m7b) this.b.getValue())).a.t());
    }

    public final dv9 f(String str, boolean z) {
        if (str.length() == 0) {
            return null;
        }
        return new dv9(str, z, new Uri.Builder().scheme("content").authority("one.me.android.notifications").appendPath("message_image").appendPath(str).appendPath(String.valueOf(z)).build());
    }
}
