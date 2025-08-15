package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import androidx.work.WorkRequest;

/* renamed from: dt8  reason: default package */
public final class dt8 {
    public final Context a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final khe f = new khe(new at8(this, 0));
    public final khe g = new khe(new at8(this, 13));
    public final khe h = new khe(new at8(this, 14));
    public final khe i = new khe(new at8(this, 15));
    public final khe j = new khe(new at8(this, 1));
    public final khe k = new khe(new at8(this, 2));
    public final khe l = new khe(new at8(this, 3));
    public final khe m = new khe(new at8(this, 4));
    public final khe n = new khe(new at8(this, 5));
    public final khe o = new khe(new at8(this, 6));
    public final khe p = new khe(new at8(this, 7));
    public final khe q = new khe(new at8(this, 8));
    public final khe r = new khe(new at8(this, 9));
    public final khe s = new khe(new at8(this, 10));
    public final khe t = new khe(new at8(this, 11));
    public final khe u = new khe(new at8(this, 12));

    public dt8(je7 je7, je7 je72, je7 je73, je7 je74, Context context) {
        this.a = context;
        this.b = je7;
        this.c = je72;
        this.d = je73;
        this.e = je74;
    }

    public static int e(boolean z, boolean z2) {
        if (!z2 || z) {
            return z ? tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density) : tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        }
        return 0;
    }

    public final Layout a(tz tzVar, boolean z) {
        return f().a(au1.g((String) this.k.getValue(), ":"), g().a(os2.g), b(tzVar, e(z, true)), 1, false, TextUtils.TruncateAt.END);
    }

    public final int b(tz tzVar, int i2) {
        int G;
        int q2;
        int G2;
        o00 o00 = tzVar.d;
        if (o00 instanceof v2e) {
            q2 = tu0.G(((float) ((v2e) o00).a.s0) * fk4.d().getDisplayMetrics().density);
            G2 = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
        } else {
            boolean z = o00 instanceof k50;
            je7 je7 = this.c;
            if (z) {
                float f2 = (float) 192;
                q2 = (int) ((((float) rh4.q(f2, fk4.d().getDisplayMetrics().density, ((Number) ((w6a) ((os0) je7.getValue())).d.getValue()).intValue())) * (((float) (ote.f(((k50) o00).j, 1000, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) - 1000)) / ((float) 29000))) + ((float) tu0.G(fk4.d().getDisplayMetrics().density * f2)));
                G2 = tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density);
            } else {
                G = o00 instanceof wgf ? tu0.G(((float) 228) * fk4.d().getDisplayMetrics().density) : ((w6a) ((os0) je7.getValue())).a();
                return G - i2;
            }
        }
        G = q2 - (G2 * 2);
        return G - i2;
    }

    public final Layout c(CharSequence charSequence, tz tzVar, boolean z, boolean z2, boolean z3, boolean z4) {
        int e2 = e(z4, false);
        if (z) {
            e2 = rh4.c((float) 36, fk4.d().getDisplayMetrics().density, e2);
        }
        int b2 = b(tzVar, e2);
        if (!z2) {
            return f().a(charSequence, g().a(os2.j), b2, 1, false, TextUtils.TruncateAt.END);
        }
        return i24.g(this.a, f(), charSequence, b2, g().a(os2.j), new bt8(z3, 1));
    }

    /* JADX WARNING: type inference failed for: r8v5, types: [android.text.SpannedString] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.Layout d(java.lang.String r8, defpackage.tz r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            r7 = this;
            if (r11 == 0) goto L_0x003a
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            ct8 r1 = new ct8
            r1.<init>(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r1}
            java.lang.String r1 = "​"
            defpackage.tpa.e(r0, r1, r11)
            bvd r11 = new bvd
            r2 = 2
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.fk4.d()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = defpackage.tu0.G(r2)
            r11.<init>(r2)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            defpackage.tpa.e(r0, r1, r11)
            r0.append(r8)
            android.text.SpannedString r8 = new android.text.SpannedString
            r8.<init>(r0)
        L_0x003a:
            r2 = r8
            fe7 r1 = r7.f()
            tpe r8 = r7.g()
            kqe r11 = defpackage.os2.f
            android.text.TextPaint r3 = r8.a(r11)
            r8 = 0
            int r8 = e(r10, r8)
            int r4 = r7.b(r9, r8)
            r6 = 48
            r5 = 1
            android.text.Layout r7 = r1.a(r2, r3, r4, r5, false, android.text.TextUtils.TruncateAt.END)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt8.d(java.lang.String, tz, boolean, android.graphics.drawable.Drawable):android.text.Layout");
    }

    public final fe7 f() {
        return (fe7) this.b.getValue();
    }

    public final tpe g() {
        return (tpe) this.e.getValue();
    }
}
