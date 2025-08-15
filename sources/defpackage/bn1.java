package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: bn1  reason: default package */
public final class bn1 {
    public final Context a;

    public bn1(Context context) {
        this.a = context;
    }

    public static String e(Long l) {
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        long j = (long) 3600;
        long j2 = longValue / j;
        long j3 = (long) 60;
        long j4 = (longValue % j) / j3;
        long j5 = longValue % j3;
        return j2 > 0 ? String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5)}, 3)) : String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
    }

    public final iqe a(eqe eqe) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(eqe.b(this.a));
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 18);
        return new iqe(spannableStringBuilder);
    }

    public final u51 b(oqf oqf) {
        Drawable drawable;
        s51 s51 = (s51) oqf;
        boolean equals = s51.equals(f51.c);
        pq9 pq9 = qp4.u0;
        Context context = this.a;
        if (equals) {
            drawable = dy7.E(pub.check_outline_16, pq9.o(context).c.getIcon().f, context);
        } else if (s51.equals(g51.c)) {
            drawable = h();
        } else if (s51.equals(i51.c)) {
            drawable = dy7.E(ztb.ic_connection_fill_16, pq9.o(context).c.getIcon().c, context);
        } else if (!s51.equals(o51.c)) {
            return null;
        } else {
            drawable = dy7.E(pub.ic_microphone_off_fill_16, pq9.o(context).c.getIcon().f, context);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(oqf.a));
        spannableStringBuilder.append("  ");
        spannableStringBuilder.setSpan(new yl5(drawable, (sl5) null, 6), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        return new u51((long) s51.getPriority(), spannableStringBuilder);
    }

    public final SpannableStringBuilder c(boolean z) {
        Integer valueOf = Integer.valueOf(f0c.call_incoming_video_call);
        if (!z) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : f0c.call_incoming_audio_call;
        Context context = this.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wg0.i("   ", context.getString(intValue)));
        Drawable b = kt3.b(context, x7a.V);
        b.setBounds(0, 0, b.getIntrinsicWidth(), b.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new yl5(b, (sl5) null, 6), 0, 1, 33);
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder d(CharSequence charSequence, boolean z, int i, boolean z2, boolean z3, boolean z4, i95 i95) {
        Drawable drawable;
        if (charSequence == null) {
            return null;
        }
        if (z && (((i95 instanceof e95) || (i95 instanceof g95)) && z3)) {
            drawable = h();
        } else if (z || !z2 || (i95 instanceof e95) || (i95 instanceof g95)) {
            pq9 pq9 = qp4.u0;
            Context context = this.a;
            if (!z && z4) {
                drawable = dy7.E(ztb.ic_share_screen_20, pq9.o(context).c.getIcon().f, context);
                float f = (float) 12;
                drawable.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
            } else if (i == 2) {
                drawable = dy7.E(ztb.ic_microphone_disable_12, pq9.o(context).c.getIcon().f, context);
                float f2 = (float) 12;
                drawable.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
            } else if (i == 1) {
                mtd mtd = new mtd(context, pq9.b(context).i(), new we1(4));
                float f3 = (float) 12;
                mtd.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
                drawable = mtd;
            } else {
                drawable = null;
            }
        } else {
            drawable = h();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (drawable != null) {
            spannableStringBuilder.append("  ");
            spannableStringBuilder.setSpan(new yl5(drawable, (sl5) null, 6), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public final String f(boolean z, boolean z2, boolean z3, i95 i95) {
        Context context = this.a;
        if (!z3 && !z2 && (((i95 instanceof e95) || (i95 instanceof g95)) && !z)) {
            return context.getString(f0c.call_waiting);
        }
        if (((i95 instanceof e95) || (i95 instanceof g95)) && !z3) {
            return context.getString(f0c.call_connecting);
        }
        if (!(i95 instanceof b95)) {
            return null;
        }
        switch (an1.$EnumSwitchMapping$0[au1.s(((b95) i95).b)]) {
            case 1:
                return context.getString(f0c.call_opponent_unavailable);
            case 2:
                return context.getString(f0c.call_opponent_unavailable_busy);
            case 3:
                return context.getString(f0c.call_opponent_failed);
            case 4:
                return context.getString(f0c.call_opponent_unavailable_privacy);
            case 5:
                return context.getString(f0c.call_opponent_failed_timout);
            case 6:
                return context.getString(f0c.call_group_was_removed_from_call);
            case 7:
                return context.getString(f0c.call_group_was_removed_from_waiting_room);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.SpannableStringBuilder g(boolean r9, int r10, java.lang.CharSequence r11, boolean r12, boolean r13, boolean r14, boolean r15, defpackage.i95 r16) {
        /*
            r8 = this;
            r0 = r11
            r1 = r8
            android.content.Context r2 = r1.a
            r3 = 0
            if (r9 != 0) goto L_0x002a
            if (r15 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x001e
            r3 = 1
            char[] r3 = new char[r3]
            r4 = 32
            r5 = 0
            r3[r5] = r4
            java.util.List r0 = defpackage.w9e.P0(r11, r3)
            java.lang.Object r0 = defpackage.x53.i0(r0)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
        L_0x001e:
            int r0 = defpackage.b8a.e0
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = r2.getString(r0, r3)
        L_0x0028:
            r3 = r0
            goto L_0x0038
        L_0x002a:
            if (r12 != 0) goto L_0x002f
            if (r9 != 0) goto L_0x002f
            goto L_0x0038
        L_0x002f:
            if (r9 == 0) goto L_0x0028
            int r0 = defpackage.f0c.call_me_member
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0028
        L_0x0038:
            r0 = r8
            r1 = r3
            r2 = r9
            r3 = r10
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            android.text.SpannableStringBuilder r0 = r0.d(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn1.g(boolean, int, java.lang.CharSequence, boolean, boolean, boolean, boolean, i95):android.text.SpannableStringBuilder");
    }

    public final oo7 h() {
        int i = x7a.T;
        pq9 pq9 = qp4.u0;
        Context context = this.a;
        pq9.o(context).c.getIcon();
        oo7 oo7 = new oo7(i, -1, context);
        float f = (float) 12;
        oo7.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        return oo7;
    }
}
