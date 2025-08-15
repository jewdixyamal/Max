package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: ida  reason: default package */
public final class ida {
    public static final /* synthetic */ int s = 0;
    public final Context a;
    public final d6a b;
    public final t33 c;
    public final je7 d;
    public final are e;
    public int f = -1;
    public String g;
    public Pattern h;
    public final m7b i;
    public final tx4 j;
    public final d6a k;
    public final xs2 l;
    public final o45 m;
    public final hda n;
    public final je7 o;
    public int p = -1;
    public int q = -1;
    public int r = -1;

    public ida(Context context, m7b m7b, tx4 tx4, xs2 xs2, d6a d6a, o45 o45, je7 je7, are are, hda hda, je7 je72) {
        this.a = context.getApplicationContext();
        this.c = ((p7b) m7b).a;
        this.b = d6a;
        this.d = je7;
        this.e = are;
        this.i = m7b;
        this.j = tx4;
        this.l = xs2;
        this.k = d6a;
        this.m = o45;
        this.n = hda;
        this.o = je72;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence a(java.lang.CharSequence r17, boolean r18, boolean r19, boolean r20, boolean r21, java.util.List r22, boolean r23) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r23
            java.lang.String r5 = "OneMeLinksProcessor"
            java.lang.String r6 = "ONEME-6282"
            boolean r7 = android.text.TextUtils.isEmpty(r17)
            if (r7 == 0) goto L_0x0015
            java.lang.String r0 = ""
            return r0
        L_0x0015:
            java.lang.String r7 = r1.g
            if (r7 != 0) goto L_0x0034
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            android.content.Context r8 = r1.a
            int r9 = defpackage.yzb.app_scheme
            java.lang.String r8 = r8.getString(r9)
            r7.append(r8)
            java.lang.String r8 = "://"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r1.g = r7
        L_0x0034:
            java.util.regex.Pattern r7 = r1.h
            if (r7 != 0) goto L_0x0051
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r1.g
            r7.append(r8)
            java.lang.String r8 = "[^\\s]+"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)
            r1.h = r7
        L_0x0051:
            java.util.regex.Pattern r7 = defpackage.cre.a
            boolean r7 = r0 instanceof android.text.Spannable
            if (r7 == 0) goto L_0x005b
            android.text.Spannable r0 = (android.text.Spannable) r0
        L_0x0059:
            r7 = r0
            goto L_0x0060
        L_0x005b:
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r17)
            goto L_0x0059
        L_0x0060:
            d6a r0 = r1.k
            int r8 = r0.a(r3)
            if (r20 == 0) goto L_0x006d
            lk7 r0 = defpackage.lk7.c
            defpackage.cre.a(r7, r0, r2, r8)
        L_0x006d:
            if (r21 == 0) goto L_0x0072
            r0 = 7
            r9 = r0
            goto L_0x0073
        L_0x0072:
            r9 = 1
        L_0x0073:
            xs2 r0 = r1.l
            r0.getClass()
            je7 r10 = r0.a
            r11 = 0
            boolean r0 = android.text.util.Linkify.addLinks(r7, r9)     // Catch:{ all -> 0x0080 }
            goto L_0x00b1
        L_0x0080:
            r0 = move-exception
            r12 = r0
            boolean r0 = r12 instanceof java.lang.ArrayIndexOutOfBoundsException
            if (r0 == 0) goto L_0x00a2
            java.lang.CharSequence r0 = defpackage.kp.z(r7)     // Catch:{ all -> 0x0091 }
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch:{ all -> 0x0091 }
            boolean r0 = android.text.util.Linkify.addLinks(r0, r9)     // Catch:{ all -> 0x0091 }
            goto L_0x00b1
        L_0x0091:
            r0 = move-exception
            java.lang.String r9 = "LinkifyCompat.addLinks with mask text.safeCopy() failed"
            defpackage.hm9.p(r5, r9, r0)
            java.lang.Object r9 = r10.getValue()
            ty3 r9 = (defpackage.ty3) r9
            r9.a(r6, r0)
        L_0x00a0:
            r0 = r11
            goto L_0x00b1
        L_0x00a2:
            java.lang.String r0 = "LinkifyCompat.addLinks with mask failed"
            defpackage.hm9.p(r5, r0, r12)
            java.lang.Object r0 = r10.getValue()
            ty3 r0 = (defpackage.ty3) r0
            r0.a(r6, r12)
            goto L_0x00a0
        L_0x00b1:
            if (r0 != 0) goto L_0x00f2
            java.util.regex.Pattern r9 = r1.h
            java.lang.String r12 = r1.g
            boolean r0 = android.text.util.Linkify.addLinks(r7, r9, r12)     // Catch:{ all -> 0x00bc }
            goto L_0x00ed
        L_0x00bc:
            r0 = move-exception
            r13 = r0
            boolean r0 = r13 instanceof java.lang.ArrayIndexOutOfBoundsException
            if (r0 == 0) goto L_0x00de
            java.lang.CharSequence r0 = defpackage.kp.z(r7)     // Catch:{ all -> 0x00cd }
            android.text.Spannable r0 = (android.text.Spannable) r0     // Catch:{ all -> 0x00cd }
            boolean r0 = android.text.util.Linkify.addLinks(r0, r9, r12)     // Catch:{ all -> 0x00cd }
            goto L_0x00ed
        L_0x00cd:
            r0 = move-exception
            java.lang.String r9 = "LinkifyCompat.addLinks with pattern text.safeCopy() failed"
            defpackage.hm9.p(r5, r9, r0)
            java.lang.Object r5 = r10.getValue()
            ty3 r5 = (defpackage.ty3) r5
            r5.a(r6, r0)
        L_0x00dc:
            r0 = r11
            goto L_0x00ed
        L_0x00de:
            java.lang.String r0 = "LinkifyCompat.addLinks with pattern failed"
            defpackage.hm9.p(r5, r0, r13)
            java.lang.Object r0 = r10.getValue()
            ty3 r0 = (defpackage.ty3) r0
            r0.a(r6, r13)
            goto L_0x00dc
        L_0x00ed:
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r0 = r11
            goto L_0x00f3
        L_0x00f2:
            r0 = 1
        L_0x00f3:
            if (r0 == 0) goto L_0x0174
            int r0 = r7.length()
            java.lang.Class<android.text.style.URLSpan> r5 = android.text.style.URLSpan.class
            java.lang.Object[] r0 = r7.getSpans(r11, r0, r5)
            android.text.style.URLSpan[] r0 = (android.text.style.URLSpan[]) r0
            if (r0 == 0) goto L_0x0174
            int r5 = r0.length
            if (r5 != 0) goto L_0x0108
            goto L_0x0174
        L_0x0108:
            int r5 = r7.length()
            java.lang.Class<ek7> r6 = defpackage.ek7.class
            java.lang.Object[] r5 = r7.getSpans(r11, r5, r6)
            ek7[] r5 = (defpackage.ek7[]) r5
            if (r5 == 0) goto L_0x0174
            int r6 = r5.length
            if (r6 != 0) goto L_0x011a
            goto L_0x0174
        L_0x011a:
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r5 = java.util.Arrays.asList(r5)
            r6.<init>(r5)
            int r5 = r0.length
            r9 = r11
            r10 = r9
        L_0x0126:
            if (r9 >= r5) goto L_0x0174
            r12 = r0[r9]
            boolean r13 = r6.isEmpty()
            if (r13 == 0) goto L_0x0131
            goto L_0x0174
        L_0x0131:
            int r13 = r7.getSpanStart(r12)
            if (r13 >= 0) goto L_0x0138
            goto L_0x013e
        L_0x0138:
            int r14 = r7.getSpanEnd(r12)
            if (r14 >= 0) goto L_0x0140
        L_0x013e:
            r4 = 1
            goto L_0x0171
        L_0x0140:
            r15 = r11
        L_0x0141:
            int r11 = r6.size()
            if (r15 >= r11) goto L_0x016d
            java.lang.Object r11 = r6.get(r15)
            ek7 r11 = (defpackage.ek7) r11
            int r4 = r7.getSpanStart(r11)
            if (r4 >= 0) goto L_0x0154
            goto L_0x015a
        L_0x0154:
            int r11 = r7.getSpanEnd(r11)
            if (r11 >= 0) goto L_0x015c
        L_0x015a:
            r4 = 1
            goto L_0x016b
        L_0x015c:
            if (r4 != r13) goto L_0x0169
            if (r11 != r14) goto L_0x0169
            r7.removeSpan(r12)
            r6.remove(r15)
            r4 = 1
            r10 = 1
            goto L_0x016e
        L_0x0169:
            r4 = 1
            r10 = 1
        L_0x016b:
            int r15 = r15 + r4
            goto L_0x0141
        L_0x016d:
            r4 = 1
        L_0x016e:
            if (r10 != 0) goto L_0x0171
            goto L_0x0174
        L_0x0171:
            int r9 = r9 + r4
            r11 = 0
            goto L_0x0126
        L_0x0174:
            lk7 r0 = defpackage.lk7.o
            defpackage.cre.a(r7, r0, r2, r8)
            if (r22 == 0) goto L_0x01c8
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x01c8
            java.util.Iterator r4 = r22.iterator()
        L_0x0185:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r0 = r4.next()
            r5 = r0
            nu8 r5 = (defpackage.nu8) r5
            int r0 = r5.d
            int r6 = r5.e
            int r6 = r6 + r0
            java.lang.Class<cmb> r9 = defpackage.cmb.class
            java.lang.Object[] r0 = r7.getSpans(r0, r6, r9)
            r6 = r0
            cmb[] r6 = (defpackage.cmb[]) r6
            if (r6 == 0) goto L_0x01be
            int r0 = r6.length
            if (r0 > 0) goto L_0x01a6
            goto L_0x01be
        L_0x01a6:
            int r9 = r6.length
            r10 = 0
        L_0x01a8:
            if (r10 >= r9) goto L_0x01be
            r0 = r6[r10]
            r7.removeSpan(r0)     // Catch:{ Exception | StackOverflowError -> 0x01b1 }
        L_0x01af:
            r11 = 1
            goto L_0x01bc
        L_0x01b1:
            r0 = move-exception
            boolean r11 = r0 instanceof java.lang.StackOverflowError
            if (r11 == 0) goto L_0x01af
            o45 r11 = r1.m
            r11.a(r0)
            goto L_0x01af
        L_0x01bc:
            int r10 = r10 + r11
            goto L_0x01a8
        L_0x01be:
            r11 = 1
            r6 = 0
            java.lang.CharSequence r0 = r1.b(r7, r5, r6, r3)
            r7 = r0
            android.text.Spannable r7 = (android.text.Spannable) r7
            goto L_0x0185
        L_0x01c8:
            if (r19 == 0) goto L_0x01cf
            lk7 r0 = defpackage.lk7.b
            defpackage.cre.a(r7, r0, r2, r8)
        L_0x01cf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ida.a(java.lang.CharSequence, boolean, boolean, boolean, boolean, java.util.List, boolean):java.lang.CharSequence");
    }

    public final CharSequence b(CharSequence charSequence, nu8 nu8, boolean z, boolean z2) {
        if (nu8.g.contains(nu8.c)) {
            return charSequence;
        }
        int i2 = nu8.d;
        int i3 = nu8.e;
        int i4 = i2 + i3;
        if (i4 > charSequence.length() || i2 < 0) {
            hm9.k0("ida", (Exception) null, "addMessageElement: can't add message element, text length: %s, from: %s, length: %s", Arrays.copyOf(new Object[]{Integer.valueOf(charSequence.length()), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
            return charSequence;
        } else if (z && charSequence.charAt(i2) == '@') {
            return charSequence;
        } else {
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(new qu8(nu8, this.b.a(z2)), i2, i4, 33);
            return spannableStringBuilder;
        }
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2, int i2) {
        if (z) {
            spannableStringBuilder.insert(i2, "⁠ ");
            spannableStringBuilder.setSpan(new fcf(this.a, 1, false, new bt8(z2, 2)), i2 + 1, i2 + 2, 33);
        }
    }

    public final String d(long j2) {
        t33 t33 = this.c;
        b11 o2 = ay7.o(j2, t33.n());
        Locale v = t33.v();
        String[] strArr = are.b;
        int s2 = au1.s(o2.b);
        Context context = this.a;
        long j3 = o2.c;
        switch (s2) {
            case 0:
                return context.getString(c2c.tt_dates_right_now);
            case 1:
                return are.s(fzb.tt_dates_minutes_past, (int) j3, context);
            case 2:
                return are.s(fzb.tt_dates_hours_past, (int) j3, context);
            case 3:
                return String.format(context.getString(c2c.tt_dates_yesterday_at), new Object[]{ay7.k(context, j3, v)});
            case 4:
                return are.s(fzb.tt_dates_days_past, (int) j3, context);
            case 5:
                return are.s(fzb.tt_dates_weeks_past, (int) j3, context);
            case 6:
                return are.s(fzb.tt_dates_months_past, (int) j3, context);
            case 7:
                return ay7.q(v, j3, true);
            default:
                return "";
        }
    }

    public final int e() {
        if (this.q == -1) {
            this.q = (int) this.a.getResources().getDimension(fpc.b);
        }
        return this.q;
    }

    public final int f() {
        if (this.p == -1) {
            this.p = (int) (fk4.e(((p7b) this.i).c.g.getFloat("app.extra.text.size.sp", 0.0f)) + this.a.getResources().getDimension(fpc.a));
        }
        return this.p;
    }

    public final int g() {
        if (this.r == -1) {
            this.r = (int) (fk4.e(((p7b) this.i).c.g.getFloat("app.extra.text.size.sp", 0.0f)) + this.a.getResources().getDimension(fpc.c));
        }
        return this.r;
    }

    public final w6b h(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) ? w6b.a() : new w6b(this.j.e(charSequence), bre.d(charSequence.toString(), this));
    }

    public final w6b i(String str, ArrayList arrayList) {
        return TextUtils.isEmpty(str) ? w6b.a() : arrayList.isEmpty() ? h(str) : new w6b(j(str, arrayList, fk4.b(18)), bre.d(str.toString(), this));
    }

    public final CharSequence j(CharSequence charSequence, List list, int i2) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        boolean a2 = ((rj) this.o.getValue()).a();
        tx4 tx4 = this.j;
        if (!a2) {
            return tx4.b(i2, charSequence);
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : list) {
                try {
                    if (((nu8) next).c == mu8.v0) {
                        arrayList2.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        return arrayList.isEmpty() ? tx4.b(i2, charSequence) : this.n.a(charSequence, arrayList, 1, false, i2, true);
    }

    public final CharSequence k(CharSequence charSequence, List list, boolean z, int i2, boolean z2) {
        if (charSequence == null) {
            return null;
        }
        return this.n.a(charSequence, list, 1, z, i2, z2 && ((rj) this.o.getValue()).a());
    }

    public final CharSequence l(CharSequence charSequence, List list) {
        CharSequence k2 = k(charSequence, list, true, 0, false);
        if (TextUtils.isEmpty(k2) || nd7.D(list)) {
            return k2;
        }
        CharSequence spannableStringBuilder = new SpannableStringBuilder(k2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nu8 nu8 = (nu8) it.next();
            if (nu8.c == mu8.a) {
                spannableStringBuilder = b(spannableStringBuilder, nu8, false, true);
            }
        }
        return spannableStringBuilder;
    }
}
