package defpackage;

import android.text.Spannable;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wx4  reason: default package */
public final class wx4 implements tx4 {
    public final je7 a;
    public final je7 b;

    public wx4(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    public final boolean a(int i, CharSequence charSequence) {
        h().getClass();
        if (charSequence == null || charSequence.length() == 0 || i < 0 || i > w9e.v0(charSequence)) {
            return false;
        }
        int codePointAt = charSequence.toString().codePointAt(i);
        return nu0.y(codePointAt) || codePointAt == 8205 || codePointAt == 8419;
    }

    public final CharSequence b(int i, CharSequence charSequence) {
        Spannable e = h().e(i, charSequence);
        return e == null ? "" : e;
    }

    public final List c(CharSequence charSequence) {
        List<kpa> d = h().d(charSequence);
        ArrayList arrayList = new ArrayList(z53.S(d, 10));
        for (kpa kpa : d) {
            arrayList.add((CharSequence) kpa.a);
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: ey4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence d(long r13, java.lang.String r15, java.lang.String r16, java.lang.CharSequence r17, int r18) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            r2 = r17
            r9 = r18
            java.lang.CharSequence r3 = r12.b(r9, r2)
            int r4 = r3.length()
            r5 = 0
            r10 = 0
            boolean r6 = r3 instanceof android.text.Spanned     // Catch:{ all -> 0x0022 }
            if (r6 == 0) goto L_0x0018
            r6 = r3
            android.text.Spanned r6 = (android.text.Spanned) r6     // Catch:{ all -> 0x0022 }
            goto L_0x0019
        L_0x0018:
            r6 = r5
        L_0x0019:
            if (r6 == 0) goto L_0x0022
            java.lang.Class<ey4> r7 = defpackage.ey4.class
            java.lang.Object[] r4 = r6.getSpans(r10, r4, r7)     // Catch:{ all -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r4 = r5
        L_0x0023:
            ey4[] r4 = (defpackage.ey4[]) r4
            if (r4 == 0) goto L_0x002e
            java.lang.Object r4 = defpackage.ys.e0(r4)
            r5 = r4
            ey4 r5 = (defpackage.ey4) r5
        L_0x002e:
            if (r5 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x0085
            je7 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            ji r0 = (defpackage.ji) r0
            r0.getClass()
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0085
            int r4 = r17.length()
            if (r4 != 0) goto L_0x0048
            goto L_0x0085
        L_0x0048:
            zj r11 = new zj
            a3f r4 = new a3f
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            if (r16 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r3 = r16
        L_0x0055:
            r4.<init>(r6, r15, r3)
            q0e r6 = defpackage.r0e.a(r4)
            ki r7 = new ki
            android.graphics.drawable.Drawable r1 = r5.Y
            r7.<init>(r1)
            android.content.Context r4 = r0.b
            fi r8 = r0.a
            r3 = r11
            r5 = r18
            r3.<init>(r4, r5, r6, r7, r8)
            r11.setBounds(r10, r10, r9, r9)
            ak r0 = new ak
            r3 = r13
            r0.<init>(r13, r11)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r2)
            int r2 = r17.length()
            r3 = 33
            r1.setSpan(r0, r10, r2, r3)
            r3 = r1
        L_0x0085:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx4.d(long, java.lang.String, java.lang.String, java.lang.CharSequence, int):java.lang.CharSequence");
    }

    public final CharSequence e(CharSequence charSequence) {
        cz4 h = h();
        h.c.getClass();
        Spannable e = h.e(tu0.G(TypedValue.applyDimension(2, (float) 20, fk4.d().getDisplayMetrics())), charSequence);
        return e == null ? "" : e;
    }

    public final List f(CharSequence charSequence) {
        return h().d(charSequence);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, java.util.function.IntPredicate] */
    public final boolean g(CharSequence charSequence) {
        h().getClass();
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        return charSequence.codePoints().allMatch(new Object());
    }

    public final cz4 h() {
        return (cz4) this.a.getValue();
    }
}
